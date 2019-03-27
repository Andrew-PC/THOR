Specification: THOR {

    Struct: Resources {
        modules = ['CS430','CS431','CS210','CS211','CS404','CS425','CS370','CS220','CS253','CS426']
        student = ['postgrad','undergrad']
        under = ['Andrew Cummins','James Hunt','John Doe','Jane Doe','Mary Dunne','Liz Kearney']
        post = ['Hao Wu','Joe Timoney','Oscar Brady','Ben Fennell']
        head = ['Hao Wu','Oscar Brady']
        empty = []
        all_demos = under+post+head+empty as all
        time = ['09:00','10:00','11:00','12:00','13:00','14:00','15:00','16:00','17:00']
        day = ['Monday','Tuesday','Wednesday','Thursday','Friday']
        lab = ['Callan 1.105','Eolas 003/4/5','Eolas 002','Callan Mac Lab 2.17']
        class_size = ['<49','50-99','100-149','150-200']

        Timetable1 =[
        {'CS430'} => {'9:00','Monday','Eolas 002','50-99'},
        {'CS320'} => {'11:00','Tuesday','Eolas 003/4/5','<49'},
        {'CS265'} => {'13:00','Wednesday','Callan Mac Lab 2.17','50-99'},
        {'CS404'} => {'15:00','Monday','Eolas 002','100-149'},
        {'CS355'} => {'20:00','Thursday','Eolas 003/4/5','150-200'},
        {'CS161'} => {'10:00','Friday','Eolas 002','50-99'},
        {'CS162'} => {'17:00','Wednesday','Eolas 002','50-99'}
        ]


        Timetable2 =[
        {'CS430'} => {'9:00','Monday','Eolas 002','50-99'},
        {'CS320'} => {'11:00','Tuesday','Eolas 003/4/5','<49'},
        {'CS265'} => {'13:00','Wednesday','Callan Mac Lab 2.17','50-99'},
        {'CS404'} => {'15:00','Monday','Eolas 002','100-149'},
        {'CS355'} => {'20:00','Thursday','Eolas 003/4/5','150-200'},
        {'CS161'} => {'10:00','Friday','Eolas 002','50-99'},
        {'CS162'} => {'17:00','Wednesday','Eolas 002','50-99'}
        ]
         
        all.under['Andrew Cummins'] => Timetable1
        all.head['Hao Wu'] => Timetable2
      

       

        
    }

    Schedule:Schedule1{
        hard rule r1: * of all.post in Timetable[*]
        hard rule r2: 1 of all.head in Timetable[*]//all labs get 1 head demo
        hard rule r3: class_size['50-99'] in location['Eolas 002'] or location['Callan 1.105'] //specify what labs can hold 50-99 students
        hard rule r4: all with Timetable['CS430'] != Timetable['CS320'] 
        soft rule r5: all.post['Andrew Cummins']  with Timetable[:] for 10 //specify what demonstrators get x hours
        soft rule r6: 40 of all.under // how many undergrads are needed 
        soft rule r7: 3 of all.under in Timetable['CS355'] and Timetable['CS161'] // add  more if needed 
        soft rule r8: Timetable['CS265'] != Timetable[:] // no 2 Timetables are exaclty the same 
    }
    Schedule:Schedule2{
        rule r1: + of post in Timetable['CS130']
        rule r2: none of under in Timetable['CS355']
        rule r3: all_demos hours < 40
        rule r4: no Timetable[:] with < 4 modules in day[:] // no timetable can have more than 4 modules on any given day
    }
  
}
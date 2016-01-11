@RestController
class ThisWillActuallyRun {

<<<<<<< HEAD
    int count=0;
    @RequestMapping("/")
    String home() {
        count++;
        return "hola mundo";        
=======
    static int count=0;
    @RequestMapping("/")
    String home() {
        count++;
        System.out.println(count);
        if ( (count % 2)==0  ){
            while (true){}
        }
        return "Hello World!"
>>>>>>> fd06022096522edfd4444f0a5dd7e2d8e7beb3ae
    }

}

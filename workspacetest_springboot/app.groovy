@RestController
class ThisWillActuallyRun {

    static int count=0;
    @RequestMapping("/")
    String home() {
        count++;
        System.out.println(count);
        if ( (count % 2)==0  ){
            while (true){}
        }
        return "Hello World!"
    }

}

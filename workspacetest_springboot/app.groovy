@RestController
class ThisWillActuallyRun {

    int count=0;
    @RequestMapping("/")
    String home() {
        count++;
        return "hola mundo";        
    }

}

public class ToolMaker {
    private Tool saw;
    private Tool screwdriver;
    private Tool hammer;


    public ToolMaker() {
        this.saw = new Saw();
        this.screwdriver = new Screwdriver();
        this.hammer = new Hammer();
    }

    public void createSaw() {
        saw.create();
    }

    public void createScrewdriver() {
        screwdriver.create();
    }

    public void createHammer() {
        hammer.create();
    }

}

package tzatziki.analysis.exec.model;

/**
 * @author <a href="http://twitter.com/aloyer">@aloyer</a>
 */
public class ScenarioExec extends StepContainer {
    private final String keyword;
    private final String name;

    public ScenarioExec(String keyword, String name) {
        this.keyword = keyword;
        this.name = name;
    }
}
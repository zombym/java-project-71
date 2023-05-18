package hexlet.code;

import picocli.CommandLine;

@CommandLine.Command(name = "gendiff", mixinStandardHelpOptions = true, version = "gendiff: 1",
        description = "Compares two configuration files and shows a difference.")

public class App implements Runnable{

    @CommandLine.Parameters(index = "0", description = "path to first file")
    private String firstFilePath;
    @CommandLine.Parameters(index = "1", description = "path to second file")
    private String secondFilePath;

    @CommandLine.Option(names = {"-h", "--help"}, usageHelp = true, description = "Show this help message and exit.")
    private boolean usageHelpRequested;
    @CommandLine.Option(names = {"-V", "--version"}, versionHelp = true, description = "Print version information and exit.")
    private boolean versionInfoRequested;
    @CommandLine.Option(names = {"-f", "--format"}, paramLabel = "format", description = "output format [default: stylish]")
    private String format = "stylish";

    public static void main(String[] args) {
        new CommandLine(new App()).execute(args);
    }

    @Override
    public void run() {
        System.out.println("Hello World!");
    }
}
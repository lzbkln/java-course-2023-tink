package edu.project3.reports;

import edu.project3.logWorkers.LogRecord;
import java.time.OffsetDateTime;
import java.util.List;

public class MarkdownGenerator {
    private static final String FORMAT = "markdown";

    private MarkdownGenerator() {

    }

    @SuppressWarnings("MultipleStringLiterals")
    public static String generateGeneralInformation(
        String logPath,
        OffsetDateTime from,
        OffsetDateTime to,
        int requestCount,
        String averageResponseSize
    ) {
        return "#### General Information\n\n"
            + "| Metric                | Value        |\n"
            + "|:---------------------:|-------------:|\n"
            + "| File(s)                  | " + logPath + "|\n"
            + "| Start Date            | " + from + "|\n"
            + "| End Date              | " + to + "|\n"
            + "| Request Count         | " + requestCount + "|\n"
            + "| Average Response Size | " + averageResponseSize + " b|\n\n";
    }

    @SuppressWarnings("MultipleStringLiterals")
    public static String generateResourceTable(List<LogRecord> logRecords) {
        return "#### Resource Table\n\n"
            + "| Resource              | Count        |\n"
            + "|:---------------------:|-------------:|\n"
            + LogReportUtils.generateResourceTable(logRecords, FORMAT) + "\n\n";
    }

    public static String generateStatusCodesTable(List<LogRecord> logRecords) {
        return "#### Status Codes Table\n\n"
            + "| Status Code           | Description | Count       |\n"
            + "|:---------------------:|------------:|-----------:|\n"
            + LogReportUtils.generateStatusCodesTable(logRecords, FORMAT) + "\n\n";
    }

    @SuppressWarnings("MultipleStringLiterals")
    public static String generateAddrTable(List<LogRecord> logRecords) {
        return "#### IP Address Table\n\n"
            + "| IP              | Count        |\n"
            + "|:---------------:|-------------:|\n"
            + LogReportUtils.generateTopIpAddressesTable(logRecords, FORMAT) + "\n\n";
    }

    public static String generateRequestTable(List<LogRecord> logRecords) {
        return "#### Requests Table\n\n"
            + "| Request         | Count        |\n"
            + "|:---------------:|-------------:|\n"
            + LogReportUtils.generateRequestTable(logRecords, FORMAT);
    }

}

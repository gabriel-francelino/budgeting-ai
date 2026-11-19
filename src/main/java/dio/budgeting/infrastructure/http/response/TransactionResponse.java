package dio.budgeting.infrastructure.http.response;

import dio.budgeting.application.output.TransactionOutput;

public record TransactionResponse(String id, String description, double amount, String category) {
    public static TransactionResponse from(TransactionOutput transactionOutput) {
        return new TransactionResponse(
                transactionOutput.id(),
                transactionOutput.description(),
                transactionOutput.amount(),
                transactionOutput.category()
        );
    }
}

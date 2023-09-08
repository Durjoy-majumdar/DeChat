package com.tencent.p014mm.mm7zip;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;

/* renamed from: com.tencent.mm.mm7zip.SevenZipException */
public class SevenZipException extends IOException {
    private static final String NEW_LINE = System.getProperty("line.separator");
    private static final long serialVersionUID = 42;
    private Throwable causeFirstPotentialThrown;
    private Throwable causeLastPotentialThrown;
    private Throwable causeLastThrown;

    /* renamed from: com.tencent.mm.mm7zip.SevenZipException$PrintStreamWriter */
    public static class PrintStreamWriter extends Writer {
        private final PrintStream printStream;

        public PrintStreamWriter(PrintStream printStream2) {
            this.printStream = printStream2;
        }

        public void close() {
            this.printStream.close();
        }

        public void flush() {
            this.printStream.flush();
        }

        public void write(char[] cArr, int i, int i2) {
            if (i == 0 && i2 == cArr.length) {
                this.printStream.print(cArr);
            } else {
                this.printStream.print(new String(cArr, i, i2));
            }
        }
    }

    /* renamed from: com.tencent.mm.mm7zip.SevenZipException$StackTraceWriter */
    public static class StackTraceWriter extends Writer {
        private int indexInMessage;
        private final String message;
        private boolean newlineFound = true;
        private PrintWriter writer;

        public StackTraceWriter(PrintWriter printWriter, String str) {
            super(printWriter);
            this.writer = printWriter;
            this.message = str;
        }

        public void close() {
            this.writer.close();
        }

        public void flush() {
            this.writer.flush();
        }

        public void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i3];
                if (c == 10 || c == 13) {
                    this.newlineFound = true;
                } else {
                    if (this.newlineFound) {
                        if (this.message.charAt(this.indexInMessage) == ' ') {
                            this.writer.write("| ");
                        } else {
                            this.writer.write(this.message.charAt(this.indexInMessage));
                            this.writer.write(32);
                        }
                        int i4 = this.indexInMessage + 1;
                        this.indexInMessage = i4;
                        if (i4 >= this.message.length()) {
                            this.indexInMessage = 0;
                        }
                    }
                    this.newlineFound = false;
                }
                this.writer.write(cArr[i3]);
            }
        }
    }

    public SevenZipException() {
    }

    private static String getMessageForPrintStackTraceExtended(Throwable th) {
        return th instanceof SevenZipException ? ((SevenZipException) th).getMessage(true) : th.toString();
    }

    private void printMessageToStringBuilder(String str, StringBuilder sb, Throwable th) {
        sb.append(th.getClass().getCanonicalName());
        sb.append(": ");
        if (th instanceof SevenZipException) {
            ((SevenZipException) th).printToStringBuilder(str + "  ", sb, false);
            return;
        }
        sb.append(th.getMessage());
    }

    private static void printStackTraceOfThrowable(PrintWriter printWriter, Throwable th, Throwable th4) {
        if (th instanceof SevenZipException) {
            printStackTraceToPrintWriter(printWriter, (SevenZipException) th, th4);
        } else {
            printStackTraceRecursive(printWriter, th, th4);
        }
    }

    private static void printStackTraceRecursive(PrintWriter printWriter, Throwable th, Throwable th4) {
        int i;
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (th4 != null) {
            StackTraceElement[] stackTrace2 = th4.getStackTrace();
            int length = stackTrace2.length - 1;
            int length2 = stackTrace.length - 1;
            i = 0;
            while (length >= 3 && length2 >= 3 && stackTrace2[length].equals(stackTrace[length2])) {
                length--;
                length2--;
                i++;
            }
        } else {
            i = 0;
        }
        if (i <= 3) {
            i = 0;
        }
        if (th4 == null) {
            printWriter.println(getMessageForPrintStackTraceExtended(th));
        } else {
            printWriter.println("Caused by: " + getMessageForPrintStackTraceExtended(th));
        }
        for (int i2 = 0; i2 < stackTrace.length - i; i2++) {
            printWriter.println("\tat " + stackTrace[i2]);
        }
        if (i > 0) {
            printWriter.println("\t... " + i + " more");
        }
        if (th.getCause() != null) {
            printStackTraceOfThrowable(printWriter, th.getCause(), th);
        }
    }

    private static void printStackTraceToPrintWriter(PrintWriter printWriter, SevenZipException sevenZipException, Throwable th) {
        if (sevenZipException.causeLastThrown == null && sevenZipException.causeFirstPotentialThrown == null && sevenZipException.causeLastPotentialThrown == null) {
            printStackTraceRecursive(printWriter, sevenZipException, th);
        }
        Class<SevenZipException> cls = SevenZipException.class;
        printWriter.println("+------ SevenZipException with multiple 'cause by' exceptions. Stacktraces for all involved exceptions:");
        Class<SevenZipException> cls2 = SevenZipException.class;
        printWriter.println("+-- The SevenZipException itself with first thrown 'cause by' exception (first cause): ");
        printStackTraceRecursive(new PrintWriter(new StackTraceWriter(printWriter, "  FIRST THROWN CAUSE ")), sevenZipException, th);
        if (sevenZipException.causeLastThrown != null) {
            printWriter.println("+-- Last thrown 'cause by' exception (last cause): ");
            printStackTraceOfThrowable(new PrintWriter(new StackTraceWriter(printWriter, "  LAST THROWN CAUSE ")), sevenZipException.causeLastThrown, sevenZipException);
        }
        if (sevenZipException.causeFirstPotentialThrown != null) {
            printWriter.println("+-- First thrown potential 'cause by' exception, thrown in an other thread (first possible cause): ");
            printStackTraceOfThrowable(new PrintWriter(new StackTraceWriter(printWriter, "  FIRST THROWN POTENTIAL CAUSE ")), sevenZipException.causeFirstPotentialThrown, sevenZipException);
        }
        if (sevenZipException.causeLastPotentialThrown != null) {
            printWriter.println("+-- Last thrown potential 'cause by' exception, thrown in an other thread (last possible cause): ");
            printStackTraceOfThrowable(new PrintWriter(new StackTraceWriter(printWriter, "  LAST THROWN POTENTIAL CAUSE ")), sevenZipException.causeLastPotentialThrown, sevenZipException);
        }
        Class<SevenZipException> cls3 = SevenZipException.class;
        printWriter.println("+------ End of stacktrace of SevenZipException with multiple 'cause by' exceptions");
    }

    private void printToStringBuilder(String str, StringBuilder sb, boolean z) {
        String message = super.getMessage();
        if (message == null) {
            sb.append("No message");
        } else {
            sb.append(message);
        }
        if (str.length() == 0 && !z) {
            sb.append(NEW_LINE);
            Class<SevenZipException> cls = SevenZipException.class;
            Class<SevenZipException> cls2 = SevenZipException.class;
            sb.append("This SevenZipException has multiple 'cause by' exceptions. Use one of the SevenZipException.printStackTraceExtended(..) methods to get stack trace of last thrown and first/last potiential thrown 'cause by' exceptions.");
        }
        Throwable cause = getCause();
        if (cause != null) {
            sb.append(NEW_LINE);
            sb.append(str);
            sb.append("Caused by (first thrown): ");
            printMessageToStringBuilder(str, sb, cause);
        }
        if (this.causeLastThrown != null) {
            sb.append(NEW_LINE);
            sb.append(str);
            sb.append("Caused by (last thrown): ");
            printMessageToStringBuilder(str, sb, this.causeLastThrown);
        }
        if (this.causeFirstPotentialThrown != null) {
            sb.append(NEW_LINE);
            sb.append(str);
            sb.append("Caused by (first potential thrown): ");
            printMessageToStringBuilder(str, sb, this.causeFirstPotentialThrown);
        }
        if (this.causeLastPotentialThrown != null) {
            sb.append(NEW_LINE);
            sb.append(str);
            sb.append("Caused by (last potential thrown): ");
            printMessageToStringBuilder(str, sb, this.causeLastPotentialThrown);
        }
    }

    private void setCauseFirstPotentialThrown(Throwable th) {
        this.causeFirstPotentialThrown = th;
    }

    private void setCauseLastPotentialThrown(Throwable th) {
        this.causeLastPotentialThrown = th;
    }

    private void setCauseLastThrown(Throwable th) {
        this.causeLastThrown = th;
    }

    public Throwable getCause() {
        return super.getCause();
    }

    public Throwable getCauseFirstPotentialThrown() {
        return this.causeFirstPotentialThrown;
    }

    public Throwable getCauseLastPotentialThrown() {
        return this.causeLastPotentialThrown;
    }

    public Throwable getCauseLastThrown() {
        return this.causeLastThrown;
    }

    public String getMessage() {
        return getMessage(false);
    }

    public String getSevenZipExceptionMessage() {
        return super.getMessage();
    }

    public void printStackTraceExtended() {
        printStackTraceExtended(System.err);
    }

    public SevenZipException(String str, Throwable th) {
        super(str);
        initCause(th);
    }

    private String getMessage(boolean z) {
        if (this.causeLastThrown == null && this.causeFirstPotentialThrown == null && this.causeLastPotentialThrown == null) {
            return super.getMessage();
        }
        StringBuilder sb = new StringBuilder();
        printToStringBuilder("", sb, z);
        return sb.toString();
    }

    public void printStackTraceExtended(PrintStream printStream) {
        synchronized (printStream) {
            printStackTraceToPrintWriter(new PrintWriter(new PrintStreamWriter(printStream)), this, (Throwable) null);
        }
    }

    public SevenZipException(String str) {
        super(str);
    }

    public SevenZipException(Throwable th) {
        initCause(th);
    }

    public void printStackTraceExtended(PrintWriter printWriter) {
        synchronized (printWriter) {
            printStackTraceToPrintWriter(printWriter, this, (Throwable) null);
        }
    }
}

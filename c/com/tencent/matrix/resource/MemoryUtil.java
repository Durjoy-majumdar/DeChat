package com.tencent.matrix.resource;

import android.app.Application;
import fy3.C32224a;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import k20.C9556a;
import kotlin.Metadata;
import p425ze.C91669a;
import p723vf.C118672d;
import p761yd.C91441c;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C110818d0;
import sx3.C64186f0;
import z04.C119027c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\b\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001dB\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002H J\u0011\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H J\t\u0010\u0007\u001a\u00020\u0002H J\u0019\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH J)\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH J)\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH J\u0011\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000bH ¨\u0006\u001e"}, mo182094d2 = {"Lcom/tencent/matrix/resource/MemoryUtil;", "", "Lrx3/b0;", "loadJniCache", "", "storageDirPath", "syncTaskDir", "initializeSymbol", "hprofPath", "", "timeout", "", "forkDump", "resultPath", "referenceKey", "forkAnalyze", "forkDumpAndAnalyze", "pid", "Lcom/tencent/matrix/resource/MemoryUtil$TaskResult;", "waitTask", "<init>", "()V", "ForkException", "InitializeException", "a", "TaskResult", "TerminateException", "UnexpectedExitException", "UnknownAnalyzeException", "WaitException", "matrix-resource-canary-android_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class MemoryUtil {

    /* renamed from: a */
    public static final File f235537a;

    /* renamed from: b */
    public static final InitializeException f235538b;

    /* renamed from: c */
    public static final SimpleDateFormat f235539c = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.US);

    /* renamed from: d */
    public static final MemoryUtil f235540d;

    @Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/matrix/resource/MemoryUtil$InitializeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "throwable", "", "(Ljava/lang/Throwable;)V", "matrix-resource-canary-android_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
    public static final class InitializeException extends RuntimeException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public InitializeException(Throwable th) {
            super("Initialization failed due to: " + th);
            C87412m.m108594g(th, "throwable");
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB'\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00028FX\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, mo182094d2 = {"Lcom/tencent/matrix/resource/MemoryUtil$TaskResult;", "", "Ljava/lang/RuntimeException;", "exception$delegate", "Lrx3/g;", "getException", "()Ljava/lang/RuntimeException;", "exception", "", "type", "I", "code", "", "stateRaw", "B", "", "error", "Ljava/lang/String;", "getError", "()Ljava/lang/String;", "getState", "state", "", "getSuccess", "()Z", "success", "<init>", "(IIBLjava/lang/String;)V", "Companion", "a", "matrix-resource-canary-android_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
    public static final class TaskResult {
        public static final C0963a Companion = new C0963a((C8480h) null);
        private static final int TYPE_EXIT = 0;
        private static final int TYPE_SIGNALED = 1;
        private static final int TYPE_WAIT_FAILED = -1;
        /* access modifiers changed from: private */
        public final int code;
        private final String error;
        private final C13601g exception$delegate = C36568h.m40985a(new C0964b(this));
        private final byte stateRaw;
        /* access modifiers changed from: private */
        public final int type;

        /* renamed from: com.tencent.matrix.resource.MemoryUtil$TaskResult$a */
        public static final class C0963a {
            public C0963a(C8480h hVar) {
            }
        }

        /* renamed from: com.tencent.matrix.resource.MemoryUtil$TaskResult$b */
        public static final class C0964b extends C87413o implements C32224a<RuntimeException> {

            /* renamed from: d */
            public final /* synthetic */ TaskResult f2309d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0964b(TaskResult taskResult) {
                super(0);
                this.f2309d = taskResult;
            }

            public Object invoke() {
                if (this.f2309d.getSuccess()) {
                    return null;
                }
                int access$getType$p = this.f2309d.type;
                return access$getType$p != -1 ? access$getType$p != 0 ? access$getType$p != 1 ? new UnknownAnalyzeException(this.f2309d.type, this.f2309d.code, this.f2309d.getState(), this.f2309d.getError()) : new TerminateException(this.f2309d.code, this.f2309d.getState(), this.f2309d.getError()) : new UnexpectedExitException(this.f2309d.code, this.f2309d.getState(), this.f2309d.getError()) : new WaitException(this.f2309d.code);
            }
        }

        public TaskResult(int i, int i2, byte b, String str) {
            C87412m.m108594g(str, "error");
            this.type = i;
            this.code = i2;
            this.stateRaw = b;
            this.error = str;
        }

        /* access modifiers changed from: private */
        public final String getState() {
            switch (this.stateRaw) {
                case 1:
                    return "dump";
                case 2:
                    return "analyzer_create";
                case 3:
                    return "analyzer_initialize";
                case 4:
                    return "analyzer_execute";
                case 5:
                    return "create_result_file";
                case 6:
                    return "serialize";
                default:
                    return "unknown";
            }
        }

        /* access modifiers changed from: private */
        public final boolean getSuccess() {
            return this.type == 0 && this.code == 0;
        }

        public final String getError() {
            return this.error;
        }

        public final RuntimeException getException() {
            return (RuntimeException) this.exception$delegate.getValue();
        }
    }

    @Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\b¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/matrix/resource/MemoryUtil$TerminateException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "signal", "", "state", "", "error", "(ILjava/lang/String;Ljava/lang/String;)V", "matrix-resource-canary-android_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
    public static final class TerminateException extends RuntimeException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TerminateException(int i, String str, String str2) {
            super("Task process was terminated by signal " + i + " (state: " + str + ", error: " + str2 + ')');
            C87412m.m108594g(str, "state");
            C87412m.m108594g(str2, "error");
        }
    }

    @Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\b¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/matrix/resource/MemoryUtil$UnexpectedExitException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "code", "", "state", "", "error", "(ILjava/lang/String;Ljava/lang/String;)V", "matrix-resource-canary-android_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
    public static final class UnexpectedExitException extends RuntimeException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UnexpectedExitException(int i, String str, String str2) {
            super("Task process exited with code " + i + " unexpectedly (state: " + str + ", error: " + str2 + ')');
            C87412m.m108594g(str, "state");
            C87412m.m108594g(str2, "error");
        }
    }

    @Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/matrix/resource/MemoryUtil$UnknownAnalyzeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "type", "", "code", "state", "", "error", "(IILjava/lang/String;Ljava/lang/String;)V", "matrix-resource-canary-android_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
    public static final class UnknownAnalyzeException extends RuntimeException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UnknownAnalyzeException(int i, int i2, String str, String str2) {
            super("Unknown error with type " + i + " returned from task process (code: " + i2 + ", state: " + str + ", error: " + str2 + ')');
            C87412m.m108594g(str, "state");
            C87412m.m108594g(str2, "error");
        }
    }

    @Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/matrix/resource/MemoryUtil$WaitException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "errno", "", "(I)V", "matrix-resource-canary-android_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
    public static final class WaitException extends RuntimeException {
        public WaitException(int i) {
            super("Failed to wait task process with errno " + i);
        }
    }

    @Metadata(mo182092bv = {1, 0, 3}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/matrix/resource/MemoryUtil$ForkException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "matrix-resource-canary-android_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
    public static final class ForkException extends RuntimeException {
        public ForkException() {
            super("Failed to fork task process");
        }
    }

    /* renamed from: com.tencent.matrix.resource.MemoryUtil$a */
    public static final class C80523a {

        /* renamed from: a */
        public final List<C80524a> f235541a;

        /* renamed from: com.tencent.matrix.resource.MemoryUtil$a$a */
        public static final class C80524a {

            /* renamed from: a */
            public final String f235542a;

            /* renamed from: b */
            public final int f235543b;

            /* renamed from: c */
            public final String f235544c;

            /* renamed from: d */
            public final int f235545d;

            public C80524a(String str, int i, String str2, int i2) {
                C87412m.m108594g(str, "objectName");
                C87412m.m108594g(str2, "referenceName");
                this.f235542a = str;
                this.f235543b = i;
                this.f235544c = str2;
                this.f235545d = i2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C80524a)) {
                    return false;
                }
                C80524a aVar = (C80524a) obj;
                return C87412m.m108589b(this.f235542a, aVar.f235542a) && this.f235543b == aVar.f235543b && C87412m.m108589b(this.f235544c, aVar.f235544c) && this.f235545d == aVar.f235545d;
            }

            public int hashCode() {
                String str = this.f235542a;
                int i = 0;
                int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f235543b) * 31;
                String str2 = this.f235544c;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return ((hashCode + i) * 31) + this.f235545d;
            }

            public String toString() {
                return "Node(objectName=" + this.f235542a + ", objectType=" + this.f235543b + ", referenceName=" + this.f235544c + ", referenceType=" + this.f235545d + ")";
            }
        }

        public C80523a(List<C80524a> list) {
            C87412m.m108594g(list, "nodes");
            this.f235541a = list;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p425ze.C39344h mo112089a() {
            /*
                r12 = this;
                java.util.List<com.tencent.matrix.resource.MemoryUtil$a$a> r0 = r12.f235541a
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = sx3.C36907w.m41090l(r0, r2)
                r1.<init>(r2)
                java.util.Iterator r0 = r0.iterator()
            L_0x0011:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x008c
                java.lang.Object r2 = r0.next()
                com.tencent.matrix.resource.MemoryUtil$a$a r2 = (com.tencent.matrix.resource.MemoryUtil.C80523a.C80524a) r2
                ze.j r11 = new ze.j
                java.lang.String r4 = r2.f235544c
                com.tencent.matrix.resource.MemoryUtil r3 = com.tencent.matrix.resource.MemoryUtil.f235540d
                int r5 = r2.f235545d
                r3.getClass()
                ze.j$b r6 = p425ze.C91672j.C91674b.INSTANCE_FIELD
                r7 = 3
                r8 = 2
                r9 = 1
                if (r5 == 0) goto L_0x0052
                if (r5 == r9) goto L_0x004f
                if (r5 == r8) goto L_0x0052
                if (r5 != r7) goto L_0x0038
                ze.j$b r5 = p425ze.C91672j.C91674b.ARRAY_ENTRY
                goto L_0x0053
            L_0x0038:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unsupported reference type "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x004f:
                ze.j$b r5 = p425ze.C91672j.C91674b.STATIC_FIELD
                goto L_0x0053
            L_0x0052:
                r5 = r6
            L_0x0053:
                int r6 = r2.f235543b
                r3.getClass()
                if (r6 == r9) goto L_0x007b
                if (r6 == r8) goto L_0x0078
                if (r6 != r7) goto L_0x0061
                ze.j$a r3 = p425ze.C91672j.C91673a.OBJECT
                goto L_0x007d
            L_0x0061:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unsupported object type "
                r1.append(r2)
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0078:
                ze.j$a r3 = p425ze.C91672j.C91673a.ARRAY
                goto L_0x007d
            L_0x007b:
                ze.j$a r3 = p425ze.C91672j.C91673a.CLASS
            L_0x007d:
                r6 = r3
                java.lang.String r7 = r2.f235542a
                r8 = 0
                r9 = 0
                sx3.f0 r10 = sx3.C64186f0.f181907d
                r3 = r11
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                r1.add(r11)
                goto L_0x0011
            L_0x008c:
                ze.h r0 = new ze.h
                r0.<init>(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.resource.MemoryUtil.C80523a.mo112089a():ze.h");
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C80523a) && C87412m.m108589b(this.f235541a, ((C80523a) obj).f235541a);
            }
            return true;
        }

        public int hashCode() {
            List<C80524a> list = this.f235541a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "LeakChain(nodes=" + this.f235541a + ")";
        }
    }

    static {
        InitializeException initializeException;
        MemoryUtil memoryUtil = new MemoryUtil();
        f235540d = memoryUtil;
        C91441c d = C91441c.m114730d();
        C87412m.m108593f(d, "Matrix.with()");
        Application application = d.f262168b;
        C87412m.m108593f(application, "Matrix.with().application");
        File file = new File(application.getCacheDir(), "matrix_mem_util");
        C80527e.m98125a(file);
        f235537a = file;
        try {
            C9556a aVar = new C9556a();
            aVar.mo10233c("matrix_mem_util");
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/matrix/resource/MemoryUtil", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/matrix/resource/MemoryUtil", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            memoryUtil.loadJniCache();
            String absolutePath = file.getAbsolutePath();
            C87412m.m108593f(absolutePath, "storageDir.absolutePath");
            memoryUtil.syncTaskDir(absolutePath);
            memoryUtil.initializeSymbol();
            initializeException = null;
        } catch (Throwable th) {
            initializeException = new InitializeException(th);
        }
        f235538b = initializeException;
    }

    /* renamed from: e */
    public static final boolean m98119e(String str, long j) {
        C87412m.m108594g(str, "hprofPath");
        MemoryUtil memoryUtil = f235540d;
        InitializeException initializeException = f235538b;
        if (initializeException != null) {
            C118672d.m167354d("Matrix.MemoryUtil", initializeException, "", new Object[0]);
            return false;
        }
        int forkDump = memoryUtil.forkDump(str, j);
        if (forkDump != -1) {
            C80527e.m98126b("Wait for task process [" + forkDump + "] complete executing.");
            TaskResult waitTask = memoryUtil.waitTask(forkDump);
            RuntimeException exception = waitTask.getException();
            if (exception != null) {
                C80527e.m98126b("Task process [" + forkDump + "] complete with error: " + exception.getMessage() + '.');
            } else {
                C80527e.m98126b("Task process [" + forkDump + "] complete without error.");
            }
            return waitTask.getException() == null;
        }
        C118672d.m167352b("Matrix.MemoryUtil", "Failed to fork task executing process.", new Object[0]);
        return false;
    }

    /* access modifiers changed from: private */
    public final native int forkAnalyze(String str, String str2, String str3, long j);

    private final native int forkDump(String str, long j);

    /* access modifiers changed from: private */
    public final native int forkDumpAndAnalyze(String str, String str2, String str3, long j);

    private final native void initializeSymbol();

    private final native void loadJniCache();

    private final native void syncTaskDir(String str);

    private final native TaskResult waitTask(int i);

    /* renamed from: c */
    public final C91669a mo112087c(String str, String str2, long j, C32229r<? super String, ? super String, ? super String, ? super Long, Integer> rVar) {
        C91669a aVar;
        InitializeException initializeException = f235538b;
        if (initializeException != null) {
            return C91669a.m115208a(initializeException, 0);
        }
        long currentTimeMillis = System.currentTimeMillis();
        f235540d.getClass();
        SimpleDateFormat simpleDateFormat = f235539c;
        Calendar instance = Calendar.getInstance();
        C87412m.m108593f(instance, "Calendar.getInstance()");
        String format = simpleDateFormat.format(instance.getTime());
        File file = new File(f235537a, "result");
        C80527e.m98125a(file);
        File file2 = new File(file, "result-" + format + ".tmp");
        try {
            file2.createNewFile();
        } catch (IOException unused) {
            C118672d.m167352b("Matrix.MemoryUtil", "Failed to create analyze result file on path " + file2.getAbsolutePath() + '.', new Object[0]);
            file2 = null;
        }
        if (file2 == null) {
            return C91669a.m115208a(new RuntimeException("Failed to create temporary analyze result file."), 0);
        }
        String absolutePath = file2.getAbsolutePath();
        C87412m.m108593f(absolutePath, "resultPath");
        String str3 = str;
        C32229r<? super String, ? super String, ? super String, ? super Long, Integer> rVar2 = rVar;
        int intValue = rVar2.mo162I(str, absolutePath, str2, Long.valueOf(j)).intValue();
        if (intValue != -1) {
            MemoryUtil memoryUtil = f235540d;
            C80527e.m98126b("Wait for task process [" + intValue + "] complete executing.");
            TaskResult waitTask = memoryUtil.waitTask(intValue);
            if (waitTask.getException() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Task process [");
                sb.append(intValue);
                sb.append("] complete with error: ");
                RuntimeException exception = waitTask.getException();
                C87412m.m108591d(exception);
                sb.append(exception.getMessage());
                sb.append('.');
                C80527e.m98126b(sb.toString());
                aVar = C91669a.m115208a(waitTask.getException(), System.currentTimeMillis() - currentTimeMillis);
            } else {
                C80527e.m98126b("Task process [" + intValue + "] complete without error.");
                try {
                    List<C80523a> d = memoryUtil.mo112088d(file2);
                    if (d.isEmpty()) {
                        aVar = C91669a.m115209b(System.currentTimeMillis() - currentTimeMillis);
                    } else {
                        C80523a aVar2 = (C80523a) C110818d0.m150914L(d);
                        aVar = new C91669a(true, false, ((C80523a.C80524a) C110818d0.m150923U(aVar2.f235541a)).f235542a, aVar2.mo112089a(), (Throwable) null, System.currentTimeMillis() - currentTimeMillis);
                    }
                } catch (Throwable th) {
                    aVar = C91669a.m115208a(th, System.currentTimeMillis() - currentTimeMillis);
                }
            }
        } else {
            aVar = C91669a.m115208a(new ForkException(), 0);
        }
        if (!file2.exists()) {
            return aVar;
        }
        file2.delete();
        return aVar;
    }

    /* renamed from: d */
    public final List<C80523a> mo112088d(File file) {
        C80528f fVar;
        String str;
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[4];
        fileInputStream.read(bArr, 0, 4);
        if (Arrays.equals(bArr, new byte[]{0, 0, 0, 1})) {
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            C87412m.m108593f(byteOrder, "ByteOrder.BIG_ENDIAN");
            fVar = new C80528f(byteOrder, fileInputStream);
        } else {
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            C87412m.m108593f(byteOrder2, "ByteOrder.LITTLE_ENDIAN");
            fVar = new C80528f(byteOrder2, fileInputStream);
        }
        try {
            int a = fVar.mo112096a();
            if (a == 0) {
                fVar.f235547b.close();
                C64186f0 f0Var = C64186f0.f181907d;
                fVar.f235547b.close();
                return f0Var;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < a; i++) {
                ArrayList arrayList2 = new ArrayList();
                int a2 = fVar.mo112096a();
                for (int i2 = 0; i2 < a2; i2++) {
                    int a3 = fVar.mo112096a();
                    byte[] bArr2 = new byte[fVar.mo112096a()];
                    fVar.f235547b.read(bArr2);
                    Charset charset = C119027c.f356488a;
                    String str2 = new String(bArr2, charset);
                    int a4 = fVar.mo112096a();
                    if (a4 == 0) {
                        str = "";
                    } else {
                        byte[] bArr3 = new byte[fVar.mo112096a()];
                        fVar.f235547b.read(bArr3);
                        str = new String(bArr3, charset);
                    }
                    arrayList2.add(new C80523a.C80524a(str2, a3, str, a4));
                }
                arrayList.add(new C80523a(arrayList2));
            }
            fVar.f235547b.close();
            return arrayList;
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            fVar.f235547b.close();
            throw th;
        }
    }
}

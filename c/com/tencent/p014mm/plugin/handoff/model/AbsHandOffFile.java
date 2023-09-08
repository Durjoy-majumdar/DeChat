package com.tencent.p014mm.plugin.handoff.model;

import android.os.Parcel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.FileExplorerUtil;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000 %2\u00020\u0001:\u0001&B\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dB=\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\f\u0012\u0006\u0010\u001f\u001a\u00020\u0012\u0012\u0006\u0010 \u001a\u00020\u0012\u0012\u0006\u0010!\u001a\u00020\u0012\u0012\b\b\u0002\u0010\"\u001a\u00020\u0012\u0012\b\b\u0002\u0010#\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010$J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&R\u001c\u0010\u000b\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0011\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0017\u001a\u00020\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010¨\u0006'"}, mo182094d2 = {"Lcom/tencent/mm/plugin/handoff/model/AbsHandOffFile;", "Lcom/tencent/mm/plugin/handoff/model/HandOff;", "Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;", "multiTaskInfo", "Lrx3/b0;", "saveToMultiTaskInfo", "", "getSize", "()J", "setSize", "(J)V", "size", "", "getSource", "()I", "setSource", "(I)V", "source", "", "getFullPath", "()Ljava/lang/String;", "setFullPath", "(Ljava/lang/String;)V", "fullPath", "getFileStatus", "setFileStatus", "fileStatus", "Landroid/os/Parcel;", "<init>", "(Landroid/os/Parcel;)V", "handOffType", "from", "to", "key", "id", "createTime", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "Companion", "a", "handoff-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.handoff.model.AbsHandOffFile */
public abstract class AbsHandOffFile extends HandOff {
    public static final C18890a Companion = new C18890a((C8480h) null);

    /* renamed from: com.tencent.mm.plugin.handoff.model.AbsHandOffFile$a */
    public static final class C18890a {
        public C18890a(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo23889a(String str) {
            if (str == null || str.length() == 0) {
                return false;
            }
            if (!C112551y.m153819s(str, ".", false)) {
                str = '.' + str;
            }
            return FileExplorerUtil.isPdf(str) || FileExplorerUtil.isDoc(str) || FileExplorerUtil.isPpt(str) || FileExplorerUtil.isXls(str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbsHandOffFile(Parcel parcel) {
        super(parcel);
        C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
    }

    public static final boolean isSupportOpenFile(String str) {
        return Companion.mo23889a(str);
    }

    public abstract int getFileStatus();

    public abstract String getFullPath();

    public abstract long getSize();

    public abstract int getSource();

    public abstract void saveToMultiTaskInfo(MultiTaskInfo multiTaskInfo);

    public abstract void setFileStatus(int i);

    public abstract void setFullPath(String str);

    public abstract void setSize(long j);

    public abstract void setSource(int i);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AbsHandOffFile(int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, long r16, int r18, gy3.C8480h r19) {
        /*
            r10 = this;
            r0 = r18 & 16
            if (r0 == 0) goto L_0x0014
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "randomUUID().toString()"
            gy3.C87412m.m108593f(r0, r1)
            r7 = r0
            goto L_0x0015
        L_0x0014:
            r7 = r15
        L_0x0015:
            r0 = r18 & 32
            if (r0 == 0) goto L_0x001f
            long r0 = java.lang.System.currentTimeMillis()
            r8 = r0
            goto L_0x0021
        L_0x001f:
            r8 = r16
        L_0x0021:
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.AbsHandOffFile.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, gy3.h):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbsHandOffFile(int i, String str, String str2, String str3, String str4, long j) {
        super(i, str, str2, str3, str4, j);
        C87412m.m108594g(str, "from");
        C87412m.m108594g(str2, "to");
        C87412m.m108594g(str3, "key");
        C87412m.m108594g(str4, "id");
    }
}

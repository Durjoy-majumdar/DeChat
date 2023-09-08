package com.tencent.p014mm.plugin.handoff.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import d02.C31040b;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13604l;
import te3.C64459j13;
import z04.C66725r;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\r\b'\u0018\u0000 <2\u00020\u0001:\u0001=B;\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0007\u0012\u0006\u0010(\u001a\u00020\u0007\u0012\u0006\u0010+\u001a\u00020\u0007\u0012\b\b\u0002\u0010.\u001a\u00020\u0007\u0012\b\b\u0002\u00102\u001a\u000201¢\u0006\u0004\b8\u00109B\u0011\b\u0016\u0012\u0006\u0010:\u001a\u00020\u0013¢\u0006\u0004\b8\u0010;J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0016J\b\u0010\b\u001a\u00020\u0007H$J\b\u0010\t\u001a\u00020\u0000H&J\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\n\u0010\f\u001a\u0004\u0018\u00010\nH$J\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rJ\u0016\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH$J\b\u0010\u0012\u001a\u00020\u0007H\u0007J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0002H\u0016R\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\"\u0010+\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010#\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R\"\u0010.\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010#\u001a\u0004\b/\u0010%\"\u0004\b0\u0010'R\"\u00102\u001a\u0002018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006>"}, mo182094d2 = {"Lcom/tencent/mm/plugin/handoff/model/HandOff;", "Landroid/os/Parcelable;", "", "getDataType", "newHandOff", "", "update", "", "body", "copy", "Lcom/tencent/mm/plugin/ball/model/BallInfo;", "createBallInfo", "doCreateBallInfo", "Lrx3/l;", "Lte3/j13;", "", "createMultiTaskInfo", "doCreateMultiTaskInfo", "build", "Landroid/os/Parcel;", "dest", "flags", "Lrx3/b0;", "writeToParcel", "", "other", "equals", "hashCode", "handOffType", "I", "getHandOffType", "()I", "setHandOffType", "(I)V", "from", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "to", "getTo", "setTo", "key", "getKey", "setKey", "id", "getId", "setId", "", "createTime", "J", "getCreateTime", "()J", "setCreateTime", "(J)V", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "source", "(Landroid/os/Parcel;)V", "Companion", "a", "handoff-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.handoff.model.HandOff */
public abstract class HandOff implements Parcelable {
    public static final C30122a Companion = new C30122a((C8480h) null);
    public static final String KId = "handoff#id";
    private long createTime;
    private String from;
    private int handOffType;

    /* renamed from: id */
    private String f271890id;
    private String key;

    /* renamed from: to */
    private String f271891to;

    /* renamed from: com.tencent.mm.plugin.handoff.model.HandOff$a */
    public static final class C30122a {
        public C30122a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo57158a(int i, int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append('_');
            sb.append(i2);
            sb.append('_');
            sb.append(System.currentTimeMillis());
            return sb.toString();
        }
    }

    public HandOff(int i, String str, String str2, String str3, String str4, long j) {
        C87412m.m108594g(str, "from");
        C87412m.m108594g(str2, "to");
        C87412m.m108594g(str3, "key");
        C87412m.m108594g(str4, "id");
        this.handOffType = i;
        this.from = str;
        this.f271891to = str2;
        this.key = str3;
        this.f271890id = str4;
        this.createTime = j;
    }

    public static final String generateKey(int i, int i2) {
        return Companion.mo57158a(i, i2);
    }

    public abstract String body();

    public final String build() {
        return C66725r.m78728b("\n    <handoff type=\"" + getDataType() + "\" id=\"" + this.f271890id + "\" createtime=\"" + this.createTime + "\" from=\"" + this.from + "\" to=\"" + this.f271891to + "\">\n        <handofftype>" + C31040b.m39288a(Integer.valueOf(this.handOffType)) + "</handofftype>\n        " + body() + "\n    </handoff>\n    ");
    }

    public abstract HandOff copy();

    public final BallInfo createBallInfo() {
        BallInfo doCreateBallInfo = doCreateBallInfo();
        if (doCreateBallInfo == null) {
            return null;
        }
        doCreateBallInfo.f311678C.putString(KId, this.f271890id);
        return doCreateBallInfo;
    }

    public final C13604l<C64459j13, byte[]> createMultiTaskInfo() {
        return doCreateMultiTaskInfo();
    }

    public abstract BallInfo doCreateBallInfo();

    public abstract C13604l<C64459j13, byte[]> doCreateMultiTaskInfo();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HandOff)) {
            return false;
        }
        HandOff handOff = (HandOff) obj;
        return this.handOffType == handOff.handOffType && C87412m.m108589b(this.from, handOff.from) && C87412m.m108589b(this.f271891to, handOff.f271891to) && C87412m.m108589b(this.key, handOff.key) && C87412m.m108589b(this.f271890id, handOff.f271890id);
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public abstract int getDataType();

    public final String getFrom() {
        return this.from;
    }

    public final int getHandOffType() {
        return this.handOffType;
    }

    public final String getId() {
        return this.f271890id;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getTo() {
        return this.f271891to;
    }

    public int hashCode() {
        return (((((((this.handOffType * 31) + this.from.hashCode()) * 31) + this.f271891to.hashCode()) * 31) + this.key.hashCode()) * 31) + this.f271890id.hashCode();
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setFrom(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.from = str;
    }

    public final void setHandOffType(int i) {
        this.handOffType = i;
    }

    public final void setId(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f271890id = str;
    }

    public final void setKey(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.key = str;
    }

    public final void setTo(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f271891to = str;
    }

    public boolean update(HandOff handOff) {
        C87412m.m108594g(handOff, "newHandOff");
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        parcel.writeInt(this.handOffType);
        parcel.writeString(this.from);
        parcel.writeString(this.f271891to);
        parcel.writeString(this.key);
        parcel.writeString(this.f271890id);
        parcel.writeLong(this.createTime);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HandOff(int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, long r16, int r18, gy3.C8480h r19) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOff.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, gy3.h):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOff(android.os.Parcel r10) {
        /*
            r9 = this;
            java.lang.String r0 = "source"
            gy3.C87412m.m108594g(r10, r0)
            int r2 = r10.readInt()
            java.lang.String r3 = r10.readString()
            gy3.C87412m.m108591d(r3)
            java.lang.String r4 = r10.readString()
            gy3.C87412m.m108591d(r4)
            java.lang.String r5 = r10.readString()
            gy3.C87412m.m108591d(r5)
            java.lang.String r6 = r10.readString()
            gy3.C87412m.m108591d(r6)
            long r7 = r10.readLong()
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOff.<init>(android.os.Parcel):void");
    }
}

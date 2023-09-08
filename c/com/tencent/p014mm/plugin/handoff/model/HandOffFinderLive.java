package com.tencent.p014mm.plugin.handoff.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import d02.C31039a;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13604l;
import te3.C64459j13;
import z04.C66725r;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b \b\u0007\u0018\u0000 52\u00020\u0001:\u00016BY\b\u0017\u0012\u0006\u0010!\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020\u0007\u0012\u0006\u0010'\u001a\u00020\u0007\u0012\u0006\u0010*\u001a\u00020\u0007\u0012\b\b\u0002\u0010-\u001a\u00020\u0002\u0012\b\b\u0002\u0010.\u001a\u00020\u0007\u0012\b\b\u0002\u0010/\u001a\u00020\u0007\u0012\b\b\u0002\u00100\u001a\u00020\u0007¢\u0006\u0004\b1\u00102B\u0011\b\u0016\u0012\u0006\u00103\u001a\u00020\n¢\u0006\u0004\b1\u00104J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0015J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0001H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014J\u0016\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012H\u0014J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\"\u0010\u001b\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\"\u0010$\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\"\u0010'\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 R\"\u0010*\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 ¨\u00067"}, mo182094d2 = {"Lcom/tencent/mm/plugin/handoff/model/HandOffFinderLive;", "Lcom/tencent/mm/plugin/handoff/model/HandOff;", "", "getDataType", "newHandOff", "", "update", "", "body", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "Lrx3/b0;", "writeToParcel", "copy", "Lcom/tencent/mm/plugin/ball/model/BallInfo;", "doCreateBallInfo", "Lrx3/l;", "Lte3/j13;", "", "doCreateMultiTaskInfo", "toString", "", "other", "equals", "hashCode", "icon", "Ljava/lang/String;", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "objectId", "getObjectId", "setObjectId", "nonceId", "getNonceId", "setNonceId", "liveId", "getLiveId", "setLiveId", "handOffType", "from", "to", "key", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "source", "(Landroid/os/Parcel;)V", "Companion", "b", "api-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.handoff.model.HandOffFinderLive */
public final class HandOffFinderLive extends HandOff {
    public static final Parcelable.Creator<HandOffFinderLive> CREATOR = new C30124a();
    public static final C30125b Companion = new C30125b((C8480h) null);
    private String icon;
    private String liveId;
    private String nonceId;
    private String objectId;
    private String title;

    /* renamed from: com.tencent.mm.plugin.handoff.model.HandOffFinderLive$a */
    public static final class C30124a implements Parcelable.Creator<HandOffFinderLive> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            return new HandOffFinderLive(parcel);
        }

        public Object[] newArray(int i) {
            return new HandOffFinderLive[i];
        }
    }

    /* renamed from: com.tencent.mm.plugin.handoff.model.HandOffFinderLive$b */
    public static final class C30125b {
        public C30125b(C8480h hVar) {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOffFinderLive(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            r13 = this;
            java.lang.String r0 = "title"
            r2 = r14
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "icon"
            r3 = r15
            gy3.C87412m.m108594g(r15, r0)
            java.lang.String r0 = "objectId"
            r4 = r16
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "nonceId"
            r5 = r17
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "liveId"
            r6 = r18
            gy3.C87412m.m108594g(r6, r0)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 480(0x1e0, float:6.73E-43)
            r12 = 0
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffFinderLive.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOffFinderLive(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19) {
        /*
            r13 = this;
            java.lang.String r0 = "title"
            r2 = r14
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "icon"
            r3 = r15
            gy3.C87412m.m108594g(r15, r0)
            java.lang.String r0 = "objectId"
            r4 = r16
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "nonceId"
            r5 = r17
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "liveId"
            r6 = r18
            gy3.C87412m.m108594g(r6, r0)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 448(0x1c0, float:6.28E-43)
            r12 = 0
            r1 = r13
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffFinderLive.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOffFinderLive(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19, java.lang.String r20) {
        /*
            r13 = this;
            java.lang.String r0 = "title"
            r2 = r14
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "icon"
            r3 = r15
            gy3.C87412m.m108594g(r15, r0)
            java.lang.String r0 = "objectId"
            r4 = r16
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "nonceId"
            r5 = r17
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "liveId"
            r6 = r18
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "from"
            r8 = r20
            gy3.C87412m.m108594g(r8, r0)
            r9 = 0
            r10 = 0
            r11 = 384(0x180, float:5.38E-43)
            r12 = 0
            r1 = r13
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffFinderLive.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOffFinderLive(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19, java.lang.String r20, java.lang.String r21) {
        /*
            r13 = this;
            java.lang.String r0 = "title"
            r2 = r14
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "icon"
            r3 = r15
            gy3.C87412m.m108594g(r15, r0)
            java.lang.String r0 = "objectId"
            r4 = r16
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "nonceId"
            r5 = r17
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "liveId"
            r6 = r18
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "from"
            r8 = r20
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "to"
            r9 = r21
            gy3.C87412m.m108594g(r9, r0)
            r10 = 0
            r11 = 256(0x100, float:3.59E-43)
            r12 = 0
            r1 = r13
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffFinderLive.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HandOffFinderLive(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, gy3.C8480h r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0009
            r1 = 1
            r8 = 1
            goto L_0x000b
        L_0x0009:
            r8 = r18
        L_0x000b:
            r1 = r0 & 64
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0013
            r9 = r2
            goto L_0x0015
        L_0x0013:
            r9 = r19
        L_0x0015:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x001b
            r10 = r2
            goto L_0x001d
        L_0x001b:
            r10 = r20
        L_0x001d:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0024
            r11 = r17
            goto L_0x0026
        L_0x0024:
            r11 = r21
        L_0x0026:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffFinderLive.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, gy3.h):void");
    }

    public String body() {
        return C66725r.m78728b("\n        <icon>" + C31039a.m39287a(this.icon) + "</icon>\n        <title>" + C31039a.m39287a(this.title) + "</title>\n        <feedObjectId>" + C31039a.m39287a(this.objectId) + "</feedObjectId>\n        <feedNonceId>" + C31039a.m39287a(this.nonceId) + "</feedNonceId>\n        <feedLiveId>" + C31039a.m39287a(this.liveId) + "</feedLiveId>\n    ");
    }

    public HandOff copy() {
        HandOffFinderLive handOffFinderLive = new HandOffFinderLive(this.title, this.icon, this.objectId, this.nonceId, this.liveId, getHandOffType(), getFrom(), getTo(), getKey());
        handOffFinderLive.setId(getId());
        return handOffFinderLive;
    }

    public int describeContents() {
        return 0;
    }

    public BallInfo doCreateBallInfo() {
        return null;
    }

    public C13604l<C64459j13, byte[]> doCreateMultiTaskInfo() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HandOffFinderLive) || !super.equals(obj)) {
            return false;
        }
        HandOffFinderLive handOffFinderLive = (HandOffFinderLive) obj;
        return C87412m.m108589b(this.icon, handOffFinderLive.icon) && C87412m.m108589b(this.title, handOffFinderLive.title) && C87412m.m108589b(this.objectId, handOffFinderLive.objectId) && C87412m.m108589b(this.nonceId, handOffFinderLive.nonceId) && C87412m.m108589b(this.liveId, handOffFinderLive.liveId);
    }

    public int getDataType() {
        return 6;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getLiveId() {
        return this.liveId;
    }

    public final String getNonceId() {
        return this.nonceId;
    }

    public final String getObjectId() {
        return this.objectId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((super.hashCode() * 31) + this.icon.hashCode()) * 31) + this.title.hashCode()) * 31) + this.objectId.hashCode()) * 31) + this.nonceId.hashCode()) * 31) + this.liveId.hashCode();
    }

    public final void setIcon(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.icon = str;
    }

    public final void setLiveId(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.liveId = str;
    }

    public final void setNonceId(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.nonceId = str;
    }

    public final void setObjectId(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.objectId = str;
    }

    public final void setTitle(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.title = str;
    }

    public String toString() {
        return "HandOffFinderLive(key='" + getKey() + "', id='" + getId() + "', createTime='" + getCreateTime() + ", title='" + this.title + "', objId='" + this.objectId + "', icon='" + this.icon + ", nonceId=" + this.nonceId + ", liveId=" + this.liveId + "')";
    }

    public boolean update(HandOff handOff) {
        C87412m.m108594g(handOff, "newHandOff");
        boolean update = super.update(handOff);
        if (!(handOff instanceof HandOffFinderLive) || C87412m.m108589b(handOff, this)) {
            return update;
        }
        HandOffFinderLive handOffFinderLive = (HandOffFinderLive) handOff;
        this.title = handOffFinderLive.title;
        this.icon = handOffFinderLive.icon;
        this.objectId = handOffFinderLive.objectId;
        this.nonceId = handOffFinderLive.nonceId;
        this.liveId = handOffFinderLive.liveId;
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.icon);
        parcel.writeString(this.title);
        parcel.writeString(this.objectId);
        parcel.writeString(this.nonceId);
        parcel.writeString(this.liveId);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOffFinderLive(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            r16 = this;
            r10 = r16
            r11 = r17
            r12 = r18
            r13 = r19
            r14 = r20
            r15 = r21
            java.lang.String r0 = "title"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "icon"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "objectId"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "nonceId"
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "liveId"
            gy3.C87412m.m108594g(r15, r0)
            java.lang.String r0 = "from"
            r2 = r23
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "to"
            r3 = r24
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "key"
            r4 = r25
            gy3.C87412m.m108594g(r4, r0)
            r5 = 0
            r6 = 0
            r8 = 48
            r9 = 0
            r0 = r16
            r1 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9)
            r10.title = r11
            r10.icon = r12
            r10.objectId = r13
            r10.nonceId = r14
            r10.liveId = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffFinderLive.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandOffFinderLive(Parcel parcel) {
        super(parcel);
        C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
        String readString = parcel.readString();
        C87412m.m108591d(readString);
        this.icon = readString;
        String readString2 = parcel.readString();
        C87412m.m108591d(readString2);
        this.title = readString2;
        String readString3 = parcel.readString();
        C87412m.m108591d(readString3);
        this.objectId = readString3;
        String readString4 = parcel.readString();
        C87412m.m108591d(readString4);
        this.nonceId = readString4;
        String readString5 = parcel.readString();
        C87412m.m108591d(readString5);
        this.liveId = readString5;
    }
}

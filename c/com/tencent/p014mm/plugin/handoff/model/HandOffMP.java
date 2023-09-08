package com.tencent.p014mm.plugin.handoff.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import d02.C31039a;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import p444at.C79629c;
import rx3.C13604l;
import te3.C64459j13;
import z04.C66725r;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b!\b\u0017\u0018\u0000 92\u00020\u00012\u00020\u0002:\u0001:BY\b\u0017\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\u0006\u0010$\u001a\u00020\b\u0012\u0006\u0010'\u001a\u00020\b\u0012\u0006\u0010*\u001a\u00020\b\u0012\u0006\u0010-\u001a\u00020\b\u0012\b\b\u0002\u00100\u001a\u00020\u0003\u0012\b\b\u0002\u00101\u001a\u00020\b\u0012\b\b\u0002\u00102\u001a\u00020\b\u0012\b\b\u0002\u00103\u001a\u00020\b¢\u0006\u0004\b4\u00105B\t\b\u0016¢\u0006\u0004\b4\u00106B\u0011\b\u0016\u0012\u0006\u00107\u001a\u00020\u000b¢\u0006\u0004\b4\u00108J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001H\u0016J\b\u0010\t\u001a\u00020\bH\u0015J\b\u0010\n\u001a\u00020\u0003H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0001H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0016\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013H\u0014J\b\u0010\u0017\u001a\u00020\bH\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\bH\u0016J\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001d\u001a\u00020\u0003H\u0016R\"\u0010\u001e\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\"\u0010'\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\"\u0010*\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\"\u0010-\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#¨\u0006;"}, mo182094d2 = {"Lcom/tencent/mm/plugin/handoff/model/HandOffMP;", "Lcom/tencent/mm/plugin/handoff/model/HandOff;", "Lat/c;", "", "getDataType", "newHandOff", "", "update", "", "body", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "Lrx3/b0;", "writeToParcel", "copy", "Lcom/tencent/mm/plugin/ball/model/BallInfo;", "doCreateBallInfo", "Lrx3/l;", "Lte3/j13;", "", "doCreateMultiTaskInfo", "toString", "page", "setPageOfAppEntry", "", "other", "equals", "hashCode", "icon", "Ljava/lang/String;", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "appID", "getAppID", "setAppID", "appEntryPage", "getAppEntryPage", "setAppEntryPage", "appUserName", "getAppUserName", "setAppUserName", "handOffType", "from", "to", "key", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()V", "source", "(Landroid/os/Parcel;)V", "Companion", "b", "api-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.handoff.model.HandOffMP */
public class HandOffMP extends HandOff implements C79629c {
    public static final Parcelable.Creator<HandOffMP> CREATOR = new C94146a();
    public static final C94147b Companion = new C94147b((C8480h) null);
    private String appEntryPage;
    private String appID;
    private String appUserName;
    private String icon;
    private String title;

    /* renamed from: com.tencent.mm.plugin.handoff.model.HandOffMP$a */
    public static final class C94146a implements Parcelable.Creator<HandOffMP> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            return new HandOffMP(parcel);
        }

        public Object[] newArray(int i) {
            return new HandOffMP[i];
        }
    }

    /* renamed from: com.tencent.mm.plugin.handoff.model.HandOffMP$b */
    public static final class C94147b {
        public C94147b(C8480h hVar) {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOffMP(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            r13 = this;
            java.lang.String r0 = "icon"
            r2 = r14
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "title"
            r3 = r15
            gy3.C87412m.m108594g(r15, r0)
            java.lang.String r0 = "appID"
            r4 = r16
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "appEntryPage"
            r5 = r17
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "appUserName"
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffMP.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOffMP(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19) {
        /*
            r13 = this;
            java.lang.String r0 = "icon"
            r2 = r14
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "title"
            r3 = r15
            gy3.C87412m.m108594g(r15, r0)
            java.lang.String r0 = "appID"
            r4 = r16
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "appEntryPage"
            r5 = r17
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "appUserName"
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffMP.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOffMP(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19, java.lang.String r20) {
        /*
            r13 = this;
            java.lang.String r0 = "icon"
            r2 = r14
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "title"
            r3 = r15
            gy3.C87412m.m108594g(r15, r0)
            java.lang.String r0 = "appID"
            r4 = r16
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "appEntryPage"
            r5 = r17
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "appUserName"
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffMP.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOffMP(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19, java.lang.String r20, java.lang.String r21) {
        /*
            r13 = this;
            java.lang.String r0 = "icon"
            r2 = r14
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "title"
            r3 = r15
            gy3.C87412m.m108594g(r15, r0)
            java.lang.String r0 = "appID"
            r4 = r16
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = "appEntryPage"
            r5 = r17
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "appUserName"
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffMP.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOffMP(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            r16 = this;
            r10 = r16
            r11 = r17
            r12 = r18
            r13 = r19
            r14 = r20
            r15 = r21
            java.lang.String r0 = "icon"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "title"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "appID"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "appEntryPage"
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "appUserName"
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
            r10.icon = r11
            r10.title = r12
            r10.appID = r13
            r10.appEntryPage = r14
            r10.appUserName = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffMP.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public String body() {
        return C66725r.m78728b("\n        <icon>" + C31039a.m39287a(this.icon) + "</icon>\n        <title>" + C31039a.m39287a(this.title) + "</title>\n        <appid>" + C31039a.m39287a(this.appID) + "</appid>\n        <appentrypage>" + C31039a.m39287a(this.appEntryPage) + "</appentrypage>\n        <appusername>" + C31039a.m39287a(this.appUserName) + "</appusername>\n    ");
    }

    public HandOff copy() {
        HandOffMP handOffMP = new HandOffMP(this.icon, this.title, this.appID, this.appEntryPage, this.appUserName, getHandOffType(), getFrom(), getTo(), getKey());
        handOffMP.setId(getId());
        return handOffMP;
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
        if (!(obj instanceof HandOffMP) || !super.equals(obj)) {
            return false;
        }
        HandOffMP handOffMP = (HandOffMP) obj;
        return C87412m.m108589b(this.icon, handOffMP.icon) && C87412m.m108589b(this.title, handOffMP.title) && C87412m.m108589b(this.appID, handOffMP.appID) && C87412m.m108589b(this.appEntryPage, handOffMP.appEntryPage) && C87412m.m108589b(this.appUserName, handOffMP.appUserName);
    }

    public final String getAppEntryPage() {
        return this.appEntryPage;
    }

    public final String getAppID() {
        return this.appID;
    }

    public final String getAppUserName() {
        return this.appUserName;
    }

    public int getDataType() {
        return 3;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((this.icon.hashCode() * 31) + this.title.hashCode()) * 31) + this.appID.hashCode()) * 31) + this.appEntryPage.hashCode()) * 31) + this.appUserName.hashCode();
    }

    public final void setAppEntryPage(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.appEntryPage = str;
    }

    public final void setAppID(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.appID = str;
    }

    public final void setAppUserName(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.appUserName = str;
    }

    public final void setIcon(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.icon = str;
    }

    public void setPageOfAppEntry(String str) {
        C87412m.m108594g(str, "page");
        this.appEntryPage = str;
    }

    public final void setTitle(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.title = str;
    }

    public String toString() {
        return "HandOffMP(key='" + getKey() + "', id='" + getId() + "', createTime='" + getCreateTime() + ", icon='" + this.icon + "', title='" + this.title + "', appID='" + this.appID + "', appEntryPage='" + this.appEntryPage + "', appUserName='" + this.appUserName + "')";
    }

    public boolean update(HandOff handOff) {
        C87412m.m108594g(handOff, "newHandOff");
        boolean update = super.update(handOff);
        if (!(handOff instanceof HandOffMP) || C87412m.m108589b(handOff, this)) {
            return update;
        }
        HandOffMP handOffMP = (HandOffMP) handOff;
        this.icon = handOffMP.icon;
        this.title = handOffMP.title;
        this.appID = handOffMP.appID;
        this.appEntryPage = handOffMP.appEntryPage;
        this.appUserName = handOffMP.appUserName;
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.icon);
        parcel.writeString(this.title);
        parcel.writeString(this.appID);
        parcel.writeString(this.appEntryPage);
        parcel.writeString(this.appUserName);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HandOffMP(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, gy3.C8480h r23) {
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
            if (r0 == 0) goto L_0x002a
            com.tencent.mm.plugin.handoff.model.HandOff$a r0 = com.tencent.p014mm.plugin.handoff.model.HandOff.Companion
            r1 = 3
            java.lang.String r0 = r0.mo57158a(r1, r8)
            r11 = r0
            goto L_0x002c
        L_0x002a:
            r11 = r21
        L_0x002c:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffMP.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, gy3.h):void");
    }

    public HandOffMP() {
        this("", "", "", "", "", 0, (String) null, (String) null, (String) null, 480, (C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandOffMP(Parcel parcel) {
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
        this.appID = readString3;
        String readString4 = parcel.readString();
        C87412m.m108591d(readString4);
        this.appEntryPage = readString4;
        String readString5 = parcel.readString();
        C87412m.m108591d(readString5);
        this.appUserName = readString5;
    }
}

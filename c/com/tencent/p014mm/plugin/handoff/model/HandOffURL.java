package com.tencent.p014mm.plugin.handoff.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import d02.C31040b;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import org.json.JSONObject;
import rx3.C13604l;
import te3.C64459j13;
import te3.i25;
import z04.C66725r;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\b\u0007\u0018\u0000 32\u00020\u0001:\u00014BI\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010!\u001a\u00020\u0007\u0012\u0006\u0010$\u001a\u00020\u0007\u0012\b\b\u0002\u0010*\u001a\u00020\u0002\u0012\b\b\u0002\u0010+\u001a\u00020\u0007\u0012\b\b\u0002\u0010,\u001a\u00020\u0007\u0012\b\b\u0002\u0010-\u001a\u00020\u0007¢\u0006\u0004\b.\u0010/B\t\b\u0016¢\u0006\u0004\b.\u00100B\u0011\b\u0016\u0012\u0006\u00101\u001a\u00020\n¢\u0006\u0004\b.\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0015J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0001H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014J\u0016\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012H\u0014J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\"\u0010\u001b\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\"\u0010$\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\"\u0010'\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 ¨\u00065"}, mo182094d2 = {"Lcom/tencent/mm/plugin/handoff/model/HandOffURL;", "Lcom/tencent/mm/plugin/handoff/model/HandOff;", "", "getDataType", "newHandOff", "", "update", "", "body", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "Lrx3/b0;", "writeToParcel", "copy", "Lcom/tencent/mm/plugin/ball/model/BallInfo;", "doCreateBallInfo", "Lrx3/l;", "Lte3/j13;", "", "doCreateMultiTaskInfo", "toString", "", "other", "equals", "hashCode", "title", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "url", "getUrl", "setUrl", "icon", "getIcon", "setIcon", "nickname", "getNickname", "setNickname", "handOffType", "from", "to", "key", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()V", "source", "(Landroid/os/Parcel;)V", "Companion", "b", "handoff-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.handoff.model.HandOffURL */
public final class HandOffURL extends HandOff {
    public static final Parcelable.Creator<HandOffURL> CREATOR = new C30126a();
    public static final C42407b Companion = new C42407b((C8480h) null);
    public static final String KShareUrl = "handoff#shareUrl";
    private String icon;
    private String nickname;
    private String title;
    private String url;

    /* renamed from: com.tencent.mm.plugin.handoff.model.HandOffURL$a */
    public static final class C30126a implements Parcelable.Creator<HandOffURL> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            return new HandOffURL(parcel);
        }

        public Object[] newArray(int i) {
            return new HandOffURL[i];
        }
    }

    /* renamed from: com.tencent.mm.plugin.handoff.model.HandOffURL$b */
    public static final class C42407b {
        public C42407b(C8480h hVar) {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HandOffURL(String str, String str2, String str3) {
        this(str, str2, str3, 0, (String) null, (String) null, (String) null, 120, (C8480h) null);
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str2, "url");
        C87412m.m108594g(str3, "icon");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HandOffURL(String str, String str2, String str3, int i) {
        this(str, str2, str3, i, (String) null, (String) null, (String) null, 112, (C8480h) null);
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str2, "url");
        C87412m.m108594g(str3, "icon");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOffURL(java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15, java.lang.String r16) {
        /*
            r11 = this;
            java.lang.String r0 = "title"
            r2 = r12
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "url"
            r3 = r13
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "icon"
            r4 = r14
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "from"
            r6 = r16
            gy3.C87412m.m108594g(r6, r0)
            r7 = 0
            r8 = 0
            r9 = 96
            r10 = 0
            r1 = r11
            r5 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffURL.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOffURL(java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15, java.lang.String r16, java.lang.String r17) {
        /*
            r11 = this;
            java.lang.String r0 = "title"
            r2 = r12
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "url"
            r3 = r13
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "icon"
            r4 = r14
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "from"
            r6 = r16
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "to"
            r7 = r17
            gy3.C87412m.m108594g(r7, r0)
            r8 = 0
            r9 = 64
            r10 = 0
            r1 = r11
            r5 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffURL.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOffURL(java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            r14 = this;
            r10 = r14
            r11 = r15
            r12 = r16
            r13 = r17
            java.lang.String r0 = "title"
            gy3.C87412m.m108594g(r15, r0)
            java.lang.String r0 = "url"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "icon"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r0 = "from"
            r2 = r19
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "to"
            r3 = r20
            gy3.C87412m.m108594g(r3, r0)
            java.lang.String r0 = "key"
            r4 = r21
            gy3.C87412m.m108594g(r4, r0)
            r5 = 0
            r6 = 0
            r8 = 48
            r9 = 0
            r0 = r14
            r1 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9)
            java.lang.String r0 = ""
            r10.nickname = r0
            r10.title = r11
            r10.url = r12
            r10.icon = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffURL.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public String body() {
        return C66725r.m78728b("\n        <title>" + C31040b.m39288a(this.title) + "</title>\n        <url>" + C31040b.m39288a(this.url) + "</url>\n        <icon>" + C31040b.m39288a(this.icon) + "</icon>\n    ");
    }

    public HandOff copy() {
        HandOffURL handOffURL = new HandOffURL(this.title, this.url, this.icon, getHandOffType(), getFrom(), getTo(), getKey());
        handOffURL.setId(getId());
        return handOffURL;
    }

    public int describeContents() {
        return 0;
    }

    public BallInfo doCreateBallInfo() {
        if (getHandOffType() == 1) {
            return null;
        }
        BallInfo ballInfo = new BallInfo(2, getKey(), (JSONObject) null);
        ballInfo.f311699t = this.title;
        ballInfo.f311695p = this.icon;
        ballInfo.mo149049o("rawUrl", this.url);
        return ballInfo;
    }

    public C13604l<C64459j13, byte[]> doCreateMultiTaskInfo() {
        if (getHandOffType() == 1) {
            return null;
        }
        C64459j13 j132 = new C64459j13();
        i25 i25 = new i25();
        j132.f183752e = this.title;
        j132.f183756i = this.icon;
        j132.f183751d = "";
        String str = this.url;
        i25.f135052f = str;
        i25.f135051e = str;
        return new C13604l<>(j132, i25.toByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HandOffURL) || !super.equals(obj)) {
            return false;
        }
        HandOffURL handOffURL = (HandOffURL) obj;
        return C87412m.m108589b(this.title, handOffURL.title) && C87412m.m108589b(this.url, handOffURL.url) && C87412m.m108589b(this.icon, handOffURL.icon) && C87412m.m108589b(this.nickname, handOffURL.nickname);
    }

    public int getDataType() {
        return 2;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((super.hashCode() * 31) + this.title.hashCode()) * 31) + this.url.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.nickname.hashCode();
    }

    public final void setIcon(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.icon = str;
    }

    public final void setNickname(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.nickname = str;
    }

    public final void setTitle(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.title = str;
    }

    public final void setUrl(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.url = str;
    }

    public String toString() {
        return "HandOffURL(key='" + getKey() + "', id='" + getId() + "', createTime='" + getCreateTime() + ", title='" + this.title + "', url='" + this.url + "', icon='" + this.icon + "')";
    }

    public boolean update(HandOff handOff) {
        C87412m.m108594g(handOff, "newHandOff");
        boolean update = super.update(handOff);
        if (!(handOff instanceof HandOffURL) || C87412m.m108589b(handOff, this)) {
            return update;
        }
        HandOffURL handOffURL = (HandOffURL) handOff;
        boolean z = false;
        if (handOffURL.title.length() > 0) {
            this.title = handOffURL.title;
        }
        if (handOffURL.url.length() > 0) {
            this.url = handOffURL.url;
        }
        if (handOffURL.icon.length() > 0) {
            this.icon = handOffURL.icon;
        }
        if (handOffURL.nickname.length() > 0) {
            z = true;
        }
        if (z) {
            this.nickname = handOffURL.nickname;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C87412m.m108594g(parcel, "dest");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeString(this.icon);
        parcel.writeString(this.nickname);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HandOffURL(java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, int r17, gy3.C8480h r18) {
        /*
            r9 = this;
            r0 = r17 & 8
            if (r0 == 0) goto L_0x0007
            r0 = 1
            r5 = 1
            goto L_0x0008
        L_0x0007:
            r5 = r13
        L_0x0008:
            r0 = r17 & 16
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0010
            r6 = r1
            goto L_0x0011
        L_0x0010:
            r6 = r14
        L_0x0011:
            r0 = r17 & 32
            if (r0 == 0) goto L_0x0017
            r7 = r1
            goto L_0x0018
        L_0x0017:
            r7 = r15
        L_0x0018:
            r0 = r17 & 64
            if (r0 == 0) goto L_0x0025
            com.tencent.mm.plugin.handoff.model.HandOff$a r0 = com.tencent.p014mm.plugin.handoff.model.HandOff.Companion
            r1 = 2
            java.lang.String r0 = r0.mo57158a(r1, r5)
            r8 = r0
            goto L_0x0027
        L_0x0025:
            r8 = r16
        L_0x0027:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffURL.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, gy3.h):void");
    }

    public HandOffURL() {
        this("", "", "", 0, (String) null, (String) null, (String) null, 120, (C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandOffURL(Parcel parcel) {
        super(parcel);
        C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
        this.nickname = "";
        String readString = parcel.readString();
        C87412m.m108591d(readString);
        this.title = readString;
        String readString2 = parcel.readString();
        C87412m.m108591d(readString2);
        this.url = readString2;
        String readString3 = parcel.readString();
        C87412m.m108591d(readString3);
        this.icon = readString3;
        String readString4 = parcel.readString();
        C87412m.m108591d(readString4);
        this.nickname = readString4;
    }
}

package com.tencent.p014mm.plugin.handoff.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017BY\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011B\t\b\u0016¢\u0006\u0004\b\u0010\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0010\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0018"}, mo182094d2 = {"Lcom/tencent/mm/plugin/handoff/model/HandOffMG;", "Lcom/tencent/mm/plugin/handoff/model/HandOffMP;", "", "getDataType", "Lcom/tencent/mm/plugin/handoff/model/HandOff;", "copy", "", "icon", "title", "appID", "appEntryPage", "appUserName", "handOffType", "from", "to", "key", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "Companion", "b", "api-handoff_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.handoff.model.HandOffMG */
public final class HandOffMG extends HandOffMP {
    public static final Parcelable.Creator<HandOffMG> CREATOR = new C94144a();
    public static final C94145b Companion = new C94145b((C8480h) null);

    /* renamed from: com.tencent.mm.plugin.handoff.model.HandOffMG$a */
    public static final class C94144a implements Parcelable.Creator<HandOffMG> {
        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
            return new HandOffMG(parcel);
        }

        public Object[] newArray(int i) {
            return new HandOffMG[i];
        }
    }

    /* renamed from: com.tencent.mm.plugin.handoff.model.HandOffMG$b */
    public static final class C94145b {
        public C94145b(C8480h hVar) {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOffMG(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffMG.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOffMG(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffMG.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOffMG(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19, java.lang.String r20) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffMG.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HandOffMG(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19, java.lang.String r20, java.lang.String r21) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffMG.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandOffMG(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8) {
        super(str, str2, str3, str4, str5, i, str6, str7, str8);
        C87412m.m108594g(str, "icon");
        C87412m.m108594g(str2, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str3, "appID");
        C87412m.m108594g(str4, "appEntryPage");
        C87412m.m108594g(str5, "appUserName");
        C87412m.m108594g(str6, "from");
        C87412m.m108594g(str7, "to");
        C87412m.m108594g(str8, "key");
    }

    public HandOff copy() {
        HandOffMG handOffMG = new HandOffMG(getIcon(), getTitle(), getAppID(), getAppEntryPage(), getAppUserName(), getHandOffType(), getFrom(), getTo(), getKey());
        handOffMG.setId(getId());
        return handOffMG;
    }

    public int getDataType() {
        return 4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HandOffMG(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, gy3.C8480h r23) {
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
            r1 = 4
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.handoff.model.HandOffMG.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, gy3.h):void");
    }

    public HandOffMG() {
        this("", "", "", "", "", 0, (String) null, (String) null, (String) null, 480, (C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandOffMG(Parcel parcel) {
        super(parcel);
        C87412m.m108594g(parcel, FirebaseAnalytics.C113379b.SOURCE);
    }
}

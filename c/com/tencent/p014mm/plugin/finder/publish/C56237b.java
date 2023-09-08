package com.tencent.p014mm.plugin.finder.publish;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsPostSyncFinderPostStruct;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.sdk.event.EventCenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.MimeTypeUtil;
import com.tencent.p014mm.storage.C72994y1;
import da0.C58247e;
import di3.C86301e;
import di3.C86312j;
import dp1.C58381l;
import dp1.C58408t0;
import dp1.C58417y0;
import ei3.C86522b;
import er1.C58684b;
import er1.C58741j5;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import ht1.C60200t1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import lc3.C10485b;
import o40.C61926c;
import org.json.JSONObject;
import p599lr.C61381b;
import p707tz.C64999e;
import p823sg.C90193h;
import qo1.C12899g;
import qo1.C12900k;
import qo1.C12901n;
import qo1.C63289e;
import qo1.C63292h;
import qo1.C63293i;
import qo1.C63294j;
import qo1.C63295m;
import qo1.C63296o;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import te3.C64237ap1;
import te3.C64311db1;
import te3.C64726td1;
import up1.C37521f;
import uq1.C65433e;
import uq1.C65437f;
import wp1.C15587j;
import z04.C112551y;
import z04.C119027c;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.finder.publish.b */
public final class C56237b extends C86301e implements C61381b {

    /* renamed from: d */
    public final C13601g f160689d = C36568h.m40985a(C29972b.f81143d);

    /* renamed from: e */
    public final C13601g f160690e = C36568h.m40985a(new C56238a(this));

    /* renamed from: com.tencent.mm.plugin.finder.publish.b$b */
    public static final class C29972b extends C87413o implements C32224a<ArrayList<C13604l<? extends Long, ? extends SnsPostSyncFinderPostStruct>>> {

        /* renamed from: d */
        public static final C29972b f81143d = new C29972b();

        public C29972b() {
            super(0);
        }

        public Object invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.publish.b$a */
    public static final class C56238a extends C87413o implements C32224a<FinderPublishFeatureService$snsPostListener$2$1> {

        /* renamed from: d */
        public final /* synthetic */ C56237b f160691d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56238a(C56237b bVar) {
            super(0);
            this.f160691d = bVar;
        }

        public Object invoke() {
            return new FinderPublishFeatureService$snsPostListener$2$1(this.f160691d, C40008f.f107254d);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa  */
    /* renamed from: Cb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo78537Cb(boolean r13) {
        /*
            r12 = this;
            er1.w3 r0 = er1.C58784w3.f168295a
            r1 = 0
            r2 = 1
            int r0 = er1.C58784w3.m68441q(r0, r1, r2, r1)
            up1.f r1 = up1.C37521f.f99374d
            r1.getClass()
            pe1.c<java.lang.Integer> r3 = up1.C37521f.f99486p6
            java.lang.Object r3 = r3.mo60266n()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r4 = 0
            if (r3 != r2) goto L_0x001e
            r3 = 1
            goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            if (r5 < r6) goto L_0x0027
            r6 = 1
            goto L_0x0028
        L_0x0027:
            r6 = 0
        L_0x0028:
            r7 = 2
            if (r0 == r7) goto L_0x002e
            r7 = 3
            if (r0 != r7) goto L_0x004c
        L_0x002e:
            java.lang.Class<ht1.t1> r0 = ht1.C60200t1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.t1 r0 = (ht1.C60200t1) r0
            boolean r0 = r0.mo76873sF()
            if (r0 == 0) goto L_0x004c
            java.lang.Class<ht1.v4> r0 = ht1.C8808v4.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.v4 r0 = (ht1.C8808v4) r0
            boolean r0 = r0.mo9635e()
            if (r0 != 0) goto L_0x004c
            r0 = 1
            goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            zc1.b r7 = zc1.C66785b.f191882e
            java.lang.String r7 = r7.mo90662O5()
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x006d
            r1.getClass()
            pe1.c<java.lang.Integer> r7 = up1.C37521f.f99531u6
            java.lang.Object r7 = r7.mo60266n()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 != r2) goto L_0x006b
            goto L_0x006d
        L_0x006b:
            r7 = 0
            goto L_0x006e
        L_0x006d:
            r7 = 1
        L_0x006e:
            r1.getClass()
            pe1.c<java.lang.Integer> r8 = up1.C37521f.f99540v6
            java.lang.Object r8 = r8.mo60266n()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 == r2) goto L_0x0092
            f40.o r8 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r8 = r8.mo121142i()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_CAN_SHOW_SNS_POST_ENTRY_BOOLEAN_SYNC
            boolean r8 = r8.mo119686g(r9, r4)
            if (r8 == 0) goto L_0x0090
            goto L_0x0092
        L_0x0090:
            r8 = 0
            goto L_0x0093
        L_0x0092:
            r8 = 1
        L_0x0093:
            boolean r9 = r12.wx0()
            r1.getClass()
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99495q6
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != r2) goto L_0x00aa
            r1 = 1
            goto L_0x00ab
        L_0x00aa:
            r1 = 0
        L_0x00ab:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "canShowSnsPostEntrance: switchOpen="
            r10.append(r11)
            r10.append(r3)
            java.lang.String r11 = ", enableFinderEntrance="
            r10.append(r11)
            r10.append(r0)
            java.lang.String r11 = ", serverDynamicMainSwitch="
            r10.append(r11)
            r10.append(r9)
            java.lang.String r11 = ", isPhoto="
            r10.append(r11)
            r10.append(r13)
            java.lang.String r11 = ", isPhotoEnable="
            r10.append(r11)
            r10.append(r1)
            java.lang.String r11 = ", noAccountEnableShow="
            r10.append(r11)
            r10.append(r7)
            java.lang.String r11 = ", serverCanShowEntry="
            r10.append(r11)
            r10.append(r8)
            java.lang.String r11 = ", enableSdkLevel="
            r10.append(r11)
            r10.append(r6)
            java.lang.String r11 = ", sdkLevel="
            r10.append(r11)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            java.lang.String r10 = "FinderPublishFeatureService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r5)
            if (r6 == 0) goto L_0x0112
            if (r3 == 0) goto L_0x0112
            if (r0 == 0) goto L_0x0112
            if (r7 == 0) goto L_0x0112
            if (r8 == 0) goto L_0x0112
            if (r9 == 0) goto L_0x0112
            if (r13 == 0) goto L_0x0113
            if (r1 == 0) goto L_0x0112
            goto L_0x0113
        L_0x0112:
            r2 = 0
        L_0x0113:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.publish.C56237b.mo78537Cb(boolean):boolean");
    }

    /* renamed from: DI */
    public void mo78538DI(Context context, byte[] bArr, String str, String str2, int i, C64311db1 db12, long j, long j2) {
        String str3;
        Context context2 = context;
        byte[] bArr2 = bArr;
        String str4 = str;
        String str5 = str2;
        int i2 = i;
        C64311db1 db13 = db12;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(bArr2, "videoComposition");
        C87412m.m108594g(str4, "videoPath");
        C87412m.m108594g(str5, "desc");
        StringBuilder sb = new StringBuilder();
        sb.append("postSnsVideoByComposition: videoPath=");
        sb.append(str4);
        sb.append(", desc=");
        sb.append(str5);
        sb.append(" videoSource=");
        sb.append(i2);
        sb.append(", location=");
        String str6 = "";
        if (db13 == null || (str3 = db13.f182664g) == null) {
            str3 = str6;
        }
        sb.append(str3);
        Log.m105924i("FinderPublishFeatureService", sb.toString());
        Intent intent = new Intent();
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76842e7(4, 29, 74, intent);
        intent.putExtra("video_composition", bArr2);
        intent.putExtra("key_finder_post_router", 6);
        intent.putExtra("key_finder_post_from", 20);
        intent.putExtra("postType", 4);
        intent.putExtra("postMediaList", C64197v.m75534c(str4));
        intent.putExtra("postTypeList", C64197v.m75534c(4));
        String str7 = C86709a0.m107523b().mo121111i() + '_' + Util.nowMilliSecond();
        intent.putExtra("post_id", str7);
        intent.putExtra("edit_id", str7);
        intent.putExtra("saveDesc", str5);
        intent.putExtra("KEY_SHOW_FINDER_ACTION_BAR_TITLE", true);
        intent.putExtra("KEY_SNS_SERVER_FEED_ID", j);
        intent.putExtra("KEY_SNS_LOCAL_FEED_ID", j2);
        if (db13 != null) {
            vx0(intent, db13);
        }
        C58408t0 t0Var = C58408t0.f167336a;
        t0Var.mo83266l(16, false);
        t0Var.mo83260f(i2);
        ((C58684b) C86312j.m106911c(C58684b.class)).Vx0(context2, intent);
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb != null) {
            str6 = Wb;
        }
        fd0(true, j, str6, j2, false);
    }

    public C63292h E80() {
        return PublishPostApi.INSTANCE;
    }

    /* renamed from: ER */
    public boolean mo78540ER() {
        C37521f.f99374d.getClass();
        boolean z = true;
        if (C37521f.f99522t6.mo60266n().intValue() != 1) {
            z = false;
        }
        Log.m105924i("FinderPublishFeatureService", "templateEditSelectNoTemplate: ret " + z);
        return z;
    }

    /* renamed from: Ea */
    public String mo78541Ea() {
        C58741j5 j5Var = C58741j5.f168184a;
        return C58741j5.f168195l;
    }

    public String G20() {
        C58741j5 j5Var = C58741j5.f168184a;
        StringBuilder sb = new StringBuilder();
        sb.append(C58741j5.f168193j);
        byte[] bytes = String.valueOf(System.currentTimeMillis()).getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        sb.append(C90193h.m112878f(bytes));
        return sb.toString();
    }

    /* renamed from: NY */
    public void mo78543NY(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        hashSet.add(C13442s8.class);
    }

    /* renamed from: QE */
    public boolean mo78544QE(long j) {
        C37521f.f99374d.getClass();
        long longValue = C37521f.f99549w6.mo60266n().longValue();
        boolean z = j >= longValue;
        Log.m105924i("FinderPublishFeatureService", "checkVideoEnableFinderPost: enableShowFinderPost=" + z + ", durationMs=" + j + ", durationLimit=" + longValue);
        return z;
    }

    /* renamed from: UQ */
    public C12899g mo78545UQ() {
        C65437f fVar = C65437f.f188296h;
        return C65437f.f188296h;
    }

    /* renamed from: Vy */
    public VideoTransPara mo78546Vy() {
        return C37521f.f99374d.mo61161O();
    }

    /* renamed from: WG */
    public void mo78547WG(Context context, List<String> list, String str, int i, C64311db1 db12, long j, long j2) {
        String str2;
        Context context2 = context;
        String str3 = str;
        int i2 = i;
        C64311db1 db13 = db12;
        Class cls = C60200t1.class;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(list, "imagePathList");
        C87412m.m108594g(str3, "desc");
        StringBuilder sb = new StringBuilder();
        sb.append("postSnsPhotos: imagePathSize=");
        sb.append(list.size());
        sb.append(", desc=");
        sb.append(str3);
        sb.append(" videoSource=");
        sb.append(i2);
        sb.append(", location=");
        String str4 = "";
        if (db13 == null || (str2 = db13.f182664g) == null) {
            str2 = str4;
        }
        sb.append(str2);
        Log.m105924i("FinderPublishFeatureService", sb.toString());
        Intent intent = new Intent();
        ((C60200t1) C86312j.m106911c(cls)).mo76842e7(4, 29, 74, intent);
        intent.putExtra("key_finder_sns_post_type", 4);
        intent.putExtra("key_finder_post_router", 6);
        intent.putExtra("key_finder_post_from", 20);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (T next : list) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                String str5 = (String) next;
                String mimeTypeByFilePath = MimeTypeUtil.getMimeTypeByFilePath(str5);
                arrayList.add(GalleryItem$MediaItem.m65488c(1, (long) i3, str5, "", Util.isNullOrNil(mimeTypeByFilePath) ? str4 : mimeTypeByFilePath));
                i3 = i4;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        intent.putParcelableArrayListExtra("key_finder_post_sns_photo_path_list", arrayList);
        String str6 = C86709a0.m107523b().mo121111i() + '_' + Util.nowMilliSecond();
        intent.putExtra("post_id", str6);
        intent.putExtra("edit_id", str6);
        intent.putExtra("saveDesc", str3);
        intent.putExtra("KEY_SHOW_FINDER_ACTION_BAR_TITLE", true);
        intent.putExtra("KEY_SNS_SERVER_FEED_ID", j);
        intent.putExtra("KEY_SNS_LOCAL_FEED_ID", j2);
        if (db13 != null) {
            vx0(intent, db13);
        }
        C58408t0 t0Var = C58408t0.f167336a;
        t0Var.mo83266l(16, false);
        t0Var.mo83260f(i2);
        ((C60200t1) C86312j.m106911c(cls)).mo76837c0(context2, intent);
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb != null) {
            str4 = Wb;
        }
        fd0(true, j, str4, j2, true);
    }

    public C63289e Xs0() {
        requireAccountInitialized();
        return C65433e.f188292a;
    }

    public C63293i Yp0() {
        return C63295m.f179622a;
    }

    public boolean Zl0() {
        C37521f.f99374d.getClass();
        boolean z = C37521f.f99540v6.mo60266n().intValue() == 1 || C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_FINDER_CAN_SHOW_SNS_POST_ENTRY_BOOLEAN_SYNC, false);
        boolean wx02 = wx0();
        Log.m105924i("FinderPublishFeatureService", "canShowSnsEditPostFinderEntrance: serverCanShowEntry=" + z + ", serverDynamicMainSwitch=" + wx02);
        return z && wx02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r3 == null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("FinderPublishFeatureService", "parsesFinderDynamicAbility: notFinderUser=" + r1 + ", is not sns post relative ability");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        if (r9.f141454d == 1) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if ((r4 != null ? r4.f135570d : null) != null) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b3 A[EDGE_INSN: B:51:0x00b3->B:47:0x00b3 ?: BREAK  , SYNTHETIC] */
    /* renamed from: eX */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo78551eX(te3.C51553uj0 r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "info"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "source"
            gy3.C87412m.m108594g(r10, r0)
            zc1.b r0 = zc1.C66785b.f191882e
            java.lang.String r0 = r0.mo90662O5()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r2 = "FinderPublishFeatureService"
            r3 = 0
            if (r1 == 0) goto L_0x0024
            te3.ip1 r4 = r9.f142870d
            if (r4 == 0) goto L_0x0021
            te3.se0 r4 = r4.f135570d
            goto L_0x0022
        L_0x0021:
            r4 = r3
        L_0x0022:
            if (r4 == 0) goto L_0x0050
        L_0x0024:
            java.lang.String r4 = "info.author_ability"
            if (r1 != 0) goto L_0x006a
            java.util.LinkedList<te3.yf0> r5 = r9.f142871e
            gy3.C87412m.m108593f(r5, r4)
            java.util.Iterator r5 = r5.iterator()
        L_0x0031:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0047
            java.lang.Object r6 = r5.next()
            r7 = r6
            te3.yf0 r7 = (te3.C52108yf0) r7
            java.lang.String r7 = r7.f145256d
            boolean r7 = gy3.C87412m.m108589b(r7, r0)
            if (r7 == 0) goto L_0x0031
            goto L_0x0048
        L_0x0047:
            r6 = r3
        L_0x0048:
            te3.yf0 r6 = (te3.C52108yf0) r6
            if (r6 == 0) goto L_0x004e
            te3.zf0 r3 = r6.f145257e
        L_0x004e:
            if (r3 != 0) goto L_0x006a
        L_0x0050:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "parsesFinderDynamicAbility: notFinderUser="
            r9.append(r10)
            r9.append(r1)
            java.lang.String r10 = ", is not sns post relative ability"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
            return
        L_0x006a:
            r3 = 1
            r5 = 0
            if (r1 == 0) goto L_0x007d
            te3.ip1 r9 = r9.f142870d
            if (r9 == 0) goto L_0x007b
            te3.se0 r9 = r9.f135570d
            if (r9 == 0) goto L_0x007b
            int r9 = r9.f141454d
            if (r9 != r3) goto L_0x007b
            goto L_0x00b3
        L_0x007b:
            r3 = 0
            goto L_0x00b3
        L_0x007d:
            java.util.LinkedList<te3.yf0> r9 = r9.f142871e
            gy3.C87412m.m108593f(r9, r4)
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L_0x0089
            goto L_0x007b
        L_0x0089:
            java.util.Iterator r9 = r9.iterator()
        L_0x008d:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x007b
            java.lang.Object r1 = r9.next()
            te3.yf0 r1 = (te3.C52108yf0) r1
            java.lang.String r4 = r1.f145256d
            boolean r4 = gy3.C87412m.m108589b(r4, r0)
            if (r4 == 0) goto L_0x00b0
            te3.zf0 r1 = r1.f145257e
            if (r1 == 0) goto L_0x00ab
            int r1 = r1.f145858d
            if (r1 != r3) goto L_0x00ab
            r1 = 1
            goto L_0x00ac
        L_0x00ab:
            r1 = 0
        L_0x00ac:
            if (r1 == 0) goto L_0x00b0
            r1 = 1
            goto L_0x00b1
        L_0x00b0:
            r1 = 0
        L_0x00b1:
            if (r1 == 0) goto L_0x008d
        L_0x00b3:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = "processFinderDynamicAbility enable show sns entry = "
            r9.append(r1)
            r9.append(r3)
            java.lang.String r1 = ", source = "
            r9.append(r1)
            r9.append(r10)
            java.lang.String r10 = " myFinderUsername="
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
            f40.o r9 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()
            com.tencent.mm.storage.y1$a r10 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_CAN_SHOW_SNS_POST_ENTRY_BOOLEAN_SYNC
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r9.mo119677K(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.publish.C56237b.mo78551eX(te3.uj0, java.lang.String):void");
    }

    public void fd0(boolean z, long j, String str, long j2, boolean z2) {
        boolean z3 = z;
        String str2 = str;
        C87412m.m108594g(str2, "sessionId");
        Log.m105924i("FinderPublishFeatureService", "reportSnsPostEntrance: isClick=" + z3 + ", snsFeedId=" + C61926c.m72691p(j) + ", snsLocalId=" + j2);
        long j3 = 15;
        long j4 = 2;
        if (j != 0) {
            SnsPostSyncFinderPostStruct snsPostSyncFinderPostStruct = new SnsPostSyncFinderPostStruct();
            if (!z3) {
                j4 = 1;
            }
            snsPostSyncFinderPostStruct.f156853d = j4;
            snsPostSyncFinderPostStruct.f156854e = snsPostSyncFinderPostStruct.mo86045b("snsfeedid", C61926c.m72691p(j), true);
            snsPostSyncFinderPostStruct.f156855f = snsPostSyncFinderPostStruct.mo86045b("FinderPublishSessionId", str2, true);
            if (z2) {
                j3 = 1;
            }
            snsPostSyncFinderPostStruct.f156857h = j3;
            snsPostSyncFinderPostStruct.mo86054n();
            ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(snsPostSyncFinderPostStruct);
            return;
        }
        if (!EventCenter.instance.hadListened((FinderPublishFeatureService$snsPostListener$2$1) ((C36570n) this.f160690e).getValue())) {
            ((FinderPublishFeatureService$snsPostListener$2$1) ((C36570n) this.f160690e).getValue()).alive();
        }
        SnsPostSyncFinderPostStruct snsPostSyncFinderPostStruct2 = new SnsPostSyncFinderPostStruct();
        if (!z3) {
            j4 = 1;
        }
        snsPostSyncFinderPostStruct2.f156853d = j4;
        snsPostSyncFinderPostStruct2.f156855f = snsPostSyncFinderPostStruct2.mo86045b("FinderPublishSessionId", str2, true);
        if (z2) {
            j3 = 1;
        }
        snsPostSyncFinderPostStruct2.f156857h = j3;
        ((ArrayList) ((C36570n) this.f160689d).getValue()).add(new C13604l(Long.valueOf(j2), snsPostSyncFinderPostStruct2));
    }

    /* renamed from: iZ */
    public String mo78553iZ(Context context) {
        C87412m.m108594g(context, "context");
        String b = C15587j.f42215a.mo14350b("FinderObjectDynamicItemKey_SnsPostEntry");
        String string = Util.isNullOrNil(b) ? context.getResources().getString(C0966R.string.mpv) : b == null ? "" : b;
        C87412m.m108593f(string, "if (Util.isNullOrNil(dyn…else dynamicWording ?: \"\"");
        Log.m105924i("FinderPublishFeatureService", "getSnsPostEntranceTips: text = " + string + ", dynamicWording=" + b);
        return string;
    }

    /* renamed from: lj */
    public void mo78554lj(Context context, String str, String str2, int i, C64311db1 db12, long j, long j2, C64237ap1 ap12, Intent intent) {
        String str3;
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        int i2 = i;
        C64311db1 db13 = db12;
        C64237ap1 ap13 = ap12;
        Intent intent2 = intent;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(str4, "videoPath");
        C87412m.m108594g(str5, "desc");
        C87412m.m108594g(intent2, "intent");
        if (Util.isNullOrNil(str)) {
            Log.m105920e("FinderPublishFeatureService", "postSnsOriginVideoDirectly: video path is null");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("postSnsOriginVideoDirectly: videoPath=");
        sb.append(str4);
        sb.append(", desc=");
        sb.append(str5);
        sb.append(" videoSource=");
        sb.append(i2);
        sb.append(" location=");
        if (db13 == null || (str3 = db13.f182664g) == null) {
            str3 = "";
        }
        sb.append(str3);
        sb.append(" videoTemplateInfo=(");
        String str6 = null;
        sb.append(ap13 != null ? ap13.f182115d : null);
        sb.append(',');
        if (ap13 != null) {
            str6 = ap13.f182121j;
        }
        sb.append(str6);
        sb.append(')');
        Log.m105924i("FinderPublishFeatureService", sb.toString());
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76842e7(4, 29, 74, intent2);
        intent2.putExtra("key_finder_post_router", 6);
        intent2.putExtra("key_finder_post_from", 20);
        String str7 = C86709a0.m107523b().mo121111i() + '_' + Util.nowMilliSecond();
        intent2.putExtra("edit_id", str7);
        intent2.putExtra("post_id", str7);
        intent2.putExtra("postType", 4);
        intent2.putExtra("postMediaList", C64197v.m75534c(str4));
        intent2.putExtra("postTypeList", C64197v.m75534c(4));
        intent2.putExtra("isLongVideoPost", false);
        intent2.putExtra("saveDesc", str5);
        intent2.putExtra("KEY_SHOW_FINDER_ACTION_BAR_TITLE", true);
        intent2.putExtra("KEY_SNS_SERVER_FEED_ID", j);
        intent2.putExtra("KEY_SNS_LOCAL_FEED_ID", j2);
        if (ap13 != null) {
            intent2.putExtra("KEY_POST_VIDEO_TEMPLATE", ap12.toByteArray());
        }
        if (db13 != null) {
            vx0(intent2, db13);
        }
        C58408t0 t0Var = C58408t0.f167336a;
        t0Var.mo83266l(16, false);
        t0Var.mo83260f(i2);
        if (ap13 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("template_id", ap13.f182115d);
            jSONObject.put("music_id", ap13.f182121j);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().also {\n    …\n            }.toString()");
            String n = C112551y.m153814n(jSONObject2, ",", ";", false);
            FinderFeedReportObject finderFeedReportObject = C58408t0.f167337b;
            if (finderFeedReportObject != null) {
                finderFeedReportObject.tempateInfo = n;
            }
        }
        ((C58684b) C86312j.m106911c(C58684b.class)).Vx0(context2, intent2);
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        fd0(true, j, Wb == null ? "" : Wb, j2, false);
    }

    /* renamed from: oT */
    public C63294j mo78555oT() {
        return C12901n.f36884a;
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        C65437f fVar = C65437f.f188296h;
        C65437f fVar2 = C65437f.f188296h;
        fVar2.f188298a.mo89353f(fVar2.f188302e);
        fVar2.mo12412e(C58408t0.f167338c);
        C58381l lVar = C58381l.f167278a;
        fVar2.mo12418k(C58381l.f167280c);
        ((C64999e) C86312j.m106911c(C64999e.class)).mo89157L0();
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        C65437f fVar = C65437f.f188296h;
        C65437f fVar2 = C65437f.f188296h;
        fVar2.f188298a.mo89354g(fVar2.f188302e);
        fVar2.mo12417j(C58408t0.f167338c);
        C58381l lVar = C58381l.f167278a;
        fVar2.mo12415h(C58381l.f167280c);
        ((C64999e) C86312j.m106911c(C64999e.class)).destroy();
    }

    public C12900k pa0() {
        return C63296o.f179623a;
    }

    public void qg0(Context context, List<String> list, byte[] bArr, String str, int i, C64311db1 db12, long j, long j2) {
        String str2;
        Context context2 = context;
        List<String> list2 = list;
        byte[] bArr2 = bArr;
        String str3 = str;
        int i2 = i;
        C64311db1 db13 = db12;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(list2, "imagePathList");
        C87412m.m108594g(str3, "desc");
        if (list.isEmpty()) {
            Log.m105920e("FinderPublishFeatureService", "postSnsPhotosDirectly: image path list is empty");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("postSnsPhotosDirectly: desc=");
        sb.append(str3);
        sb.append(" videoSource=");
        sb.append(i2);
        sb.append(" location=");
        if (db13 == null || (str2 = db13.f182664g) == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append(' ');
        Log.m105924i("FinderPublishFeatureService", sb.toString());
        Intent intent = new Intent();
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76842e7(4, 29, 74, intent);
        intent.putExtra("key_finder_post_router", 6);
        intent.putExtra("key_finder_post_from", 20);
        String str4 = C86709a0.m107523b().mo121111i() + '_' + Util.nowMilliSecond();
        intent.putExtra("edit_id", str4);
        intent.putExtra("post_id", str4);
        intent.putExtra("postType", 2);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list2);
        C13598b0 b0Var = C13598b0.f38549a;
        intent.putExtra("postMediaList", arrayList);
        ArrayList c = C64197v.m75534c(2);
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            c.add(2);
        }
        C13598b0 b0Var2 = C13598b0.f38549a;
        intent.putExtra("postTypeList", c);
        intent.putExtra("isLongVideoPost", false);
        intent.putExtra("saveDesc", str3);
        intent.putExtra("KEY_SHOW_FINDER_ACTION_BAR_TITLE", true);
        intent.putExtra("KEY_SNS_SERVER_FEED_ID", j);
        intent.putExtra("KEY_SNS_LOCAL_FEED_ID", j2);
        if (bArr2 != null) {
            intent.putExtra("MEDIA_EXTRA_MUSIC", bArr2);
        }
        if (db13 != null) {
            vx0(intent, db13);
        }
        C58408t0 t0Var = C58408t0.f167336a;
        t0Var.mo83266l(16, false);
        t0Var.mo83260f(i2);
        ((C58684b) C86312j.m106911c(C58684b.class)).Vx0(context2, intent);
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        fd0(true, j, Wb == null ? "" : Wb, j2, true);
    }

    public final void vx0(Intent intent, C64311db1 db12) {
        intent.putExtra("saveLocation", true);
        intent.putExtra("get_poi_name", db12.f182664g);
        intent.putExtra("get_city", db12.f182663f);
        intent.putExtra("get_lat", db12.f182662e);
        intent.putExtra("get_lng", db12.f182661d);
        intent.putExtra("get_poi_address", db12.f182665h);
        intent.putExtra("get_poi_classify_id", db12.f182666i);
    }

    public final boolean wx0() {
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("FinderForbiddenSnsPostTips");
        Log.m105924i("FinderPublishFeatureService", "getSnsPostFinderDynamicMainSwitch, getDynamicConfig=" + c);
        if (Util.isNullOrNil(c)) {
            return true;
        }
        try {
            int optInt = new JSONObject(c).optInt("ForbiddenShowTips", 0);
            Log.m105924i("FinderPublishFeatureService", "getSnsPostFinderDynamicMainSwitch: config=" + optInt);
            return optInt != 1;
        } catch (Exception unused) {
            Log.m105920e("FinderPublishFeatureService", "getSnsPostFinderDynamicMainSwitch parse Json error!");
            return true;
        }
    }

    /* renamed from: xU */
    public boolean mo78560xU() {
        C37521f.f99374d.getClass();
        boolean z = C37521f.f99513s6.mo60266n().intValue() == 1;
        boolean Ze = ((C58247e) C86312j.m106911c(C58247e.class)).mo82985Ze();
        Log.m105924i("FinderPublishFeatureService", "photoToVideo: ret " + z + ", deviceSupport " + Ze);
        return z && Ze;
    }

    /* renamed from: xg */
    public String mo78561xg(C64726td1 td12) {
        C87412m.m108594g(td12, "musicInfo");
        return C58741j5.f168184a.mo83729c(td12);
    }
}

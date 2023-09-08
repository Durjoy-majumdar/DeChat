package jp2;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gv2.C98242p;
import java.util.Iterator;
import java.util.LinkedList;
import rq2.C101425k;
import te3.C64509l2;
import te3.w64;
import vr2.C102236a0;

/* renamed from: jp2.d */
public class C98955d {

    /* renamed from: A */
    public int f290072A;

    /* renamed from: B */
    public int f290073B;

    /* renamed from: C */
    public int f290074C;

    /* renamed from: D */
    public int f290075D;

    /* renamed from: E */
    public int f290076E;

    /* renamed from: F */
    public boolean f290077F;

    /* renamed from: G */
    public int f290078G;

    /* renamed from: H */
    public String f290079H;

    /* renamed from: I */
    public boolean f290080I;

    /* renamed from: J */
    public boolean f290081J;

    /* renamed from: a */
    public boolean f290082a = false;

    /* renamed from: b */
    public int f290083b;

    /* renamed from: c */
    public SnsObject f290084c;

    /* renamed from: d */
    public View f290085d;

    /* renamed from: e */
    public View f290086e;

    /* renamed from: f */
    public int f290087f = 0;

    /* renamed from: g */
    public int f290088g = 0;

    /* renamed from: h */
    public int f290089h = 0;

    /* renamed from: i */
    public int f290090i;

    /* renamed from: j */
    public View f290091j;

    /* renamed from: k */
    public int f290092k = 0;

    /* renamed from: l */
    public int f290093l;

    /* renamed from: m */
    public String f290094m;

    /* renamed from: n */
    public long f290095n;

    /* renamed from: o */
    public ADXml f290096o;

    /* renamed from: p */
    public int f290097p;

    /* renamed from: q */
    public int f290098q;

    /* renamed from: r */
    public int f290099r;

    /* renamed from: s */
    public long f290100s;

    /* renamed from: t */
    public long f290101t;

    /* renamed from: u */
    public int f290102u;

    /* renamed from: v */
    public long f290103v;

    /* renamed from: w */
    public int f290104w;

    /* renamed from: x */
    public long f290105x;

    /* renamed from: y */
    public long f290106y;

    /* renamed from: z */
    public long f290107z;

    public C98955d(ADInfo aDInfo, String str, long j, View view, int i, View view2, int i2, int i3, SnsObject snsObject, int i4, ADXml aDXml, boolean z) {
        ADInfo aDInfo2 = aDInfo;
        boolean z2 = z;
        String str2 = "";
        this.f290094m = str2;
        this.f290095n = 0;
        this.f290097p = -10086;
        this.f290098q = -10086;
        this.f290099r = -10086;
        this.f290100s = 0;
        this.f290101t = 0;
        this.f290102u = -10086;
        this.f290103v = 0;
        this.f290104w = -10086;
        this.f290105x = 0;
        this.f290106y = 0;
        this.f290107z = 0;
        this.f290072A = 0;
        this.f290073B = -1;
        this.f290074C = -1;
        this.f290075D = 0;
        this.f290076E = 0;
        this.f290077F = false;
        this.f290078G = 0;
        this.f290079H = str2;
        this.f290080I = false;
        this.f290081J = false;
        this.f290083b = i4;
        this.f290085d = view;
        this.f290084c = snsObject;
        this.f290096o = aDXml;
        if (aDInfo2 != null) {
            Util.nullAs(aDInfo2.viewId, str2);
        }
        this.f290094m = aDInfo2 != null ? Util.nullAs(aDInfo2.uxInfo, str2) : str2;
        this.f290079H = str;
        this.f290095n = j;
        this.f290080I = z2;
        this.f290090i = i;
        this.f290091j = view2;
        this.f290092k = i2;
        View view3 = this.f290085d;
        if (view3 != null) {
            this.f290086e = view3.findViewById(C0966R.C0970id.f5735n7);
        }
        mo138285f();
        Log.m105924i("MicroMsg.SnsAdStatistic", "new AdViewStatic, isImproveUI=" + z2);
    }

    /* renamed from: d */
    public static int m128829d(SnsObject snsObject) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("getReportCommentCount", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
        int i = 0;
        if (snsObject == null) {
            Log.m105920e("MicroMsg.AdViewStatic", "getReportCommentCount, snsObj==null");
            SnsMethodCalculate.markEndTimeMs("getReportCommentCount", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
            return 0;
        }
        LinkedList<w64> linkedList = snsObject.CommentUserList;
        if (linkedList != null) {
            Iterator<w64> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                w64 next = it.next();
                if (next != null && C98242p.m126942d(next.f299716t, 32)) {
                    z = true;
                    break;
                }
            }
            int size = linkedList.size();
            if (z) {
                size--;
            }
            if (size >= 0) {
                i = size;
            }
            Log.m105924i("MicroMsg.AdViewStatic", "getReportCommentCount, snsId=" + C102236a0.m134765q0(snsObject.f283891Id) + ", commentList.size=" + linkedList.size() + ", commentCount=" + snsObject.CommentUserListCount + ", ret=" + i);
            SnsMethodCalculate.markEndTimeMs("getReportCommentCount", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
            return i;
        }
        SnsMethodCalculate.markEndTimeMs("getReportCommentCount", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
        return 0;
    }

    /* renamed from: e */
    public static int m128830e(SnsObject snsObject) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("getReportLikeCount", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
        int i = 0;
        if (snsObject == null) {
            Log.m105920e("MicroMsg.AdViewStatic", "getReportLikeCount, snsObj is null");
            SnsMethodCalculate.markEndTimeMs("getReportLikeCount", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
            return 0;
        }
        LinkedList<w64> linkedList = snsObject.LikeUserList;
        if (C101425k.m133097a(linkedList)) {
            Log.m105924i("MicroMsg.AdViewStatic", "getReportLikeCount, likeUserList is null or empty");
            SnsMethodCalculate.markEndTimeMs("getReportLikeCount", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
            return 0;
        }
        Iterator<w64> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            w64 next = it.next();
            if (next == null) {
                Log.m105920e("MicroMsg.AdViewStatic", "getReportLikeCount, likeUserList is not null or empty, but why the node is null??");
            } else if (C98242p.m126942d(next.f299716t, 128)) {
                z = true;
                break;
            }
        }
        int size = linkedList.size();
        if (z) {
            size--;
        }
        if (size >= 0) {
            i = size;
        }
        Log.m105924i("MicroMsg.AdViewStatic", "getReportLikeCount, snsId is " + C102236a0.m134765q0(snsObject.f283891Id) + ", likeUserList.size is " + linkedList.size() + ", likeCount is " + snsObject.LikeUserListCount + ", ret is " + i);
        SnsMethodCalculate.markEndTimeMs("getReportLikeCount", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
        return i;
    }

    /* renamed from: a */
    public void mo138282a(boolean z) {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        String str7;
        String str8;
        int i3;
        String str9;
        boolean z2;
        String str10;
        boolean z3;
        boolean z4 = z;
        String str11 = "calc";
        SnsMethodCalculate.markStartTimeMs(str11, "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
        if (this.f290085d != null) {
            mo138285f();
            Log.m105918d("MicroMsg.SnsAdStatistic", "-calc old, isEnd=" + this.f290077F + ", vh=" + this.f290088g + ", isScroll=" + z4 + "， isImproveUI=" + this.f290080I);
            if (this.f290077F || this.f290088g <= 0) {
                SnsMethodCalculate.markEndTimeMs(str11, "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                return;
            }
            this.f290082a = true;
            int[] iArr = new int[2];
            this.f290085d.getLocationOnScreen(iArr);
            int i4 = (iArr[1] - this.f290093l) - this.f290092k;
            int i5 = this.f290088g + i4;
            if (i4 < 0 || i5 < 0 || i5 > this.f290090i) {
                this.f290078G = 0;
            } else {
                this.f290078G = 1;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("set old isFull=");
            sb.append(this.f290078G == 1);
            sb.append(", top=");
            sb.append(i4);
            sb.append(", bottom=");
            sb.append(i5);
            sb.append(", SCREEN_HEIGHT=");
            sb.append(this.f290090i);
            Log.m105918d("MicroMsg.SnsAdStatistic", sb.toString());
            if (this.f290097p == -10086 && this.f290098q == -10086) {
                this.f290097p = i4;
                this.f290098q = i5;
            }
            this.f290099r = i4;
            Log.m105924i("MicroMsg.AdViewStatic", "get top " + i4 + " bottom " + i5 + " body_half: " + this.f290089h + "| " + (this.f290088g + i4) + "  firsttop " + this.f290097p + " endtop " + this.f290099r);
            String str12 = str11;
            String str13 = "com.tencent.mm.plugin.sns.ad.model.AdViewStatic";
            if (i4 < 0) {
                int i6 = this.f290088g;
                int i7 = i5;
                int i8 = i4 + i6;
                int i9 = i6 - i8;
                str5 = " bottom ";
                StringBuilder sb4 = new StringBuilder();
                str4 = "down first touch half";
                sb4.append("top ");
                sb4.append(i4);
                sb4.append(" screen in ");
                sb4.append(i8);
                sb4.append(" out: ");
                sb4.append(i9);
                Log.m105924i("MicroMsg.AdViewStatic", sb4.toString());
                if (i8 < this.f290089h || this.f290102u != -10086) {
                    str7 = " screen in ";
                    str8 = "MicroMsg.SnsAdStatistic";
                    str10 = " top ";
                    str3 = "up first touch half";
                    z3 = true;
                } else {
                    this.f290102u = i4;
                    str7 = " screen in ";
                    str8 = "MicroMsg.SnsAdStatistic";
                    this.f290103v = System.currentTimeMillis();
                    Log.m105924i("MicroMsg.AdViewStatic", "up first touch half" + i8 + " top " + i4 + " viewhieght " + this.f290088g + " inscreenval: " + i8 + " outscreenval: " + i9);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("--halfExposure old 0, begin:");
                    str10 = " top ";
                    str3 = "up first touch half";
                    sb5.append(this.f290103v);
                    sb5.append(", hash=");
                    sb5.append(hashCode());
                    Log.m105918d(str8, sb5.toString());
                    z3 = false;
                }
                if (i9 < this.f290089h || this.f290104w != -10086 || !z3 || this.f290103v <= 0) {
                    i = i4;
                    str2 = "MicroMsg.AdViewStatic";
                    i2 = i7;
                    str6 = str10;
                } else {
                    this.f290104w = i4;
                    this.f290105x = System.currentTimeMillis();
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str4);
                    sb6.append(i8);
                    sb6.append(str5);
                    i2 = i7;
                    sb6.append(i2);
                    sb6.append(" viewhieght ");
                    sb6.append(this.f290088g);
                    sb6.append(" inscreenval: ");
                    sb6.append(i8);
                    sb6.append(" outscreenval: ");
                    sb6.append(i9);
                    Log.m105924i("MicroMsg.AdViewStatic", sb6.toString());
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("--halfExposure old 0, end:");
                    str6 = str10;
                    str2 = "MicroMsg.AdViewStatic";
                    i = i4;
                    sb7.append(this.f290105x - this.f290103v);
                    sb7.append(", hash=");
                    sb7.append(hashCode());
                    Log.m105918d(str8, sb7.toString());
                }
                mo138283b(i8, i9);
            } else {
                i = i4;
                str4 = "down first touch half";
                str5 = " bottom ";
                str2 = "MicroMsg.AdViewStatic";
                str6 = " top ";
                str3 = "up first touch half";
                str7 = " screen in ";
                str8 = "MicroMsg.SnsAdStatistic";
                i2 = i5;
            }
            int i15 = this.f290090i;
            if (i2 > i15) {
                int i16 = i2 - i15;
                int i17 = this.f290088g - i16;
                str9 = str2;
                Log.m105924i(str9, "bottom " + i2 + str7 + i17 + " out: " + i16);
                if (i17 < this.f290089h || this.f290102u != -10086) {
                    i3 = i;
                    z2 = true;
                } else {
                    i3 = i;
                    this.f290102u = i3;
                    this.f290103v = System.currentTimeMillis();
                    Log.m105924i(str9, str3 + i16 + str6 + i3 + " viewhieght " + this.f290088g + " inscreenval: " + i17 + " outscreenval: " + i16);
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("--halfExposure old 1, begin:");
                    sb8.append(this.f290103v);
                    sb8.append(", hash=");
                    sb8.append(hashCode());
                    Log.m105918d(str8, sb8.toString());
                    z2 = false;
                }
                if (i16 >= this.f290089h && this.f290104w == -10086 && z2 && this.f290103v > 0) {
                    this.f290104w = i3;
                    this.f290105x = System.currentTimeMillis();
                    Log.m105924i(str9, str4 + i16 + str5 + i2 + " viewhieght " + this.f290088g + " inscreenval: " + i17 + " outscreenval: " + i16);
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append("--halfExposure old 1, end:");
                    sb9.append(this.f290105x - this.f290103v);
                    sb9.append(", hash=");
                    sb9.append(hashCode());
                    Log.m105918d(str8, sb9.toString());
                }
                mo138283b(i17, i16);
            } else {
                str9 = str2;
                i3 = i;
            }
            if (i3 < 0 || i2 > this.f290090i) {
                if (this.f290107z == 0 && this.f290106y != 0) {
                    this.f290107z = System.currentTimeMillis();
                    Log.m105918d(str8, "--fullExposure old, end:" + (this.f290107z - this.f290106y) + ", hash=" + hashCode());
                }
            } else if (this.f290106y == 0) {
                this.f290106y = System.currentTimeMillis();
                Log.m105918d(str8, "--fullExposure old, begin:" + this.f290106y + ", hash=" + hashCode());
            }
            if (i3 < 0) {
                int i18 = -i3;
                int i19 = this.f290073B;
                if (i19 == -1 || i19 > i18) {
                    this.f290073B = i18;
                }
            } else {
                this.f290073B = 0;
            }
            int i25 = this.f290090i;
            if (i2 > i25) {
                int i26 = i2 - i25;
                int i27 = this.f290074C;
                if (i27 == -1 || i27 > i26) {
                    this.f290074C = i26;
                }
            } else {
                this.f290074C = 0;
            }
            int i28 = this.f290088g;
            if (i3 < 0) {
                i28 += i3;
            }
            if (i2 > i25) {
                i28 -= i2 - i25;
            }
            int i29 = this.f290072A;
            if (i29 == -1 || i29 < i28) {
                this.f290072A = i28;
            }
            StringBuilder sb10 = new StringBuilder();
            sb10.append("unreadtop: ");
            sb10.append(this.f290073B);
            sb10.append(" unreadBottom:");
            sb10.append(this.f290074C);
            sb10.append(" readHeight: ");
            sb10.append(this.f290072A);
            sb10.append(z ? " isScrooIde" : "");
            Log.m105924i(str9, sb10.toString());
            str11 = str12;
            str = str13;
        } else {
            str = "com.tencent.mm.plugin.sns.ad.model.AdViewStatic";
        }
        SnsMethodCalculate.markEndTimeMs(str11, str);
    }

    /* renamed from: b */
    public void mo138283b(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("calcHalfVisibleState", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
        int i3 = this.f290089h;
        boolean z = true;
        if (i >= i3) {
            this.f290081J = true;
            z = false;
        }
        if (i2 >= i3 && z) {
            this.f290081J = false;
        }
        Log.m105918d("MicroMsg.SnsAdStatistic", "calcHalfVisibleState, set isHalf=" + this.f290081J);
        SnsMethodCalculate.markEndTimeMs("calcHalfVisibleState", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
    }

    /* renamed from: c */
    public C64509l2 mo138284c() {
        SnsObject e;
        SnsMethodCalculate.markStartTimeMs("getAdExposureSocialInfo", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
        C64509l2 l2Var = new C64509l2();
        SnsInfo SE = C94866e1.Yx0().mo139806SE(this.f290095n);
        if (SE == null || (e = C94897n1.m120367e(SE)) == null) {
            SnsObject snsObject = this.f290084c;
            if (snsObject != null) {
                l2Var.f184022e = m128829d(snsObject);
                l2Var.f184021d = m128830e(this.f290084c);
                SnsMethodCalculate.markEndTimeMs("getAdExposureSocialInfo", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                return l2Var;
            }
            SnsMethodCalculate.markEndTimeMs("getAdExposureSocialInfo", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
            return null;
        }
        l2Var.f184022e = m128829d(e);
        l2Var.f184021d = m128830e(e);
        SnsMethodCalculate.markEndTimeMs("getAdExposureSocialInfo", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
        return l2Var;
    }

    /* renamed from: f */
    public final void mo138285f() {
        View view;
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
        if (this.f290088g == 0 && (view = this.f290085d) != null) {
            this.f290088g = view.getHeight();
            View view2 = this.f290086e;
            if (view2 != null && view2.getVisibility() == 0) {
                this.f290087f = this.f290086e.getHeight();
            }
            if (this.f290088g == 0) {
                SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                return;
            }
            this.f290093l = 0;
            View view3 = this.f290091j;
            if (view3 != null) {
                this.f290093l = view3.getBottom();
            }
            int i = this.f290088g - this.f290087f;
            this.f290088g = i;
            this.f290089h = i / 2;
            this.f290090i = (this.f290090i - this.f290093l) - this.f290092k;
            Log.m105924i("MicroMsg.AdViewStatic", "viewHeight " + this.f290088g + " SCREEN_HEIGHT: " + this.f290090i + " abottom: " + this.f290093l + " stHeight: " + this.f290092k + " commentViewHeight:" + this.f290087f);
        }
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
    }
}

package vr2;

import a70.C112760b;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.PersistableBundle;
import android.os.Vibrator;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ReportAdClickEvent;
import com.tencent.p014mm.autogen.events.SnsAdListScrollEvent;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.memory.C92714n;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94847c1;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ConvertUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.wxmm.v2helper;
import com.tencent.xweb.FileReaderHelper;
import de3.C75359b0;
import de3.C75360c0;
import di0.C86299o;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import h81.C32735h;
import ht1.C60194q2;
import ht1.C60200t1;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kg3.C76577a;
import kr0.C76629w0;
import kr0.C76630x0;
import os2.C100420w;
import p629ny.C76979h;
import p763ym.C79138l;
import p823sg.C90193h;
import ps2.C100894u;
import te3.C101789j00;
import te3.C101804kv2;
import te3.C101833r5;
import te3.C64378fw2;
import te3.C64623p81;
import te3.C64682rk1;
import te3.C64719t23;
import te3.w64;
import zc0.C39339c;

/* renamed from: vr2.a0 */
public final class C102236a0 {

    /* renamed from: a */
    public static Vibrator f301037a = null;

    /* renamed from: b */
    public static int f301038b = 3200;

    /* renamed from: c */
    public static String f301039c = "";

    /* renamed from: d */
    public static String f301040d = "";

    /* renamed from: e */
    public static String f301041e = WeChatHosts.domainString(C0966R.string.f360885fm3);

    /* renamed from: vr2.a0$a */
    public class C102237a extends ViewOutlineProvider {

        /* renamed from: a */
        public final /* synthetic */ Float f301042a;

        public C102237a(Float f) {
            this.f301042a = f;
        }

        public void getOutline(View view, Outline outline) {
            SnsMethodCalculate.markStartTimeMs("getOutline", "com.tencent.mm.plugin.sns.data.SnsUtil$2");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f301042a.floatValue());
            SnsMethodCalculate.markEndTimeMs("getOutline", "com.tencent.mm.plugin.sns.data.SnsUtil$2");
        }
    }

    /* renamed from: A */
    public static String m134703A(C64682rk1 rk12) {
        SnsMethodCalculate.markStartTimeMs("getFinderShareObjectNickname", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (rk12 == null) {
            SnsMethodCalculate.markEndTimeMs("getFinderShareObjectNickname", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return "";
        } else if (!Util.isNullOrNil(rk12.f185198v)) {
            String str = rk12.f185198v;
            SnsMethodCalculate.markEndTimeMs("getFinderShareObjectNickname", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        } else if (!Util.isNullOrNil(rk12.f185185f)) {
            String str2 = rk12.f185185f;
            SnsMethodCalculate.markEndTimeMs("getFinderShareObjectNickname", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str2;
        } else {
            SnsMethodCalculate.markEndTimeMs("getFinderShareObjectNickname", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return "";
        }
    }

    /* renamed from: A0 */
    public static boolean m134704A0(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("strContainsIgnoreCase", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            SnsMethodCalculate.markEndTimeMs("strContainsIgnoreCase", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return false;
        }
        boolean contains = str.toLowerCase().contains(str2.toLowerCase());
        SnsMethodCalculate.markEndTimeMs("strContainsIgnoreCase", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return contains;
    }

    /* renamed from: B */
    public static String m134705B(String str) {
        SnsMethodCalculate.markStartTimeMs("getFullStrSeq", "com.tencent.mm.plugin.sns.data.SnsUtil");
        StringBuffer stringBuffer = new StringBuffer(str);
        while (stringBuffer.length() < 25) {
            stringBuffer.insert(0, "0");
        }
        String stringBuffer2 = stringBuffer.toString();
        SnsMethodCalculate.markEndTimeMs("getFullStrSeq", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return stringBuffer2;
    }

    /* renamed from: B0 */
    public static long m134706B0(String str) {
        SnsMethodCalculate.markStartTimeMs("unsignedStringToLong", "com.tencent.mm.plugin.sns.data.SnsUtil");
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("unsignedStringToLong", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 0;
        }
        try {
            j = new BigInteger(str).longValue();
            Log.m105925i("MicroMsg.SnsUtil", "seq %s to snsId %d ", str, Long.valueOf(j));
        } catch (Exception | NumberFormatException unused) {
        }
        SnsMethodCalculate.markEndTimeMs("unsignedStringToLong", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return j;
    }

    /* renamed from: C */
    public static Rect m134707C(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("getGridSrc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        SnsMethodCalculate.markEndTimeMs("getGridSrc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return rect;
    }

    /* renamed from: C0 */
    public static void m134708C0(long[] jArr) {
        SnsMethodCalculate.markStartTimeMs("vabriate", "com.tencent.mm.plugin.sns.data.SnsUtil");
        try {
            if (f301037a == null) {
                f301037a = (Vibrator) MMApplicationContext.getContext().getSystemService("vibrator");
            }
            f301037a.vibrate(jArr, -1);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SnsUtil", e, "vibrate error!", new Object[0]);
        }
        SnsMethodCalculate.markEndTimeMs("vabriate", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    /* renamed from: D */
    public static int m134709D(String str) {
        SnsMethodCalculate.markStartTimeMs("getMediaTypeValue", "com.tencent.mm.plugin.sns.data.SnsUtil");
        SnsMethodCalculate.markStartTimeMs("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
        int i = 0;
        int i2 = 4;
        try {
            BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str);
            if (imageOptions == null) {
                SnsMethodCalculate.markEndTimeMs("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
            } else {
                String str2 = imageOptions.outMimeType;
                if (str2 == null) {
                    SnsMethodCalculate.markEndTimeMs("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
                } else {
                    String lowerCase = str2.toLowerCase();
                    if (lowerCase.indexOf("png") >= 0) {
                        SnsMethodCalculate.markEndTimeMs("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
                        i = 1;
                    } else {
                        if (lowerCase.indexOf("jpg") < 0) {
                            if (lowerCase.indexOf("jpeg") < 0) {
                                if (lowerCase.indexOf("wxam") >= 0) {
                                    SnsMethodCalculate.markEndTimeMs("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
                                    i = 4;
                                } else if (lowerCase.indexOf("vcodec") >= 0) {
                                    SnsMethodCalculate.markEndTimeMs("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
                                    i = 5;
                                } else {
                                    SnsMethodCalculate.markEndTimeMs("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
                                }
                            }
                        }
                        SnsMethodCalculate.markEndTimeMs("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
                        i = 2;
                    }
                }
            }
        } catch (Exception unused) {
            SnsMethodCalculate.markEndTimeMs("getMediaTypeInFile", "com.tencent.mm.plugin.sns.data.SnsUtil");
        }
        if (str.indexOf("png") >= 0) {
            i2 = 1;
        } else if (str.indexOf("jpg") >= 0 || str.indexOf("jpeg") >= 0) {
            i2 = 2;
        } else if (str.indexOf(FileReaderHelper.MP3_EXT) >= 0) {
            i2 = 3;
        } else if (str.indexOf("wxam") < 0) {
            if (str.indexOf("vcodec") >= 0) {
                SnsMethodCalculate.markEndTimeMs("getMediaTypeValue", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return 5;
            }
            i2 = i;
        }
        SnsMethodCalculate.markEndTimeMs("getMediaTypeValue", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return i2;
    }

    /* renamed from: E */
    public static CharSequence m134710E(TimeLineObject timeLineObject, Context context, Map<String, String> map) {
        C64719t23 t232;
        C64623p81 p812;
        int i;
        C64682rk1 rk12;
        C64623p81 p813;
        C64378fw2 fw22;
        C64682rk1 rk13;
        TimeLineObject timeLineObject2 = timeLineObject;
        Context context2 = context;
        Map<String, String> map2 = map;
        C32735h.C32737c cVar = C32735h.C32737c.clicfg_finder_no_support_share_switch;
        Class cls = C32735h.class;
        Class cls2 = C60200t1.class;
        SnsMethodCalculate.markStartTimeMs("getNameBasedOnLang", "com.tencent.mm.plugin.sns.data.SnsUtil");
        C101789j00 j002 = timeLineObject2.ContentObj;
        String str = "";
        if (j002 == null) {
            SnsMethodCalculate.markEndTimeMs("getNameBasedOnLang", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
        int i2 = j002.f298424e;
        if (i2 == 26) {
            String string = context2.getString(C0966R.string.cmx);
            SnsMethodCalculate.markEndTimeMs("getNameBasedOnLang", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return string;
        } else if ((i2 == 28 || i2 == 29 || i2 == 37 || i2 == 38 || i2 == 36) && (((C60200t1) C86312j.m106911c(cls2)).mo76873sF() || ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 0) == 0)) {
            C101789j00 j003 = timeLineObject2.ContentObj;
            if (j003.f298424e != 28 || (rk13 = j003.f298431o) == null || Util.isNullOrNil(m134703A(rk13))) {
                C101789j00 j004 = timeLineObject2.ContentObj;
                if (j004.f298424e != 36 || (fw22 = j004.f298436t) == null || Util.isNullOrNil(fw22.f183243f)) {
                    String string2 = context2.getString(C0966R.string.d0s);
                    SnsMethodCalculate.markEndTimeMs("getNameBasedOnLang", "com.tencent.mm.plugin.sns.data.SnsUtil");
                    return string2;
                }
                String str2 = context2.getString(C0966R.string.d0s) + " · " + timeLineObject2.ContentObj.f298436t.f183243f;
                SnsMethodCalculate.markEndTimeMs("getNameBasedOnLang", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return str2;
            }
            String str3 = context2.getString(C0966R.string.d0s) + " · " + m134703A(timeLineObject2.ContentObj.f298431o);
            SnsMethodCalculate.markEndTimeMs("getNameBasedOnLang", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str3;
        } else {
            int i3 = timeLineObject2.ContentObj.f298424e;
            if ((i3 == 34 || i3 == 43 || i3 == 45) && (((C60200t1) C86312j.m106911c(cls2)).mo76873sF() || ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 0) == 0)) {
                C101789j00 j005 = timeLineObject2.ContentObj;
                int i4 = j005.f298424e;
                if ((i4 == 34 || i4 == 45 || i4 == 43) && (p813 = j005.f298435s) != null && !Util.isNullOrNil(p813.f184781g)) {
                    String str4 = context2.getString(C0966R.string.d0s) + " · " + timeLineObject2.ContentObj.f298435s.f184781g;
                    SnsMethodCalculate.markEndTimeMs("getNameBasedOnLang", "com.tencent.mm.plugin.sns.data.SnsUtil");
                    return str4;
                }
                String string3 = context2.getString(C0966R.string.d0s);
                SnsMethodCalculate.markEndTimeMs("getNameBasedOnLang", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return string3;
            }
            C101789j00 j006 = timeLineObject2.ContentObj;
            int i5 = j006.f298424e;
            if (i5 == 30) {
                WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(timeLineObject2.weappInfo.f298070d);
                String string4 = (N2 == null || Util.isNullOrNil(N2.field_nickname)) ? context2.getString(C0966R.string.a4n) : N2.field_nickname;
                SnsMethodCalculate.markEndTimeMs("getNameBasedOnLang", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return string4;
            } else if (i5 == 39 && ((i = j006.f298437u) == 3 || i == 100000000)) {
                if (i5 != 28 || (rk12 = j006.f298431o) == null || Util.isNullOrNil(m134703A(rk12))) {
                    String string5 = context2.getString(C0966R.string.d0s);
                    SnsMethodCalculate.markEndTimeMs("getNameBasedOnLang", "com.tencent.mm.plugin.sns.data.SnsUtil");
                    return string5;
                }
                String str5 = context2.getString(C0966R.string.d0s) + " · " + m134703A(timeLineObject2.ContentObj.f298431o);
                SnsMethodCalculate.markEndTimeMs("getNameBasedOnLang", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return str5;
            } else if (i5 == 46) {
                String string6 = context2.getString(C0966R.string.d0s);
                SnsMethodCalculate.markEndTimeMs("getNameBasedOnLang", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return string6;
            } else if (i5 != 1 || (p812 = j006.f298435s) == null) {
                C101833r5 r5Var = timeLineObject2.AppInfo;
                if (r5Var == null) {
                    SnsMethodCalculate.markEndTimeMs("getNameBasedOnLang", "com.tencent.mm.plugin.sns.data.SnsUtil");
                    return str;
                } else if (Util.isNullOrNil(r5Var.f299236d)) {
                    SnsMethodCalculate.markEndTimeMs("getNameBasedOnLang", "com.tencent.mm.plugin.sns.data.SnsUtil");
                    return str;
                } else {
                    C101789j00 j007 = timeLineObject2.ContentObj;
                    if (!(j007 == null || (t232 = j007.f298439w) == null)) {
                        str = t232.f185476x;
                    }
                    if ("wx485a97c844086dc9".equals(timeLineObject2.AppInfo.f299236d) || "wx485a97c844086dc9".equals(str)) {
                        String string7 = context2.getString(C0966R.string.j4z);
                        SnsMethodCalculate.markEndTimeMs("getNameBasedOnLang", "com.tencent.mm.plugin.sns.data.SnsUtil");
                        return string7;
                    } else if (map2.containsKey(timeLineObject2.AppInfo.f299236d)) {
                        CharSequence charSequence = map2.get(timeLineObject2.AppInfo.f299236d);
                        SnsMethodCalculate.markEndTimeMs("getNameBasedOnLang", "com.tencent.mm.plugin.sns.data.SnsUtil");
                        return charSequence;
                    } else {
                        String KS = ((C79138l) C86312j.m106911c(C79138l.class)).mo73992KS(context2, timeLineObject2.AppInfo.f299236d, Util.getInt(timeLineObject2.AppInfo.f299237e, 0));
                        if (Util.isNullOrNil(KS)) {
                            SnsMethodCalculate.markEndTimeMs("getNameBasedOnLang", "com.tencent.mm.plugin.sns.data.SnsUtil");
                            return KS;
                        }
                        map2.put(timeLineObject2.AppInfo.f299236d, KS);
                        SnsMethodCalculate.markEndTimeMs("getNameBasedOnLang", "com.tencent.mm.plugin.sns.data.SnsUtil");
                        return KS;
                    }
                }
            } else if (!Util.isNullOrNil(p812.f184781g)) {
                String str6 = timeLineObject2.ContentObj.f298435s.f184781g;
                SnsMethodCalculate.markEndTimeMs("getNameBasedOnLang", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return str6;
            } else {
                SnsMethodCalculate.markEndTimeMs("getNameBasedOnLang", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return str;
            }
        }
    }

    /* renamed from: F */
    public static int m134711F() {
        SnsMethodCalculate.markStartTimeMs("getNetType", "com.tencent.mm.plugin.sns.data.SnsUtil");
        int i = NetStatusUtil.isWifi(MMApplicationContext.getContext()) ? 1 : NetStatusUtil.is3G(MMApplicationContext.getContext()) ? 3 : NetStatusUtil.is4G(MMApplicationContext.getContext()) ? 4 : NetStatusUtil.is2G(MMApplicationContext.getContext()) ? 2 : NetStatusUtil.is5G(MMApplicationContext.getContext()) ? 5 : 0;
        SnsMethodCalculate.markEndTimeMs("getNetType", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return i;
    }

    /* renamed from: G */
    public static int m134712G() {
        SnsMethodCalculate.markStartTimeMs("getPicReportNetworkType", "com.tencent.mm.plugin.sns.data.SnsUtil");
        Context context = MMApplicationContext.getContext();
        if (NetStatusUtil.is2G(context)) {
            SnsMethodCalculate.markEndTimeMs("getPicReportNetworkType", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 1;
        } else if (NetStatusUtil.is3G(context)) {
            SnsMethodCalculate.markEndTimeMs("getPicReportNetworkType", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 2;
        } else if (NetStatusUtil.is4G(context)) {
            SnsMethodCalculate.markEndTimeMs("getPicReportNetworkType", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 3;
        } else if (NetStatusUtil.isWifi(context)) {
            SnsMethodCalculate.markEndTimeMs("getPicReportNetworkType", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 4;
        } else {
            SnsMethodCalculate.markEndTimeMs("getPicReportNetworkType", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 0;
        }
    }

    /* renamed from: H */
    public static Rect m134713H(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("getRectSrc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        int width = bitmap.getWidth();
        Rect rect = new Rect(width / 4, 0, (int) (((double) (width * 3)) / 4.0d), bitmap.getHeight());
        SnsMethodCalculate.markEndTimeMs("getRectSrc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return rect;
    }

    /* renamed from: I */
    public static String m134714I(int i, String str) {
        SnsMethodCalculate.markStartTimeMs("getRequestKey", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str2 = i + "-" + str;
        SnsMethodCalculate.markEndTimeMs("getRequestKey", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    /* renamed from: J */
    public static int m134715J(int i) {
        SnsMethodCalculate.markStartTimeMs("getSOSImageGallerySearchSource", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (i == 1) {
            SnsMethodCalculate.markEndTimeMs("getSOSImageGallerySearchSource", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 5;
        } else if (i == 2) {
            SnsMethodCalculate.markEndTimeMs("getSOSImageGallerySearchSource", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 8;
        } else if (i == 3) {
            SnsMethodCalculate.markEndTimeMs("getSOSImageGallerySearchSource", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 9;
        } else if (i == 4 || i == 5) {
            SnsMethodCalculate.markEndTimeMs("getSOSImageGallerySearchSource", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 6;
        } else {
            SnsMethodCalculate.markEndTimeMs("getSOSImageGallerySearchSource", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 0;
        }
    }

    /* renamed from: K */
    public static String m134716K(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getSnsAdSightName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str = "sightad_" + m134768s(kv22.f298689d);
        if (kv22.f298671D == 1) {
            String a = C39339c.m42094a(str, kv22.f298672E);
            SnsMethodCalculate.markEndTimeMs("getSnsAdSightName", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return a;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsAdSightName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    /* renamed from: L */
    public static String m134717L(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getSnsBigName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str = "snsb_" + m134768s(kv22.f298689d);
        if (kv22.f298671D == 1) {
            String a = C39339c.m42094a(str + m134747h0(kv22), kv22.f298672E);
            SnsMethodCalculate.markEndTimeMs("getSnsBigName", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return a;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsBigName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    /* renamed from: M */
    public static String m134718M(String str) {
        SnsMethodCalculate.markStartTimeMs("getSnsBigNameWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str2 = "snsb_" + m134768s(str);
        SnsMethodCalculate.markEndTimeMs("getSnsBigNameWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    /* renamed from: N */
    public static String m134719N(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getSnsBlurGridName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str = "snsblurs_" + m134768s(kv22.f298689d);
        if (kv22.f298671D == 1) {
            String a = C39339c.m42094a(str + m134747h0(kv22), kv22.f298672E);
            SnsMethodCalculate.markEndTimeMs("getSnsBlurGridName", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return a;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsBlurGridName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    /* renamed from: O */
    public static String m134720O(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getSnsBlurName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str = "snsblurt_" + m134768s(kv22.f298689d);
        if (kv22.f298671D == 1) {
            String a = C39339c.m42094a(str + m134747h0(kv22), kv22.f298672E);
            SnsMethodCalculate.markEndTimeMs("getSnsBlurName", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return a;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsBlurName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    /* renamed from: P */
    public static String m134721P(List<C101804kv2> list) {
        SnsMethodCalculate.markStartTimeMs("getSnsMediasName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str = "";
        if (list == null || list.size() == 0) {
            SnsMethodCalculate.markEndTimeMs("getSnsMediasName", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
        int i = 0;
        for (C101804kv2 next : list) {
            if (str.length() > 0) {
                str = str + "-";
            }
            str = str + next.f298689d;
            i++;
            if (i >= 4) {
                break;
            }
        }
        SnsMethodCalculate.markEndTimeMs("getSnsMediasName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    /* renamed from: Q */
    public static String m134722Q(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getSnsPhotoName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str = "snsb_" + m134768s(kv22.f298689d);
        if (kv22.f298671D == 1) {
            String a = C39339c.m42094a(str + m134747h0(kv22), kv22.f298672E);
            SnsMethodCalculate.markEndTimeMs("getSnsPhotoName", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return a;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsPhotoName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    /* renamed from: R */
    public static int m134723R() {
        SnsMethodCalculate.markStartTimeMs("getSnsResponeCount", "com.tencent.mm.plugin.sns.data.SnsUtil");
        int i = MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getInt("sns_respone_count", 20);
        SnsMethodCalculate.markEndTimeMs("getSnsResponeCount", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return i;
    }

    /* renamed from: S */
    public static int m134724S(int i) {
        SnsMethodCalculate.markStartTimeMs("getSnsScanImageRequestTypeType", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (i == 1) {
            SnsMethodCalculate.markEndTimeMs("getSnsScanImageRequestTypeType", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 5;
        } else if (i == 2) {
            SnsMethodCalculate.markEndTimeMs("getSnsScanImageRequestTypeType", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 7;
        } else if (i == 3) {
            SnsMethodCalculate.markEndTimeMs("getSnsScanImageRequestTypeType", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 9;
        } else if (i == 4 || i == 5) {
            SnsMethodCalculate.markEndTimeMs("getSnsScanImageRequestTypeType", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 6;
        } else {
            SnsMethodCalculate.markEndTimeMs("getSnsScanImageRequestTypeType", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return 0;
        }
    }

    /* renamed from: T */
    public static String m134725T(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getSnsSightName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str = "sight_" + m134768s(kv22.f298689d);
        if (kv22.f298671D == 1) {
            String a = C39339c.m42094a(str + m134747h0(kv22), kv22.f298672E);
            SnsMethodCalculate.markEndTimeMs("getSnsSightName", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return a;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsSightName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048 A[DONT_GENERATE] */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m134726U(java.lang.String r8) {
        /*
            java.lang.String r0 = "MicroMsg.SnsUtil"
            java.lang.String r1 = "getSnsSightVideoDurationInSeconds"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.data.SnsUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = 1
            r4 = 0
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ all -> 0x003c }
            if (r5 == 0) goto L_0x0015
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r4
        L_0x0015:
            java.lang.String r5 = "getSnsSightVideoDurationInSeconds, path: %s"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x003c }
            r6[r4] = r8     // Catch:{ all -> 0x003c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r6)     // Catch:{ all -> 0x003c }
            oj.c r5 = new oj.c     // Catch:{ all -> 0x003c }
            r5.<init>()     // Catch:{ all -> 0x003c }
            r5.setDataSource(r8)     // Catch:{ all -> 0x003d }
            r6 = 9
            java.lang.String r6 = r5.extractMetadata(r6)     // Catch:{ all -> 0x003d }
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r4)     // Catch:{ all -> 0x003d }
            long r6 = (long) r6     // Catch:{ all -> 0x003d }
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.videoMsToSec(r6)     // Catch:{ all -> 0x003d }
            r5.release()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r8
        L_0x003c:
            r5 = 0
        L_0x003d:
            java.lang.String r6 = "getSnsSightVideoDurationInSeconds error: %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x004f }
            r3[r4] = r8     // Catch:{ all -> 0x004f }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r6, r3)     // Catch:{ all -> 0x004f }
            if (r5 == 0) goto L_0x004b
            r5.release()
        L_0x004b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r4
        L_0x004f:
            r8 = move-exception
            if (r5 == 0) goto L_0x0055
            r5.release()
        L_0x0055:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vr2.C102236a0.m134726U(java.lang.String):int");
    }

    /* renamed from: V */
    public static String m134727V(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getSnsSrcName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str = "snstblur_src_" + m134768s(kv22.f298689d);
        if (kv22.f298671D == 1) {
            String a = C39339c.m42094a(str + m134747h0(kv22), kv22.f298672E);
            SnsMethodCalculate.markEndTimeMs("getSnsSrcName", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return a;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsSrcName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    /* renamed from: W */
    public static String m134728W(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("getSnsStringId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String q0 = snsInfo == null ? "0" : m134765q0(snsInfo.field_snsId);
        SnsMethodCalculate.markEndTimeMs("getSnsStringId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return q0;
    }

    /* renamed from: X */
    public static String m134729X(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getSnsThumbName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str = "snst_" + m134768s(kv22.f298689d);
        if (kv22.f298671D == 1) {
            String a = C39339c.m42094a(str + m134747h0(kv22), kv22.f298672E);
            SnsMethodCalculate.markEndTimeMs("getSnsThumbName", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return a;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsThumbName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    /* renamed from: Y */
    public static String m134730Y(String str) {
        SnsMethodCalculate.markStartTimeMs("getSnsThumbNameWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str2 = "snst_" + m134768s(str);
        SnsMethodCalculate.markEndTimeMs("getSnsThumbNameWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    /* renamed from: Z */
    public static String m134731Z(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getSnsTmpBig", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str = "sns_tmpb_" + m134768s(kv22.f298689d);
        if (kv22.f298671D == 1) {
            String a = C39339c.m42094a(str + m134747h0(kv22), kv22.f298672E);
            SnsMethodCalculate.markEndTimeMs("getSnsTmpBig", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return a;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsTmpBig", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    /* renamed from: a */
    public static void m134732a(Intent intent, int i) {
        SnsMethodCalculate.markStartTimeMs("appendAdGetA8KeySceneExtra", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (intent != null) {
            Log.m105924i("MicroMsg.SnsUtil", "appendAdGetA8KeySceneExtra, scene=" + i);
            intent.putExtra("geta8key_scene", i);
        }
        SnsMethodCalculate.markEndTimeMs("appendAdGetA8KeySceneExtra", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    /* renamed from: a0 */
    public static String m134733a0(String str) {
        SnsMethodCalculate.markStartTimeMs("getSnsTmpBigWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str2 = "sns_tmpb_" + m134768s(str);
        SnsMethodCalculate.markEndTimeMs("getSnsTmpBigWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    /* renamed from: b */
    public static String m134734b(String str, String str2) {
        String str3;
        SnsMethodCalculate.markStartTimeMs("appendAdUxInfo", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.m105920e("MicroMsg.SnsUtil", "appendAdUxInfo empty:" + str + ", " + str2);
            SnsMethodCalculate.markEndTimeMs("appendAdUxInfo", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
        try {
            str3 = URLEncoder.encode(str2, "UTF-8");
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SnsUtil", "appendAdUxInfo exp:" + e.toString() + ", " + str2);
            str3 = "";
        }
        String d = m134738d(str, "uxinfo", str3);
        Log.m105924i("MicroMsg.SnsUtil", "appendAdUxInfo, ret=" + d);
        SnsMethodCalculate.markEndTimeMs("appendAdUxInfo", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return d;
    }

    /* renamed from: b0 */
    public static String m134735b0(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getSnsTmpSight", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str = "sns_tmps_" + m134768s(kv22.f298689d);
        if (kv22.f298671D == 1) {
            String a = C39339c.m42094a(str + m134747h0(kv22), kv22.f298672E);
            SnsMethodCalculate.markEndTimeMs("getSnsTmpSight", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return a;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsTmpSight", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    /* renamed from: c */
    public static void m134736c(Intent intent, String str) {
        SnsMethodCalculate.markStartTimeMs("appendAdUxInfoForAdPay", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (intent == null) {
            Log.m105920e("MicroMsg.SnsUtil", "appendAdUxInfoForAdPay, intent==null");
            SnsMethodCalculate.markEndTimeMs("appendAdUxInfoForAdPay", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return;
        }
        intent.putExtra(C74928u.C45093i.f122325q, str == null ? "" : str);
        Log.m105924i("MicroMsg.SnsUtil", "appendAdUxInfoForAdPay, uxInfo=" + str);
        SnsMethodCalculate.markEndTimeMs("appendAdUxInfoForAdPay", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    /* renamed from: c0 */
    public static String m134737c0(String str) {
        SnsMethodCalculate.markStartTimeMs("getSnsTmpSightWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str2 = "sns_tmps_" + m134768s(str);
        SnsMethodCalculate.markEndTimeMs("getSnsTmpSightWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    /* renamed from: d */
    public static String m134738d(String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        SnsMethodCalculate.markStartTimeMs("appendUrlParams", "com.tencent.mm.plugin.sns.data.SnsUtil");
        try {
            int indexOf = str.indexOf("#");
            if (indexOf >= 0) {
                str4 = str.substring(0, indexOf);
                str5 = str.substring(indexOf);
            } else {
                str5 = "";
                str4 = str;
            }
            if (str4.contains("?")) {
                str6 = str4 + "&" + str2 + "=" + str3;
            } else {
                str6 = str4 + "?" + str2 + "=" + str3;
            }
            String str7 = str6 + str5;
            SnsMethodCalculate.markEndTimeMs("appendUrlParams", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str7;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.SnsUtil", "appendUrlParams exp:" + e.toString());
            SnsMethodCalculate.markEndTimeMs("appendUrlParams", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str;
        }
    }

    /* renamed from: d0 */
    public static String m134739d0(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getSnsTmpThumb", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str = "sns_tmpt_" + m134768s(kv22.f298689d);
        if (kv22.f298671D == 1) {
            String a = C39339c.m42094a(str + m134747h0(kv22), kv22.f298672E);
            SnsMethodCalculate.markEndTimeMs("getSnsTmpThumb", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return a;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsTmpThumb", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    /* renamed from: e */
    public static boolean m134740e(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("bitmapAvailable", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (bitmap == null || bitmap.isRecycled()) {
            SnsMethodCalculate.markEndTimeMs("bitmapAvailable", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("bitmapAvailable", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return true;
    }

    /* renamed from: e0 */
    public static String m134741e0(String str) {
        SnsMethodCalculate.markStartTimeMs("getSnsTmpThumbWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str2 = "sns_tmpt_" + m134768s(str);
        SnsMethodCalculate.markEndTimeMs("getSnsTmpThumbWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    /* renamed from: f */
    public static boolean m134742f(C92714n nVar) {
        SnsMethodCalculate.markStartTimeMs("bitmapAvailable", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (nVar == null || nVar.mo126922e()) {
            SnsMethodCalculate.markEndTimeMs("bitmapAvailable", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("bitmapAvailable", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return true;
    }

    /* renamed from: f0 */
    public static String m134743f0(String str) {
        SnsMethodCalculate.markStartTimeMs("getSnsTmpUserWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str2 = "snsu_" + m134768s(str);
        SnsMethodCalculate.markEndTimeMs("getSnsTmpUserWithoutEnc", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    /* renamed from: g */
    public static String m134744g(long j) {
        SnsMethodCalculate.markStartTimeMs("buildCameraEntranceSessionId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str = C86709a0.m107523b().mo121111i() + "_" + j;
        SnsMethodCalculate.markEndTimeMs("buildCameraEntranceSessionId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    /* renamed from: g0 */
    public static String m134745g0(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getSnsUserName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str = "snsu_" + m134768s(kv22.f298689d);
        if (kv22.f298671D == 1) {
            String a = C39339c.m42094a(str + m134747h0(kv22), kv22.f298672E);
            SnsMethodCalculate.markEndTimeMs("getSnsUserName", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return a;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsUserName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    /* renamed from: h */
    public static String m134746h(int i, String str) {
        SnsMethodCalculate.markStartTimeMs("buildSnsCopyReportData", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str2 = "<WCTimelineReportData>" + "<msgsource>" + "<cf>" + i + "</cf>" + "<inlenlist>" + str + "</inlenlist>" + "</msgsource>" + "</WCTimelineReportData>";
        SnsMethodCalculate.markEndTimeMs("buildSnsCopyReportData", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    /* renamed from: h0 */
    public static String m134747h0(C101804kv2 kv22) {
        String str;
        SnsMethodCalculate.markStartTimeMs("getUrlMd5", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (!Util.isNullOrNil(kv22.f298673F)) {
            String str2 = kv22.f298673F;
            SnsMethodCalculate.markEndTimeMs("getUrlMd5", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return str2;
        }
        try {
            str = C90193h.m112878f(kv22.toByteArray());
        } catch (Exception unused) {
            str = "";
        }
        SnsMethodCalculate.markEndTimeMs("getUrlMd5", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    /* renamed from: i */
    public static void m134748i(String str, long j) {
        SnsMethodCalculate.markStartTimeMs("calTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
        long currentTimeMillis = System.currentTimeMillis() - j;
        Log.m105918d("MicroMsg.SnsUtil", " name " + str + " allTime " + currentTimeMillis);
        SnsMethodCalculate.markEndTimeMs("calTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    /* renamed from: i0 */
    public static boolean m134749i0(TimeLineObject timeLineObject) {
        SnsMethodCalculate.markStartTimeMs("isDisplayAppname", "com.tencent.mm.plugin.sns.data.SnsUtil");
        boolean z = true;
        if (Util.isNullOrNil(timeLineObject.publicUserName)) {
            SnsMethodCalculate.markEndTimeMs("isDisplayAppname", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return true;
        }
        if ((C5431p1.C5432a.m5339j() & 2) > 0) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isDisplayAppname", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return z;
    }

    /* renamed from: j */
    public static Bitmap m134750j(String str, Bitmap bitmap) {
        int i;
        int i2;
        SnsMethodCalculate.markStartTimeMs("changeBitmapByExif", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (bitmap == null) {
            SnsMethodCalculate.markEndTimeMs("changeBitmapByExif", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return null;
        }
        SnsMethodCalculate.markStartTimeMs("getFixSnsPath", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str2 = "";
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("getFixSnsPath", "com.tencent.mm.plugin.sns.data.SnsUtil");
        } else {
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf > 0 && (i2 = lastIndexOf + 1) < str.length()) {
                String substring = str.substring(i2);
                if (substring.startsWith("snsb") || substring.startsWith("sns_tmpb_")) {
                    SnsMethodCalculate.markEndTimeMs("getFixSnsPath", "com.tencent.mm.plugin.sns.data.SnsUtil");
                    str2 = str;
                } else if (substring.startsWith("snst_") || substring.startsWith("snsu_")) {
                    SnsMethodCalculate.markEndTimeMs("getFixSnsPath", "com.tencent.mm.plugin.sns.data.SnsUtil");
                }
            }
            SnsMethodCalculate.markEndTimeMs("getFixSnsPath", "com.tencent.mm.plugin.sns.data.SnsUtil");
            str2 = str;
        }
        if (Util.isNullOrNil(str2)) {
            SnsMethodCalculate.markEndTimeMs("changeBitmapByExif", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return bitmap;
        }
        try {
            Log.m105925i("MicroMsg.SnsUtil", "[changes below by tomys]parsing jpg, path: %s, size: %s", str, Long.valueOf(C86013q1.m106451l(str)));
            Exif fromFile = Exif.fromFile(str);
            if (fromFile != null) {
                i = fromFile.getOrientationInDegree() % v2helper.VOIP_ENC_HEIGHT_LV1;
                Log.m105919d("MicroMsg.SnsUtil", "exifPath : %s degree : %d", str2, Integer.valueOf(i));
                Bitmap rotate = BitmapUtil.rotate(bitmap, (float) i);
                SnsMethodCalculate.markEndTimeMs("changeBitmapByExif", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return rotate;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SnsUtil", e, "Failed parsing JPEG file: " + str2, new Object[0]);
        } catch (Throwable th) {
            SnsMethodCalculate.markEndTimeMs("changeBitmapByExif", "com.tencent.mm.plugin.sns.data.SnsUtil");
            throw th;
        }
        i = 0;
        Log.m105919d("MicroMsg.SnsUtil", "exifPath : %s degree : %d", str2, Integer.valueOf(i));
        Bitmap rotate2 = BitmapUtil.rotate(bitmap, (float) i);
        SnsMethodCalculate.markEndTimeMs("changeBitmapByExif", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return rotate2;
    }

    /* renamed from: j0 */
    public static boolean m134751j0(String str) {
        SnsMethodCalculate.markStartTimeMs("isHasSdcard", "com.tencent.mm.plugin.sns.data.SnsUtil");
        boolean startsWith = str.startsWith(C112760b.m154230f0());
        SnsMethodCalculate.markEndTimeMs("isHasSdcard", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return startsWith;
    }

    /* renamed from: k */
    public static boolean m134752k(LinkedList<Pair<Integer, Integer>> linkedList, int i) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("checkInTimeInteval", "com.tencent.mm.plugin.sns.data.SnsUtil");
        Iterator<Pair<Integer, Integer>> it = linkedList.iterator();
        do {
            z = false;
            if (it.hasNext()) {
                Pair next = it.next();
                int intValue = ((Integer) next.first).intValue();
                int intValue2 = ((Integer) next.second).intValue();
                SnsMethodCalculate.markStartTimeMs("checkInTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
                if (intValue < intValue2) {
                    if (i >= intValue2 || i < intValue) {
                        SnsMethodCalculate.markEndTimeMs("checkInTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
                        continue;
                    } else {
                        SnsMethodCalculate.markEndTimeMs("checkInTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
                    }
                } else if (i <= 1440 && i >= intValue) {
                    SnsMethodCalculate.markEndTimeMs("checkInTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
                } else if (i >= intValue2 || i < 0) {
                    SnsMethodCalculate.markEndTimeMs("checkInTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
                    continue;
                } else {
                    SnsMethodCalculate.markEndTimeMs("checkInTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
                }
                z = true;
                continue;
            } else {
                SnsMethodCalculate.markEndTimeMs("checkInTimeInteval", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return false;
            }
        } while (!z);
        SnsMethodCalculate.markEndTimeMs("checkInTimeInteval", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return true;
    }

    /* renamed from: k0 */
    public static boolean m134753k0(w64 w64) {
        SnsMethodCalculate.markStartTimeMs("isReplyComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (w64 == null || Util.isNullOrNil(w64.f299711o)) {
            SnsMethodCalculate.markEndTimeMs("isReplyComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("isReplyComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return true;
    }

    /* renamed from: l */
    public static String m134754l() {
        SnsMethodCalculate.markStartTimeMs("checkSnsPostSessionId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (Util.isNullOrNil(f301039c)) {
            f301039c = m134744g(C31543z5.m39453c());
        }
        String str = f301039c;
        SnsMethodCalculate.markEndTimeMs("checkSnsPostSessionId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    /* renamed from: l0 */
    public static boolean m134755l0(int i) {
        SnsMethodCalculate.markStartTimeMs("isShowSOSMenu", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
            SnsMethodCalculate.markEndTimeMs("isShowSOSMenu", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("isShowSOSMenu", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return false;
    }

    /* renamed from: m */
    public static void m134756m() {
        SnsMethodCalculate.markStartTimeMs("cleanSnsPostSessionId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        f301039c = "";
        SnsMethodCalculate.markEndTimeMs("cleanSnsPostSessionId", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    /* renamed from: m0 */
    public static void m134757m0(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        String str8;
        SnsMethodCalculate.markStartTimeMs("jumpHalfWeApp", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (!Util.isNullOrNil(str2)) {
            str8 = C100894u.m132223c(str2, String.format("gdt_vid=%s", new Object[]{str5}), String.format("weixinadinfo=%s.%s.0.0", new Object[]{str4, str5}));
        } else {
            str8 = str2;
        }
        ((C60194q2) C86312j.m106911c(C60194q2.class)).mo75416Sv(context, "", str, str8, "", Integer.valueOf(i), str6, "", "", 0.75f);
        StringBuilder sb = new StringBuilder();
        sb.append("jumpHalfWeApp userName=");
        String str9 = str;
        sb.append(str);
        sb.append(", path=");
        sb.append(str8);
        sb.append(", ver=");
        sb.append(str3);
        sb.append(", scene=");
        sb.append(i);
        sb.append(", uxinfo=");
        sb.append(str7);
        sb.append(", sceneNode=");
        sb.append(str6);
        Log.m105924i("MicroMsg.SnsUtil", sb.toString());
        SnsMethodCalculate.markEndTimeMs("jumpHalfWeApp", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x004c */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.memory.C92714n m134758n(java.lang.String r10) {
        /*
            java.lang.String r0 = "MicroMsg.SnsUtil"
            java.lang.String r1 = "decodeFileToBitmap"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.data.SnsUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = 0
            r4 = 0
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)     // Catch:{ Exception -> 0x0052 }
            if (r5 != 0) goto L_0x0015
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r4
        L_0x0015:
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0052 }
            r5.<init>()     // Catch:{ Exception -> 0x0052 }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.bindlowMemeryOption(r5)     // Catch:{ Exception -> 0x0052 }
            r6 = 1
            r5.inSampleSize = r6     // Catch:{ Exception -> 0x0052 }
        L_0x0020:
            int r7 = r5.inSampleSize     // Catch:{ Exception -> 0x0052 }
            r8 = 10
            if (r7 <= r8) goto L_0x002a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r4
        L_0x002a:
            java.lang.String r8 = "decodeFileToBitmap %s"
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ OutOfMemoryError -> 0x004c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ OutOfMemoryError -> 0x004c }
            r9[r3] = r7     // Catch:{ OutOfMemoryError -> 0x004c }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r8, r9)     // Catch:{ OutOfMemoryError -> 0x004c }
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ OutOfMemoryError -> 0x004c }
            com.tencent.mm.memory.n r9 = lr2.C99590a.m130019b(r10, r5)     // Catch:{ OutOfMemoryError -> 0x004c }
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r7)     // Catch:{ OutOfMemoryError -> 0x004c }
            if (r9 == 0) goto L_0x0048
            com.tencent.p014mm.plugin.sns.statistics.C94994j.m120750d(r10, r7)     // Catch:{ OutOfMemoryError -> 0x004c }
        L_0x0048:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r9
        L_0x004c:
            int r7 = r5.inSampleSize     // Catch:{ Exception -> 0x0052 }
            int r7 = r7 + r6
            r5.inSampleSize = r7     // Catch:{ Exception -> 0x0052 }
            goto L_0x0020
        L_0x0052:
            r10 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = "snsdecode error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r10, r5, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: vr2.C102236a0.m134758n(java.lang.String):com.tencent.mm.memory.n");
    }

    /* renamed from: n0 */
    public static void m134759n0(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        Context context2;
        String str8;
        String str9 = str;
        String str10 = str6;
        String str11 = str7;
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (context == null) {
            Log.m105924i("MicroMsg.SnsUtil", "jumpWeApp, use MMApplicationContext");
            context2 = MMApplicationContext.getContext();
        } else {
            context2 = context;
        }
        if (!Util.isNullOrNil(str2)) {
            str8 = C100894u.m132223c(str2, String.format("gdt_vid=%s", new Object[]{str5}), String.format("weixinadinfo=%s.%s.0.0", new Object[]{str4, str5}));
        } else {
            str8 = str2;
        }
        C86299o oVar = new C86299o();
        oVar.f250940l = str10;
        oVar.f250929a = str9;
        oVar.f250932d = Util.safeParseInt(str3);
        oVar.f250934f = str8;
        oVar.f250939k = i2;
        PersistableBundle persistableBundle = new PersistableBundle();
        oVar.f250938j = persistableBundle;
        persistableBundle.putString("adUxInfo", str11);
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context2, oVar);
        Log.m105924i("MicroMsg.SnsUtil", "jumpWeApp userName=" + str + ", path=" + str8 + ", ver=" + str3 + ", scene=" + i2 + ", uxinfo=" + str11 + ", sceneNode=" + str10);
        SnsMethodCalculate.markEndTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:61|62|63|64|95) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:77|78|(2:87|88)|89|90|91) */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0155, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0157, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0158, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x015a, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r6.inSampleSize++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0160, code lost:
        if (r4 != null) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0166, code lost:
        if (r4 != null) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("decodeFileToBitmapByJavaHeap", "com.tencent.mm.plugin.sns.data.SnsUtil");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016e, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0105 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x015b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x016b */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e0 A[Catch:{ Exception -> 0x016f }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0105 A[LOOP:0: B:61:0x0105->B:95:0x0105, LOOP_START, SYNTHETIC, Splitter:B:61:0x0105] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0168 A[SYNTHETIC, Splitter:B:87:0x0168] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m134760o(java.lang.String r17) {
        /*
            r0 = r17
            java.lang.String r1 = "MicroMsg.SnsUtil"
            java.lang.String r2 = "decodeFileToBitmapByJavaHeap"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.data.SnsUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r4 = 0
            r5 = 0
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r17)     // Catch:{ Exception -> 0x016f }
            if (r6 != 0) goto L_0x0017
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r4
        L_0x0017:
            android.graphics.BitmapFactory$Options r6 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r17)     // Catch:{ Exception -> 0x016f }
            r7 = 1
            if (r6 == 0) goto L_0x00fa
            int r8 = r6.outWidth     // Catch:{ Exception -> 0x016f }
            int r6 = r6.outHeight     // Catch:{ Exception -> 0x016f }
            int r9 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.getExifOrientation(r17)     // Catch:{ Exception -> 0x016f }
            r10 = 90
            if (r10 == r9) goto L_0x002e
            r10 = 270(0x10e, float:3.78E-43)
            if (r10 != r9) goto L_0x0033
        L_0x002e:
            r16 = r8
            r8 = r6
            r6 = r16
        L_0x0033:
            int r9 = r8 * r6
            int r10 = f301038b     // Catch:{ Exception -> 0x016f }
            int r11 = r10 * r10
            r12 = 3
            r13 = 2
            if (r9 > r11) goto L_0x003f
            goto L_0x00b8
        L_0x003f:
            int r9 = r8 * 2
            if (r6 <= r9) goto L_0x00b3
            java.lang.String r9 = "high pic."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r9)     // Catch:{ Exception -> 0x016f }
            int r9 = r6 / r8
            r10 = 4
            r11 = 1198(0x4ae, float:1.679E-42)
            if (r9 >= r10) goto L_0x0055
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x016f }
            r10.mo175911u(r11, r5)     // Catch:{ Exception -> 0x016f }
            goto L_0x0089
        L_0x0055:
            r14 = 5
            if (r9 >= r14) goto L_0x005e
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x016f }
            r10.mo175911u(r11, r7)     // Catch:{ Exception -> 0x016f }
            goto L_0x0089
        L_0x005e:
            r15 = 6
            if (r9 >= r15) goto L_0x0067
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x016f }
            r10.mo175911u(r11, r13)     // Catch:{ Exception -> 0x016f }
            goto L_0x0089
        L_0x0067:
            r4 = 7
            if (r9 >= r4) goto L_0x0070
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x016f }
            r4.mo175911u(r11, r12)     // Catch:{ Exception -> 0x016f }
            goto L_0x0089
        L_0x0070:
            r4 = 8
            if (r9 >= r4) goto L_0x007a
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x016f }
            r4.mo175911u(r11, r10)     // Catch:{ Exception -> 0x016f }
            goto L_0x0089
        L_0x007a:
            r4 = 9
            if (r9 >= r4) goto L_0x0084
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x016f }
            r4.mo175911u(r11, r14)     // Catch:{ Exception -> 0x016f }
            goto L_0x0089
        L_0x0084:
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x016f }
            r4.mo175911u(r11, r15)     // Catch:{ Exception -> 0x016f }
        L_0x0089:
            int r4 = f301038b     // Catch:{ Exception -> 0x016f }
            int r4 = r4 * r4
            int r4 = r4 / r9
            double r10 = (double) r4     // Catch:{ Exception -> 0x016f }
            double r10 = java.lang.Math.sqrt(r10)     // Catch:{ Exception -> 0x016f }
            int r4 = (int) r10     // Catch:{ Exception -> 0x016f }
            if (r8 <= r6) goto L_0x0099
            int r9 = r9 * r4
            goto L_0x00a0
        L_0x0099:
            int r9 = r9 * r4
            r16 = r9
            r9 = r4
            r4 = r16
        L_0x00a0:
            double r10 = (double) r6     // Catch:{ Exception -> 0x016f }
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r10 * r14
            double r12 = (double) r4     // Catch:{ Exception -> 0x016f }
            double r10 = r10 / r12
            double r12 = (double) r8     // Catch:{ Exception -> 0x016f }
            double r12 = r12 * r14
            double r14 = (double) r9     // Catch:{ Exception -> 0x016f }
            double r12 = r12 / r14
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b1
            r10 = r12
        L_0x00b1:
            int r4 = (int) r10     // Catch:{ Exception -> 0x016f }
            goto L_0x00be
        L_0x00b3:
            if (r8 > r10) goto L_0x00ba
            if (r6 <= r10) goto L_0x00b8
            goto L_0x00ba
        L_0x00b8:
            r4 = 1
            goto L_0x00be
        L_0x00ba:
            int r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.calculateInSampleSize(r8, r6, r10, r10)     // Catch:{ Exception -> 0x016f }
        L_0x00be:
            if (r4 >= r7) goto L_0x00c1
            r4 = 1
        L_0x00c1:
            java.lang.String r9 = "ow: %s, oh: %s, res: %s."
            if (r4 <= r7) goto L_0x00e0
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x016f }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x016f }
            r10[r5] = r8     // Catch:{ Exception -> 0x016f }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x016f }
            r10[r7] = r6     // Catch:{ Exception -> 0x016f }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x016f }
            r8 = 2
            r10[r8] = r6     // Catch:{ Exception -> 0x016f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r9, r10)     // Catch:{ Exception -> 0x016f }
            goto L_0x00fb
        L_0x00e0:
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x016f }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x016f }
            r10[r5] = r8     // Catch:{ Exception -> 0x016f }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x016f }
            r10[r7] = r6     // Catch:{ Exception -> 0x016f }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x016f }
            r8 = 2
            r10[r8] = r6     // Catch:{ Exception -> 0x016f }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r9, r10)     // Catch:{ Exception -> 0x016f }
            goto L_0x00fb
        L_0x00fa:
            r4 = 1
        L_0x00fb:
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x016f }
            r6.<init>()     // Catch:{ Exception -> 0x016f }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.bindlowMemeryOption(r6)     // Catch:{ Exception -> 0x016f }
            r6.inSampleSize = r4     // Catch:{ Exception -> 0x016f }
        L_0x0105:
            java.io.InputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106423E(r17)     // Catch:{ OutOfMemoryError -> 0x015a, all -> 0x0157 }
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ OutOfMemoryError -> 0x015b }
            java.lang.String r10 = "inSampleSize: %d."
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ OutOfMemoryError -> 0x015b }
            int r12 = r6.inSampleSize     // Catch:{ OutOfMemoryError -> 0x015b }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ OutOfMemoryError -> 0x015b }
            r11[r5] = r12     // Catch:{ OutOfMemoryError -> 0x015b }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r10, r11)     // Catch:{ OutOfMemoryError -> 0x015b }
            r10 = 0
            android.graphics.Bitmap r11 = com.tencent.p014mm.graphics.MMBitmapFactory.m98738g(r4, r10, r6)     // Catch:{ OutOfMemoryError -> 0x015b }
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r8)     // Catch:{ OutOfMemoryError -> 0x015b }
            int r10 = r6.inSampleSize     // Catch:{ OutOfMemoryError -> 0x015b }
            if (r10 <= r7) goto L_0x013f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x015b }
            r10.<init>()     // Catch:{ OutOfMemoryError -> 0x015b }
            java.lang.String r12 = "decode succ in "
            r10.append(r12)     // Catch:{ OutOfMemoryError -> 0x015b }
            int r12 = r6.inSampleSize     // Catch:{ OutOfMemoryError -> 0x015b }
            r10.append(r12)     // Catch:{ OutOfMemoryError -> 0x015b }
            java.lang.String r10 = r10.toString()     // Catch:{ OutOfMemoryError -> 0x015b }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r10)     // Catch:{ OutOfMemoryError -> 0x015b }
        L_0x013f:
            boolean r10 = m134740e(r11)     // Catch:{ OutOfMemoryError -> 0x015b }
            if (r10 == 0) goto L_0x014c
            android.graphics.Bitmap r11 = m134750j(r0, r11)     // Catch:{ OutOfMemoryError -> 0x015b }
            com.tencent.p014mm.plugin.sns.statistics.C94994j.m120750d(r0, r8)     // Catch:{ OutOfMemoryError -> 0x015b }
        L_0x014c:
            if (r4 == 0) goto L_0x0151
            r4.close()     // Catch:{ IOException -> 0x0151 }
        L_0x0151:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r11
        L_0x0155:
            r0 = move-exception
            goto L_0x0166
        L_0x0157:
            r0 = move-exception
            r4 = 0
            goto L_0x0166
        L_0x015a:
            r4 = 0
        L_0x015b:
            int r8 = r6.inSampleSize     // Catch:{ all -> 0x0155 }
            int r8 = r8 + r7
            r6.inSampleSize = r8     // Catch:{ all -> 0x0155 }
            if (r4 == 0) goto L_0x0105
            r4.close()     // Catch:{ IOException -> 0x0105 }
            goto L_0x0105
        L_0x0166:
            if (r4 == 0) goto L_0x016b
            r4.close()     // Catch:{ IOException -> 0x016b }
        L_0x016b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)     // Catch:{ Exception -> 0x016f }
            throw r0     // Catch:{ Exception -> 0x016f }
        L_0x016f:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.String r5 = "snsdecode error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r5, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vr2.C102236a0.m134760o(java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: o0 */
    public static void m134761o0(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        SnsMethodCalculate.markStartTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.data.SnsUtil");
        m134759n0((Context) null, str, str2, str3, str4, str5, str6, str7, i);
        SnsMethodCalculate.markEndTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    /* renamed from: p */
    public static C92714n m134762p(String str) {
        SnsMethodCalculate.markStartTimeMs("decodeFileToBlurThumbBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
        try {
            Log.m105924i("MicroMsg.SnsUtil", "decodeFileToBlurThumbBitmap " + C86013q1.m106450k(str));
            if (!C86013q1.m106450k(str)) {
                SnsMethodCalculate.markEndTimeMs("decodeFileToBlurThumbBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return null;
            }
            C92714n n = m134758n(str);
            SnsMethodCalculate.markEndTimeMs("decodeFileToBlurThumbBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return n;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SnsUtil", e, "snsdecode error", new Object[0]);
            SnsMethodCalculate.markEndTimeMs("decodeFileToBlurThumbBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return null;
        }
    }

    /* renamed from: p0 */
    public static String m134763p0(long j) {
        SnsMethodCalculate.markStartTimeMs("longToFullString", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (j == 0) {
            SnsMethodCalculate.markEndTimeMs("longToFullString", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return "";
        }
        String B = m134705B(new BigInteger(Long.toBinaryString(j), 2).toString());
        SnsMethodCalculate.markEndTimeMs("longToFullString", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return B;
    }

    /* renamed from: q */
    public static void m134764q(boolean z) {
        SnsMethodCalculate.markStartTimeMs("enableAdListScroll", "com.tencent.mm.plugin.sns.data.SnsUtil");
        SnsAdListScrollEvent snsAdListScrollEvent = new SnsAdListScrollEvent();
        snsAdListScrollEvent.f265121d.f265122a = z;
        snsAdListScrollEvent.publish();
        SnsMethodCalculate.markEndTimeMs("enableAdListScroll", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    /* renamed from: q0 */
    public static String m134765q0(long j) {
        SnsMethodCalculate.markStartTimeMs("longToString", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String longToString = ConvertUtils.longToString(j);
        SnsMethodCalculate.markEndTimeMs("longToString", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return longToString;
    }

    /* renamed from: r */
    public static SpannableString m134766r(String str, Context context, TextView textView) {
        SnsMethodCalculate.markStartTimeMs("fillOriginalLabelTitle", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("fillOriginalLabelTitle", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return null;
        }
        SpannableString spannableString = new SpannableString(((C76979h) C86312j.m106911c(C76979h.class)).mo107070jH(context, "<img src=\"original_label.png\"/>  " + str, (float) ((int) textView.getTextSize()), false));
        SnsMethodCalculate.markEndTimeMs("fillOriginalLabelTitle", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return spannableString;
    }

    /* renamed from: r0 */
    public static Bitmap m134767r0(List<C92714n> list, int i) {
        Rect rect;
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("mergeBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
        for (C92714n f : list) {
            if (!m134742f(f)) {
                SnsMethodCalculate.markEndTimeMs("mergeBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
                return null;
            }
        }
        if (i2 <= 0) {
            SnsMethodCalculate.markEndTimeMs("mergeBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        int size = list.size();
        SnsMethodCalculate.markStartTimeMs("getDestRect", "com.tencent.mm.plugin.sns.data.SnsUtil");
        LinkedList linkedList = new LinkedList();
        int i3 = i2 >> 1;
        int i4 = i3 + 2;
        int i5 = i3 - 2;
        int i6 = 4;
        int i7 = 0;
        if (size == 2) {
            Rect rect2 = new Rect(0, 0, i5, i2);
            Rect rect3 = new Rect(i4, 0, i2, i2);
            linkedList.add(rect2);
            linkedList.add(rect3);
        } else if (size == 3) {
            Rect rect4 = new Rect(0, 0, i5, i2);
            Rect rect5 = new Rect(i4, 0, i2, i5);
            Rect rect6 = new Rect(i4, i4, i2, i2);
            linkedList.add(rect4);
            linkedList.add(rect5);
            linkedList.add(rect6);
        } else if (size >= 4) {
            Rect rect7 = new Rect(0, 0, i5, i5);
            Rect rect8 = new Rect(0, i4, i5, i2);
            Rect rect9 = new Rect(i4, 0, i2, i5);
            Rect rect10 = new Rect(i4, i4, i2, i2);
            linkedList.add(rect7);
            linkedList.add(rect8);
            linkedList.add(rect9);
            linkedList.add(rect10);
        }
        SnsMethodCalculate.markEndTimeMs("getDestRect", "com.tencent.mm.plugin.sns.data.SnsUtil");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-1);
        int i8 = 0;
        while (i7 < list.size() && i8 < i6) {
            Bitmap bitmap = list.get(i7).f266818d;
            Rect rect11 = (Rect) linkedList.get(i7);
            int size2 = list.size();
            SnsMethodCalculate.markStartTimeMs("getSrc", "com.tencent.mm.plugin.sns.data.SnsUtil");
            if (size2 == 1) {
                rect = m134707C(bitmap);
                SnsMethodCalculate.markEndTimeMs("getSrc", "com.tencent.mm.plugin.sns.data.SnsUtil");
            } else if (size2 == 2) {
                rect = m134713H(bitmap);
                SnsMethodCalculate.markEndTimeMs("getSrc", "com.tencent.mm.plugin.sns.data.SnsUtil");
            } else if (size2 != 3) {
                rect = m134707C(bitmap);
                SnsMethodCalculate.markEndTimeMs("getSrc", "com.tencent.mm.plugin.sns.data.SnsUtil");
            } else if (i7 == 0) {
                rect = m134713H(bitmap);
                SnsMethodCalculate.markEndTimeMs("getSrc", "com.tencent.mm.plugin.sns.data.SnsUtil");
            } else {
                rect = m134707C(bitmap);
                SnsMethodCalculate.markEndTimeMs("getSrc", "com.tencent.mm.plugin.sns.data.SnsUtil");
            }
            canvas.drawBitmap(bitmap, rect, rect11, (Paint) null);
            i7++;
            i8++;
            i6 = 4;
        }
        canvas.save();
        canvas.restore();
        SnsMethodCalculate.markEndTimeMs("mergeBitmap", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return createBitmap;
    }

    /* renamed from: s */
    public static String m134768s(String str) {
        SnsMethodCalculate.markStartTimeMs("fliterPre", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (str == null) {
            SnsMethodCalculate.markEndTimeMs("fliterPre", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return "";
        }
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) == '0') {
            i++;
        }
        String substring = str.substring(i);
        SnsMethodCalculate.markEndTimeMs("fliterPre", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return substring;
    }

    /* renamed from: s0 */
    public static List<PointF> m134769s0(String str) {
        SnsMethodCalculate.markStartTimeMs("parseGesture", "com.tencent.mm.plugin.sns.data.SnsUtil");
        ArrayList arrayList = new ArrayList();
        if (!Util.isNullOrNil(str)) {
            String[] split = str.split("[|]");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String[] split2 = split[i].split("[_]");
                if (split2.length != 2) {
                    Log.m105921e("MicroMsg.SnsUtil", "invalid gesture str! %s", str);
                    arrayList.clear();
                    break;
                }
                float f = Util.getFloat(split2[0], -1.0f);
                float f2 = Util.getFloat(split2[1], -1.0f);
                if (f == -1.0f || f2 == -1.0f) {
                    Log.m105921e("MicroMsg.SnsUtil", "invalid gesture str! %s", str);
                    arrayList.clear();
                } else {
                    arrayList.add(new PointF(f, f2));
                    i++;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("parseGesture", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return arrayList;
    }

    /* renamed from: t */
    public static String m134770t(List<PointF> list) {
        SnsMethodCalculate.markStartTimeMs("formatGestureVector", "com.tencent.mm.plugin.sns.data.SnsUtil");
        StringBuilder sb = new StringBuilder("");
        for (PointF next : list) {
            sb.append(next.x);
            sb.append("_");
            sb.append(next.y);
            sb.append("|");
        }
        if (list.size() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sb4 = sb.toString();
        SnsMethodCalculate.markEndTimeMs("formatGestureVector", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return sb4;
    }

    /* renamed from: t0 */
    public static String m134771t0(CharSequence charSequence) {
        SnsMethodCalculate.markStartTimeMs("removeClickSpanInString", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (charSequence == null) {
            SnsMethodCalculate.markEndTimeMs("removeClickSpanInString", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return "";
        }
        SpannableString spannableString = new SpannableString(charSequence);
        C75360c0[] c0VarArr = (C75360c0[]) spannableString.getSpans(0, spannableString.length(), C75360c0.class);
        Log.m105919d("MicroMsg.SnsUtil", "removeClickSpanInString, clickSpans.length:%d", Integer.valueOf(c0VarArr.length));
        for (C75360c0 removeSpan : c0VarArr) {
            spannableString.removeSpan(removeSpan);
        }
        String spannableString2 = spannableString.toString();
        SnsMethodCalculate.markEndTimeMs("removeClickSpanInString", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return spannableString2;
    }

    /* renamed from: u */
    public static String m134772u(long j) {
        SnsMethodCalculate.markStartTimeMs("formatTimeSecondToDate", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String format = new SimpleDateFormat(TimeUtil.YYYY2MM2DD_HH1MM1SS).format(new Date(j * 1000));
        SnsMethodCalculate.markEndTimeMs("formatTimeSecondToDate", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return format;
    }

    /* renamed from: u0 */
    public static void m134773u0(SnsAdClick snsAdClick) {
        SnsMethodCalculate.markStartTimeMs("reportAdClick", "com.tencent.mm.plugin.sns.data.SnsUtil");
        ReportAdClickEvent reportAdClickEvent = new ReportAdClickEvent();
        reportAdClickEvent.f9426d.f9427a = snsAdClick;
        reportAdClickEvent.publish();
        SnsMethodCalculate.markEndTimeMs("reportAdClick", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    /* renamed from: v */
    public static void m134774v(w64 w64, CharSequence charSequence, C96275w6 w6Var) {
        String str;
        w64 w642 = w64;
        CharSequence charSequence2 = charSequence;
        C96275w6 w6Var2 = w6Var;
        SnsMethodCalculate.markStartTimeMs("genCompressedComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (C94847c1.m120218f() <= 0) {
            w6Var2.f281373d.mo141828c(w642, charSequence2);
        } else if (charSequence2 instanceof SpannableStringBuilder) {
            C102266t tVar = w6Var2.f281373d;
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence2;
            SnsMethodCalculate.markStartTimeMs("compressLinkContent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            if (!Util.isNullOrNil((CharSequence) spannableStringBuilder)) {
                int i = 0;
                C75359b0[] b0VarArr = (C75359b0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C75359b0.class);
                if (b0VarArr != null && b0VarArr.length > 0) {
                    int length = b0VarArr.length;
                    int i2 = 0;
                    while (i2 < length) {
                        C75359b0 b0Var = b0VarArr[i2];
                        if (b0Var.getType() == 1 && (str = b0Var.getHrefInfo().f148312c) != null && str.length() > C94847c1.m120218f() && spannableStringBuilder2.toString().contains(str)) {
                            String str2 = str.substring(i, C94847c1.m120218f()) + "...";
                            SpannableString spannableString = new SpannableString(str2);
                            spannableString.setSpan(new C75359b0(2, b0Var.getHrefInfo()), 0, str2.length(), 33);
                            int indexOf = spannableStringBuilder2.toString().indexOf(str);
                            spannableStringBuilder2.replace(indexOf, str.length() + indexOf, spannableString);
                        }
                        i2++;
                        i = 0;
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("compressLinkContent", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
            tVar.mo141828c(w642, spannableStringBuilder2);
        }
        SnsMethodCalculate.markEndTimeMs("genCompressedComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    /* renamed from: v0 */
    public static void m134775v0(View view, Float f) {
        SnsMethodCalculate.markStartTimeMs("roundCorner", "com.tencent.mm.plugin.sns.data.SnsUtil");
        view.setOutlineProvider(new C102237a(f));
        view.setClipToOutline(true);
        SnsMethodCalculate.markEndTimeMs("roundCorner", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    /* renamed from: w */
    public static String m134776w(C100420w wVar) {
        SnsMethodCalculate.markStartTimeMs("genFeedIdBySnsComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (wVar == null) {
            SnsMethodCalculate.markEndTimeMs("genFeedIdBySnsComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return "";
        }
        long j = wVar.field_parentID;
        String q0 = j == 0 ? m134765q0(wVar.field_snsID) : m134765q0(j);
        SnsMethodCalculate.markEndTimeMs("genFeedIdBySnsComment", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return q0;
    }

    /* renamed from: w0 */
    public static String m134777w0(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("safeGetSnsId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (snsInfo != null) {
            String q0 = m134765q0(snsInfo.field_snsId);
            SnsMethodCalculate.markEndTimeMs("safeGetSnsId", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return q0;
        }
        SnsMethodCalculate.markEndTimeMs("safeGetSnsId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return "";
    }

    /* renamed from: x */
    public static String m134778x(int i, String str) {
        SnsMethodCalculate.markStartTimeMs("getBatchDownloadKey", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str2 = i + "_" + str;
        SnsMethodCalculate.markEndTimeMs("getBatchDownloadKey", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    /* renamed from: x0 */
    public static void m134779x0(View view, Context context) {
        int i;
        SnsMethodCalculate.markStartTimeMs("scaleImageView", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (view != null && C76577a.m92165p(context) > 1.0f) {
            float p = C76577a.m92165p(context);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int b = C76577a.m92151b(context, 60);
            int i2 = layoutParams.width;
            if (i2 >= 0 && (i = layoutParams.height) >= 0) {
                int i3 = (int) (((float) i2) * p);
                int i4 = (int) (p * ((float) i));
                if (i3 > b) {
                    i3 = b;
                }
                layoutParams.width = i3;
                if (i4 <= b) {
                    b = i4;
                }
                layoutParams.height = b;
                view.setLayoutParams(layoutParams);
            }
        }
        SnsMethodCalculate.markEndTimeMs("scaleImageView", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    /* renamed from: y */
    public static String m134780y(int i, String str) {
        SnsMethodCalculate.markStartTimeMs("getCacheName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        String str2 = i + "-" + str;
        SnsMethodCalculate.markEndTimeMs("getCacheName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str2;
    }

    /* renamed from: y0 */
    public static void m134781y0(String str) {
        SnsMethodCalculate.markStartTimeMs("setMediaEditPublishId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        if (TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("setMediaEditPublishId", "com.tencent.mm.plugin.sns.data.SnsUtil");
            return;
        }
        f301040d += str + ";";
        SnsMethodCalculate.markEndTimeMs("setMediaEditPublishId", "com.tencent.mm.plugin.sns.data.SnsUtil");
    }

    /* renamed from: z */
    public static String m134782z(w64 w64, C44668u3 u3Var) {
        String str;
        SnsMethodCalculate.markStartTimeMs("getCommentNickName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        C72996z1 H3 = u3Var.mo69656H3(w64.f299703d);
        if (H3 != null) {
            str = H3.mo62898f();
        } else {
            String str2 = w64.f299704e;
            str = str2 != null ? str2 : w64.f299703d;
        }
        SnsMethodCalculate.markEndTimeMs("getCommentNickName", "com.tencent.mm.plugin.sns.data.SnsUtil");
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0766, code lost:
        if (r9 == false) goto L_0x0768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x07ab, code lost:
        if (((h81.C32735h) di3.C86312j.m106911c(r17)).mo58779Qe(r9, r10) == 0) goto L_0x07b0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0b6a  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x0b80  */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x0c95  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0475  */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.tencent.p014mm.plugin.sns.p106ui.C96275w6 m134783z0(com.tencent.p014mm.plugin.sns.storage.SnsInfo r37, com.tencent.p014mm.protocal.protobuf.SnsObject r38, android.content.Context r39, com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter r40, boolean r41, com.tencent.p014mm.storage.C44668u3 r42, java.lang.String r43, java.util.Map<java.lang.String, java.lang.Boolean> r44, java.util.Map<java.lang.String, java.lang.String> r45, java.util.List<java.lang.String> r46) {
        /*
            r0 = r37
            r1 = r38
            r11 = r39
            r12 = r42
            r13 = r43
            r14 = r44
            r15 = r45
            r10 = r46
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_finder_no_support_share_switch
            java.lang.Class<ym.l> r16 = p763ym.C79138l.class
            java.lang.Class<h81.h> r17 = h81.C32735h.class
            java.lang.Class<ht1.t1> r18 = ht1.C60200t1.class
            java.lang.String r8 = "snsInfoToSnsStruct"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.data.SnsUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r6)
            com.tencent.mm.plugin.sns.ui.w6 r7 = new com.tencent.mm.plugin.sns.ui.w6
            r7.<init>()
            r5 = 0
            java.lang.String r4 = "MicroMsg.SnsUtil"
            if (r0 != 0) goto L_0x003b
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "mSnsInfo is null, why?"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r2, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r6)
            return r7
        L_0x003b:
            if (r12 != 0) goto L_0x004d
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "contactStorage is null, why?"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r2, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r6)
            return r7
        L_0x004d:
            com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r37.getTimeLine()
            int r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter.m122254p(r37)
            r7.f281379g = r2
            r19 = r6
            long r5 = r0.field_snsId
            r7.f281383j = r5
            int r5 = r37.getLikeFlag()
            r7.f281387n = r5
            boolean r5 = r37.isExposures()
            r7.f281388o = r5
            com.tencent.mm.plugin.sns.storage.ADInfo r5 = r37.getAdInfo()
            java.lang.String r6 = ""
            if (r5 != 0) goto L_0x0073
            r5 = r6
            goto L_0x0079
        L_0x0073:
            com.tencent.mm.plugin.sns.storage.ADInfo r5 = r37.getAdInfo()
            java.lang.String r5 = r5.viewId
        L_0x0079:
            r7.f281389p = r5
            r7.f281367a = r0
            r7.f281369b = r3
            r7.f281371c = r1
            com.tencent.mm.plugin.sns.storage.ADXml r5 = r37.getAdXml()
            r7.f281370b0 = r5
            java.lang.String r5 = "renderSnsPostDesc"
            r21 = r6
            r6 = r19
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            r19 = r2
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r7.f281369b
            java.lang.String r2 = r2.ContentDesc
            r22 = r2
            java.lang.String r2 = "onItemDescSpanGenerate"
            r23 = r3
            java.lang.String r3 = "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r24 = r4
            java.lang.String r4 = "context"
            gy3.C87412m.m108594g(r11, r4)
            te3.ze4 r4 = new te3.ze4
            r4.<init>()
            r25 = r8
            r8 = 3
            r4.f228685e = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r27 = r5
            java.lang.String r5 = "getUserName"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            r28 = r9
            com.tencent.mm.protocal.protobuf.TimeLineObject r9 = r7.f281369b
            if (r9 != 0) goto L_0x00cc
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            r9 = r21
            goto L_0x00d1
        L_0x00cc:
            java.lang.String r9 = r9.UserName
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
        L_0x00d1:
            r8.append(r9)
            r9 = 35
            r8.append(r9)
            long r9 = r7.f281383j
            java.lang.String r9 = m134765q0(r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r4.f228686f = r8
            com.tencent.mm.protocal.protobuf.SnsObject r8 = r7.f281371c
            int r8 = r8.CreateTime
            long r8 = (long) r8
            r4.f228687g = r8
            r10 = 1
            r4.f228688h = r10
            com.tencent.mm.plugin.sns.storage.SnsInfo r8 = r7.f281367a
            int r9 = r8.field_type
            r4.f228689i = r9
            int r8 = r8.localid
            r4.f228690j = r8
            java.lang.String r8 = "getTAG"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r3)
            java.lang.String r9 = "access$getTAG$cp"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r3)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "onItemDescSpanGenerate by struct:ShareSceneId="
            r8.append(r9)
            java.lang.String r9 = r4.f228686f
            r8.append(r9)
            java.lang.String r9 = ", CreateTime="
            r8.append(r9)
            long r9 = r4.f228687g
            r8.append(r9)
            java.lang.String r9 = ", SnsContentType="
            r8.append(r9)
            int r9 = r4.f228689i
            r8.append(r9)
            java.lang.String r9 = ", SnsLocalId="
            r8.append(r9)
            int r9 = r4.f228690j
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "MicroMsg.Sns.SnsTagSearchSpanClickReportFlow"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r8)
            java.lang.Class<ox.b> r8 = p640ox.C77049b.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            ox.b r8 = (p640ox.C77049b) r8
            r9 = 1
            dm2.g r8 = r8.Lq0(r11, r9)
            if (r8 == 0) goto L_0x016c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Item_"
            r9.append(r10)
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r7.f281367a
            int r10 = r10.localid
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.mo70916a(r9, r4)
        L_0x016c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.lang.String r2 = "key_wxa_short_link_launch_scene"
            java.lang.String r3 = "TIME_LINE"
            r8.putString(r2, r3)
            java.lang.String r2 = "ShareScene"
            r9 = 3
            r8.putInt(r2, r9)
            long r2 = r7.f281383j
            java.lang.String r2 = m134765q0(r2)
            java.lang.String r3 = "serverMsgID"
            r8.putString(r3, r2)
            java.lang.String r2 = r0.field_userName
            java.lang.String r3 = "msgUsername"
            r8.putString(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            com.tencent.mm.protocal.protobuf.TimeLineObject r3 = r7.f281369b
            if (r3 != 0) goto L_0x01a8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            r3 = r21
            goto L_0x01ad
        L_0x01a8:
            java.lang.String r3 = r3.UserName
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
        L_0x01ad:
            r2.append(r3)
            java.lang.String r3 = "#"
            r2.append(r3)
            long r3 = r7.f281383j
            java.lang.String r3 = m134765q0(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "ShareSceneId"
            r8.putString(r3, r2)
            com.tencent.mm.protocal.protobuf.SnsObject r2 = r7.f281371c
            int r2 = r2.CreateTime
            long r2 = (long) r2
            java.lang.String r4 = "CreateTime"
            r8.putLong(r4, r2)
            java.lang.String r2 = "TimelineEnterSource"
            r3 = 1
            r8.putInt(r2, r3)
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r7.f281367a
            int r2 = r2.field_type
            java.lang.String r3 = "SnsContentType"
            r8.putInt(r3, r2)
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r7.f281367a
            int r2 = r2.localid
            java.lang.String r3 = "SnsLocalId"
            r8.putInt(r3, r2)
            gv2.C98249r.m126976a()
            gv2.r r10 = gv2.C98249r.f288050e
            java.lang.String r2 = "getTextSize"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            int r4 = gv2.C98249r.f288051f
            float r4 = (float) r4
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            float r5 = kg3.C76577a.m92165p(r5)
            float r4 = r4 * r5
            int r4 = (int) r4
            float r4 = (float) r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r7.f281367a
            long r2 = r2.field_snsId
            r26 = 2
            r29 = r2
            r5 = r19
            r3 = r22
            r2 = r39
            r13 = r23
            r31 = r24
            r32 = r5
            r9 = r27
            r14 = 0
            r5 = r8
            r1 = r6
            r14 = r7
            r8 = r21
            r6 = r29
            r12 = r8
            r33 = r25
            r8 = r26
            de3.u r2 = gv2.C76072s.m91373b(r2, r3, r4, r5, r6, r8)
            java.lang.String r3 = "genCompressedDesc"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r1)
            int r4 = com.tencent.p014mm.plugin.sns.model.C94847c1.m120218f()
            if (r4 <= 0) goto L_0x0240
            java.lang.CharSequence r4 = gv2.C76072s.m91372a(r2)
            r14.f281375e = r4
            goto L_0x0242
        L_0x0240:
            r14.f281375e = r2
        L_0x0242:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)
            gv2.C98249r.m126976a()
            int r3 = r10.mo137553d()
            if (r41 == 0) goto L_0x0289
            boolean r4 = r37.isAd()
            if (r4 == 0) goto L_0x0289
            com.tencent.mm.plugin.sns.storage.ADXml r4 = r37.getAdXml()
            if (r4 == 0) goto L_0x0289
            int r4 = r4.adMediaDisplayMode
            r8 = 1
            if (r4 != r8) goto L_0x028a
            java.lang.String r3 = "window"
            java.lang.Object r3 = r11.getSystemService(r3)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r3 = r3.getDefaultDisplay()
            int r3 = r3.getWidth()
            r4 = 50
            int r5 = kg3.C76577a.m92151b(r11, r4)
            int r3 = r3 - r5
            int r4 = kg3.C76577a.m92151b(r11, r4)
            int r3 = r3 - r4
            r4 = 12
            int r5 = kg3.C76577a.m92151b(r11, r4)
            int r3 = r3 - r5
            int r4 = kg3.C76577a.m92151b(r11, r4)
            int r3 = r3 - r4
            goto L_0x028a
        L_0x0289:
            r8 = 1
        L_0x028a:
            r7 = 7
            if (r3 <= 0) goto L_0x02cb
            gv2.C98249r.m126976a()
            m40.a r4 = r10.mo137551b()
            l40.d r4 = l40.C99337d.m129495d(r2, r3, r4)
            l40.f r4 = r4.mo138734a()
            l40.c r5 = l40.C99336c.f291266b
            gv2.C98249r.m126976a()
            m40.a r6 = r10.mo137551b()
            r5.mo138733c(r6, r4)
            android.text.StaticLayout r4 = r4.f291301k
            int r4 = r4.getLineCount()
            if (r4 <= r7) goto L_0x02cb
            gv2.C98249r.m126976a()
            m40.a r4 = r10.mo137552c()
            l40.d r2 = l40.C99337d.m129495d(r2, r3, r4)
            l40.f r2 = r2.mo138734a()
            l40.c r3 = l40.C99336c.f291266b
            gv2.C98249r.m126976a()
            m40.a r4 = r10.mo137552c()
            r3.mo138733c(r4, r2)
        L_0x02cb:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r1)
            java.lang.String r10 = "renderSnsComment"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r1)
            com.tencent.mm.protocal.protobuf.SnsObject r2 = r14.f281371c
            java.util.LinkedList<te3.w64> r2 = r2.CommentUserList
            vr2.t r3 = new vr2.t
            r3.<init>()
            r14.f281373d = r3
            eb0.C75592q0.m90789s()
            java.util.Iterator r25 = r2.iterator()
        L_0x02e6:
            boolean r2 = r25.hasNext()
            if (r2 == 0) goto L_0x04dd
            java.lang.Object r2 = r25.next()
            r9 = r2
            te3.w64 r9 = (te3.w64) r9
            java.lang.String r2 = r9.f299707h
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
            r9.f299707h = r2
            int r2 = r9.f299716t
            r6 = 16
            boolean r2 = gv2.C98242p.m126942d(r2, r6)
            if (r2 == 0) goto L_0x030f
            gv2.C98239l.m126931a()
            gv2.l r2 = gv2.C98239l.f288025c
            m40.a r2 = r2.mo137536b()
            goto L_0x0318
        L_0x030f:
            gv2.C98241o.m126934a()
            gv2.o r2 = gv2.C98241o.f288030d
            m40.a r2 = r2.mo137540b()
        L_0x0318:
            r5 = r2
            vr2.z r4 = new vr2.z
            r20 = 0
            r21 = 0
            r22 = 0
            r19 = r4
            r23 = r14
            r24 = r40
            r19.<init>(r20, r21, r22, r23, r24)
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r14.f281367a
            int r3 = r2.field_type
            java.lang.String r19 = r2.getUserName()
            r20 = 1
            java.lang.String r2 = "enableCommentStory"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.model.SnsConfig"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r6)
            com.tencent.p014mm.plugin.sns.model.C94847c1.m120219g()
            boolean r21 = com.tencent.p014mm.plugin.sns.model.C94847c1.f274792b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r6)
            java.lang.String r2 = "enableLikeStory"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r6)
            com.tencent.p014mm.plugin.sns.model.C94847c1.m120219g()
            boolean r22 = com.tencent.p014mm.plugin.sns.model.C94847c1.f274793c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r6)
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r14.f281367a
            r2 = r39
            r23 = r3
            r3 = r9
            r34 = r5
            r5 = r23
            r23 = r6
            r24 = r13
            r13 = 16
            r6 = r19
            r7 = r20
            r19 = 1
            r8 = r21
            r41 = r9
            r35 = r28
            r9 = r22
            r36 = r10
            r10 = r23
            java.lang.CharSequence r2 = gv2.C98242p.m126941c(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r3 = gv2.C98242p.m126944f(r41)
            if (r3 == 0) goto L_0x040b
            java.lang.String r2 = "getDeletedCommentSpan"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.String r4 = gv2.C98242p.m126940b(r41)
            android.content.res.Resources r5 = r39.getResources()
            r6 = 2131836871(0x7f113fc7, float:1.9306921E38)
            java.lang.String r5 = r5.getString(r6)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r6 != 0) goto L_0x03aa
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = ": "
            r6.append(r4)
            java.lang.String r4 = r6.toString()
        L_0x03aa:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r12)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            java.lang.String r5 = ":"
            int r5 = r4.indexOf(r5)
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>(r4)
            r7 = -1
            if (r5 == r7) goto L_0x0407
            android.text.style.ForegroundColorSpan r7 = new android.text.style.ForegroundColorSpan
            android.content.res.Resources r8 = r39.getResources()
            r9 = 2131099710(0x7f06003e, float:1.781178E38)
            int r8 = r8.getColor(r9)
            r7.<init>(r8)
            int r8 = r4.length()
            r9 = 0
            r6.setSpan(r7, r9, r8, r9)
            android.text.style.BackgroundColorSpan r7 = new android.text.style.BackgroundColorSpan
            android.content.res.Resources r8 = r39.getResources()
            r10 = 2131099718(0x7f060046, float:1.7811797E38)
            int r8 = r8.getColor(r10)
            r7.<init>(r8)
            int r5 = r5 + 1
            int r4 = r4.length()
            r6.setSpan(r7, r5, r4, r9)
        L_0x0407:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            r2 = r6
        L_0x040b:
            l40.c r3 = l40.C99336c.f291266b
            r4 = r34
            if (r4 == 0) goto L_0x043a
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, l40.b> r3 = r3.f291267a
            int r5 = r4.hashCode()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r3 = r3.get(r5)
            l40.b r3 = (l40.C99335b) r3
            if (r3 == 0) goto L_0x043d
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.LinkedList<l40.f>> r3 = r3.f291265a
            java.lang.String r5 = r2.toString()
            java.lang.Object r3 = r3.get(r5)
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            if (r3 == 0) goto L_0x043d
            int r3 = r3.size()
            if (r3 != 0) goto L_0x0438
            goto L_0x043d
        L_0x0438:
            r5 = 1
            goto L_0x043e
        L_0x043a:
            r3.getClass()
        L_0x043d:
            r5 = 0
        L_0x043e:
            if (r5 == 0) goto L_0x0475
            vr2.t r3 = r14.f281373d
            r5 = r41
            r3.mo141826a(r5, r2)
            java.util.LinkedList<te3.c74> r3 = r5.f299717u
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
            if (r3 != 0) goto L_0x0471
            java.util.LinkedList<te3.c74> r3 = r5.f299717u
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            if (r3 == 0) goto L_0x0471
            boolean r3 = gv2.C98242p.m126944f(r5)
            if (r3 != 0) goto L_0x0471
            vr2.t r3 = r14.f281373d
            java.util.LinkedList<te3.c74> r6 = r5.f299717u
            java.lang.Object r6 = r6.get(r4)
            te3.c74 r6 = (te3.c74) r6
            java.lang.String r4 = r6.f131560d
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            r3.mo141827b(r5, r4)
        L_0x0471:
            m134774v(r5, r2, r14)
            goto L_0x04d3
        L_0x0475:
            r5 = r41
            vr2.t r3 = r14.f281373d
            r3.mo141826a(r5, r2)
            java.util.LinkedList<te3.c74> r3 = r5.f299717u
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
            if (r3 != 0) goto L_0x04a6
            java.util.LinkedList<te3.c74> r3 = r5.f299717u
            r6 = 0
            java.lang.Object r3 = r3.get(r6)
            if (r3 == 0) goto L_0x04a6
            boolean r3 = gv2.C98242p.m126944f(r5)
            if (r3 != 0) goto L_0x04a6
            vr2.t r3 = r14.f281373d
            java.util.LinkedList<te3.c74> r7 = r5.f299717u
            java.lang.Object r7 = r7.get(r6)
            te3.c74 r7 = (te3.c74) r7
            java.lang.String r6 = r7.f131560d
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            r3.mo141827b(r5, r6)
        L_0x04a6:
            m134774v(r5, r2, r14)
            int r3 = r5.f299716t
            boolean r3 = gv2.C98242p.m126942d(r3, r13)
            if (r3 == 0) goto L_0x04bb
            gv2.C98239l.m126931a()
            gv2.l r3 = gv2.C98239l.f288025c
            int r3 = r3.mo137537c()
            goto L_0x04c4
        L_0x04bb:
            gv2.C98241o.m126934a()
            gv2.o r3 = gv2.C98241o.f288030d
            int r3 = r3.mo137541c()
        L_0x04c4:
            if (r3 <= 0) goto L_0x04d3
            l40.d r2 = l40.C99337d.m129495d(r2, r3, r4)
            l40.f r2 = r2.mo138734a()
            l40.c r3 = l40.C99336c.f291266b
            r3.mo138733c(r4, r2)
        L_0x04d3:
            r13 = r24
            r28 = r35
            r10 = r36
            r7 = 7
            r8 = 1
            goto L_0x02e6
        L_0x04dd:
            r2 = r10
            r24 = r13
            r35 = r28
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r14.f281367a
            boolean r2 = r2.isAd()
            if (r2 == 0) goto L_0x04f5
            com.tencent.mm.plugin.sns.model.o r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r2.mo131133p(r0)
            goto L_0x04fc
        L_0x04f5:
            com.tencent.mm.plugin.sns.model.o r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r2.mo131135r(r0)
        L_0x04fc:
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r14.f281369b
            m134710E(r2, r11, r15)
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_finder_feed_try_get_enable
            java.lang.String r3 = "tryGetFinderFeedDetail"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r1)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r4 != 0) goto L_0x0524
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r4 != 0) goto L_0x0524
            boolean r4 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r4 == 0) goto L_0x0516
            goto L_0x0524
        L_0x0516:
            di3.d r4 = di3.C86312j.m106911c(r17)
            h81.h r4 = (h81.C32735h) r4
            r5 = 1
            int r2 = r4.mo58779Qe(r2, r5)
            if (r2 != r5) goto L_0x0533
            goto L_0x0531
        L_0x0524:
            r5 = 1
            di3.d r4 = di3.C86312j.m106911c(r17)
            h81.h r4 = (h81.C32735h) r4
            int r2 = r4.mo58779Qe(r2, r5)
            if (r2 != r5) goto L_0x0533
        L_0x0531:
            r2 = 1
            goto L_0x0534
        L_0x0533:
            r2 = 0
        L_0x0534:
            r4 = 37
            r6 = 28
            if (r2 == 0) goto L_0x0586
            if (r24 == 0) goto L_0x0586
            r7 = r24
            te3.j00 r8 = r7.ContentObj
            if (r8 == 0) goto L_0x0583
            int r9 = r8.f298424e
            if (r9 != r6) goto L_0x0583
            te3.rk1 r8 = r8.f298431o
            if (r8 == 0) goto L_0x0583
            java.lang.String r8 = r8.f185184e
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x0583
            te3.j00 r8 = r7.ContentObj
            te3.rk1 r8 = r8.f298431o
            java.lang.String r8 = r8.f185183d
            r9 = r46
            boolean r8 = r9.contains(r8)
            if (r8 != 0) goto L_0x058a
            di3.d r8 = di3.C86312j.m106911c(r18)
            ht1.t1 r8 = (ht1.C60200t1) r8
            te3.j00 r10 = r7.ContentObj
            te3.rk1 r10 = r10.f298431o
            java.lang.String r10 = r10.f185183d
            long r5 = m134706B0(r10)
            te3.j00 r10 = r7.ContentObj
            te3.rk1 r10 = r10.f298431o
            java.lang.String r10 = r10.f185191o
            r8.mo76890w4(r5, r10, r4)
            te3.j00 r5 = r7.ContentObj
            te3.rk1 r5 = r5.f298431o
            java.lang.String r5 = r5.f185183d
            r9.add(r5)
            goto L_0x058a
        L_0x0583:
            r9 = r46
            goto L_0x058a
        L_0x0586:
            r9 = r46
            r7 = r24
        L_0x058a:
            r5 = 43
            r6 = 34
            r8 = 45
            if (r2 == 0) goto L_0x05da
            if (r7 == 0) goto L_0x05da
            te3.j00 r2 = r7.ContentObj
            if (r2 == 0) goto L_0x05da
            int r10 = r2.f298424e
            if (r10 == r6) goto L_0x05a0
            if (r10 == r8) goto L_0x05a0
            if (r10 != r5) goto L_0x05da
        L_0x05a0:
            te3.p81 r2 = r2.f298435s
            if (r2 == 0) goto L_0x05da
            java.lang.String r2 = r2.f184779e
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x05da
            te3.j00 r2 = r7.ContentObj
            te3.p81 r2 = r2.f298435s
            java.lang.String r2 = r2.f184780f
            boolean r2 = r9.contains(r2)
            if (r2 != 0) goto L_0x05da
            di3.d r2 = di3.C86312j.m106911c(r18)
            ht1.t1 r2 = (ht1.C60200t1) r2
            te3.j00 r10 = r7.ContentObj
            te3.p81 r10 = r10.f298435s
            java.lang.String r10 = r10.f184780f
            long r5 = m134706B0(r10)
            te3.j00 r10 = r7.ContentObj
            te3.p81 r10 = r10.f298435s
            java.lang.String r10 = r10.f184790s
            r2.mo76890w4(r5, r10, r4)
            te3.j00 r2 = r7.ContentObj
            te3.p81 r2 = r2.f298435s
            java.lang.String r2 = r2.f184780f
            r9.add(r2)
        L_0x05da:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)
            java.lang.String r2 = r37.getUserName()
            r3 = r42
            r4 = r12
            com.tencent.mm.storage.z1 r5 = r3.mo69656H3(r2)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r6 != 0) goto L_0x0638
            if (r5 != 0) goto L_0x05f2
            r6 = r2
            goto L_0x05f6
        L_0x05f2:
            java.lang.String r6 = r5.mo62898f()
        L_0x05f6:
            boolean r9 = r37.isAd()
            if (r9 == 0) goto L_0x0619
            com.tencent.mm.plugin.sns.storage.ADXml r9 = r37.getAdXml()
            if (r9 == 0) goto L_0x0619
            boolean r10 = r9.usePreferedInfo
            if (r10 == 0) goto L_0x0609
            java.lang.String r6 = r9.preferNickName
            goto L_0x0619
        L_0x0609:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r10 == 0) goto L_0x0619
            java.lang.String r10 = r9.nickname
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x0619
            java.lang.String r6 = r9.nickname
        L_0x0619:
            r14.f281398y = r2
            r14.f281399z = r6
            boolean r2 = r37.isAd()
            r14.f281391r = r2
            java.lang.String r2 = r37.getLocalid()
            r14.f281381h = r2
            if (r5 != 0) goto L_0x062c
            goto L_0x0631
        L_0x062c:
            long r9 = r5.f108320R1
            int r2 = (int) r9
            if (r2 != 0) goto L_0x0633
        L_0x0631:
            r2 = 1
            goto L_0x0634
        L_0x0633:
            r2 = 0
        L_0x0634:
            r14.f281341A = r2
            r14.f281377f = r5
        L_0x0638:
            java.lang.String r2 = r37.getSnsId()
            r14.f281382i = r2
            java.lang.String r2 = r7.ContentDesc
            r14.f281384k = r2
            int r2 = r7.contentDescShowType
            r14.f281385l = r2
            int r2 = r37.getCreateTime()
            r14.f281386m = r2
            long r5 = (long) r2
            r9 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r9
            java.lang.String r2 = com.tencent.p014mm.plugin.sns.p106ui.C96315x6.m123535a(r11, r5)
            r14.f281390q = r2
            r2 = 0
            r14.f281343C = r2
            r2 = 10
            r5 = r32
            if (r5 != r2) goto L_0x067d
            java.lang.String r2 = eb0.C75592q0.m90789s()
            java.lang.String r5 = r7.UserName
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x067d
            r2 = r1
            r1 = r38
            te3.h84 r5 = r1.SnsRedEnvelops
            if (r5 == 0) goto L_0x0680
            int r5 = r5.f134504d
            if (r5 == 0) goto L_0x0680
            r14.f281344D = r5
            r5 = 1
            r14.f281343C = r5
            goto L_0x0680
        L_0x067d:
            r2 = r1
            r1 = r38
        L_0x0680:
            boolean r5 = r14.f281391r
            if (r5 == 0) goto L_0x069b
            com.tencent.mm.plugin.sns.storage.ADInfo r5 = r37.getAdInfo()
            if (r5 == 0) goto L_0x0698
            java.lang.String r9 = r5.adActionPOIName
            r14.f281346F = r9
            java.lang.String r5 = r5.adActionPOILink
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            r9 = 1
            r5 = r5 ^ r9
            r14.f281347G = r5
        L_0x0698:
            r6 = r7
            r5 = 0
            goto L_0x06e7
        L_0x069b:
            te3.kr2 r5 = r7.Location
            if (r5 != 0) goto L_0x06a1
            r9 = 0
            goto L_0x06a3
        L_0x06a1:
            java.lang.String r9 = r5.f298649f
        L_0x06a3:
            if (r5 != 0) goto L_0x06a7
            r5 = 0
            goto L_0x06a9
        L_0x06a7:
            java.lang.String r5 = r5.f298650g
        L_0x06a9:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r10 != 0) goto L_0x06de
            r23 = r7
            long r6 = r0.field_snsId
            r19 = 0
            int r10 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r10 != 0) goto L_0x06d7
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r6 != 0) goto L_0x06d7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            java.lang.String r7 = "·"
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r14.f281346F = r5
            goto L_0x06d9
        L_0x06d7:
            r14.f281346F = r5
        L_0x06d9:
            r5 = 1
            r14.f281347G = r5
            r5 = 0
            goto L_0x06e5
        L_0x06de:
            r23 = r7
            r14.f281346F = r9
            r5 = 0
            r14.f281347G = r5
        L_0x06e5:
            r6 = r23
        L_0x06e7:
            java.lang.CharSequence r7 = m134710E(r6, r11, r15)
            te3.r5 r9 = r6.AppInfo
            if (r9 == 0) goto L_0x06fb
            java.lang.String r9 = r9.f299236d
            java.lang.String r10 = "wx122a2d4c4b5f211e"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x06fb
            r7 = r4
        L_0x06fb:
            java.lang.Class<om.f> r9 = p214om.C11502f.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            om.f r9 = (p214om.C11502f) r9
            wc3.y r9 = r9.mo11461Sr()
            if (r7 != 0) goto L_0x070b
            r10 = 0
            goto L_0x070f
        L_0x070b:
            java.lang.String r10 = r7.toString()
        L_0x070f:
            boolean r9 = r9.mo93144L1(r10)
            if (r9 == 0) goto L_0x07f0
            boolean r9 = m134749i0(r6)
            if (r9 == 0) goto L_0x07f0
            r9 = 1
            r14.f281348H = r9
            te3.r5 r9 = r6.AppInfo
            if (r9 != 0) goto L_0x0724
            r10 = 0
            goto L_0x0779
        L_0x0724:
            java.lang.String r9 = r9.f299236d
            r5 = r44
            r10 = 0
            boolean r9 = r5.containsKey(r9)
            if (r9 == 0) goto L_0x073e
            te3.r5 r9 = r6.AppInfo
            java.lang.String r9 = r9.f299236d
            java.lang.Object r5 = r5.get(r9)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L_0x0779
        L_0x073e:
            di3.d r9 = di3.C86312j.m106911c(r16)
            ym.l r9 = (p763ym.C79138l) r9
            te3.r5 r12 = r6.AppInfo
            java.lang.String r12 = r12.f299236d
            boolean r9 = r9.mo74006a3(r12)
            if (r9 == 0) goto L_0x0758
            te3.r5 r9 = r6.AppInfo
            int r9 = r9.f299241i
            if (r9 != 0) goto L_0x0756
            r9 = 0
            goto L_0x0768
        L_0x0756:
            r9 = 1
            goto L_0x076b
        L_0x0758:
            di3.d r9 = di3.C86312j.m106911c(r16)
            ym.l r9 = (p763ym.C79138l) r9
            te3.r5 r12 = r6.AppInfo
            java.lang.String r12 = r12.f299236d
            boolean r9 = r9.cg0(r12)
            if (r9 != 0) goto L_0x076b
        L_0x0768:
            r12 = r9
            r9 = 0
            goto L_0x076d
        L_0x076b:
            r12 = r9
            r9 = 1
        L_0x076d:
            te3.r5 r15 = r6.AppInfo
            java.lang.String r15 = r15.f299236d
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r5.put(r15, r12)
            r5 = r9
        L_0x0779:
            te3.j00 r9 = r6.ContentObj
            int r9 = r9.f298424e
            r12 = 28
            if (r9 == r12) goto L_0x0793
            r12 = 36
            if (r9 == r12) goto L_0x0793
            r12 = 34
            if (r9 == r12) goto L_0x0793
            r12 = 43
            if (r9 == r12) goto L_0x0793
            if (r9 != r8) goto L_0x0790
            goto L_0x0793
        L_0x0790:
            r9 = r35
            goto L_0x07b1
        L_0x0793:
            di3.d r8 = di3.C86312j.m106911c(r18)
            ht1.t1 r8 = (ht1.C60200t1) r8
            boolean r8 = r8.mo76873sF()
            if (r8 != 0) goto L_0x07ae
            di3.d r8 = di3.C86312j.m106911c(r17)
            h81.h r8 = (h81.C32735h) r8
            r9 = r35
            int r8 = r8.mo58779Qe(r9, r10)
            if (r8 != 0) goto L_0x07b1
            goto L_0x07b0
        L_0x07ae:
            r9 = r35
        L_0x07b0:
            r5 = 1
        L_0x07b1:
            te3.j00 r8 = r6.ContentObj
            int r12 = r8.f298424e
            r13 = 1
            if (r12 != r13) goto L_0x07d5
            te3.p81 r8 = r8.f298435s
            if (r8 == 0) goto L_0x07d5
            di3.d r8 = di3.C86312j.m106911c(r18)
            ht1.t1 r8 = (ht1.C60200t1) r8
            boolean r8 = r8.mo76873sF()
            if (r8 != 0) goto L_0x07d4
            di3.d r8 = di3.C86312j.m106911c(r17)
            h81.h r8 = (h81.C32735h) r8
            int r8 = r8.mo58779Qe(r9, r10)
            if (r8 != 0) goto L_0x07d5
        L_0x07d4:
            r5 = 1
        L_0x07d5:
            te3.j00 r8 = r6.ContentObj
            if (r8 == 0) goto L_0x07e0
            te3.t23 r8 = r8.f298439w
            if (r8 == 0) goto L_0x07e0
            java.lang.String r8 = r8.f185476x
            goto L_0x07e1
        L_0x07e0:
            r8 = r4
        L_0x07e1:
            java.lang.String r9 = "wx485a97c844086dc9"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x07eb
            r5 = 1
        L_0x07eb:
            r14.f281350J = r7
            r14.f281349I = r5
            goto L_0x07f3
        L_0x07f0:
            r10 = 0
            r14.f281348H = r10
        L_0x07f3:
            te3.w25 r5 = r6.webSearchInfo
            if (r5 == 0) goto L_0x080c
            java.lang.String r5 = r5.f259899d
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x080c
            r5 = 2131838105(0x7f114499, float:1.9309424E38)
            java.lang.String r5 = r11.getString(r5)
            r14.f281350J = r5
            r5 = 1
            r14.f281348H = r5
            goto L_0x080d
        L_0x080c:
            r5 = 1
        L_0x080d:
            te3.j00 r7 = r6.ContentObj
            if (r7 == 0) goto L_0x0819
            int r7 = r7.f298424e
            r8 = 30
            if (r7 != r8) goto L_0x0819
            r14.f281351K = r5
        L_0x0819:
            java.lang.String r5 = r14.f281398y
            r7 = r6
            r6 = r43
            if (r5 == 0) goto L_0x0828
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0828
            r5 = 1
            goto L_0x0829
        L_0x0828:
            r5 = 0
        L_0x0829:
            r14.f281342B = r5
            boolean r5 = r37.isDieItem()
            r14.f281352L = r5
            te3.lv2 r5 = r37.getPostInfo()
            int r5 = r5.f298755s
            r14.f281353M = r5
            r14.f281354N = r10
            r5 = 5
            if (r1 == 0) goto L_0x087b
            boolean r8 = r14.f281342B
            if (r8 == 0) goto L_0x087b
            int r8 = r37.getLocalPrivate()
            r9 = 1
            r8 = r8 & r9
            if (r8 == 0) goto L_0x084c
            r8 = 1
            goto L_0x084d
        L_0x084c:
            r8 = 0
        L_0x084d:
            int r9 = r1.ExtFlag
            java.lang.String r12 = "checkEnableShowGroupByExtFlag"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            r15 = r9 & 3
            r10 = 3
            if (r15 == r10) goto L_0x086d
            r15 = r9 & 5
            if (r15 == r5) goto L_0x086d
            r15 = r9 & 1025(0x401, float:1.436E-42)
            r5 = 1025(0x401, float:1.436E-42)
            if (r15 == r5) goto L_0x086d
            r5 = 513(0x201, float:7.19E-43)
            r9 = r9 & r5
            if (r9 != r5) goto L_0x086b
            goto L_0x086d
        L_0x086b:
            r5 = 0
            goto L_0x086e
        L_0x086d:
            r5 = 1
        L_0x086e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            if (r5 == 0) goto L_0x0879
            if (r8 != 0) goto L_0x0879
            r5 = 1
            r14.f281354N = r5
            goto L_0x087d
        L_0x0879:
            r5 = 1
            goto L_0x087d
        L_0x087b:
            r5 = 1
            r10 = 3
        L_0x087d:
            if (r1 == 0) goto L_0x0b5b
            int r8 = r1.NewWithTaListCount
            if (r8 <= 0) goto L_0x0899
            r14.f281355O = r5
            vr2.b0$a r5 = vr2.C65874b0.f189421a
            java.lang.String r8 = r14.f281382i
            java.lang.String r9 = r1.Username
            boolean r6 = r6.equals(r9)
            java.util.LinkedList<te3.w64> r9 = r1.NewWithTaList
            java.lang.CharSequence r5 = r5.mo89930i(r11, r8, r6, r9)
            r14.f281357Q = r5
            goto L_0x0918
        L_0x0899:
            java.util.LinkedList<te3.w64> r5 = r1.WithUserList
            int r5 = r5.size()
            if (r5 > 0) goto L_0x08a6
            r5 = 0
            r14.f281355O = r5
            goto L_0x0918
        L_0x08a6:
            java.lang.String r5 = r1.Username
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x08f9
            r5 = 1
            r14.f281355O = r5
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>()
            java.util.LinkedList<te3.w64> r6 = r1.WithUserList
            java.util.Iterator r6 = r6.iterator()
            r8 = 0
        L_0x08bd:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x08f2
            java.lang.Object r9 = r6.next()
            te3.w64 r9 = (te3.w64) r9
            if (r8 != 0) goto L_0x08d2
            java.lang.String r8 = "  "
            r5.append(r8)
            r8 = 1
            goto L_0x08d7
        L_0x08d2:
            java.lang.String r12 = ",  "
            r5.append(r12)
        L_0x08d7:
            java.lang.String r12 = r9.f299704e
            if (r12 == 0) goto L_0x08df
            r5.append(r12)
            goto L_0x08bd
        L_0x08df:
            java.lang.String r12 = r9.f299703d
            com.tencent.mm.storage.z1 r12 = r3.mo69656H3(r12)
            if (r12 != 0) goto L_0x08ea
            java.lang.String r9 = r9.f299703d
            goto L_0x08ee
        L_0x08ea:
            java.lang.String r9 = r12.mo62898f()
        L_0x08ee:
            r5.append(r9)
            goto L_0x08bd
        L_0x08f2:
            java.lang.String r5 = r5.toString()
            r14.f281356P = r5
            goto L_0x0918
        L_0x08f9:
            java.util.LinkedList<te3.w64> r5 = r1.WithUserList
            java.util.Iterator r5 = r5.iterator()
        L_0x08ff:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0918
            java.lang.Object r8 = r5.next()
            te3.w64 r8 = (te3.w64) r8
            java.lang.String r8 = r8.f299703d
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x08ff
            r8 = 1
            r14.f281355O = r8
            r14.f281358R = r8
        L_0x0918:
            te3.h84 r5 = r1.SnsRedEnvelops
            if (r5 == 0) goto L_0x0992
            java.lang.String r5 = eb0.C75592q0.m90789s()
            java.lang.String r6 = r7.UserName
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0992
            te3.h84 r5 = r1.SnsRedEnvelops
            int r5 = r5.f134504d
            if (r5 <= 0) goto L_0x0992
            long r5 = as2.C92086h.m115758e(r37, r38)
            double r5 = (double) r5
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r5 = r5 * r8
            r14.f281361U = r5
            te3.h84 r5 = r1.SnsRedEnvelops
            int r5 = r5.f134504d
            r14.f281360T = r5
            r5 = 1
            r14.f281359S = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            te3.h84 r6 = r1.SnsRedEnvelops
            java.util.LinkedList<te3.j74> r6 = r6.f134505e
            java.util.Iterator r6 = r6.iterator()
        L_0x094f:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x098a
            java.lang.Object r8 = r6.next()
            te3.j74 r8 = (te3.j74) r8
            java.lang.String r9 = r8.f135912d
            com.tencent.mm.storage.z1 r9 = r3.mo69656H3(r9)
            if (r9 == 0) goto L_0x096c
            java.lang.String r9 = r9.mo62898f()
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
            goto L_0x0972
        L_0x096c:
            java.lang.String r9 = r8.f135912d
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
        L_0x0972:
            r12 = 1
            op3.j[] r13 = new op3.C117882j[r12]
            java.lang.String r8 = r8.f135912d
            op3.b r8 = op3.C117882j.m166284c(r8, r9)
            r9 = 0
            r13[r9] = r8
            r8 = 0
        L_0x097f:
            if (r8 >= r12) goto L_0x094f
            r9 = r13[r8]
            r5.add(r9)
            int r8 = r8 + 1
            r12 = 1
            goto L_0x097f
        L_0x098a:
            ip3.b r6 = new ip3.b
            r8 = 0
            r6.<init>(r5, r8)
            r14.f281362V = r6
        L_0x0992:
            java.util.LinkedList<te3.w64> r5 = r1.LikeUserList
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x0a0a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.LinkedList<te3.w64> r6 = r1.LikeUserList
            java.util.Iterator r6 = r6.iterator()
        L_0x09a5:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0a02
            java.lang.Object r8 = r6.next()
            te3.w64 r8 = (te3.w64) r8
            java.lang.String r9 = r8.f299703d
            com.tencent.mm.storage.z1 r9 = r3.mo69656H3(r9)
            if (r9 == 0) goto L_0x09d2
            java.lang.String r12 = r9.mo62898f()
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            java.lang.String r13 = r9.mo73980x2()
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)
            java.lang.String r9 = r9.mo73976t2()
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
            goto L_0x09da
        L_0x09d2:
            java.lang.String r9 = r8.f299703d
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
            r9 = r4
            r13 = r9
        L_0x09da:
            boolean r15 = vr2.C102260r.m134838G(r0, r8)
            if (r15 == 0) goto L_0x09e8
            com.tencent.mm.plugin.sns.storage.ADXml r15 = r37.getAdXml()
            java.lang.String r12 = gv2.C98242p.m126939a(r15, r12)
        L_0x09e8:
            r15 = 1
            op3.j[] r10 = new op3.C117882j[r15]
            java.lang.String r8 = r8.f299703d
            op3.d r8 = op3.C117882j.m166286e(r8, r12, r13, r9)
            r9 = 0
            r10[r9] = r8
            r8 = 0
        L_0x09f5:
            if (r8 >= r15) goto L_0x0a00
            r9 = r10[r8]
            r5.add(r9)
            int r8 = r8 + 1
            r15 = 1
            goto L_0x09f5
        L_0x0a00:
            r10 = 3
            goto L_0x09a5
        L_0x0a02:
            ip3.b r6 = new ip3.b
            r8 = 0
            r6.<init>(r5, r8)
            r14.f281363W = r6
        L_0x0a0a:
            java.util.LinkedList<te3.w64> r5 = r1.CommentUserList
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x0b5b
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.LinkedList<te3.w64> r6 = r1.CommentUserList
            java.util.Iterator r6 = r6.iterator()
        L_0x0a1d:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0b4d
            java.lang.Object r8 = r6.next()
            te3.w64 r8 = (te3.w64) r8
            int r9 = r8.f299709j
            if (r9 == 0) goto L_0x0a2f
            long r9 = (long) r9
            goto L_0x0a31
        L_0x0a2f:
            long r9 = r8.f299714r
        L_0x0a31:
            java.lang.String r12 = r8.f299703d
            java.lang.String r13 = m134782z(r8, r3)
            boolean r15 = r37.isAd()
            if (r15 == 0) goto L_0x0a53
            java.lang.String r15 = r8.f299703d
            if (r15 == 0) goto L_0x0a53
            java.lang.String r0 = r37.getUserName()
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x0a53
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r37.getAdXml()
            java.lang.String r13 = gv2.C98242p.m126939a(r0, r13)
        L_0x0a53:
            java.lang.String r0 = r8.f299707h
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r8.f299707h = r0
            vr2.t r15 = r14.f281373d
            r15.getClass()
            java.lang.String r3 = "get"
            r41 = r6
            java.lang.String r6 = "com.tencent.mm.plugin.sns.data.SnsCommentData"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r6)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.CharSequence> r15 = r15.f301194a
            r19 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r1 = r8.f299709j
            r2.append(r1)
            java.lang.String r1 = "-"
            r2.append(r1)
            r21 = r4
            r43 = r5
            long r4 = r8.f299714r
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = r8.f299707h
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object r2 = r15.get(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r6)
            vr2.t r3 = r14.f281373d
            r3.getClass()
            java.lang.String r4 = "getEmojiMd5"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r6)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r3 = r3.f301195b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r15 = r8.f299709j
            r5.append(r15)
            r5.append(r1)
            r15 = r12
            long r11 = r8.f299714r
            r5.append(r11)
            r5.append(r1)
            java.lang.String r11 = r8.f299707h
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            java.lang.Object r3 = r3.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r6)
            vr2.t r4 = r14.f281373d
            r4.getClass()
            java.lang.String r5 = "getShortComment"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.CharSequence> r4 = r4.f301196c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            int r12 = r8.f299709j
            r11.append(r12)
            r11.append(r1)
            r44 = r2
            r45 = r3
            long r2 = r8.f299714r
            r11.append(r2)
            r11.append(r1)
            java.lang.String r1 = r8.f299707h
            r11.append(r1)
            java.lang.String r1 = r11.toString()
            java.lang.Object r1 = r4.get(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            r2 = 1
            op3.j[] r3 = new op3.C117882j[r2]
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            op3.g r5 = new op3.g
            r5.<init>()
            r6 = 7
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r9 = 0
            r8[r9] = r4
            r8[r2] = r15
            r2 = 2
            r8[r2] = r13
            r2 = 3
            r8[r2] = r0
            r0 = 4
            r8[r0] = r44
            r0 = 5
            r8[r0] = r45
            r4 = 6
            r8[r4] = r1
            r5.f352402a = r8
            r3[r9] = r5
            r1 = 1
            r5 = 0
        L_0x0b2e:
            if (r5 >= r1) goto L_0x0b3b
            r1 = r3[r5]
            r4 = r43
            r4.add(r1)
            int r5 = r5 + 1
            r1 = 1
            goto L_0x0b2e
        L_0x0b3b:
            r0 = r37
            r1 = r38
            r11 = r39
            r6 = r41
            r3 = r42
            r5 = r43
            r2 = r19
            r4 = r21
            goto L_0x0a1d
        L_0x0b4d:
            r19 = r2
            r21 = r4
            r4 = r5
            ip3.b r0 = new ip3.b
            r1 = 0
            r0.<init>(r4, r1)
            r14.f281364X = r0
            goto L_0x0b5f
        L_0x0b5b:
            r19 = r2
            r21 = r4
        L_0x0b5f:
            te3.k1 r0 = r7.actionInfo
            r1 = r39
            com.tencent.p014mm.plugin.sns.p106ui.C96318y1.m123547a(r1, r14, r0)
            boolean r0 = r14.f281391r
            if (r0 == 0) goto L_0x0b7c
            com.tencent.mm.plugin.sns.storage.ADInfo r0 = r37.getAdInfo()
            r14.f281392s = r0
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r37.getAdXml()
            r14.f281393t = r0
            java.lang.String r0 = r37.getAdTitle()
            r14.f281394u = r0
        L_0x0b7c:
            boolean r0 = r14.f281391r
            if (r0 == 0) goto L_0x0c72
            com.tencent.mm.plugin.sns.storage.ADInfo r0 = r14.f281392s
            int r2 = r0.adActionExtTailType
            int r3 = com.tencent.p014mm.plugin.sns.storage.ADInfo.ADChainStrengthenDefaultWording
            if (r2 != r3) goto L_0x0b8e
            java.lang.String r2 = r0.adActionExtTailWording
            r14.f281395v = r2
            goto L_0x0c1c
        L_0x0b8e:
            int r3 = com.tencent.p014mm.plugin.sns.storage.ADInfo.ADChainStrengthenUserInfoFormatWording
            if (r2 != r3) goto L_0x0c1c
            java.lang.String r2 = r0.adActionExtTailWording
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0c1c
            java.util.LinkedList<java.lang.String> r2 = r0.adActionExtUserList
            java.util.Iterator r2 = r2.iterator()
            r6 = r21
        L_0x0ba2:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0c0c
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.tencent.mm.storage.u3 r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.Jx0()
            com.tencent.mm.storage.z1 r4 = r4.mo69656H3(r3)
            if (r4 == 0) goto L_0x0be2
            java.lang.String r4 = r4.mo62898f()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 != 0) goto L_0x0bd2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            goto L_0x0bf1
        L_0x0bd2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            goto L_0x0bf1
        L_0x0be2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
        L_0x0bf1:
            r6 = r4
            java.util.LinkedList<java.lang.String> r4 = r0.adActionExtUserList
            java.lang.Object r4 = r4.getLast()
            if (r4 == r3) goto L_0x0ba2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            java.lang.String r4 = ","
            r3.append(r4)
            java.lang.String r6 = r3.toString()
            goto L_0x0ba2
        L_0x0c0c:
            r14.f281397x = r6
            java.lang.String r2 = r0.adActionExtTailWording
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r3 = 0
            r4[r3] = r6
            java.lang.String r2 = java.lang.String.format(r2, r4)
            r14.f281396w = r2
        L_0x0c1c:
            com.tencent.mm.plugin.sns.storage.ADXml r2 = r14.f281393t
            boolean r0 = lo2.C99542h0.m129910h(r2, r0)
            if (r0 == 0) goto L_0x0c72
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r14.f281393t
            if (r0 == 0) goto L_0x0c6b
            int r2 = r0.adActionLinkHidden
            r3 = 1
            if (r2 != r3) goto L_0x0c6b
            boolean r0 = r0.isCardAd()
            if (r0 != 0) goto L_0x0c6b
            com.tencent.mm.plugin.sns.storage.ADXml r0 = r14.f281393t
            boolean r0 = r0.isFullCardAd()
            if (r0 != 0) goto L_0x0c6b
            com.tencent.mm.plugin.sns.storage.ADInfo r0 = r14.f281392s
            if (r0 == 0) goto L_0x0c53
            java.lang.String r0 = r0.adActionExtTailWording
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0c51
            com.tencent.mm.plugin.sns.storage.ADInfo r0 = r14.f281392s
            java.lang.String r0 = r0.adActionExtTailFormattedWording
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0c53
        L_0x0c51:
            r5 = 1
            goto L_0x0c54
        L_0x0c53:
            r5 = 0
        L_0x0c54:
            if (r5 != 0) goto L_0x0c63
            r2 = 1
            r14.f281348H = r2
            r0 = 2131826159(0x7f1115ef, float:1.9285195E38)
            java.lang.String r0 = r1.getString(r0)
            r14.f281350J = r0
            goto L_0x0c72
        L_0x0c63:
            r1 = 0
            r14.f281348H = r1
            r0 = r21
            r14.f281350J = r0
            goto L_0x0c72
        L_0x0c6b:
            r0 = r21
            r1 = 0
            r14.f281348H = r1
            r14.f281350J = r0
        L_0x0c72:
            te3.lv2 r0 = r37.getPostInfo()
            r14.f281368a0 = r0
            if (r0 == 0) goto L_0x0c8f
            java.lang.String r0 = eb0.C75592q0.m90789s()
            java.lang.String r1 = r7.UserName
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0c8f
            boolean r0 = as2.C92086h.m115755b(r37, r38)
            if (r0 == 0) goto L_0x0c8f
            r1 = 1
            r14.f281345E = r1
        L_0x0c8f:
            boolean r0 = r37.isWsFold()
            if (r0 == 0) goto L_0x0ccf
            os2.o0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.iy0()
            r1 = r38
            long r1 = r1.f283891Id
            os2.n0 r0 = r0.mo60192jo(r1)
            r14.f281372c0 = r0
            if (r0 == 0) goto L_0x0ccf
            byte[] r0 = r0.field_groupStrcut
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r0)
            if (r0 != 0) goto L_0x0ccf
            te3.k94 r0 = new te3.k94
            r0.<init>()
            os2.n0 r1 = r14.f281372c0     // Catch:{ Exception -> 0x0cbc }
            byte[] r1 = r1.field_groupStrcut     // Catch:{ Exception -> 0x0cbc }
            r0.parseFrom(r1)     // Catch:{ Exception -> 0x0cbc }
            r14.f281374d0 = r0     // Catch:{ Exception -> 0x0cbc }
            goto L_0x0ccf
        L_0x0cbc:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r0.getMessage()
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "parse SnsWsGroupStruct fail:%s"
            r2 = r31
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r0, r1)
        L_0x0ccf:
            r1 = r19
            r2 = r33
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: vr2.C102236a0.m134783z0(com.tencent.mm.plugin.sns.storage.SnsInfo, com.tencent.mm.protocal.protobuf.SnsObject, android.content.Context, com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter, boolean, com.tencent.mm.storage.u3, java.lang.String, java.util.Map, java.util.Map, java.util.List):com.tencent.mm.plugin.sns.ui.w6");
    }
}

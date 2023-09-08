package r53;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import f40.C86709a0;
import gy3.C87412m;
import java.math.BigDecimal;
import m53.C10766l;
import nj3.C76879j;
import o40.C61937h;
import ob0.C89132b;
import org.json.JSONObject;
import p53.C11828a;
import p53.C11830b;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49851ii2;
import te3.C50675of3;

/* renamed from: r53.c */
public final class C12953c {

    /* renamed from: a */
    public static long f36969a;

    /* renamed from: r53.c$a */
    public static final class C12954a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f36970d;

        /* renamed from: e */
        public final /* synthetic */ C49851ii2 f36971e;

        /* renamed from: f */
        public final /* synthetic */ C11830b f36972f;

        public C12954a(Context context, C49851ii2 ii22, C11830b bVar) {
            this.f36970d = context;
            this.f36971e = ii22;
            this.f36972f = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C12953c.m12392a(this.f36970d, this.f36971e.f135363e, this.f36972f);
        }
    }

    /* renamed from: r53.c$b */
    public static final class C12955b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f36973d;

        /* renamed from: e */
        public final /* synthetic */ C49851ii2 f36974e;

        /* renamed from: f */
        public final /* synthetic */ C11830b f36975f;

        public C12955b(Context context, C49851ii2 ii22, C11830b bVar) {
            this.f36973d = context;
            this.f36974e = ii22;
            this.f36975f = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C12953c.m12392a(this.f36973d, this.f36974e.f135364f, this.f36975f);
        }
    }

    /* renamed from: r53.c$c */
    public static final class C12956c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f36976d;

        /* renamed from: e */
        public final /* synthetic */ C49851ii2 f36977e;

        /* renamed from: f */
        public final /* synthetic */ C11830b f36978f;

        public C12956c(Context context, C49851ii2 ii22, C11830b bVar) {
            this.f36976d = context;
            this.f36977e = ii22;
            this.f36978f = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C12953c.m12392a(this.f36976d, this.f36977e.f135363e, this.f36978f);
        }
    }

    /* renamed from: a */
    public static final void m12392a(Context context, C50675of3 of32, C11830b bVar) {
        if (of32 != null) {
            int i = of32.f139143e;
            if (i == 1) {
                Log.m105918d("MicroMsg.WeCoinUtils", "handleWeCoinJumpItem h5 url " + of32.f139144f);
                Intent intent = new Intent();
                intent.putExtra("rawUrl", of32.f139144f);
                C75228t.m90217J(context, intent);
            } else if (i == 2) {
                Log.m105918d("MicroMsg.WeCoinUtils", "handleWeCoinJumpItem TinyApp, username: " + of32.f139145g + ", pagepath: " + of32.f139146h);
                C75228t.m90224Q(of32.f139145g, of32.f139146h, 0, 1188);
            }
            if (bVar != null) {
                bVar.mo11378a(of32);
            }
        }
    }

    /* renamed from: b */
    public static final double m12393b(String str, String str2, int i) {
        String str3;
        C87412m.m108594g(str, "d1");
        C87412m.m108594g(str2, "d2");
        try {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (true) {
                if (i2 > length) {
                    break;
                }
                boolean z2 = C87412m.m108596i(str.charAt(!z ? i2 : length), 32) <= 0;
                if (!z) {
                    if (!z2) {
                        z = true;
                    } else {
                        i2++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            if (Util.getDouble(str.subSequence(i2, length + 1).toString(), 0.0d) == 0.0d) {
                str3 = "0";
            } else {
                int length2 = str.length() - 1;
                int i3 = 0;
                boolean z3 = false;
                while (true) {
                    if (i3 > length2) {
                        break;
                    }
                    boolean z4 = C87412m.m108596i(str.charAt(!z3 ? i3 : length2), 32) <= 0;
                    if (!z3) {
                        if (!z4) {
                            z3 = true;
                        } else {
                            i3++;
                        }
                    } else if (!z4) {
                        break;
                    } else {
                        length2--;
                    }
                }
                str3 = str.subSequence(i3, length2 + 1).toString();
            }
            BigDecimal bigDecimal = new BigDecimal(str3);
            int length3 = str2.length() - 1;
            int i4 = 0;
            boolean z5 = false;
            while (true) {
                if (i4 > length3) {
                    break;
                }
                boolean z6 = C87412m.m108596i(str2.charAt(!z5 ? i4 : length3), 32) <= 0;
                if (!z5) {
                    if (!z6) {
                        z5 = true;
                    } else {
                        i4++;
                    }
                } else if (!z6) {
                    break;
                } else {
                    length3--;
                }
            }
            return bigDecimal.divide(new BigDecimal(str2.subSequence(i4, length3 + 1).toString()), 5, i).doubleValue();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WeCoinUtils", e, "", new Object[0]);
            return 0.0d;
        }
    }

    /* renamed from: c */
    public static final int m12394c(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
            case 2:
                return 1;
            case 3:
            case 4:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return 1 + C10766l.m10744a(i);
            default:
                return -1;
        }
    }

    /* renamed from: d */
    public static final void m12395d(Context context, C11828a aVar, DialogInterface.OnClickListener onClickListener) {
        C87412m.m108594g(context, "context");
        if (aVar == null) {
            return;
        }
        if (aVar.f34583a != 0 || aVar.f34584b != 0) {
            String str = aVar.f34585c;
            if (str == null || str.length() == 0) {
                C76879j.m92711E(context, context.getString(C0966R.string.ljp), "", context.getString(C0966R.string.ljf), false, onClickListener);
            } else {
                C76879j.m92711E(context, aVar.f34585c, "", context.getString(C0966R.string.ljf), false, onClickListener);
            }
        }
    }

    /* renamed from: e */
    public static final void m12396e(Context context, C49851ii2 ii22, C11830b bVar) {
        C87412m.m108594g(context, "context");
        if (ii22 != null) {
            int i = ii22.f135365g;
            if (i == 1) {
                C76879j.m92711E(context, ii22.f135362d, "", ii22.f135363e.f139142d, false, new C12954a(context, ii22, bVar));
            } else if (i == 2) {
                C76879j.m92709C(context, ii22.f135362d, "", ii22.f135364f.f139142d, ii22.f135363e.f139142d, false, new C12955b(context, ii22, bVar), new C12956c(context, ii22, bVar));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        r2 = (r2 = r2.f256796d).BaseResponse;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends te3.C49335eu3> boolean m12397f(ob0.C89132b.C89134c<T> r2) {
        /*
            java.lang.String r0 = "callback"
            gy3.C87412m.m108594g(r2, r0)
            int r0 = r2.f256793a
            r1 = 1
            if (r0 != 0) goto L_0x0020
            int r0 = r2.f256794b
            if (r0 == 0) goto L_0x000f
            goto L_0x0020
        L_0x000f:
            T r2 = r2.f256796d
            if (r2 != 0) goto L_0x0014
            return r1
        L_0x0014:
            te3.ja r2 = r2.BaseResponse
            if (r2 != 0) goto L_0x0019
            return r1
        L_0x0019:
            int r2 = r2.f135955d
            if (r2 == 0) goto L_0x001e
            return r1
        L_0x001e:
            r2 = 0
            return r2
        L_0x0020:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r53.C12953c.m12397f(ob0.b$c):boolean");
    }

    /* renamed from: g */
    public static final <T extends C49335eu3> boolean m12398g(C89132b.C89134c<T> cVar) {
        C87412m.m108594g(cVar, "callback");
        return (cVar.f256793a == 0 && cVar.f256794b == 0) ? false : true;
    }

    /* renamed from: h */
    public static final boolean m12399h() {
        if (Util.ticksToNow(f36969a) < 600) {
            Log.m105918d("MicroMsg.WeCoinUtils", "button click too soon, save time " + f36969a);
            return true;
        }
        f36969a = Util.currentTicks();
        return false;
    }

    /* renamed from: i */
    public static final long m12400i() {
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WECOIN_BALANCE_LONG_SYNC, 0L);
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) f).longValue();
    }

    /* renamed from: j */
    public static final int m12401j(String str, String str2) {
        C87412m.m108594g(str, "d1");
        C87412m.m108594g(str2, "d2");
        try {
            double d = Util.getDouble(str, 0.0d);
            double d2 = Util.getDouble(str2, 0.0d);
            boolean z = true;
            if (d == 0.0d) {
                str = "0";
            }
            BigDecimal bigDecimal = new BigDecimal(str);
            if (d2 != 0.0d) {
                z = false;
            }
            if (z) {
                str2 = "0";
            }
            return bigDecimal.multiply(new BigDecimal(str2)).intValue();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WeCoinUtils", e, "", new Object[0]);
            return 0;
        }
    }

    /* renamed from: k */
    public static final void m12402k(String str, C47465a aVar) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(aVar, "originObj");
        JSONObject jSONObject = new JSONObject();
        try {
            C61937h.m72704c(aVar, jSONObject);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.WeCoinUtils", "printPbLog account exception, error: " + e.getMessage() + ", stack trace: " + Util.stackTraceToString(e));
        }
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "jsonObject.toString()");
        Log.m105924i(str, jSONObject2);
    }

    /* renamed from: l */
    public static final void m12403l(long j) {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WECOIN_BALANCE_LONG_SYNC, Long.valueOf(j));
    }

    /* renamed from: m */
    public static final void m12404m(TextView textView, int i) {
        C87412m.m108594g(textView, "textView");
        textView.setTextSize(1, (float) i);
    }
}

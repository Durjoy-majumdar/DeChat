package p758xy;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0125s;
import az2.C39674e;
import b03.C39691c;
import b03.C39715n;
import bl3.C39818r;
import bp3.C104160f;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.p136ui.base.NoMeasuredTextView;
import com.tencent.p014mm.p136ui.chatting.viewitems.C57783l6;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.listview.PullDownListView;
import com.tencent.p014mm.plugin.textstatus.p112ui.StatusAlbumUI;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusHistoryUI;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusLikeListActivity;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import k20.C9556a;
import lc3.C10485b;
import lz2.C46920c;
import lz2.C46927m;
import m02.C46940b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import org.json.JSONObject;
import p255vr.C65873e;
import p773yy.C79168k;
import qo3.C89779i0;
import qy2.C47894a0;
import qy2.C47896n;
import qy2.C63347a;
import qy2.C77448f0;
import qy2.C77451h;
import qy2.C77453j;
import rx3.C13598b0;
import rz2.C48201c;
import rz2.C48206h;
import su0.C13781a;
import uy2.C52665g;
import uz2.C52674d;
import uz2.C52718u;
import vy2.C78495a;
import vz2.C78501d;
import xy2.C53477h;
import yz2.C53666d0;
import yz2.C79217a;
import yz2.C79239k;
import yz2.C79261r;
import yz2.C79284y;
import z04.C112551y;
import zf3.C112622a;
import zf3.C112624c;
import zz2.C53848a;

@C86522b
/* renamed from: xy.l */
public final class C53469l extends C86301e implements C79168k {

    /* renamed from: d */
    public WeakReference<C53666d0> f150383d;

    /* renamed from: xy.l$a */
    public static final class C53470a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C46920c f150384d;

        /* renamed from: e */
        public final /* synthetic */ C79168k.C53638a f150385e;

        /* renamed from: f */
        public final /* synthetic */ C89779i0 f150386f;

        public C53470a(C46920c cVar, C79168k.C53638a aVar, C89779i0 i0Var) {
            this.f150384d = cVar;
            this.f150385e = aVar;
            this.f150386f = i0Var;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C89137b0 d = C86709a0.m107524d();
            this.f150384d.getClass();
            d.mo123469o(4301, this);
            C89137b0 d2 = C86709a0.m107524d();
            this.f150384d.getClass();
            d2.mo123470p(4301, this);
            if (i == 0 && i2 == 0) {
                C52674d dVar = this.f150384d.f126149f;
                if (dVar != null) {
                    ((C57783l6) this.f150385e).mo82221a(true, dVar.f147074d);
                }
            } else {
                ((C57783l6) this.f150385e).mo82221a(false, (String) null);
            }
            this.f150386f.dismiss();
        }
    }

    /* renamed from: xy.l$b */
    public static final class C53471b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C46920c f150387d;

        public C53471b(C46920c cVar) {
            this.f150387d = cVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f150387d);
        }
    }

    /* renamed from: AK */
    public void mo74104AK(TextView textView, String str, int i, C63347a.C47892c cVar, C63347a.C47893d dVar) {
        C87412m.m108594g(cVar, "iconScene");
        C87412m.m108594g(dVar, "iconType");
        if (textView != null) {
            if (!(str == null || C112551y.m153811k(str)) && vx0(cVar, str)) {
                new C46927m.C46937j(str, textView, i, dVar, cVar);
            }
        }
    }

    /* renamed from: BS */
    public boolean mo74105BS(String str) {
        if (!C77448f0.m93394f()) {
            return false;
        }
        return (str == null || C112551y.m153811k(str) ? null : C39674e.f106452d.mo62253n0(str)) != null;
    }

    public void Bb0(String str) {
        SQLiteDatabase f = C39674e.f106452d.mo62242Np().mo125615f();
        Cursor cursor = null;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            cursor = f.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, str, (Object[]) null, (String) null);
            String[] columnNames = cursor.getColumnNames();
            int length = columnNames != null ? columnNames.length : 0;
            Log.m105924i("MicroMsg.TextStatus.TextStatusFeatureService", "Executing SQL from shell: " + str);
            if (length > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(" > ");
                C87412m.m108591d(columnNames);
                sb.append(TextUtils.join(APLogFileUtil.SEPARATOR_LOG, columnNames));
                Log.m105924i("MicroMsg.TextStatus.TextStatusFeatureService", sb.toString());
            }
            StringBuilder sb4 = new StringBuilder(1024);
            while (cursor.moveToNext()) {
                sb4.setLength(0);
                sb4.append(" > ");
                for (int i = 0; i < length; i++) {
                    int type = cursor.getType(i);
                    if (type == 0) {
                        sb4.append("(null)");
                    } else if (type != 4) {
                        sb4.append(cursor.getString(i));
                    } else {
                        sb4.append("(blob)");
                    }
                    sb4.append(APLogFileUtil.SEPARATOR_LOG);
                }
                Log.m105924i("MicroMsg.TextStatus.TextStatusFeatureService", sb4.toString());
            }
            Log.m105925i("MicroMsg.TextStatus.TextStatusFeatureService", "Finish executing SQL in %d ms: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), str);
            if (cursor == null) {
                return;
            }
        } catch (RuntimeException e) {
            Log.m105921e("MicroMsg.TextStatus.TextStatusFeatureService", "Failed to execute SQL '%s': %s", str, e.getMessage());
            if (cursor == null) {
                return;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        cursor.close();
    }

    /* renamed from: By */
    public void mo74107By(Context context, String str) {
        if (str != null) {
            C112551y.m153811k(str);
        }
    }

    /* renamed from: Fe */
    public CharSequence mo74108Fe(TextView textView, String str, CharSequence charSequence, C63347a.C47892c cVar, float f) {
        ImageSpan Ig0;
        C87412m.m108594g(charSequence, "displayName");
        C87412m.m108594g(cVar, "iconScene");
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            if (charSequence.length() == 0) {
                z = true;
            }
            if (!z && vx0(cVar, str) && (Ig0 = Ig0(textView, str, cVar, f)) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                spannableStringBuilder.append(" ");
                spannableStringBuilder.setSpan(Ig0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 34);
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if ((r13.length() == 0) != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if ((r13.length() == 0) != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
        if (r14 == 10) goto L_0x006c;
     */
    /* renamed from: HD */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo74109HD(java.lang.String r13, long r14) {
        /*
            r12 = this;
            java.lang.String r0 = "userName"
            gy3.C87412m.m108594g(r13, r0)
            az2.e r0 = az2.C39674e.f106452d
            rz2.h r0 = r0.mo62255t0()
            rz2.c r0 = r0.mo72970kD(r13)
            r1 = 2
            r3 = 0
            r5 = 1
            r7 = 0
            r8 = 1
            int r9 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r9 != 0) goto L_0x001f
            if (r0 == 0) goto L_0x006d
            r3 = r1
            goto L_0x006d
        L_0x001f:
            r9 = 3
            int r11 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0031
            int r9 = r13.length()
            if (r9 != 0) goto L_0x002d
            r9 = 1
            goto L_0x002e
        L_0x002d:
            r9 = 0
        L_0x002e:
            if (r9 == 0) goto L_0x006c
            goto L_0x006d
        L_0x0031:
            r9 = 4
            int r11 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0043
            int r9 = r13.length()
            if (r9 != 0) goto L_0x003f
            r9 = 1
            goto L_0x0040
        L_0x003f:
            r9 = 0
        L_0x0040:
            if (r9 == 0) goto L_0x006c
            goto L_0x006d
        L_0x0043:
            r9 = 5
            int r11 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x004a
            goto L_0x006c
        L_0x004a:
            r9 = 6
            int r11 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0051
            goto L_0x006c
        L_0x0051:
            r9 = 7
            int r11 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0058
            goto L_0x006c
        L_0x0058:
            r9 = 8
            int r11 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x005f
            goto L_0x006c
        L_0x005f:
            r9 = 9
            int r11 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0066
            goto L_0x006c
        L_0x0066:
            r9 = 10
            int r11 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x006d
        L_0x006c:
            r3 = r5
        L_0x006d:
            com.tencent.mm.autogen.mmdata.rpt.TextStateHeadClickReportStruct r9 = new com.tencent.mm.autogen.mmdata.rpt.TextStateHeadClickReportStruct
            r9.<init>()
            java.lang.String r10 = "ToUsername"
            java.lang.String r13 = r9.mo86045b(r10, r13, r8)
            r9.f108009d = r13
            r9.f108010e = r14
            if (r0 == 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r1 = r5
        L_0x0080:
            r9.f108011f = r1
            r9.f108012g = r3
            long r13 = java.lang.System.currentTimeMillis()
            r9.f108013h = r13
            java.lang.String r13 = ""
            java.lang.String r14 = "SceneExtInfo"
            java.lang.String r14 = r9.mo86045b(r14, r13, r8)
            r9.f108014i = r14
            r14 = 0
            if (r0 == 0) goto L_0x009a
            java.lang.String r15 = r0.field_StatusID
            goto L_0x009b
        L_0x009a:
            r15 = r14
        L_0x009b:
            if (r15 != 0) goto L_0x009e
            r15 = r13
        L_0x009e:
            java.lang.String r1 = "ToStatusID"
            java.lang.String r15 = r9.mo86045b(r1, r15, r8)
            r9.f108015j = r15
            if (r0 == 0) goto L_0x00aa
            java.lang.String r14 = r0.field_IconID
        L_0x00aa:
            if (r14 != 0) goto L_0x00ad
            goto L_0x00ae
        L_0x00ad:
            r13 = r14
        L_0x00ae:
            java.lang.String r14 = "ToStatusIconID"
            java.lang.String r13 = r9.mo86045b(r14, r13, r8)
            r9.f108016k = r13
            r9.mo86054n()
            r13 = 2
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r14 = 22210(0x56c2, float:3.1123E-41)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13[r7] = r14
            java.lang.String r14 = r9.mo1006q()
            java.lang.String r15 = "struct.toShowString()"
            gy3.C87412m.m108593f(r14, r15)
            java.lang.String r15 = "\r\n"
            java.lang.String r0 = " "
            java.lang.String r14 = z04.C112551y.m153814n(r14, r15, r0, r7)
            r13[r8] = r14
            java.lang.String r14 = "MicroMsg.TextStatus.tsReport"
            java.lang.String r15 = "report%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r15, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p758xy.C53469l.mo74109HD(java.lang.String, long):void");
    }

    public ImageSpan Ig0(TextView textView, String str, C63347a.C47892c cVar, float f) {
        C87412m.m108594g(cVar, "iconScene");
        if ((str == null || C112551y.m153811k(str)) || !vx0(cVar, str)) {
            return null;
        }
        C39691c a = IStatusIconHelperKt.m39109a();
        int i = (int) f;
        a.getClass();
        C48201c n0 = C39674e.f106452d.mo62253n0(str);
        if (n0 == null) {
            return null;
        }
        int i2 = C39691c.C39692a.f106488b[cVar.ordinal()];
        return a.mo62299k(textView, n0.field_IconID, C63347a.C47893d.OUTLINED, i2 != 1 ? i2 != 2 ? i2 != 3 ? n0.mo72947p2() ? C63347a.C47891b.GREY : C63347a.C47891b.DEFAULT : C63347a.C47891b.FG_2 : C63347a.C47891b.FG_0 : C63347a.C47891b.WHITE, cVar, i, n0);
    }

    /* renamed from: Ij */
    public void mo74111Ij(long j, String str) {
        C78501d dVar = C78501d.f229945a;
        if (str == null) {
            str = "";
        }
        C78501d.m94805g(dVar, j, str, (String) null, 0, (String) null, 0, 60, (Object) null);
    }

    /* renamed from: J6 */
    public C77453j mo74112J6(Context context, RelativeLayout relativeLayout, LinearLayout linearLayout, int i) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(relativeLayout, "rootLayout");
        C87412m.m108594g(linearLayout, "headRoot");
        return new C79261r(context, relativeLayout, linearLayout, i);
    }

    /* renamed from: Kw */
    public C47896n mo74113Kw(Context context, C47894a0 a0Var) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(a0Var, "showParam");
        return new C79284y(context, a0Var);
    }

    /* renamed from: Mg */
    public void mo74114Mg(Activity activity, String str) {
        if (activity != null) {
            boolean z = false;
            if (!(str == null || C112551y.m153811k(str)) && C39674e.f106452d.mo62253n0(str) != null) {
                Configuration configuration = activity.getResources().getConfiguration();
                C87412m.m108593f(configuration, "activity.resources.configuration");
                if (configuration.orientation == 2) {
                    z = true;
                }
                if (!z) {
                    C53666d0 d0Var = new C53666d0(activity, str);
                    d0Var.show();
                    this.f150383d = new WeakReference<>(d0Var);
                }
            }
        }
    }

    /* renamed from: Nd */
    public void mo74115Nd(String str, int i, Context context, C79168k.C53638a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "callback");
        if (str != null) {
            C46920c cVar = new C46920c(str, i);
            C89779i0 P = C76879j.m92722P(context, context.getString(C0966R.string.f360085a04), 3, context.getString(C0966R.string.f360085a04), false, true, new C53471b(cVar));
            C87412m.m108593f(P, "val scene = NetSceneSpor…ncel(scene)\n            }");
            C89137b0 d = C86709a0.m107524d();
            C87412m.m108593f(d, "getNetSceneQueue()");
            C78495a.m94796a(d, cVar, (C0125s) null, new C53470a(cVar, aVar, P));
        }
    }

    public void Ng0(TextView textView, String str) {
        if (textView != null) {
            if (!(str == null || C112551y.m153811k(str))) {
                C46927m mVar = C46927m.f126173a;
                C87412m.m108594g(str, "_key");
                Map<Integer, C46927m.C46933f> map = C46927m.f126174b;
                synchronized (map) {
                    C46927m.C46933f fVar = (C46927m.C46933f) ((LinkedHashMap) map).get(Integer.valueOf(textView.hashCode()));
                    if (fVar != null && C87412m.m108589b(str, fVar.f126180a)) {
                        map.remove(Integer.valueOf(textView.hashCode()));
                        Log.m105924i("MicroMsg.TextStatus.TextStatusEventCenter", "cancelListener " + str);
                    }
                }
            }
        }
    }

    /* renamed from: O9 */
    public MMFragment mo74117O9(Context context, Bundle bundle) {
        C87412m.m108594g(context, "context");
        SimpleDateFormat simpleDateFormat = C77448f0.f225876a;
        boolean z = true;
        if (((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_text_state_history_v2_and, C104160f.RepairerConfig_TextStatus_NewTextStatusHistory_Int, 1) != 1) {
            z = false;
        }
        Fragment instantiate = Fragment.instantiate(context, z ? TextStatusHistoryUI.class.getName() : StatusAlbumUI.class.getName(), bundle);
        C87412m.m108592e(instantiate, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragment");
        return (MMFragment) instantiate;
    }

    /* renamed from: OU */
    public long mo74118OU() {
        return IStatusIconHelperKt.m39109a().mo62302n();
    }

    /* renamed from: Py */
    public void mo74119Py(View view, CharSequence charSequence) {
        if (!(charSequence == null || C112551y.m153811k(charSequence))) {
            C39715n[] nVarArr = (C39715n[]) new SpannableStringBuilder(charSequence).getSpans(0, charSequence != null ? charSequence.length() : 0, C39715n.class);
            if (view != null) {
                view.setTag(C0966R.C0970id.f359345ke2, (Object) null);
            }
            C87412m.m108593f(nVarArr, "imgSpans");
            for (C39715n a : nVarArr) {
                a.mo62345a(view);
            }
        }
    }

    public void Ru0(String str, String str2, Boolean bool) {
        String str3 = str;
        String str4 = str2;
        boolean booleanValue = bool.booleanValue();
        if (!(str3 == null || str.length() == 0)) {
            if (!(str4 == null || str2.length() == 0)) {
                try {
                    C52718u uVar = new C52718u();
                    uVar.parseFrom(Base64.decode(str4, 0));
                    C39674e eVar = C39674e.f106452d;
                    String a = C13781a.m13082a();
                    C87412m.m108593f(a, "username()");
                    C39674e.m42303X0(eVar, a, str, uVar, 0, (String) null, 0, 56, (Object) null);
                    if (booleanValue) {
                        C39674e.m42302T0(eVar, false, 1, (Object) null);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.TextStatus.TextStatusFeatureService", th, "NetSceneGetProfile parse extfail id:" + str3, new Object[0]);
                    return;
                }
            }
        }
        Log.m105924i("MicroMsg.TextStatus.TextStatusFeatureService", "del self");
        C48206h t0 = C39674e.f106452d.mo62255t0();
        String a2 = C13781a.m13082a();
        C87412m.m108593f(a2, "username()");
        t0.mo72973qq(a2);
    }

    /* renamed from: V7 */
    public boolean mo74121V7() {
        return IStatusIconHelperKt.m39109a().mo62279I();
    }

    /* renamed from: Xo */
    public void mo74122Xo(Context context, PullDownListView pullDownListView) {
        C13598b0 b0Var;
        Log.m105918d("MicroMsg.TextStatus.TextStatusFeatureService", "putPullDownListView() called with: context = " + context + ", listview = " + pullDownListView);
        if (context != null) {
            C53848a aVar = (C53848a) C39818r.f106831a.mo62443b(context).mo62449e(C53848a.class);
            if (aVar != null) {
                aVar.f151089f = new WeakReference<>(pullDownListView);
            }
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105928w("MicroMsg.TextStatus.TextStatusFeatureService", "putPullDownListView: context is null");
        }
    }

    /* renamed from: Ye */
    public Class<? extends UIComponent> mo74123Ye() {
        return C53848a.class;
    }

    /* renamed from: Yl */
    public void mo74124Yl(NoMeasuredTextView noMeasuredTextView, String str, C63347a.C47892c cVar) {
        C87412m.m108594g(cVar, "iconScene");
        if (noMeasuredTextView != null) {
            if (!(str == null || C112551y.m153811k(str)) && vx0(cVar, str)) {
                new C46927m.C46935h(str, noMeasuredTextView, cVar);
            }
        }
    }

    /* renamed from: ZW */
    public void mo74125ZW(Context context) {
        C87412m.m108594g(context, "context");
        TextStatusLikeListActivity.C43209a aVar = TextStatusLikeListActivity.f116931f;
        Intent intent = new Intent(context, TextStatusLikeListActivity.class);
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
        intent.putExtra("reportEnterScene", 8);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(intent);
        C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListActivity$Companion", "startForSelfAllHistory", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/textstatus/ui/TextStatusLikeListActivity$Companion", "startForSelfAllHistory", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: ej */
    public C77453j mo74126ej(Context context, RelativeLayout relativeLayout, LinearLayout linearLayout) {
        C87412m.m108594g(context, "context");
        return new C79239k(context, relativeLayout, linearLayout, 0);
    }

    /* renamed from: if */
    public String mo74127if(String str) {
        String str2 = null;
        C48201c n0 = str == null || C112551y.m153811k(str) ? null : C39674e.f106452d.mo62253n0(str);
        if (n0 != null) {
            str2 = n0.field_StatusID;
        }
        return str2 == null ? "" : str2;
    }

    /* renamed from: nC */
    public void mo74128nC(TextView textView, String str, C63347a.C47892c cVar) {
        C87412m.m108594g(cVar, "iconScene");
        if (textView != null) {
            if (!(str == null || C112551y.m153811k(str)) && vx0(cVar, str)) {
                new C46927m.C46936i(str, textView, cVar);
            }
        }
    }

    /* renamed from: nj */
    public void mo74129nj(Context context) {
        if (context != null) {
            TextStatusLikeListActivity.f116931f.mo67454a(context, -1);
        }
    }

    /* renamed from: ns */
    public void mo74130ns(TextView textView, String str, C63347a.C47892c cVar, C63347a.C47893d dVar) {
        C87412m.m108594g(cVar, "iconScene");
        C87412m.m108594g(dVar, "iconType");
        if (textView != null) {
            if (!(str == null || C112551y.m153811k(str)) && vx0(cVar, str)) {
                new C46927m.C46934g(str, textView, dVar, cVar);
            }
        }
    }

    /* renamed from: o6 */
    public String mo74131o6(String str) {
        C48201c n0 = C39674e.f106452d.mo62253n0(str);
        String str2 = n0 != null ? n0.field_IconID : null;
        return str2 == null ? "" : str2;
    }

    /* renamed from: ov */
    public void mo74132ov(ImageView imageView, String str, C63347a.C47893d dVar, C63347a.C47891b bVar) {
        if (dVar != null && bVar != null) {
            C39691c.m42340S(IStatusIconHelperKt.m39109a(), imageView, str, dVar, bVar, (C48201c) null, false, false, 112, (Object) null);
        }
    }

    public String qb0() {
        String d = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107406d(new C112624c());
        C87412m.m108593f(d, "service(IConfigService::…usShowLuckyMoneyIconId())");
        return d;
    }

    public String r70() {
        String d = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107406d(new C112622a());
        C87412m.m108593f(d, "service(IConfigService::…ublishLuckyMoneyIconId())");
        return d;
    }

    public boolean s50() {
        return IStatusIconHelperKt.m39109a().mo62275E();
    }

    public void sj0() {
        C53666d0 d0Var;
        WeakReference<C53666d0> weakReference = this.f150383d;
        if (weakReference != null && (d0Var = weakReference.get()) != null) {
            d0Var.dismiss();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:9|10|11|12|(4:14|(1:16)|17|(3:23|(1:25)(1:26)|(2:30|(1:32))))|33|34|35) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00b4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject vd0(org.json.JSONObject r14) {
        /*
            r13 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r14 == 0) goto L_0x000e
            java.lang.String r1 = "arrStrangerContact"
            org.json.JSONArray r14 = r14.optJSONArray(r1)     // Catch:{ all -> 0x00c0 }
            goto L_0x000f
        L_0x000e:
            r14 = 0
        L_0x000f:
            if (r14 == 0) goto L_0x00c0
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ all -> 0x00c0 }
            r1.<init>()     // Catch:{ all -> 0x00c0 }
            java.lang.String r2 = su0.C13781a.m13082a()     // Catch:{ all -> 0x00c0 }
            int r3 = r14.length()     // Catch:{ all -> 0x00c0 }
            r4 = 0
            r5 = 0
        L_0x0020:
            if (r5 >= r3) goto L_0x00bb
            java.lang.String r6 = r14.optString(r5)     // Catch:{ all -> 0x00c0 }
            java.lang.Class<m02.b> r7 = m02.C46940b.class
            di3.d r7 = di3.C86312j.m106911c(r7)     // Catch:{ all -> 0x00c0 }
            m02.b r7 = (m02.C46940b) r7     // Catch:{ all -> 0x00c0 }
            r8 = 1
            java.lang.String r7 = r7.mo72127jk(r6, r8)     // Catch:{ all -> 0x00c0 }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ all -> 0x00c0 }
            r9.<init>()     // Catch:{ all -> 0x00c0 }
            java.lang.String r10 = "hashName"
            r9.put(r10, r6)     // Catch:{ all -> 0x00b4 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x00b4 }
            r6.<init>()     // Catch:{ all -> 0x00b4 }
            if (r7 == 0) goto L_0x00af
            java.lang.Class<d62.i> r10 = d62.C75339i.class
            di3.d r10 = di3.C86312j.m106911c(r10)     // Catch:{ all -> 0x00b4 }
            d62.i r10 = (d62.C75339i) r10     // Catch:{ all -> 0x00b4 }
            java.lang.String r10 = r10.getDisplayName(r7)     // Catch:{ all -> 0x00b4 }
            boolean r11 = gy3.C87412m.m108589b(r10, r7)     // Catch:{ all -> 0x00b4 }
            if (r11 == 0) goto L_0x0058
            java.lang.String r10 = ""
        L_0x0058:
            java.lang.String r11 = "name"
            r6.put(r11, r10)     // Catch:{ all -> 0x00b4 }
            java.lang.Class<f62.k0> r10 = f62.C75700k0.class
            k40.a r10 = f40.C86709a0.m107533q(r10)     // Catch:{ all -> 0x00b4 }
            f62.k0 r10 = (f62.C75700k0) r10     // Catch:{ all -> 0x00b4 }
            com.tencent.mm.storage.u3 r10 = r10.mo96097Ni()     // Catch:{ all -> 0x00b4 }
            com.tencent.mm.storage.z1 r10 = r10.get(r7)     // Catch:{ all -> 0x00b4 }
            boolean r11 = r10.mo62927s3()     // Catch:{ all -> 0x00b4 }
            if (r11 == 0) goto L_0x00af
            boolean r11 = r10.mo62920o3()     // Catch:{ all -> 0x00b4 }
            if (r11 != 0) goto L_0x00af
            boolean r10 = r10.mo62846A3()     // Catch:{ all -> 0x00b4 }
            if (r10 != 0) goto L_0x00af
            jr2.t r10 = jr2.C99019x.m128974f()     // Catch:{ all -> 0x00b4 }
            if (r10 == 0) goto L_0x0092
            jr2.t r10 = jr2.C99019x.m128974f()     // Catch:{ all -> 0x00b4 }
            r11 = 5
            os2.m0 r10 = (os2.C11766m0) r10     // Catch:{ all -> 0x00b4 }
            boolean r10 = r10.mo11654bD(r7, r11)     // Catch:{ all -> 0x00b4 }
            goto L_0x0093
        L_0x0092:
            r10 = 0
        L_0x0093:
            if (r10 != 0) goto L_0x00af
            az2.e r10 = az2.C39674e.f106452d     // Catch:{ all -> 0x00b4 }
            rz2.c r10 = r10.mo62253n0(r7)     // Catch:{ all -> 0x00b4 }
            if (r10 == 0) goto L_0x00af
            java.lang.String r11 = "statusId"
            java.lang.String r10 = r10.field_StatusID     // Catch:{ all -> 0x00b4 }
            r6.put(r11, r10)     // Catch:{ all -> 0x00b4 }
            boolean r7 = gy3.C87412m.m108589b(r2, r7)     // Catch:{ all -> 0x00b4 }
            if (r7 == 0) goto L_0x00af
            java.lang.String r7 = "isSelf"
            r6.put(r7, r8)     // Catch:{ all -> 0x00b4 }
        L_0x00af:
            java.lang.String r7 = "info"
            r9.put(r7, r6)     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r1.put(r9)     // Catch:{ all -> 0x00c0 }
            int r5 = r5 + 1
            goto L_0x0020
        L_0x00bb:
            java.lang.String r14 = "arrFriendContact"
            r0.put(r14, r1)     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p758xy.C53469l.vd0(org.json.JSONObject):org.json.JSONObject");
    }

    public final boolean vx0(C63347a.C47892c cVar, String str) {
        boolean z = false;
        switch (cVar.ordinal()) {
            case 0:
                return C77448f0.m93394f();
            case 1:
                return C77448f0.m93394f();
            case 2:
                return C77448f0.m93394f();
            case 3:
                if (C77448f0.m93394f() && ((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_text_state_icon_timeline_feed_fu_and, C104160f.RepairerConfig_TextStatus_SnsFeedFuIcon_Int, 0) == 1) {
                    z = true;
                }
                if (!z) {
                    return C77448f0.m93394f();
                }
                C48201c n0 = C39674e.f106452d.mo62253n0(str);
                return C87412m.m108589b(n0 != null ? n0.field_IconID : null, "2021");
            case 4:
                return C77448f0.m93395g();
            case 5:
                return C77448f0.m93394f();
            case 6:
                SimpleDateFormat simpleDateFormat = C77448f0.f225876a;
                return false;
            case 7:
            case 8:
            case 9:
                break;
            case 10:
            case 11:
                SimpleDateFormat simpleDateFormat2 = C77448f0.f225876a;
                break;
            default:
                return false;
        }
        return true;
    }

    /* renamed from: we */
    public boolean mo74139we(Context context, JSONObject jSONObject) {
        Context context2 = context;
        JSONObject jSONObject2 = jSONObject;
        Class cls = C53477h.class;
        Class cls2 = C65873e.class;
        C87412m.m108594g(context2, "context");
        if (jSONObject2 == null) {
            return true;
        }
        String optString = jSONObject2.optString("hashUserName");
        String optString2 = jSONObject2.optString("encodeUserName");
        jSONObject2.optString("nickName");
        jSONObject2.optString("headImageURL");
        String optString3 = jSONObject2.optString("sessionId");
        String jk = ((C46940b) C86312j.m106911c(C46940b.class)).mo72127jk(optString, 1);
        boolean z = false;
        Log.m105925i("MicroMsg.TextStatus.TextStatusFeatureService", "openTextStateChatting hashUserName:%s changeUserName:%s", optString, jk);
        if (jk == null || C112551y.m153811k(jk)) {
            z = true;
        }
        if (!z) {
            C87412m.m108593f(jk, "changeUserName");
            ((C53477h) C86312j.m106911c(cls)).zx0(context2, jk);
            C78501d dVar = C78501d.f229945a;
            String ep02 = ((C65873e) C86312j.m106911c(cls2)).ep0(2);
            C87412m.m108593f(ep02, "getService(IFTSApiLogicS…atus.SessionScene.NOTIFY)");
            C78501d.m94808j(dVar, 6, (String) null, ep02, 10, (String) null, 0, 0, 0, 0, jk, (String) null, (String) null, (String) null, (String) null, 15858, (Object) null);
        } else {
            String ep03 = ((C65873e) C86312j.m106911c(cls2)).ep0(2);
            C87412m.m108593f(ep03, "getService(IFTSApiLogicS…atus.SessionScene.NOTIFY)");
            C52665g.f147056g = ep03;
            ((C53477h) C86312j.m106911c(cls)).yx0(optString3, optString2, context2);
            C78501d dVar2 = C78501d.f229945a;
            String str = C52665g.f147056g;
            if (str == null) {
                str = "";
            }
            C78501d.m94808j(dVar2, 1, "0", str, 7, (String) null, 2, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 16336, (Object) null);
        }
        return true;
    }

    /* renamed from: z6 */
    public C77451h mo74140z6(Context context, Runnable runnable, boolean z) {
        C87412m.m108594g(context, "context");
        return new C79217a(context, runnable, z);
    }
}

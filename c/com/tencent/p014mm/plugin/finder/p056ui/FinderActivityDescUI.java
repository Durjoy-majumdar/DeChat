package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.ScrollingMovementMethod;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import bl3.C54492n;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.jsapi.profile.C40475h;
import com.tencent.p014mm.plugin.finder.view.C4059g5;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.xweb.file.XVFSFile;
import de3.C75355a0;
import di3.C86312j;
import dp1.C7458x0;
import er1.C58684b;
import er1.C58784w3;
import er1.C7832m3;
import er1.C7919x;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import je1.C9328k1;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import kg3.C76577a;
import kotlin.Metadata;
import l60.C99342a;
import l60.C99344b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C88989a;
import nr3.C89059e;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONObject;
import p629ny.C76979h;
import pe3.C89349b;
import pf1.C11920q;
import pf1.C62262d0;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C11991t;
import pl1.C62345f;
import qo3.C77407n;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C49295ek0;
import te3.C52123yj0;
import te3.C52271zj0;
import up1.C27696y;
import z04.C112551y;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderActivityDescUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lob0/n;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderActivityDescUI */
public final class FinderActivityDescUI extends MMFinderUI implements C11385n {

    /* renamed from: p0 */
    public static final /* synthetic */ int f16726p0 = 0;

    /* renamed from: A */
    public long f16727A;

    /* renamed from: B */
    public String f16728B = "";

    /* renamed from: C */
    public String f16729C = "";

    /* renamed from: D */
    public String f16730D = "";

    /* renamed from: E */
    public int f16731E;

    /* renamed from: F */
    public String f16732F = "";

    /* renamed from: G */
    public C52271zj0 f16733G;

    /* renamed from: H */
    public TextView f16734H;

    /* renamed from: I */
    public WeImageView f16735I;

    /* renamed from: J */
    public ImageView f16736J;

    /* renamed from: K */
    public long f16737K;

    /* renamed from: L */
    public TextView f16738L;

    /* renamed from: M */
    public TextView f16739M;

    /* renamed from: N */
    public ImageView f16740N;

    /* renamed from: P */
    public TextView f16741P;

    /* renamed from: Q */
    public ViewGroup f16742Q;

    /* renamed from: R */
    public ImageView f16743R;

    /* renamed from: S */
    public LinearLayout f16744S;

    /* renamed from: T */
    public C49295ek0 f16745T;

    /* renamed from: U */
    public View f16746U;

    /* renamed from: V */
    public LinearLayout f16747V;

    /* renamed from: W */
    public ImageView f16748W;

    /* renamed from: X */
    public View f16749X;

    /* renamed from: Y */
    public TextView f16750Y;

    /* renamed from: Z */
    public String f16751Z = "";

    /* renamed from: o */
    public View f16752o;

    /* renamed from: p */
    public TextView f16753p;

    /* renamed from: q */
    public ImageView f16754q;

    /* renamed from: r */
    public LinearLayout f16755r;

    /* renamed from: s */
    public C104428a f16756s;

    /* renamed from: t */
    public TextView f16757t;

    /* renamed from: u */
    public TextView f16758u;

    /* renamed from: v */
    public TextView f16759v;

    /* renamed from: w */
    public TextView f16760w;

    /* renamed from: x */
    public WeImageView f16761x;

    /* renamed from: y */
    public final int f16762y = 100;

    /* renamed from: z */
    public int f16763z;

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderActivityDescUI$a */
    public static final class C3632a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ FinderActivityDescUI f16764a;

        public C3632a(FinderActivityDescUI finderActivityDescUI) {
            this.f16764a = finderActivityDescUI;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c7, code lost:
            if (r7 == null) goto L_0x00c9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            r1 = r1.f141556e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object call(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                ob0.b$c r1 = (ob0.C89132b.C89134c) r1
                int r2 = r1.f256793a
                r3 = 0
                r4 = 0
                java.lang.String r5 = "Finder.FinderActivityDescUI"
                if (r2 != 0) goto L_0x0053
                int r2 = r1.f256794b
                if (r2 != 0) goto L_0x0053
                com.tencent.mm.plugin.finder.ui.FinderActivityDescUI r2 = r0.f16764a
                T r1 = r1.f256796d
                te3.sj1 r1 = (te3.C51253sj1) r1
                if (r1 == 0) goto L_0x0025
                java.util.LinkedList<te3.zj0> r1 = r1.f141556e
                if (r1 == 0) goto L_0x0025
                java.lang.Object r1 = sx3.C110818d0.m150916N(r1)
                te3.zj0 r1 = (te3.C52271zj0) r1
                goto L_0x0026
            L_0x0025:
                r1 = r4
            L_0x0026:
                r2.f16733G = r1
                com.tencent.mm.plugin.finder.ui.FinderActivityDescUI r1 = r0.f16764a
                te3.zj0 r2 = r1.f16733G
                if (r2 == 0) goto L_0x0031
                int r6 = r2.f146012n
                goto L_0x0032
            L_0x0031:
                r6 = 0
            L_0x0032:
                r1.f16763z = r6
                r6 = 0
                if (r2 == 0) goto L_0x003b
                long r8 = r2.f146022x
                goto L_0x003c
            L_0x003b:
                r8 = r6
            L_0x003c:
                r1.f16737K = r8
                if (r2 == 0) goto L_0x0043
                te3.ek0 r8 = r2.f146023y
                goto L_0x0044
            L_0x0043:
                r8 = r4
            L_0x0044:
                r1.f16745T = r8
                long r8 = r1.f16727A
                int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r10 != 0) goto L_0x007f
                if (r2 == 0) goto L_0x0050
                long r6 = r2.f146018t
            L_0x0050:
                r1.f16727A = r6
                goto L_0x007f
            L_0x0053:
                int r2 = com.tencent.p014mm.plugin.finder.p056ui.FinderActivityDescUI.f16726p0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r6 = "errorType = "
                r2.append(r6)
                int r6 = r1.f256793a
                r2.append(r6)
                java.lang.String r6 = " errorCode = "
                r2.append(r6)
                int r6 = r1.f256794b
                r2.append(r6)
                java.lang.String r6 = "  errorMsg = "
                r2.append(r6)
                java.lang.String r1 = r1.f256795c
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            L_0x007f:
                com.tencent.mm.plugin.finder.ui.FinderActivityDescUI r1 = r0.f16764a
                android.widget.TextView r2 = r1.f16757t
                java.lang.String r6 = "activityDescEndTime"
                if (r2 == 0) goto L_0x0228
                er1.w3 r7 = er1.C58784w3.f168295a
                long r8 = r1.f16727A
                r10 = 1000(0x3e8, double:4.94E-321)
                long r8 = r8 * r10
                androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
                java.lang.String r10 = "context"
                gy3.C87412m.m108593f(r1, r10)
                r10 = 2131826236(0x7f11163c, float:1.928535E38)
                java.lang.String r1 = r7.mo83865E(r8, r1, r10)
                r2.setText(r1)
                com.tencent.mm.plugin.finder.ui.FinderActivityDescUI r1 = r0.f16764a
                int r2 = r1.f16763z
                r7 = 2
                java.lang.String r2 = er1.C7878t0.m8034c(r7, r2)
                te3.zj0 r7 = r1.f16733G
                r8 = 1
                if (r7 == 0) goto L_0x00c9
                te3.ek0 r7 = r7.f146023y
                if (r7 == 0) goto L_0x00c9
                java.lang.String r7 = r7.f132971f
                if (r7 == 0) goto L_0x00c9
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r2)
                r9.append(r7)
                java.lang.String r7 = r9.toString()
                if (r7 != 0) goto L_0x00dd
            L_0x00c9:
                androidx.appcompat.app.AppCompatActivity r7 = r1.getContext()
                r9 = 2131826080(0x7f1115a0, float:1.9285034E38)
                java.lang.Object[] r10 = new java.lang.Object[r8]
                r10[r3] = r2
                java.lang.String r7 = r7.getString(r9, r10)
                java.lang.String r2 = "context.getString(R.stri…ity_item_desc, countText)"
                gy3.C87412m.m108593f(r7, r2)
            L_0x00dd:
                android.widget.TextView r1 = r1.f16758u
                java.lang.String r2 = "activityDescParticipateCount"
                if (r1 == 0) goto L_0x0223
                r1.setText(r7)
                com.tencent.mm.plugin.finder.ui.FinderActivityDescUI r1 = r0.f16764a
                long r9 = r1.f16727A
                r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
                int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r7 == 0) goto L_0x010c
                long r9 = r1.f16737K
                r11 = 2
                long r9 = r9 & r11
                int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r7 == 0) goto L_0x00fd
                goto L_0x00fe
            L_0x00fd:
                r8 = 0
            L_0x00fe:
                if (r8 == 0) goto L_0x010c
                android.widget.TextView r1 = r1.f16757t
                if (r1 == 0) goto L_0x0108
                r1.setVisibility(r3)
                goto L_0x010c
            L_0x0108:
                gy3.C87412m.m108603p(r6)
                throw r4
            L_0x010c:
                com.tencent.mm.plugin.finder.ui.FinderActivityDescUI r1 = r0.f16764a
                android.widget.TextView r1 = r1.f16758u
                if (r1 == 0) goto L_0x021e
                r1.setVisibility(r3)
                com.tencent.mm.plugin.finder.ui.FinderActivityDescUI r1 = r0.f16764a
                te3.zj0 r2 = r1.f16733G
                java.lang.Class<pl1.s0> r6 = pl1.C11990s0.class
                java.lang.Class<ht1.t1> r7 = ht1.C60200t1.class
                if (r2 == 0) goto L_0x020f
                com.tencent.mm.protocal.protobuf.FinderJumpInfo r8 = r2.f146020v
                java.lang.String r9 = "adMiniAppIcon"
                java.lang.String r10 = "adTextView"
                java.lang.String r11 = "adActivityIcon"
                java.lang.String r12 = "adContainer"
                r13 = 8
                if (r8 == 0) goto L_0x01b9
                java.lang.String r14 = "showJumpView by jumpInfo"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r14)
                java.lang.String r14 = r8.wording
                boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
                if (r14 != 0) goto L_0x01aa
                android.widget.LinearLayout r14 = r1.f16755r
                if (r14 == 0) goto L_0x01a5
                r14.setVisibility(r3)
                android.widget.TextView r14 = r1.f16734H
                if (r14 == 0) goto L_0x01a0
                java.lang.String r15 = r8.wording
                r14.setText(r15)
                com.tencent.mm.ui.widget.imageview.WeImageView r14 = r1.f16735I
                if (r14 == 0) goto L_0x019b
                r14.setVisibility(r13)
                android.widget.ImageView r14 = r1.f16736J
                if (r14 == 0) goto L_0x0196
                r14.setVisibility(r3)
                bl3.r r14 = bl3.C39818r.f106831a
                bl3.r$a r15 = r14.mo62446e(r7)
                bl3.c r15 = r15.mo62447c(r6)
                pl1.s0 r15 = (pl1.C11990s0) r15
                k60.d r15 = r15.mo11871f2()
                pl1.n0 r3 = new pl1.n0
                java.lang.String r13 = r8.icon_url
                up1.y r4 = up1.C27696y.THUMB_IMAGE
                r3.<init>(r13, r4)
                pl1.e0$a r4 = pl1.C11978e0.C11979a.LINK_THUMB
                bl3.r$a r7 = r14.mo62446e(r7)
                bl3.c r6 = r7.mo62447c(r6)
                pl1.s0 r6 = (pl1.C11990s0) r6
                n60.f r4 = r6.mo11867O2(r4)
                l60.b r3 = r15.mo85956b(r3, r4)
                android.widget.ImageView r4 = r1.f16736J
                if (r4 == 0) goto L_0x0191
                l60.a r3 = (l60.C99342a) r3
                r3.mo85954d(r4)
                r3 = 0
                goto L_0x01ba
            L_0x0191:
                gy3.C87412m.m108603p(r11)
                r3 = 0
                throw r3
            L_0x0196:
                r3 = r4
                gy3.C87412m.m108603p(r11)
                throw r3
            L_0x019b:
                r3 = r4
                gy3.C87412m.m108603p(r9)
                throw r3
            L_0x01a0:
                r3 = r4
                gy3.C87412m.m108603p(r10)
                throw r3
            L_0x01a5:
                r3 = r4
                gy3.C87412m.m108603p(r12)
                throw r3
            L_0x01aa:
                r3 = r4
                android.widget.LinearLayout r4 = r1.f16755r
                if (r4 == 0) goto L_0x01b5
                r6 = 8
                r4.setVisibility(r6)
                goto L_0x01ba
            L_0x01b5:
                gy3.C87412m.m108603p(r12)
                throw r3
            L_0x01b9:
                r8 = 0
            L_0x01ba:
                if (r8 != 0) goto L_0x020f
                java.lang.String r3 = "showJumpView by MiniProgram"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
                java.lang.String r3 = r2.f146014p
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 != 0) goto L_0x0200
                android.widget.LinearLayout r3 = r1.f16755r
                if (r3 == 0) goto L_0x01fb
                r4 = 0
                r3.setVisibility(r4)
                android.widget.TextView r3 = r1.f16734H
                if (r3 == 0) goto L_0x01f6
                java.lang.String r2 = r2.f146016r
                r3.setText(r2)
                com.tencent.mm.ui.widget.imageview.WeImageView r2 = r1.f16735I
                if (r2 == 0) goto L_0x01f1
                r2.setVisibility(r4)
                android.widget.ImageView r1 = r1.f16736J
                if (r1 == 0) goto L_0x01ec
                r2 = 8
                r1.setVisibility(r2)
                goto L_0x020f
            L_0x01ec:
                gy3.C87412m.m108603p(r11)
                r3 = 0
                throw r3
            L_0x01f1:
                r3 = 0
                gy3.C87412m.m108603p(r9)
                throw r3
            L_0x01f6:
                r3 = 0
                gy3.C87412m.m108603p(r10)
                throw r3
            L_0x01fb:
                r3 = 0
                gy3.C87412m.m108603p(r12)
                throw r3
            L_0x0200:
                r3 = 0
                android.widget.LinearLayout r1 = r1.f16755r
                if (r1 == 0) goto L_0x020b
                r2 = 8
                r1.setVisibility(r2)
                goto L_0x020f
            L_0x020b:
                gy3.C87412m.m108603p(r12)
                throw r3
            L_0x020f:
                int r1 = com.tencent.p014mm.plugin.finder.p056ui.FinderActivityDescUI.f16726p0
                java.lang.String r1 = "CgiFinderSearchEvent refresh"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                com.tencent.mm.plugin.finder.ui.FinderActivityDescUI r1 = r0.f16764a
                r1.mo4006R7()
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            L_0x021e:
                r3 = r4
                gy3.C87412m.m108603p(r2)
                throw r3
            L_0x0223:
                r3 = r4
                gy3.C87412m.m108603p(r2)
                throw r3
            L_0x0228:
                r3 = r4
                gy3.C87412m.m108603p(r6)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderActivityDescUI.C3632a.call(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderActivityDescUI$b */
    public static final class C3633b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderActivityDescUI f16765d;

        public C3633b(FinderActivityDescUI finderActivityDescUI) {
            this.f16765d = finderActivityDescUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!this.f16765d.isFinishing()) {
                this.f16765d.finish();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderActivityDescUI$c */
    public static final class C3634c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderActivityDescUI f16766d;

        public C3634c(FinderActivityDescUI finderActivityDescUI) {
            this.f16766d = finderActivityDescUI;
        }

        public final void onClick(View view) {
            String str;
            LinkedList<FinderJumpInfo> linkedList;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderActivityDescUI finderActivityDescUI = this.f16766d;
            if (finderActivityDescUI.f16727A != 0) {
                finderActivityDescUI.getIntent().putExtra("key_activity_end_time", this.f16766d.f16727A);
            }
            FinderActivityDescUI finderActivityDescUI2 = this.f16766d;
            C52271zj0 zj02 = finderActivityDescUI2.f16733G;
            if (!(zj02 == null || (linkedList = zj02.f145997C) == null)) {
                ArrayList arrayList2 = new ArrayList();
                for (FinderJumpInfo finderJumpInfo : linkedList) {
                    if (finderJumpInfo != null) {
                        arrayList2.add(finderJumpInfo.toByteArray());
                    }
                }
                finderActivityDescUI2.getIntent().putExtra("key_activity_jump_info_list", arrayList2);
            }
            FinderActivityDescUI finderActivityDescUI3 = this.f16766d;
            C52271zj0 zj03 = finderActivityDescUI3.f16733G;
            if (!(zj03 == null || (str = zj03.f145998D) == null)) {
                finderActivityDescUI3.getIntent().putExtra("key_activity_post_wording", str);
            }
            C7458x0.f25666a.mo8608a(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, C66785b.f191882e.mo90662O5(), new JSONObject().put("vst_id", this.f16766d.f16751Z));
            FinderActivityDescUI finderActivityDescUI4 = this.f16766d;
            finderActivityDescUI4.setResult(-1, finderActivityDescUI4.getIntent());
            this.f16766d.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderActivityDescUI$d */
    public static final class C3635d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderActivityDescUI f16767d;

        public C3635d(FinderActivityDescUI finderActivityDescUI) {
            this.f16767d = finderActivityDescUI;
        }

        public final void onClick(View view) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderActivityDescUI finderActivityDescUI = this.f16767d;
            C52271zj0 zj02 = finderActivityDescUI.f16733G;
            finderActivityDescUI.getClass();
            if (zj02 != null) {
                FinderJumpInfo finderJumpInfo = zj02.f146020v;
                if (finderJumpInfo != null) {
                    finderActivityDescUI.mo4005Q7(zj02, finderJumpInfo);
                } else {
                    finderJumpInfo = null;
                }
                if (finderJumpInfo == null) {
                    StringBuilder sb = new StringBuilder();
                    FinderContact finderContact = zj02.f146006e;
                    if (finderContact == null || (str = finderContact.username) == null) {
                        str = "";
                    }
                    sb.append(str);
                    sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
                    sb.append(Util.getUuidRandom());
                    String sb4 = sb.toString();
                    C58684b bVar = (C58684b) C86312j.m106911c(C58684b.class);
                    AppCompatActivity context = finderActivityDescUI.getContext();
                    C87412m.m108593f(context, "context");
                    String str2 = zj02.f146014p;
                    String str3 = str2 == null ? "" : str2;
                    String str4 = zj02.f146015q;
                    bVar.mo13270U5(context, str3, str4 == null ? "" : str4, C40475h.CTRL_INDEX, sb4);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderActivityDescUI$e */
    public static final class C3636e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderActivityDescUI f16768d;

        /* renamed from: com.tencent.mm.plugin.finder.ui.FinderActivityDescUI$e$a */
        public static final class C3637a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ FinderActivityDescUI f16769d;

            public C3637a(FinderActivityDescUI finderActivityDescUI) {
                this.f16769d = finderActivityDescUI;
            }

            public final void onCreateMMMenu(C76874e0 e0Var) {
                if (e0Var.mo107176v()) {
                    FinderActivityDescUI finderActivityDescUI = this.f16769d;
                    e0Var.mo107140d(finderActivityDescUI.f16762y, finderActivityDescUI.getContext().getResources().getColor(C0966R.color.Red_100), FinderActivityDescUI.m3815N7(this.f16769d));
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.ui.FinderActivityDescUI$e$b */
        public static final class C3638b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ FinderActivityDescUI f16770d;

            public C3638b(FinderActivityDescUI finderActivityDescUI) {
                this.f16770d = finderActivityDescUI;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int itemId = menuItem.getItemId();
                FinderActivityDescUI finderActivityDescUI = this.f16770d;
                if (itemId == finderActivityDescUI.f16762y) {
                    Intent intent = finderActivityDescUI.getIntent();
                    C87412m.m108594g(intent, "intent");
                    intent.removeExtra("key_user_name");
                    intent.removeExtra("key_nick_name");
                    intent.removeExtra("key_cover_url");
                    intent.removeExtra("key_avatar_url");
                    intent.removeExtra("key_topic_id");
                    intent.removeExtra("key_activity_name");
                    intent.removeExtra("key_activity_desc");
                    intent.removeExtra("key_activity_end_time");
                    this.f16770d.getIntent().putExtra("key_activity_type", 100);
                    this.f16770d.getIntent().putExtra("key_activity_already_participate", false);
                    this.f16770d.getIntent().putExtra("key_activity_jump_info_list", new ArrayList());
                    this.f16770d.getIntent().putExtra("key_activity_post_wording", "");
                    FinderActivityDescUI finderActivityDescUI2 = this.f16770d;
                    finderActivityDescUI2.setResult(-1, finderActivityDescUI2.getIntent());
                    this.f16770d.finish();
                }
            }
        }

        public C3636e(FinderActivityDescUI finderActivityDescUI) {
            this.f16768d = finderActivityDescUI;
        }

        public final void onClick(View view) {
            String str;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C77407n nVar = new C77407n((Context) this.f16768d, 1, true);
            FinderActivityDescUI finderActivityDescUI = this.f16768d;
            C49295ek0 ek02 = finderActivityDescUI.f16745T;
            if (ek02 == null || (str = ek02.f132979q) == null) {
                str = finderActivityDescUI.getResources().getString(C0966R.string.f360459cz2);
            }
            C87412m.m108593f(str, "eventWordingInfo?.exitHi…y_participate_hint_title)");
            nVar.mo107568m(str, 17, 0);
            FinderActivityDescUI finderActivityDescUI2 = this.f16768d;
            nVar.f225771i = new C3637a(finderActivityDescUI2);
            nVar.f225782p = new C3638b(finderActivityDescUI2);
            nVar.mo107573q();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderActivityDescUI$f */
    public static final class C3639f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f16771d;

        /* renamed from: e */
        public final /* synthetic */ FinderActivityDescUI f16772e;

        /* renamed from: f */
        public final /* synthetic */ boolean f16773f;

        public C3639f(View view, FinderActivityDescUI finderActivityDescUI, boolean z) {
            this.f16771d = view;
            this.f16772e = finderActivityDescUI;
            this.f16773f = z;
        }

        public final void run() {
            String str;
            int height = this.f16771d.getHeight();
            View view = this.f16772e.f16752o;
            if (view != null) {
                int height2 = view.getHeight();
                if (this.f16773f) {
                    int b = C76577a.m92151b(this.f16772e.getContext(), 170);
                    if (height - height2 > b) {
                        View view2 = this.f16772e.f16752o;
                        if (view2 != null) {
                            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                            layoutParams.height = height - b;
                            View view3 = this.f16772e.f16752o;
                            if (view3 != null) {
                                view3.setLayoutParams(layoutParams);
                            } else {
                                C87412m.m108603p("descContainer");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("descContainer");
                            throw null;
                        }
                    }
                    FinderActivityDescUI finderActivityDescUI = this.f16772e;
                    TextView textView = finderActivityDescUI.f16759v;
                    if (textView != null) {
                        C49295ek0 ek02 = finderActivityDescUI.f16745T;
                        if (ek02 != null) {
                            str = ek02.f132972g;
                            if (str == null) {
                                str = "";
                            }
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = finderActivityDescUI.getResources().getString(C0966R.string.f360460cz3);
                            C87412m.m108593f(str, "resources.getString(R.st…ctivity_participate_text)");
                        }
                        textView.setText(str);
                        TextView textView2 = this.f16772e.f16759v;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                        } else {
                            C87412m.m108603p("participateBtn");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("participateBtn");
                        throw null;
                    }
                } else {
                    int b2 = C76577a.m92151b(this.f16772e.getContext(), 170);
                    if (height - height2 > b2) {
                        View view4 = this.f16772e.f16752o;
                        if (view4 != null) {
                            ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                            layoutParams2.height = height - b2;
                            View view5 = this.f16772e.f16752o;
                            if (view5 != null) {
                                view5.setLayoutParams(layoutParams2);
                            } else {
                                C87412m.m108603p("descContainer");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("descContainer");
                            throw null;
                        }
                    }
                    FinderActivityDescUI finderActivityDescUI2 = this.f16772e;
                    TextView textView3 = finderActivityDescUI2.f16760w;
                    if (textView3 != null) {
                        textView3.setText(FinderActivityDescUI.m3815N7(finderActivityDescUI2));
                        TextView textView4 = this.f16772e.f16760w;
                        if (textView4 != null) {
                            textView4.setVisibility(0);
                        } else {
                            C87412m.m108603p("cancelBtn");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("cancelBtn");
                        throw null;
                    }
                }
            } else {
                C87412m.m108603p("descContainer");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderActivityDescUI$g */
    public static final class C3640g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderActivityDescUI f16774d;

        /* renamed from: e */
        public final /* synthetic */ FinderContact f16775e;

        public C3640g(FinderActivityDescUI finderActivityDescUI, FinderContact finderContact) {
            this.f16774d = finderActivityDescUI;
            this.f16775e = finderContact;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$refreshView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderActivityDescUI finderActivityDescUI = this.f16774d;
            String str = this.f16775e.username;
            if (str == null) {
                str = "";
            }
            FinderActivityDescUI.m3816O7(finderActivityDescUI, str);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$refreshView$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderActivityDescUI$h */
    public static final class C3641h extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<String, C13598b0> f16776d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3641h(C32226l<? super String, C13598b0> lVar) {
            super(1);
            this.f16776d = lVar;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "detailSuffix");
            this.f16776d.invoke(str);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: N7 */
    public static final String m3815N7(FinderActivityDescUI finderActivityDescUI) {
        String str;
        C49295ek0 ek02 = finderActivityDescUI.f16745T;
        if (ek02 != null) {
            str = ek02.f132978p;
            if (str == null) {
                str = "";
            }
        } else {
            str = null;
        }
        if (str != null) {
            return str;
        }
        String string = finderActivityDescUI.getResources().getString(C0966R.string.cym);
        C87412m.m108593f(string, "resources.getString(R.st…inder_activity_exit_text)");
        return string;
    }

    /* renamed from: O7 */
    public static final void m3816O7(FinderActivityDescUI finderActivityDescUI, String str) {
        finderActivityDescUI.getClass();
        Intent intent = new Intent();
        intent.putExtra("finder_username", str);
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        AppCompatActivity context = finderActivityDescUI.getContext();
        C87412m.m108593f(context, "context");
        C13442s8.C13443a.m12791e(aVar, context, intent, 0, (String) null, 0, 1, false, 0, 192, (Object) null);
        AppCompatActivity context2 = finderActivityDescUI.getContext();
        C87412m.m108593f(context2, "context");
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context2, intent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x02a5  */
    /* renamed from: P7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m3817P7(com.tencent.p014mm.plugin.finder.p056ui.FinderActivityDescUI r31) {
        /*
            r0 = r31
            java.lang.Class<pl1.s0> r1 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            com.google.android.material.bottomsheet.a r3 = r0.f16756s
            if (r3 != 0) goto L_0x03c7
            androidx.appcompat.app.AppCompatActivity r3 = r31.getContext()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131494446(0x7f0c062e, float:1.86124E38)
            r5 = 0
            r6 = 0
            android.view.View r3 = r3.inflate(r4, r5, r6)
            com.google.android.material.bottomsheet.a r4 = new com.google.android.material.bottomsheet.a
            androidx.appcompat.app.AppCompatActivity r7 = r31.getContext()
            r8 = 2131886332(0x7f1200fc, float:1.940724E38)
            r4.<init>(r7, r8)
            r0.f16756s = r4
            r4.setContentView((android.view.View) r3)
            android.view.ViewParent r4 = r3.getParent()
            java.lang.String r7 = "null cannot be cast to non-null type android.view.View"
            gy3.C87412m.m108592e(r4, r7)
            android.view.View r4 = (android.view.View) r4
            com.google.android.material.bottomsheet.BottomSheetBehavior.m139527y(r4)
            com.google.android.material.bottomsheet.a r4 = r0.f16756s
            if (r4 == 0) goto L_0x004a
            android.view.Window r4 = r4.getWindow()
            if (r4 == 0) goto L_0x004a
            r7 = 1053609165(0x3ecccccd, float:0.4)
            r4.setDimAmount(r7)
        L_0x004a:
            com.google.android.material.bottomsheet.a r4 = r0.f16756s
            if (r4 == 0) goto L_0x0056
            com.tencent.mm.plugin.finder.ui.g r7 = new com.tencent.mm.plugin.finder.ui.g
            r7.<init>(r0)
            r4.setOnDismissListener(r7)
        L_0x0056:
            r4 = 2131302625(0x7f0918e1, float:1.8223341E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r7 = 1061997773(0x3f4ccccd, float:0.8)
            if (r4 == 0) goto L_0x0086
            android.text.TextPaint r8 = r4.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r8, r7)
            te3.zj0 r8 = r0.f16733G
            if (r8 == 0) goto L_0x0078
            te3.ek0 r8 = r8.f146023y
            if (r8 == 0) goto L_0x0078
            java.lang.String r8 = r8.f132973h
            if (r8 == 0) goto L_0x0078
            goto L_0x0083
        L_0x0078:
            android.content.res.Resources r8 = r4.getResources()
            r9 = 2131826093(0x7f1115ad, float:1.928506E38)
            java.lang.String r8 = r8.getString(r9)
        L_0x0083:
            r4.setText(r8)
        L_0x0086:
            r8 = 2131302620(0x7f0918dc, float:1.8223331E38)
            android.view.View r8 = r3.findViewById(r8)
            r9 = 2131296586(0x7f09014a, float:1.8211093E38)
            android.view.View r9 = r3.findViewById(r9)
            r15 = r9
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r9 = 2131302624(0x7f0918e0, float:1.822334E38)
            android.view.View r9 = r3.findViewById(r9)
            r14 = r9
            android.widget.TextView r14 = (android.widget.TextView) r14
            r9 = 2131302621(0x7f0918dd, float:1.8223333E38)
            android.view.View r9 = r3.findViewById(r9)
            r13 = r9
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            r9 = 2131302623(0x7f0918df, float:1.8223337E38)
            android.view.View r9 = r3.findViewById(r9)
            r12 = r9
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r9 = 2131302622(0x7f0918de, float:1.8223335E38)
            android.view.View r9 = r3.findViewById(r9)
            r11 = r9
            android.widget.TextView r11 = (android.widget.TextView) r11
            r9 = 2131302614(0x7f0918d6, float:1.822332E38)
            android.view.View r9 = r3.findViewById(r9)
            r10 = r9
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r9 = 2131302618(0x7f0918da, float:1.8223327E38)
            android.view.View r9 = r3.findViewById(r9)
            te3.zj0 r5 = r0.f16733G
            if (r5 == 0) goto L_0x02c1
            te3.yj0 r5 = r5.f145995A
            if (r5 == 0) goto L_0x02c1
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.f145323d
            if (r5 == 0) goto L_0x02c1
            if (r8 != 0) goto L_0x00ed
            r24 = r9
            r25 = r10
            r26 = r11
            r27 = r12
            r28 = r13
            r29 = r14
            r30 = r15
            goto L_0x014d
        L_0x00ed:
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
            r16 = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r7.mo10233c(r9)
            java.lang.Object[] r17 = r7.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI"
            java.lang.String r19 = "showBottomSheet"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r24 = r16
            r9 = r8
            r25 = r10
            r10 = r17
            r26 = r11
            r11 = r18
            r27 = r12
            r12 = r19
            r28 = r13
            r13 = r20
            r29 = r14
            r14 = r21
            r30 = r15
            r15 = r22
            r16 = r23
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r7 = r7.mo10231a(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r8.setVisibility(r7)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI"
            java.lang.String r11 = "showBottomSheet"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x014d:
            if (r4 != 0) goto L_0x0150
            goto L_0x0154
        L_0x0150:
            r7 = 4
            r4.setVisibility(r7)
        L_0x0154:
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r4.mo10233c(r7)
            java.lang.Object[] r17 = r4.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI"
            java.lang.String r19 = "showBottomSheet"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r24
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r4 = r4.mo10231a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r7 = r24
            r7.setVisibility(r4)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI"
            java.lang.String r18 = "showBottomSheet"
            java.lang.String r19 = "()V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r16 = r7
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.text.TextPaint r4 = r29.getPaint()
            r9 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r4, r9)
            java.lang.Class<ny.h> r4 = p629ny.C76979h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ny.h r4 = (p629ny.C76979h) r4
            androidx.appcompat.app.AppCompatActivity r9 = r31.getContext()
            java.lang.String r10 = r5.nickname
            android.text.SpannableString r4 = r4.mo107057T1(r9, r10)
            r9 = r29
            r9.setText(r4)
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r9 = r4.mo62446e(r2)
            bl3.c r9 = r9.mo62447c(r1)
            pl1.s0 r9 = (pl1.C11990s0) r9
            k60.d r9 = r9.mo11872i2()
            pl1.f r10 = new pl1.f
            java.lang.String r11 = r5.headUrl
            r12 = 2
            r13 = 0
            r10.<init>(r11, r13, r12, r13)
            java.lang.String r11 = "dialogNoteAvatar"
            r13 = r30
            gy3.C87412m.m108593f(r13, r11)
            pl1.e0$a r11 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r2 = r4.mo62446e(r2)
            bl3.c r1 = r2.mo62447c(r1)
            pl1.s0 r1 = (pl1.C11990s0) r1
            n60.f r1 = r1.mo11867O2(r11)
            r9.mo85957c(r10, r13, r1)
            com.tencent.mm.plugin.finder.ui.h r1 = new com.tencent.mm.plugin.finder.ui.h
            r1.<init>(r0, r5)
            r13.setOnClickListener(r1)
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r1 = r5.authInfo
            if (r1 == 0) goto L_0x01fe
            int r1 = r1.authIconType
            goto L_0x01ff
        L_0x01fe:
            r1 = 0
        L_0x01ff:
            if (r1 <= 0) goto L_0x02b7
            r9 = r28
            r9.setVisibility(r6)
            java.lang.Class<tf0.p1> r1 = tf0.C64916p1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            java.lang.String r2 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            r16 = r1
            tf0.p1 r16 = (tf0.C64916p1) r16
            java.lang.String r1 = "dialogNoteIcon"
            r9 = r27
            gy3.C87412m.m108593f(r9, r1)
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r1 = r5.authInfo
            r19 = 0
            r20 = 0
            r21 = 12
            r22 = 0
            r17 = r9
            r18 = r1
            tf0.C64916p1.C64917a.m76444k(r16, r17, r18, r19, r20, r21, r22)
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r1 = r5.authInfo
            java.lang.String r2 = "dialogNoteDesc"
            r4 = r26
            gy3.C87412m.m108593f(r4, r2)
            java.lang.String r2 = "dialogNoteGuarantee"
            r5 = r25
            gy3.C87412m.m108593f(r5, r2)
            if (r1 == 0) goto L_0x02ab
            int r2 = r1.authIconType
            java.lang.String r5 = "context.resources.getStr….finder_contact_auth, it)"
            r9 = 2131826337(0x7f1116a1, float:1.9285556E38)
            r10 = 1
            if (r2 == r10) goto L_0x027e
            if (r2 == r12) goto L_0x0265
            r1 = 100
            if (r2 == r1) goto L_0x0250
            goto L_0x0296
        L_0x0250:
            androidx.appcompat.app.AppCompatActivity r1 = r31.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131826807(0x7f111877, float:1.9286509E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "context.resources.getStr…ing.finder_has_real_name)"
            gy3.C87412m.m108593f(r1, r2)
            goto L_0x0298
        L_0x0265:
            java.lang.String r1 = r1.authProfession
            if (r1 == 0) goto L_0x0296
            androidx.appcompat.app.AppCompatActivity r2 = r31.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r6] = r1
            java.lang.String r1 = r2.getString(r9, r11)
            gy3.C87412m.m108593f(r1, r5)
            goto L_0x0298
        L_0x027e:
            java.lang.String r1 = r1.authProfession
            if (r1 == 0) goto L_0x0296
            androidx.appcompat.app.AppCompatActivity r2 = r31.getContext()
            android.content.res.Resources r2 = r2.getResources()
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r6] = r1
            java.lang.String r1 = r2.getString(r9, r11)
            gy3.C87412m.m108593f(r1, r5)
            goto L_0x0298
        L_0x0296:
            java.lang.String r1 = ""
        L_0x0298:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x02a5
            r4.setVisibility(r6)
            r4.setText(r1)
            goto L_0x02be
        L_0x02a5:
            r1 = 8
            r4.setVisibility(r1)
            goto L_0x02be
        L_0x02ab:
            r1 = 8
            r9.setVisibility(r1)
            r4.setVisibility(r1)
            r5.setVisibility(r1)
            goto L_0x02be
        L_0x02b7:
            r9 = r28
            r1 = 8
            r9.setVisibility(r1)
        L_0x02be:
            rx3.b0 r5 = rx3.C13598b0.f38549a
            goto L_0x02c4
        L_0x02c1:
            r7 = r9
            r13 = 0
            r5 = r13
        L_0x02c4:
            if (r5 != 0) goto L_0x030d
            if (r8 != 0) goto L_0x02c9
            goto L_0x030d
        L_0x02c9:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r2 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r4)
            java.lang.Object[] r10 = r1.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI"
            java.lang.String r12 = "showBottomSheet"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r8
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r1 = r1.mo10231a(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r8.setVisibility(r1)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI"
            java.lang.String r11 = "showBottomSheet"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x030d:
            r1 = 2131302619(0x7f0918db, float:1.822333E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x031d
            java.lang.String r2 = r0.f16730D
            r1.setText(r2)
        L_0x031d:
            if (r7 == 0) goto L_0x0327
            com.tencent.mm.plugin.finder.ui.i r1 = new com.tencent.mm.plugin.finder.ui.i
            r1.<init>(r0)
            r7.setOnClickListener(r1)
        L_0x0327:
            r1 = 2131296552(0x7f090128, float:1.8211024E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x03c7
            androidx.appcompat.app.AppCompatActivity r2 = r31.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131826049(0x7f111581, float:1.9284971E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = "context.resources.getStr…r_activity_announce_name)"
            gy3.C87412m.m108593f(r2, r3)
            androidx.appcompat.app.AppCompatActivity r3 = r31.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131826232(0x7f111638, float:1.9285343E38)
            r5 = 1
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r6] = r2
            java.lang.String r3 = r3.getString(r4, r7)
            java.lang.String r4 = "context.resources.getStr…n_announce, announceName)"
            gy3.C87412m.m108593f(r3, r4)
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r3)
            com.tencent.mm.plugin.finder.view.g5 r7 = new com.tencent.mm.plugin.finder.view.g5
            androidx.appcompat.app.AppCompatActivity r8 = r31.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131100949(0x7f060515, float:1.7814294E38)
            int r10 = r8.getColor(r9)
            androidx.appcompat.app.AppCompatActivity r8 = r31.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r11 = r8.getColor(r9)
            r12 = 0
            r13 = 0
            com.tencent.mm.plugin.finder.ui.j r14 = new com.tencent.mm.plugin.finder.ui.j
            r14.<init>(r0)
            r8 = r7
            r9 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            int r8 = r3.length()
            int r2 = r2.length()
            int r8 = r8 - r2
            int r2 = r3.length()
            r3 = 17
            r4.setSpan(r7, r8, r2, r3)
            de3.a0 r2 = new de3.a0
            androidx.appcompat.app.AppCompatActivity r3 = r31.getContext()
            r2.<init>(r3)
            r1.setOnTouchListener(r2)
            r1.setText(r4)
            te3.ek0 r2 = r0.f16745T
            if (r2 == 0) goto L_0x03bb
            boolean r2 = r2.f132974i
            if (r2 != 0) goto L_0x03bb
            r7 = 1
            goto L_0x03bc
        L_0x03bb:
            r7 = 0
        L_0x03bc:
            if (r7 != 0) goto L_0x03c2
            r1.setVisibility(r6)
            goto L_0x03c7
        L_0x03c2:
            r2 = 8
            r1.setVisibility(r2)
        L_0x03c7:
            com.google.android.material.bottomsheet.a r0 = r0.f16756s
            if (r0 == 0) goto L_0x03ce
            r0.show()
        L_0x03ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderActivityDescUI.m3817P7(com.tencent.mm.plugin.finder.ui.FinderActivityDescUI):void");
    }

    /* renamed from: Q7 */
    public final void mo4005Q7(C52271zj0 zj02, FinderJumpInfo finderJumpInfo) {
        String str;
        FinderContact finderContact;
        int i = finderJumpInfo.jumpinfo_type;
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            if (zj02 == null || (finderContact = zj02.f146006e) == null || (str = finderContact.username) == null) {
                str = "";
            }
            sb.append(str);
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb.append(Util.getUuidRandom());
            String sb4 = sb.toString();
            C11920q qVar = new C11920q(finderJumpInfo);
            qVar.f34836j = sb4;
            C62262d0 d0Var = C62262d0.f176978a;
            AppCompatActivity context = getContext();
            C87412m.m108593f(context, "context");
            C62262d0.m73170n(d0Var, context, qVar, C40475h.CTRL_INDEX, false, (C60905o) null, 0.0f, 56, (Object) null);
        } else if (i == 2) {
            C62262d0 d0Var2 = C62262d0.f176978a;
            AppCompatActivity context2 = getContext();
            C87412m.m108593f(context2, "context");
            d0Var2.mo87320k(context2, new C11920q(finderJumpInfo), (C60905o) null);
        }
    }

    /* renamed from: R7 */
    public final void mo4006R7() {
        C13598b0 b0Var;
        String str;
        String str2;
        C52123yj0 yj02;
        String str3;
        C52123yj0 yj03;
        FinderContact finderContact;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C52271zj0 zj02 = this.f16733G;
        int i = 0;
        if (zj02 == null || (yj03 = zj02.f145995A) == null || (finderContact = yj03.f145323d) == null) {
            b0Var = null;
        } else {
            Log.m105924i("Finder.FinderActivityDescUI", "descriptionContactInfo not null");
            LinearLayout linearLayout = this.f16747V;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            ImageView imageView = this.f16748W;
            if (imageView != null) {
                ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11872i2().mo85957c(new C62345f(finderContact.headUrl, (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
                imageView.setOnClickListener(new C3640g(this, finderContact));
            }
            TextView textView = this.f16750Y;
            if (textView != null) {
                textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(getContext(), finderContact.nickname));
            }
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Log.m105924i("Finder.FinderActivityDescUI", "descriptionContactInfo null");
            LinearLayout linearLayout2 = this.f16747V;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        }
        TextView textView2 = this.f16753p;
        if (textView2 != null) {
            String stringExtra = getIntent().getStringExtra("key_activity_desc");
            String str4 = "";
            if (stringExtra == null) {
                stringExtra = str4;
            }
            C49295ek0 ek02 = this.f16745T;
            if (!(ek02 == null || (str3 = ek02.f132970e) == null)) {
                str4 = str3;
            }
            boolean z = true;
            if (!Util.isNullOrNil(str4)) {
                str = str4 + stringExtra;
            } else {
                str = textView2.getResources().getString(C0966R.string.cz_, new Object[]{stringExtra});
                C87412m.m108593f(str, "{\n                resour…tivityDesc)\n            }");
            }
            if (C112551y.m153808h(str, "\n", false, 2, (Object) null)) {
                str = str.substring(0, str.length() - 1);
                C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            String b = C7832m3.f26372a.mo8936b(str);
            boolean z2 = !Util.isNullOrNil(this.f16732F);
            if (!Util.isNullOrNil(b)) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getContext().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int f = displayMetrics.widthPixels - C76577a.m92155f(getContext(), C0966R.dimen.f3755d6);
                TextPaint paint = textView2.getPaint();
                int color = z2 ? getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8) : getContext().getResources().getColor(C0966R.color.FG_0);
                StaticLayout staticLayout = r10;
                int i2 = f;
                StaticLayout staticLayout2 = new StaticLayout(b, 0, b.length(), paint, f, Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true);
                if (staticLayout.getLineCount() <= 2) {
                    C52271zj0 zj03 = this.f16733G;
                    if ((zj03 != null ? zj03.f146024z : null) == null) {
                        if (((zj03 == null || (yj02 = zj03.f145995A) == null) ? null : yj02.f145323d) == null) {
                            z = false;
                        }
                    }
                    if (z) {
                        if (staticLayout.getLineCount() == 2) {
                            i = staticLayout.getLineEnd(0);
                        }
                        mo4007S7(textView2, b + ' ', color, (int) (textView2.getPaint().measureText(b.subSequence(i, b.length()).toString()) + getContext().getResources().getDimension(C0966R.dimen.a66)), new C3784e(this));
                        return;
                    }
                    textView2.setText(b);
                    View view = this.f16746U;
                    if (view != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI", "setSuffixedDesc", "(Ljava/lang/String;ILandroid/widget/TextView;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI", "setSuffixedDesc", "(Ljava/lang/String;ILandroid/widget/TextView;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    C87412m.m108603p("descIconView");
                    throw null;
                }
                StaticLayout staticLayout3 = staticLayout;
                int lineEnd = staticLayout3.getLineEnd(1);
                int lineEnd2 = staticLayout3.getLineEnd(0);
                String string = textView2.getContext().getString(C0966R.string.d6q);
                C87412m.m108593f(string, "textView.context.getStri….finder_desc_suffix_text)");
                float f2 = (float) i2;
                StaticLayout staticLayout4 = new StaticLayout(b, lineEnd2, lineEnd, paint, (int) ((f2 - textView2.getPaint().measureText(string)) - ((float) ((int) getContext().getResources().getDimension(C0966R.dimen.a6j)))), Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true);
                if (staticLayout4.getLineCount() > 0) {
                    int lineEnd3 = staticLayout4.getLineEnd(0);
                    int i3 = lineEnd3 - 1;
                    if (b.charAt(i3) == 10) {
                        StringBuilder sb = new StringBuilder();
                        String substring = b.substring(0, i3);
                        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb.append(substring);
                        sb.append(string);
                        sb.append(' ');
                        str2 = sb.toString();
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        String substring2 = b.substring(0, lineEnd3);
                        C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb4.append(substring2);
                        sb4.append(string);
                        sb4.append(' ');
                        str2 = sb4.toString();
                    }
                    mo4007S7(textView2, str2, color, (int) (f2 - getContext().getResources().getDimension(C0966R.dimen.a6l)), new C3789f(this));
                    return;
                }
                return;
            }
            Log.m105924i(C54492n.TAG, "desc " + b + ", maxLineNum:" + 2);
            return;
        }
        C87412m.m108603p("activityDesc");
        throw null;
    }

    /* renamed from: S7 */
    public final void mo4007S7(TextView textView, String str, int i, int i2, C32226l<? super String, C13598b0> lVar) {
        SpannableString spannableString = new SpannableString(str);
        View view = this.f16746U;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI", "setSuffixedIcon", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI", "setSuffixedIcon", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((WeImageView) getContext().findViewById(C0966R.C0970id.f5509h3)).setIconColor(i);
            int dimension = (int) getContext().getResources().getDimension(C0966R.dimen.f3736cp);
            TextView textView2 = this.f16753p;
            if (textView2 != null) {
                Paint.FontMetricsInt fontMetricsInt = textView2.getPaint().getFontMetricsInt();
                int i3 = ((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) - (dimension / 2);
                Log.m105924i("Finder.FinderActivityDescUI", "gap :" + i3);
                View view2 = this.f16746U;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
                    if (layoutParams2 != null) {
                        layoutParams2.bottomMargin = i3;
                        layoutParams2.leftMargin = i2;
                        View view3 = this.f16746U;
                        if (view3 != null) {
                            view3.setLayoutParams(layoutParams2);
                        } else {
                            C87412m.m108603p("descIconView");
                            throw null;
                        }
                    }
                    spannableString.setSpan(new C4059g5(str, i, getContext().getResources().getColor(C0966R.color.ahf), false, false, new C3641h(lVar)), 0, str.length(), 17);
                    textView.setText(spannableString);
                    return;
                }
                C87412m.m108603p("descIconView");
                throw null;
            }
            C87412m.m108603p("activityDesc");
            throw null;
        }
        C87412m.m108603p("descIconView");
        throw null;
    }

    /* renamed from: T7 */
    public final void mo4008T7(int i) {
        TextView textView = this.f16741P;
        if (textView != null) {
            textView.setTextColor(i);
            WeImageView weImageView = this.f16761x;
            if (weImageView != null) {
                weImageView.setIconColor(i);
                TextView textView2 = this.f16738L;
                if (textView2 != null) {
                    textView2.setTextColor(i);
                    TextView textView3 = this.f16750Y;
                    if (textView3 != null) {
                        textView3.setTextColor(i);
                        return;
                    }
                    return;
                }
                C87412m.m108603p(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                throw null;
            }
            C87412m.m108603p("backBtn");
            throw null;
        }
        C87412m.m108603p("nickNameText");
        throw null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a8j;
    }

    public void onCreate(Bundle bundle) {
        Class<C60200t1> cls = C60200t1.class;
        Class cls2 = C11990s0.class;
        super.onCreate(bundle);
        View findViewById = getContext().findViewById(C0966R.C0970id.f5478g9);
        C87412m.m108593f(findViewById, "context.findViewById(R.id.activity_desc_container)");
        this.f16752o = findViewById;
        View findViewById2 = getContext().findViewById(C0966R.C0970id.d5r);
        C87412m.m108593f(findViewById2, "context.findViewById(R.id.finder_activity_desc)");
        this.f16753p = (TextView) findViewById2;
        View findViewById3 = getContext().findViewById(C0966R.C0970id.d6c);
        C87412m.m108593f(findViewById3, "context.findViewById(R.id.finder_activity_name)");
        this.f16739M = (TextView) findViewById3;
        View findViewById4 = getContext().findViewById(C0966R.C0970id.a1z);
        C87412m.m108593f(findViewById4, "context.findViewById(R.id.avatar_container)");
        this.f16744S = (LinearLayout) findViewById4;
        View findViewById5 = getContext().findViewById(C0966R.C0970id.f5512h6);
        C87412m.m108593f(findViewById5, "context.findViewById(R.i…vity_profile_header_name)");
        this.f16741P = (TextView) findViewById5;
        View findViewById6 = getContext().findViewById(C0966R.C0970id.f5497gr);
        C87412m.m108593f(findViewById6, "context.findViewById(R.i…ity_profile_ad_container)");
        this.f16755r = (LinearLayout) findViewById6;
        View findViewById7 = getContext().findViewById(C0966R.C0970id.f5479g_);
        C87412m.m108593f(findViewById7, "context.findViewById(R.id.activity_desc_end_time)");
        this.f16757t = (TextView) findViewById7;
        View findViewById8 = getContext().findViewById(C0966R.C0970id.f5490gk);
        C87412m.m108593f(findViewById8, "context.findViewById(R.i…tivity_participate_count)");
        this.f16758u = (TextView) findViewById8;
        View findViewById9 = getContext().findViewById(C0966R.C0970id.hrq);
        C87412m.m108593f(findViewById9, "context.findViewById(R.id.paticipateBtn)");
        this.f16759v = (TextView) findViewById9;
        View findViewById10 = getContext().findViewById(C0966R.C0970id.apv);
        C87412m.m108593f(findViewById10, "context.findViewById(R.id.cancelBtn)");
        this.f16760w = (TextView) findViewById10;
        View findViewById11 = getContext().findViewById(C0966R.C0970id.d6j);
        C87412m.m108593f(findViewById11, "context.findViewById(R.i…activity_post_cancel_btn)");
        this.f16761x = (WeImageView) findViewById11;
        View findViewById12 = getContext().findViewById(C0966R.C0970id.f5498gs);
        C87412m.m108593f(findViewById12, "context.findViewById(R.i…activity_profile_ad_text)");
        this.f16734H = (TextView) findViewById12;
        View findViewById13 = getContext().findViewById(C0966R.C0970id.f5526hf);
        C87412m.m108593f(findViewById13, "context.findViewById(R.i…ty_profile_mini_app_icon)");
        this.f16735I = (WeImageView) findViewById13;
        View findViewById14 = getContext().findViewById(C0966R.C0970id.f5496gq);
        C87412m.m108593f(findViewById14, "context.findViewById(R.i…ty_profile_activity_icon)");
        this.f16736J = (ImageView) findViewById14;
        View findViewById15 = getContext().findViewById(C0966R.C0970id.f5510h4);
        C87412m.m108593f(findViewById15, "context.findViewById(R.i…ader_desc_icon_container)");
        this.f16746U = findViewById15;
        this.f16747V = (LinearLayout) getContext().findViewById(C0966R.C0970id.f5513h7);
        this.f16748W = (ImageView) getContext().findViewById(C0966R.C0970id.f5514h8);
        this.f16750Y = (TextView) getContext().findViewById(C0966R.C0970id.f5516h_);
        this.f16749X = getContext().findViewById(C0966R.C0970id.f5515h9);
        View findViewById16 = getContext().findViewById(C0966R.C0970id.f5492gm);
        C87412m.m108593f(findViewById16, "context.findViewById(R.id.activity_post_cover)");
        this.f16740N = (ImageView) findViewById16;
        View findViewById17 = getContext().findViewById(C0966R.C0970id.f5501gv);
        C87412m.m108593f(findViewById17, "context.findViewById(R.i…_profile_cover_container)");
        this.f16742Q = (ViewGroup) findViewById17;
        View findViewById18 = getContext().findViewById(C0966R.C0970id.f5502gw);
        C87412m.m108593f(findViewById18, "context.findViewById(R.i…ivity_profile_cover_mask)");
        this.f16743R = (ImageView) findViewById18;
        View findViewById19 = getContext().findViewById(C0966R.C0970id.d6r);
        C87412m.m108593f(findViewById19, "context.findViewById(R.i…nder_activity_post_title)");
        TextView textView = (TextView) findViewById19;
        this.f16738L = textView;
        C7919x.m8091a(textView);
        TextView textView2 = this.f16739M;
        if (textView2 != null) {
            C7919x.m8091a(textView2);
            TextView textView3 = this.f16757t;
            if (textView3 != null) {
                textView3.setVisibility(8);
                TextView textView4 = this.f16758u;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                    LinearLayout linearLayout = this.f16755r;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(8);
                        this.f16731E = getResources().getColor(C0966R.color.ahf);
                        getController().mo177105z0(this.f16731E);
                        this.f16732F = getIntent().getStringExtra("key_cover_url");
                        String stringExtra = getIntent().getStringExtra("key_nick_name");
                        String str = "";
                        if (stringExtra == null) {
                            stringExtra = str;
                        }
                        this.f16728B = stringExtra;
                        String stringExtra2 = getIntent().getStringExtra("key_activity_name");
                        if (stringExtra2 == null) {
                            stringExtra2 = str;
                        }
                        this.f16729C = stringExtra2;
                        String stringExtra3 = getIntent().getStringExtra("key_activity_desc");
                        if (stringExtra3 == null) {
                            stringExtra3 = str;
                        }
                        this.f16730D = stringExtra3;
                        String str2 = "activityDescParticipateCount";
                        this.f16727A = getIntent().getLongExtra("key_activity_end_time", 0);
                        this.f16737K = getIntent().getLongExtra("key_activity_display_mask", 0);
                        TextView textView5 = this.f16741P;
                        if (textView5 != null) {
                            textView5.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(getContext(), this.f16728B));
                            TextView textView6 = this.f16739M;
                            if (textView6 != null) {
                                textView6.setText(this.f16729C);
                                byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_wording_info");
                                if (byteArrayExtra != null) {
                                    C49295ek0 ek02 = new C49295ek0();
                                    try {
                                        ek02.parseFrom(byteArrayExtra);
                                    } catch (Exception e) {
                                        Log.printDebugStack("safeParser", str, e);
                                        ek02 = null;
                                    }
                                    this.f16745T = ek02;
                                    C13598b0 b0Var = C13598b0.f38549a;
                                }
                                String stringExtra4 = getIntent().getStringExtra("vst_id");
                                if (stringExtra4 == null) {
                                    stringExtra4 = str;
                                }
                                this.f16751Z = stringExtra4;
                                View decorView = getWindow().getDecorView();
                                C87412m.m108593f(decorView, "window.decorView");
                                decorView.setSystemUiVisibility(1280);
                                ActionBar supportActionBar = getSupportActionBar();
                                if (supportActionBar != null) {
                                    supportActionBar.mo91112w(new ColorDrawable(0));
                                    supportActionBar.mo91104o();
                                }
                                int f = C75044y4.m89994f(this);
                                View view = this.f16752o;
                                if (view != null) {
                                    int paddingTop = view.getPaddingTop();
                                    View view2 = this.f16752o;
                                    if (view2 != null) {
                                        view2.setPadding(0, paddingTop + f, 0, 0);
                                        getController().mo177105z0(getResources().getColor(C0966R.color.ahf));
                                        C89059e i = new C9328k1(this.f16728B, this.f16729C, (String) null, (C89349b) null, (String) null, 28, (C8480h) null).mo9225i();
                                        i.mo11397F(this);
                                        i.mo123420E(new C3632a(this));
                                        boolean booleanExtra = getIntent().getBooleanExtra("key_activity_already_participate", false);
                                        if (booleanExtra) {
                                            TextView textView7 = this.f16759v;
                                            if (textView7 != null) {
                                                textView7.setVisibility(4);
                                                TextView textView8 = this.f16760w;
                                                if (textView8 != null) {
                                                    textView8.setVisibility(4);
                                                } else {
                                                    C87412m.m108603p("cancelBtn");
                                                    throw null;
                                                }
                                            } else {
                                                C87412m.m108603p("participateBtn");
                                                throw null;
                                            }
                                        } else {
                                            TextView textView9 = this.f16759v;
                                            if (textView9 != null) {
                                                textView9.setVisibility(4);
                                                TextView textView10 = this.f16760w;
                                                if (textView10 != null) {
                                                    textView10.setVisibility(4);
                                                } else {
                                                    C87412m.m108603p("cancelBtn");
                                                    throw null;
                                                }
                                            } else {
                                                C87412m.m108603p("participateBtn");
                                                throw null;
                                            }
                                        }
                                        WeImageView weImageView = this.f16761x;
                                        if (weImageView != null) {
                                            weImageView.setOnClickListener(new C3633b(this));
                                            TextView textView11 = this.f16759v;
                                            if (textView11 != null) {
                                                textView11.setOnClickListener(new C3634c(this));
                                                LinearLayout linearLayout2 = this.f16755r;
                                                if (linearLayout2 != null) {
                                                    linearLayout2.setOnClickListener(new C3635d(this));
                                                    TextView textView12 = this.f16760w;
                                                    if (textView12 != null) {
                                                        textView12.setOnClickListener(new C3636e(this));
                                                        C13598b0 b0Var2 = C13598b0.f38549a;
                                                        if (!(!Util.isNullOrNil(this.f16732F))) {
                                                            AppCompatActivity context = getContext();
                                                            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                                                            ((MMActivity) context).getController().mo177049H0(C85875k4.m106211z());
                                                            mo4008T7(getResources().getColor(C0966R.color.FG_0));
                                                            View view3 = this.f16749X;
                                                            if (view3 != null) {
                                                                view3.setBackgroundColor(getContext().getResources().getColor(C0966R.color.FG_1));
                                                            }
                                                            int color = getResources().getColor(C0966R.color.f3133gi);
                                                            TextView textView13 = this.f16753p;
                                                            if (textView13 != null) {
                                                                textView13.setTextColor(color);
                                                                TextView textView14 = this.f16739M;
                                                                if (textView14 != null) {
                                                                    textView14.setTextColor(color);
                                                                    TextView textView15 = this.f16753p;
                                                                    if (textView15 != null) {
                                                                        textView15.setHintTextColor(getResources().getColor(C0966R.color.FG_2));
                                                                        ImageView imageView = this.f16740N;
                                                                        if (imageView != null) {
                                                                            imageView.setVisibility(8);
                                                                            ViewGroup viewGroup = this.f16742Q;
                                                                            if (viewGroup != null) {
                                                                                viewGroup.setVisibility(8);
                                                                                TextView textView16 = this.f16758u;
                                                                                if (textView16 != null) {
                                                                                    textView16.setTextColor(getContext().getResources().getColor(C0966R.color.FG_1));
                                                                                    TextView textView17 = this.f16757t;
                                                                                    if (textView17 != null) {
                                                                                        textView17.setTextColor(getContext().getResources().getColor(C0966R.color.FG_0));
                                                                                        TextView textView18 = this.f16753p;
                                                                                        if (textView18 != null) {
                                                                                            textView18.setTextColor(getContext().getResources().getColor(C0966R.color.FG_0));
                                                                                            TextView textView19 = this.f16734H;
                                                                                            if (textView19 != null) {
                                                                                                textView19.setTextColor(getContext().getResources().getColor(C0966R.color.FG_0));
                                                                                                LinearLayout linearLayout3 = this.f16755r;
                                                                                                if (linearLayout3 != null) {
                                                                                                    linearLayout3.setBackground(getContext().getResources().getDrawable(C0966R.C0969drawable.a4a));
                                                                                                } else {
                                                                                                    C87412m.m108603p("adContainer");
                                                                                                    throw null;
                                                                                                }
                                                                                            } else {
                                                                                                C87412m.m108603p("adTextView");
                                                                                                throw null;
                                                                                            }
                                                                                        } else {
                                                                                            C87412m.m108603p("activityDesc");
                                                                                            throw null;
                                                                                        }
                                                                                    } else {
                                                                                        C87412m.m108603p("activityDescEndTime");
                                                                                        throw null;
                                                                                    }
                                                                                } else {
                                                                                    C87412m.m108603p(str2);
                                                                                    throw null;
                                                                                }
                                                                            } else {
                                                                                C87412m.m108603p("coverMaskContainer");
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            C87412m.m108603p("coverImageView");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        C87412m.m108603p("activityDesc");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    C87412m.m108603p("activityNameText");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                C87412m.m108603p("activityDesc");
                                                                throw null;
                                                            }
                                                        } else {
                                                            String str3 = this.f16732F;
                                                            if (str3 != null) {
                                                                str = str3;
                                                            }
                                                            C11991t tVar = new C11991t(str);
                                                            C39818r rVar = C39818r.f106831a;
                                                            C99344b<C100810g0, Bitmap> a = ((C11990s0) rVar.mo62446e(cls).mo62447c(cls2)).mo11871f2().mo85955a(tVar);
                                                            a.mo138758f(((C11990s0) rVar.mo62446e(cls).mo62447c(cls2)).mo11867O2(C11978e0.C11979a.PROFILE_COVER));
                                                            a.f291320d = new C3780d(str3, this);
                                                            ImageView imageView2 = this.f16740N;
                                                            if (imageView2 != null) {
                                                                ((C99342a) a).mo85954d(imageView2);
                                                                AppCompatActivity context2 = getContext();
                                                                C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                                                                ((MMActivity) context2).getController().mo177049H0(true);
                                                                mo4008T7(getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                                                                int color2 = getResources().getColor(C0966R.color.f3390r5);
                                                                TextView textView20 = this.f16753p;
                                                                if (textView20 != null) {
                                                                    textView20.setTextColor(color2);
                                                                    TextView textView21 = this.f16753p;
                                                                    if (textView21 != null) {
                                                                        textView21.setHintTextColor(getResources().getColor(C0966R.color.BW_100_Alpha_0_3));
                                                                        TextView textView22 = this.f16739M;
                                                                        if (textView22 != null) {
                                                                            textView22.setTextColor(color2);
                                                                            ImageView imageView3 = this.f16740N;
                                                                            if (imageView3 != null) {
                                                                                imageView3.setVisibility(0);
                                                                                ViewGroup viewGroup2 = this.f16742Q;
                                                                                if (viewGroup2 != null) {
                                                                                    viewGroup2.setVisibility(0);
                                                                                    DisplayMetrics displayMetrics = new DisplayMetrics();
                                                                                    AppCompatActivity context3 = getContext();
                                                                                    C87412m.m108592e(context3, "null cannot be cast to non-null type android.app.Activity");
                                                                                    context3.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                                                                                    float f2 = ((float) displayMetrics.widthPixels) * 1.3333334f;
                                                                                    ImageView imageView4 = this.f16743R;
                                                                                    if (imageView4 != null) {
                                                                                        ViewGroup.LayoutParams layoutParams = imageView4.getLayoutParams();
                                                                                        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                                                                        layoutParams.height = (int) f2;
                                                                                        ImageView imageView5 = this.f16743R;
                                                                                        if (imageView5 != null) {
                                                                                            imageView5.setLayoutParams(layoutParams);
                                                                                            View view4 = this.f16749X;
                                                                                            if (view4 != null) {
                                                                                                view4.setBackgroundColor(getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
                                                                                            }
                                                                                            ImageView imageView6 = this.f16740N;
                                                                                            if (imageView6 != null) {
                                                                                                imageView6.post(new C3772b(this));
                                                                                                TextView textView23 = this.f16758u;
                                                                                                if (textView23 != null) {
                                                                                                    textView23.setTextColor(getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
                                                                                                    TextView textView24 = this.f16757t;
                                                                                                    if (textView24 != null) {
                                                                                                        textView24.setTextColor(getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                                                                                                        TextView textView25 = this.f16753p;
                                                                                                        if (textView25 != null) {
                                                                                                            textView25.setTextColor(getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                                                                                                            TextView textView26 = this.f16734H;
                                                                                                            if (textView26 != null) {
                                                                                                                textView26.setTextColor(getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                                                                                                                LinearLayout linearLayout4 = this.f16755r;
                                                                                                                if (linearLayout4 != null) {
                                                                                                                    linearLayout4.setBackground(getContext().getResources().getDrawable(C0966R.C0969drawable.a49));
                                                                                                                } else {
                                                                                                                    C87412m.m108603p("adContainer");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                            } else {
                                                                                                                C87412m.m108603p("adTextView");
                                                                                                                throw null;
                                                                                                            }
                                                                                                        } else {
                                                                                                            C87412m.m108603p("activityDesc");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    } else {
                                                                                                        C87412m.m108603p("activityDescEndTime");
                                                                                                        throw null;
                                                                                                    }
                                                                                                } else {
                                                                                                    C87412m.m108603p(str2);
                                                                                                    throw null;
                                                                                                }
                                                                                            } else {
                                                                                                C87412m.m108603p("coverImageView");
                                                                                                throw null;
                                                                                            }
                                                                                        } else {
                                                                                            C87412m.m108603p("coverMaskImageView");
                                                                                            throw null;
                                                                                        }
                                                                                    } else {
                                                                                        C87412m.m108603p("coverMaskImageView");
                                                                                        throw null;
                                                                                    }
                                                                                } else {
                                                                                    C87412m.m108603p("coverMaskContainer");
                                                                                    throw null;
                                                                                }
                                                                            } else {
                                                                                C87412m.m108603p("coverImageView");
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            C87412m.m108603p("activityNameText");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        C87412m.m108603p("activityDesc");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    C87412m.m108603p("activityDesc");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                C87412m.m108603p("coverImageView");
                                                                throw null;
                                                            }
                                                        }
                                                        View findViewById20 = getContext().findViewById(C0966R.C0970id.f5506h0);
                                                        C87412m.m108593f(findViewById20, "context.findViewById(R.i…ty_profile_header_avatar)");
                                                        this.f16754q = (ImageView) findViewById20;
                                                        String stringExtra5 = getIntent().getStringExtra("key_avatar_url");
                                                        C60979d<C100810g0> i2 = ((C11990s0) C39818r.f106831a.mo62446e(cls).mo62447c(cls2)).mo11872i2();
                                                        C62345f fVar = new C62345f(stringExtra5, (C27696y) null, 2, (C8480h) null);
                                                        ImageView imageView7 = this.f16754q;
                                                        if (imageView7 != null) {
                                                            i2.mo85957c(fVar, imageView7, ((C11990s0) C39818r.f106831a.mo62446e(cls).mo62447c(cls2)).mo11867O2(C11978e0.C11979a.AVATAR));
                                                            TextView textView27 = this.f16753p;
                                                            if (textView27 != null) {
                                                                textView27.setMovementMethod(ScrollingMovementMethod.getInstance());
                                                                if (C58784w3.f168295a.mo83908W0(this.f16737K)) {
                                                                    LinearLayout linearLayout5 = this.f16744S;
                                                                    if (linearLayout5 != null) {
                                                                        linearLayout5.setVisibility(0);
                                                                    } else {
                                                                        C87412m.m108603p("avatartContainer");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    LinearLayout linearLayout6 = this.f16744S;
                                                                    if (linearLayout6 != null) {
                                                                        linearLayout6.setVisibility(8);
                                                                    } else {
                                                                        C87412m.m108603p("avatartContainer");
                                                                        throw null;
                                                                    }
                                                                }
                                                                TextView textView28 = this.f16753p;
                                                                if (textView28 != null) {
                                                                    textView28.setOnTouchListener(new C75355a0(getContext()));
                                                                    mo4006R7();
                                                                    View findViewById21 = findViewById(C0966R.C0970id.f5480ga);
                                                                    findViewById21.post(new C3639f(findViewById21, this, booleanExtra));
                                                                    return;
                                                                }
                                                                C87412m.m108603p("activityDesc");
                                                                throw null;
                                                            }
                                                            C87412m.m108603p("activityDesc");
                                                            throw null;
                                                        }
                                                        C87412m.m108603p("avatarImage");
                                                        throw null;
                                                    }
                                                    C87412m.m108603p("cancelBtn");
                                                    throw null;
                                                }
                                                C87412m.m108603p("adContainer");
                                                throw null;
                                            }
                                            C87412m.m108603p("participateBtn");
                                            throw null;
                                        }
                                        C87412m.m108603p("backBtn");
                                        throw null;
                                    }
                                    C87412m.m108603p("descContainer");
                                    throw null;
                                }
                                C87412m.m108603p("descContainer");
                                throw null;
                            }
                            C87412m.m108603p("activityNameText");
                            throw null;
                        }
                        C87412m.m108603p("nickNameText");
                        throw null;
                    }
                    C87412m.m108603p("adContainer");
                    throw null;
                }
                C87412m.m108603p("activityDescParticipateCount");
                throw null;
            }
            C87412m.m108603p("activityDescEndTime");
            throw null;
        }
        C87412m.m108603p("activityNameText");
        throw null;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
    }
}

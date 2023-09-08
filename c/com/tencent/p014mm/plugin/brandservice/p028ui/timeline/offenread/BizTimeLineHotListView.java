package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C54248l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.BizTimeLineTopBarVideoChannelEntryChangedEvent;
import com.tencent.p014mm.autogen.events.FinderLiveSwitchEvent;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.bizui.widget.BizTagTextView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.BizTLRecCardCanvasView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18472y;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C75339i;
import di3.C86312j;
import fx0.C45825h;
import fy0.C8219i;
import gc0.C20828a;
import h81.C59774i;
import hc0.C20937c;
import ic0.C98661k;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jp3.C9486a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kw0.C46746a;
import l31.C61212e;
import p185kq.C10383h;
import p196ln.C76705f;
import p243tn.C14050a;
import p248ug.C102027b;
import p646pn.C100824i;
import q31.C118148a;
import te3.gr4;
import wd3.C22898h;
import wd3.C22904o;
import wd3.C22906q;
import wd3.C22908r;
import wd3.C22910y0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView */
public class BizTimeLineHotListView extends MRecyclerView implements C9486a {

    /* renamed from: T1 */
    public static int f51108T1;

    /* renamed from: U1 */
    public static int f51109U1;

    /* renamed from: V1 */
    public static int f51110V1;

    /* renamed from: W1 */
    public static int f51111W1;

    /* renamed from: X1 */
    public static int f51112X1;

    /* renamed from: Y1 */
    public static int f51113Y1;

    /* renamed from: Z1 */
    public static int f51114Z1;

    /* renamed from: a2 */
    public static Map<String, Integer> f51115a2 = new HashMap();

    /* renamed from: C1 */
    public C18472y f51116C1;

    /* renamed from: D1 */
    public C18432d f51117D1;

    /* renamed from: E1 */
    public List<C18468r> f51118E1 = new ArrayList();

    /* renamed from: F1 */
    public Map<Integer, Integer> f51119F1 = new HashMap();

    /* renamed from: G1 */
    public float f51120G1 = 0.0f;

    /* renamed from: H1 */
    public int f51121H1 = 0;

    /* renamed from: I1 */
    public int f51122I1 = 0;

    /* renamed from: J1 */
    public boolean f51123J1 = false;

    /* renamed from: K1 */
    public C18471v f51124K1;

    /* renamed from: L1 */
    public C18440a0 f51125L1;

    /* renamed from: M1 */
    public boolean f51126M1 = false;

    /* renamed from: N1 */
    public float f51127N1 = 0.0f;

    /* renamed from: O1 */
    public float f51128O1 = 0.0f;

    /* renamed from: P1 */
    public float f51129P1 = 0.0f;

    /* renamed from: Q1 */
    public IListener<BizTimeLineTopBarVideoChannelEntryChangedEvent> f51130Q1;

    /* renamed from: R1 */
    public IListener<FinderLiveSwitchEvent> f51131R1;

    /* renamed from: S1 */
    public boolean f51132S1;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView$a */
    public class C18426a extends LinearLayoutManager {
        public C18426a(BizTimeLineHotListView bizTimeLineHotListView, Context context) {
            super(context);
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView$b */
    public class C18427b implements Runnable {
        public C18427b() {
        }

        public void run() {
            if (BizTimeLineHotListView.this.isAttachedToWindow()) {
                try {
                    BizTimeLineHotListView.this.onDetachedFromWindow();
                    Log.m105924i("MicroMsg.BizTimeLineHotListView", "dead onDestroy but has not called onDetachedFromWindow!");
                    C115669n.INSTANCE.idkeyStat(1378, 12, 1, false);
                } catch (Exception e) {
                    C115669n.INSTANCE.idkeyStat(1378, 13, 1, false);
                    Log.m105921e("MicroMsg.BizTimeLineHotListView", "dead onDetachedFromWindow ex %s", e.getMessage());
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView$c */
    public class C18428c extends C18432d {

        /* renamed from: e */
        public float[] f51136e;

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView$c$a */
        public class C18429a implements C22910y0 {

            /* renamed from: a */
            public final /* synthetic */ String f51138a;

            /* renamed from: b */
            public final /* synthetic */ C18434e f51139b;

            /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView$c$a$a */
            public class C18430a implements C100824i.C100825a {
                public C18430a() {
                }

                /* renamed from: a */
                public void mo23027a(int i) {
                    ((HashMap) BizTimeLineHotListView.f51115a2).put(C18429a.this.f51138a, Integer.valueOf(i));
                    C18429a aVar = C18429a.this;
                    C18428c.this.mo23025g5(i, aVar.f51139b.f51146B);
                }
            }

            public C18429a(String str, C18434e eVar) {
                this.f51138a = str;
                this.f51139b = eVar;
            }

            /* renamed from: a */
            public boolean mo23026a(Bitmap bitmap) {
                ((C100824i) C86312j.m106911c(C100824i.class)).mo139641DS(bitmap, 0, new C18430a());
                return true;
            }

            public void onFinish() {
            }

            public void onStart() {
            }
        }

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView$c$b */
        public class C18431b extends ShapeDrawable.ShaderFactory {

            /* renamed from: a */
            public final /* synthetic */ int f51142a;

            public C18431b(C18428c cVar, int i) {
                this.f51142a = i;
            }

            public Shader resize(int i, int i2) {
                float f = (float) (i / 2);
                float f2 = (float) i2;
                int i3 = this.f51142a;
                return new LinearGradient(f, 0.0f, f, f2, new int[]{0, i3, i3}, new float[]{0.0f, 0.58f, 1.0f}, Shader.TileMode.CLAMP);
            }
        }

        public C18428c() {
            super();
            float[] fArr = new float[8];
            this.f51136e = fArr;
            fArr[3] = 0.0f;
            fArr[2] = 0.0f;
            fArr[1] = 0.0f;
            fArr[0] = 0.0f;
            float f = (float) (BizTimeLineHotListView.f51111W1 - 2);
            fArr[7] = f;
            fArr[6] = f;
            fArr[5] = f;
            fArr[4] = f;
        }

        /* renamed from: F4 */
        public void mo23022F4(C18434e eVar, C18468r rVar, int i) {
            C18434e eVar2 = eVar;
            C18468r rVar2 = rVar;
            int a = C18466p.m19102a(BizTimeLineHotListView.this.getContext());
            BizTimeLineHotListView.m19039B1(BizTimeLineHotListView.this, eVar2, rVar2, i, a);
            int i2 = a - BizTimeLineHotListView.f51111W1;
            int i3 = (i2 * 4) / 3;
            Log.m105919d("MicroMsg.BizTimeLineHotListView", "live onBindCustomViewHolder postion: %d, width: %d", Integer.valueOf(i), Integer.valueOf(a));
            if (rVar2 == null || rVar2.f51255s != 1) {
                C46746a aVar = C46746a.f125826a;
                View view = eVar2.f51153I;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.height = 1;
                    view.setLayoutParams(layoutParams);
                }
            } else {
                C46746a aVar2 = C46746a.f125826a;
                View view2 = eVar2.f51153I;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    layoutParams2.height = i3;
                    view2.setLayoutParams(layoutParams2);
                }
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5(eVar2.f51163z, rVar2.f354229d);
                eVar2.f51152H.setText(((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(rVar2.f354229d));
                eVar2.f51152H.setTextSize(0, ((float) C76577a.m92155f(BizTimeLineHotListView.this.getContext(), C0966R.dimen.f3964lm)) * C76577a.m92161l(BizTimeLineHotListView.this.getContext()));
                C8219i.f27144a.mo9271b(eVar2.f51152H);
                String str = rVar2.f51260x;
                if (str != null) {
                    String format = String.format("finder_live_bg_%s", new Object[]{MD5Util.getMD5String(str)});
                    Integer num = (Integer) ((HashMap) BizTimeLineHotListView.f51115a2).get(format);
                    if (num != null) {
                        mo23025g5(num.intValue(), eVar2.f51146B);
                    }
                    String str2 = rVar2.f51260x;
                    ImageView imageView = eVar2.f51145A;
                    C18429a aVar3 = new C18429a(format, eVar2);
                    String a2 = C102027b.m134386a(str2, 1, true);
                    float b = (float) C76577a.m92151b(BizTimeLineHotListView.this.getContext(), 8);
                    C20828a b2 = C20828a.m22825b();
                    C20937c.C20939b bVar = new C20937c.C20939b();
                    bVar.f59361q = C0966R.C0969drawable.f4616hw;
                    bVar.f59346b = true;
                    bVar.f59354j = i2;
                    bVar.f59355k = i3;
                    bVar.f59369y = new C22908r(1);
                    bVar.f59370z = new C22898h(1);
                    bVar.f59343A = new C22904o(1);
                    bVar.f59350f = C14050a.m13405b(a2);
                    b2.mo32522k(a2, imageView, bVar.mo32666a(), (C98661k) null, new C22906q(1, i2, i3, true, true, b, aVar3));
                }
            }
            BizTimeLineHotListView.m19040C1(BizTimeLineHotListView.this, eVar, rVar, i, true, a);
        }

        /* renamed from: G4 */
        public void mo23023G4(C18434e eVar, int i) {
            super.onBindViewHolder(eVar, i);
        }

        /* renamed from: O4 */
        public C18434e onCreateViewHolder(ViewGroup viewGroup, int i) {
            BizTimeLineHotListView bizTimeLineHotListView = BizTimeLineHotListView.this;
            return new C18434e(bizTimeLineHotListView, C85868k2.m106137b(bizTimeLineHotListView.getContext()).inflate(C0966R.C0971layout.f6598jb, viewGroup, false));
        }

        /* renamed from: g5 */
        public final void mo23025g5(int i, ImageView imageView) {
            C18431b bVar = new C18431b(this, i | -16777216);
            PaintDrawable paintDrawable = new PaintDrawable();
            paintDrawable.setShape(new RectShape());
            paintDrawable.setShaderFactory(bVar);
            paintDrawable.setCornerRadii(this.f51136e);
            imageView.setBackground(paintDrawable);
        }

        public int getItemCount() {
            return super.getItemCount();
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            super.onBindViewHolder((C18434e) zVar, i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView$d */
    public class C18432d extends RecyclerView.C16613e<C18434e> {

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView$d$a */
        public class C18433a implements C118148a {
            public C18433a() {
            }

            /* renamed from: a */
            public boolean mo36a(Object obj, String str, int i) {
                if (!(obj instanceof View)) {
                    return false;
                }
                if (!((HashMap) BizTimeLineHotListView.this.f51119F1).containsKey(Integer.valueOf(obj.hashCode()))) {
                    return false;
                }
                BizTimeLineHotListView bizTimeLineHotListView = BizTimeLineHotListView.this;
                List<C18468r> list = bizTimeLineHotListView.f51118E1;
                ArrayList arrayList = (ArrayList) list;
                C18468r rVar = (C18468r) arrayList.get(((Integer) ((HashMap) bizTimeLineHotListView.f51119F1).get(Integer.valueOf(obj.hashCode()))).intValue());
                if (rVar == null) {
                    return false;
                }
                BizTimeLineHotListView.this.getClass();
                if (C19428d.f54856a.mo25187v(rVar.f354229d, rVar.f354232g)) {
                    return false;
                }
                ((C61212e) C86312j.m106911c(C61212e.class)).mo86173oM((View) obj);
                return true;
            }

            /* renamed from: b */
            public Map<String, Object> mo37b(String str) {
                Class cls = C10383h.class;
                HashMap hashMap = new HashMap();
                hashMap.put("live_enter_status", 1);
                hashMap.put("finder_context_id", ((C10383h) C86312j.m106911c(cls)).mo10696E());
                hashMap.put("share_username", "");
                hashMap.put("finder_tab_context_id", ((C10383h) C86312j.m106911c(cls)).mo10698S0());
                hashMap.put("session_buffer", "");
                return hashMap;
            }
        }

        public C18432d() {
        }

        /* renamed from: F4 */
        public void mo23022F4(C18434e eVar, C18468r rVar, int i) {
            C18434e eVar2 = eVar;
            C18468r rVar2 = rVar;
            int a = C18466p.m19102a(BizTimeLineHotListView.this.getContext());
            BizTimeLineHotListView.m19039B1(BizTimeLineHotListView.this, eVar2, rVar2, i, a);
            boolean z = false;
            if (rVar2 != null && rVar2.f51255s == 1) {
                BizTimeLineHotListView.this.mo23009P1(eVar2);
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106822J5(eVar2.f51163z, rVar2.f354229d);
                eVar2.f51152H.setText(((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(rVar2.f354229d));
                eVar2.f51152H.setTextSize(0, ((float) C76577a.m92155f(BizTimeLineHotListView.this.getContext(), C0966R.dimen.f3964lm)) * C76577a.m92161l(BizTimeLineHotListView.this.getContext()));
                eVar2.f51152H.setTextColor(BizTimeLineHotListView.this.getContext().getResources().getColor(C0966R.color.f3552xi));
                BizTimeLineHotListView.this.mo23007N1(rVar2, eVar2.f51154J);
                BizTimeLineHotListView.this.mo23011R1(rVar2, eVar2);
                eVar2.f51155K.setVisibility(8);
                eVar2.f51160Q.setVisibility(8);
                eVar2.f51159P.setVisibility(8);
                eVar2.f51158N.setVisibility(8);
            } else if (rVar2 != null && rVar2.f51255s == 3 && (rVar2 instanceof C18469s)) {
                if (C45825h.f123727a.mo71294e()) {
                    eVar2.f51148D.setVisibility(8);
                    View view = eVar2.f51151G;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView$BizTimeLineHotViewAdapter", "onBindCustomViewHolder", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView$HotListViewHolder;Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotViewInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView$BizTimeLineHotViewAdapter", "onBindCustomViewHolder", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView$HotListViewHolder;Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotViewInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (eVar2.f51156L == null) {
                        View inflate = ((ViewStub) eVar2.f51153I.findViewById(C0966R.C0970id.l9r)).inflate();
                        eVar2.f51156L = inflate;
                        eVar2.f51157M = (BizTLRecCardCanvasView) inflate.findViewById(C0966R.C0970id.l4u);
                    }
                    BizTLRecCardCanvasView bizTLRecCardCanvasView = eVar2.f51157M;
                    bizTLRecCardCanvasView.setVisibility(0);
                    bizTLRecCardCanvasView.mo118070b(0, "__biz_video_channel_canvas_id__", "vc", "");
                    BizTimeLineHotListView.m19040C1(BizTimeLineHotListView.this, eVar, rVar, i, z, a);
                }
                eVar2.f51161R.setVisibility(8);
                eVar2.f51162S.setVisibility(8);
                BizTimeLineHotListView.m19042E1(BizTimeLineHotListView.this, eVar2, (C18469s) rVar2);
            }
            z = true;
            BizTimeLineHotListView.m19040C1(BizTimeLineHotListView.this, eVar, rVar, i, z, a);
        }

        /* renamed from: G4 */
        public void onBindViewHolder(C18434e eVar, int i) {
            Class cls = C61212e.class;
            if (i >= ((ArrayList) BizTimeLineHotListView.this.f51118E1).size() || i - BizTimeLineHotListView.this.getCustomItemCount() > BizTimeLineHotListView.this.getShowCount()) {
                View view = eVar.f51153I;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView$BizTimeLineHotViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView$HotListViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView$BizTimeLineHotViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView$HotListViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo23022F4(eVar, (C18468r) null, i);
                return;
            }
            View view2 = eVar.f51153I;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView$BizTimeLineHotViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView$HotListViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView$BizTimeLineHotViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView$HotListViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C18468r rVar = (C18468r) ((ArrayList) BizTimeLineHotListView.this.f51118E1).get(i);
            if (rVar != null) {
                rVar.f51253q = i;
                eVar.f51153I.setTag(rVar);
            }
            mo23022F4(eVar, rVar, i);
            if (rVar != null && !Util.isNullOrNil(rVar.f354232g)) {
                if (this instanceof C18428c) {
                    ((C61212e) C86312j.m106911c(cls)).o30(eVar.f51153I, "living_label_biz_timeline_avatar");
                } else {
                    ((C61212e) C86312j.m106911c(cls)).o30(eVar.f51153I, "biz_timeline_baritem");
                    ((HashMap) BizTimeLineHotListView.this.f51119F1).put(Integer.valueOf(eVar.f51153I.hashCode()), Integer.valueOf(i));
                }
                ((C61212e) C86312j.m106911c(cls)).mo86175pO(eVar.f51153I, 40, 26236);
                ArrayMap arrayMap = new ArrayMap();
                arrayMap.put("live_id", "");
                arrayMap.put("finder_username", "");
                arrayMap.put("feed_id", "");
                arrayMap.put("comment_scene", "");
                arrayMap.put("finder_feed_export_id", rVar.f354232g);
                arrayMap.put("wx_username", rVar.f354229d);
                arrayMap.put("behaviour_session_id", ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb());
                ((C61212e) C86312j.m106911c(cls)).mo86149PM(eVar.f51153I, arrayMap);
                ((C61212e) C86312j.m106911c(cls)).E60(eVar.f51153I, new C18433a());
            }
        }

        /* renamed from: O4 */
        public C18434e onCreateViewHolder(ViewGroup viewGroup, int i) {
            BizTimeLineHotListView bizTimeLineHotListView = BizTimeLineHotListView.this;
            return new C18434e(bizTimeLineHotListView, C85868k2.m106137b(bizTimeLineHotListView.getContext()).inflate(C0966R.C0971layout.f6602jf, viewGroup, false));
        }

        public int getItemCount() {
            if (Util.isNullOrNil((List) BizTimeLineHotListView.this.f51118E1)) {
                return 0;
            }
            int size = BizTimeLineHotListView.this.f51118E1.size();
            int i = C18466p.f51248c;
            if (BizTimeLineHotListView.this.getCustomItemCount() == 1) {
                size--;
            }
            if (size > BizTimeLineHotListView.this.getShowCount()) {
                size = BizTimeLineHotListView.this.getShowCount();
            }
            if (BizTimeLineHotListView.this.getCustomItemCount() == 1) {
                int i2 = size % i;
                return (i2 == 0 ? size + 1 : size + ((i + 1) - i2)) + BizTimeLineHotListView.this.getCustomItemCount();
            }
            int i3 = size % i;
            return i3 != 0 ? size + (i - i3) : size;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
            r3 = r2.f51143d.f51118E1.get(r3);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int getItemViewType(int r3) {
            /*
                r2 = this;
                com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.BizTimeLineHotListView.this
                java.util.List<com.tencent.mm.plugin.brandservice.ui.timeline.offenread.r> r0 = r0.f51118E1
                int r0 = r0.size()
                if (r3 >= r0) goto L_0x0031
                com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.BizTimeLineHotListView.this
                int r0 = r0.getCustomItemCount()
                int r0 = r3 - r0
                com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.BizTimeLineHotListView.this
                int r1 = r1.getShowCount()
                if (r0 > r1) goto L_0x0031
                com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.BizTimeLineHotListView.this
                java.util.List<com.tencent.mm.plugin.brandservice.ui.timeline.offenread.r> r0 = r0.f51118E1
                java.lang.Object r3 = r0.get(r3)
                com.tencent.mm.plugin.brandservice.ui.timeline.offenread.r r3 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18468r) r3
                if (r3 == 0) goto L_0x0031
                int r0 = r3.f51255s
                r1 = 3
                if (r0 != r1) goto L_0x0031
                boolean r3 = r3 instanceof com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18469s
                if (r3 == 0) goto L_0x0031
                r3 = 1
                return r3
            L_0x0031:
                r3 = 0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.BizTimeLineHotListView.C18432d.getItemViewType(int):int");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView$e */
    public class C18434e extends RecyclerView.C16631z {

        /* renamed from: A */
        public ImageView f51145A;

        /* renamed from: B */
        public ImageView f51146B;

        /* renamed from: C */
        public ImageView f51147C;

        /* renamed from: D */
        public RelativeLayout f51148D;

        /* renamed from: E */
        public RelativeLayout f51149E;

        /* renamed from: F */
        public ImageView f51150F;

        /* renamed from: G */
        public View f51151G;

        /* renamed from: H */
        public TextView f51152H;

        /* renamed from: I */
        public View f51153I;

        /* renamed from: J */
        public ImageView f51154J;

        /* renamed from: K */
        public ImageView f51155K;

        /* renamed from: L */
        public View f51156L = null;

        /* renamed from: M */
        public BizTLRecCardCanvasView f51157M;

        /* renamed from: N */
        public TextView f51158N = null;

        /* renamed from: P */
        public ImageView f51159P = null;

        /* renamed from: Q */
        public ImageView f51160Q = null;

        /* renamed from: R */
        public ImageView f51161R = null;

        /* renamed from: S */
        public BizTagTextView f51162S = null;

        /* renamed from: z */
        public ImageView f51163z;

        public C18434e(BizTimeLineHotListView bizTimeLineHotListView, View view) {
            super(view);
            this.f51153I = view;
            C46746a aVar = C46746a.f125826a;
            aVar.mo71980n(view, aVar.mo71973f(bizTimeLineHotListView.getContext()) / 4);
            this.f51163z = (ImageView) view.findViewById(C0966R.C0970id.ad_);
            this.f51145A = (ImageView) view.findViewById(C0966R.C0970id.acz);
            this.f51146B = (ImageView) view.findViewById(C0966R.C0970id.acx);
            this.f51147C = (ImageView) view.findViewById(C0966R.C0970id.ada);
            this.f51148D = (RelativeLayout) view.findViewById(C0966R.C0970id.adb);
            this.f51149E = (RelativeLayout) view.findViewById(C0966R.C0970id.ad8);
            this.f51150F = (ImageView) view.findViewById(C0966R.C0970id.ad7);
            this.f51151G = view.findViewById(C0966R.C0970id.adl);
            this.f51152H = (TextView) view.findViewById(C0966R.C0970id.adk);
            this.f51154J = (ImageView) view.findViewById(C0966R.C0970id.adm);
            this.f51155K = (ImageView) view.findViewById(C0966R.C0970id.adg);
            this.f51158N = (TextView) view.findViewById(C0966R.C0970id.ad9);
            this.f51159P = (ImageView) view.findViewById(C0966R.C0970id.adh);
            this.f51160Q = (ImageView) view.findViewById(C0966R.C0970id.adi);
            this.f51161R = (ImageView) view.findViewById(C0966R.C0970id.ade);
            this.f51162S = (BizTagTextView) view.findViewById(C0966R.C0970id.adf);
        }
    }

    public BizTimeLineHotListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C40008f fVar = C40008f.f107254d;
        this.f51130Q1 = new IListener<BizTimeLineTopBarVideoChannelEntryChangedEvent>(fVar) {
            {
                this.__eventId = 1183885262;
            }

            public boolean callback(IEvent iEvent) {
                BizTimeLineTopBarVideoChannelEntryChangedEvent bizTimeLineTopBarVideoChannelEntryChangedEvent = (BizTimeLineTopBarVideoChannelEntryChangedEvent) iEvent;
                if (bizTimeLineTopBarVideoChannelEntryChangedEvent != null) {
                    BizTimeLineHotListView bizTimeLineHotListView = BizTimeLineHotListView.this;
                    if (!bizTimeLineHotListView.f51126M1 && bizTimeLineHotListView.f51118E1 != null) {
                        Log.m105925i("MicroMsg.BizTimeLineHotListView", "alvinluo onTopBarVideoChannelEntryChanged switchOption: %d, list: %d", Integer.valueOf(bizTimeLineTopBarVideoChannelEntryChangedEvent.f107385d.f107386a), Integer.valueOf(((ArrayList) BizTimeLineHotListView.this.f51118E1).size()));
                        if (C45825h.m51116h()) {
                            if (((ArrayList) BizTimeLineHotListView.this.f51118E1).size() > 1) {
                                C18468r rVar = (C18468r) ((ArrayList) BizTimeLineHotListView.this.f51118E1).get(1);
                                if (rVar.f51255s != 3 || !(rVar instanceof C18469s)) {
                                    BizTimeLineHotListView bizTimeLineHotListView2 = BizTimeLineHotListView.this;
                                    BizTimeLineHotListView.m19041D1(bizTimeLineHotListView2, bizTimeLineHotListView2.f51118E1, bizTimeLineTopBarVideoChannelEntryChangedEvent);
                                } else {
                                    BizTimeLineHotListView bizTimeLineHotListView3 = BizTimeLineHotListView.this;
                                    C18469s sVar = (C18469s) rVar;
                                    bizTimeLineHotListView3.getClass();
                                    sVar.f354229d = "";
                                    bizTimeLineHotListView3.mo23008O1(sVar, bizTimeLineTopBarVideoChannelEntryChangedEvent.f107385d.f107387b);
                                    C18432d dVar = bizTimeLineHotListView3.f51117D1;
                                    if (dVar != null) {
                                        dVar.notifyItemChanged(1);
                                    }
                                }
                            } else if (((ArrayList) BizTimeLineHotListView.this.f51118E1).size() == 1) {
                                BizTimeLineHotListView bizTimeLineHotListView4 = BizTimeLineHotListView.this;
                                BizTimeLineHotListView.m19041D1(bizTimeLineHotListView4, bizTimeLineHotListView4.f51118E1, bizTimeLineTopBarVideoChannelEntryChangedEvent);
                            }
                        } else if (((ArrayList) BizTimeLineHotListView.this.f51118E1).size() > 1) {
                            C18468r rVar2 = (C18468r) ((ArrayList) BizTimeLineHotListView.this.f51118E1).get(1);
                            if (rVar2.f51255s == 3 && (rVar2 instanceof C18469s)) {
                                ((ArrayList) BizTimeLineHotListView.this.f51118E1).remove(1);
                                BizTimeLineHotListView bizTimeLineHotListView5 = BizTimeLineHotListView.this;
                                bizTimeLineHotListView5.f51123J1 = false;
                                C18432d dVar2 = bizTimeLineHotListView5.f51117D1;
                                if (dVar2 != null) {
                                    dVar2.notifyDataSetChanged();
                                }
                            }
                        }
                    }
                }
                return false;
            }
        };
        this.f51131R1 = new IListener<FinderLiveSwitchEvent>(fVar) {
            {
                this.__eventId = -1537763836;
            }

            public boolean callback(IEvent iEvent) {
                FinderLiveSwitchEvent finderLiveSwitchEvent = (FinderLiveSwitchEvent) iEvent;
                if (finderLiveSwitchEvent != null && !BizTimeLineHotListView.this.f51126M1) {
                    FinderLiveSwitchEvent.C55130a aVar = finderLiveSwitchEvent.f154791d;
                    if (aVar.f154792a == 4) {
                        Log.m105925i("MicroMsg.BizTimeLineHotListView", "on FinderLiveSwitchEvent %s", aVar.f154793b);
                        ((C119157j) C119157j.f356862d).mo183895z(new C18455d(this, finderLiveSwitchEvent));
                    }
                }
                return false;
            }
        };
        this.f51132S1 = true;
        mo23020y1();
    }

    /* renamed from: B1 */
    public static void m19039B1(BizTimeLineHotListView bizTimeLineHotListView, C18434e eVar, C18468r rVar, int i, int i2) {
        float showCountPerPage = bizTimeLineHotListView.getShowCountPerPage();
        if (i == bizTimeLineHotListView.f51117D1.getItemCount() - 1) {
            double d = (double) showCountPerPage;
            int ceil = (int) (((double) i2) * (1.0d - (Math.ceil(d) - d)));
            C46746a.f125826a.mo71980n(eVar.f51153I, ceil);
            Log.m105925i("MicroMsg.BizTimeLineHotListView", "alvinluo lastPosition %d set width %d", Integer.valueOf(i), Integer.valueOf(ceil));
        } else if (rVar == null) {
            C46746a.f125826a.mo71980n(eVar.f51153I, i2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ec  */
    /* renamed from: C1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m19040C1(com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.BizTimeLineHotListView r26, com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.BizTimeLineHotListView.C18434e r27, com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18468r r28, int r29, boolean r30, int r31) {
        /*
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            r26.getClass()
            if (r2 == 0) goto L_0x021d
            if (r1 == 0) goto L_0x021d
            android.view.View r4 = r1.f51153I
            if (r4 != 0) goto L_0x0015
            goto L_0x021d
        L_0x0015:
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r29)
            r7 = 0
            r5[r7] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r31)
            r8 = 1
            r5[r8] = r6
            java.lang.String r6 = "MicroMsg.BizTimeLineHotListView"
            java.lang.String r9 = "alvinluo onBindCustomViewHolder postion: %d, width: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r9, r5)
            int r5 = r26.getCurrentPage()
            int r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18472y.m19113a(r5)
            int r10 = r5 + 1
            int r11 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18466p.f51248c
            int r10 = r10 * r11
            int r10 = r10 + r8
            r11 = 4
            java.lang.Object[] r12 = new java.lang.Object[r11]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
            r12[r7] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            r12[r8] = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            r12[r4] = r13
            r13 = 3
            java.lang.Integer r14 = java.lang.Integer.valueOf(r29)
            r12[r13] = r14
            java.lang.String r13 = "alvinluo configView curPage: %d, firstPositionOfCurPage: %d, lastPositionOfCurPage: %d, position: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r13, r12)
            int r6 = r2.f51255s
            if (r6 != r4) goto L_0x00ac
            android.view.View r2 = r1.f51153I
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r4.mo10233c(r5)
            java.lang.Object[] r13 = r4.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView"
            java.lang.String r15 = "configView"
            java.lang.String r16 = "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView$HotListViewHolder;Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotViewInfo;IZI)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r2
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r4 = r4.mo10231a(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r13 = "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView"
            java.lang.String r14 = "configView"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView$HotListViewHolder;Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotViewInfo;IZI)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            kw0.a r2 = kw0.C46746a.f125826a
            android.view.View r4 = r1.f51153I
            r2.mo71980n(r4, r7)
            goto L_0x0146
        L_0x00ac:
            if (r5 != 0) goto L_0x00b1
            if (r3 != r8) goto L_0x00b4
            goto L_0x00b5
        L_0x00b1:
            if (r3 != r9) goto L_0x00b4
            goto L_0x00b5
        L_0x00b4:
            r8 = 0
        L_0x00b5:
            if (r8 == 0) goto L_0x00ba
            int r4 = f51114Z1
            goto L_0x00bb
        L_0x00ba:
            r4 = 0
        L_0x00bb:
            boolean r5 = r0.f51126M1
            if (r5 == 0) goto L_0x00f4
            boolean r5 = r2.f51258v
            if (r5 == 0) goto L_0x00e9
            boolean r2 = r2.f51257u
            if (r2 == 0) goto L_0x00ca
            int r4 = f51112X1
            goto L_0x00e9
        L_0x00ca:
            android.widget.RelativeLayout r2 = r1.f51149E
            r2.setVisibility(r7)
            int r2 = f51113Y1
            boolean r5 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r5 == 0) goto L_0x00e0
            android.widget.ImageView r5 = r1.f51150F
            r6 = 2131233688(0x7f080b98, float:1.808352E38)
            r5.setImageResource(r6)
            goto L_0x00ea
        L_0x00e0:
            android.widget.ImageView r5 = r1.f51150F
            r6 = 2131233687(0x7f080b97, float:1.8083519E38)
            r5.setImageResource(r6)
            goto L_0x00ea
        L_0x00e9:
            r2 = 0
        L_0x00ea:
            if (r2 != 0) goto L_0x00f5
            android.widget.RelativeLayout r5 = r1.f51149E
            r6 = 8
            r5.setVisibility(r6)
            goto L_0x00f5
        L_0x00f4:
            r2 = 0
        L_0x00f5:
            android.view.View r5 = r1.f51153I
            r5.setPadding(r4, r7, r7, r7)
            kw0.a r5 = kw0.C46746a.f125826a
            android.view.View r6 = r1.f51153I
            int r4 = r31 + r4
            int r4 = r4 + r2
            r5.mo71980n(r6, r4)
            android.view.View r2 = r1.f51153I
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r4.mo10233c(r5)
            java.lang.Object[] r12 = r4.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView"
            java.lang.String r14 = "configView"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView$HotListViewHolder;Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotViewInfo;IZI)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r2
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r4 = r4.mo10231a(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r12 = "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView"
            java.lang.String r13 = "configView"
            java.lang.String r14 = "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView$HotListViewHolder;Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotViewInfo;IZI)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
        L_0x0146:
            if (r30 == 0) goto L_0x0194
            boolean r2 = r0.f51126M1
            if (r2 != 0) goto L_0x0194
            android.content.Context r2 = r26.getContext()
            r4 = 2131166002(0x7f070332, float:1.7946237E38)
            int r4 = kg3.C76577a.m92155f(r2, r4)
            float r4 = (float) r4
            float r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18466p.m19105d(r2)
            float r4 = r4 * r2
            int r2 = (int) r4
            kw0.a r4 = kw0.C46746a.f125826a
            android.widget.RelativeLayout r5 = r1.f51148D
            r6 = -1
            android.content.Context r8 = r26.getContext()
            r9 = 18
            int r8 = kg3.C76577a.m92151b(r8, r9)
            int r8 = r8 + r2
            r4.mo71979m(r5, r6, r8)
            android.widget.ImageView r5 = r1.f51163z
            r4.mo71979m(r5, r2, r2)
            android.widget.ImageView r5 = r1.f51147C
            r4.mo71979m(r5, r2, r2)
            android.widget.ImageView r5 = r1.f51161R
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L_0x0194
            android.content.Context r0 = r26.getContext()
            r5 = 16
            int r0 = kg3.C76577a.m92151b(r0, r5)
            int r2 = r2 + r0
            android.widget.ImageView r0 = r1.f51161R
            r4.mo71979m(r0, r2, r2)
        L_0x0194:
            if (r3 != r10) goto L_0x01da
            android.view.View r0 = r1.f51153I
            r1 = 1050253722(0x3e99999a, float:0.3)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2.mo10233c(r1)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView"
            java.lang.String r14 = "configView"
            java.lang.String r15 = "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView$HotListViewHolder;Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotViewInfo;IZI)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setAlpha"
            java.lang.String r18 = "(F)V"
            r11 = r0
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r1 = r2.mo10231a(r7)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r0.setAlpha(r1)
            java.lang.String r12 = "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView"
            java.lang.String r13 = "configView"
            java.lang.String r14 = "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView$HotListViewHolder;Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotViewInfo;IZI)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setAlpha"
            java.lang.String r17 = "(F)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x021d
        L_0x01da:
            android.view.View r1 = r1.f51153I
            r0 = 1065353216(0x3f800000, float:1.0)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.mo10233c(r0)
            java.lang.Object[] r19 = r2.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView"
            java.lang.String r21 = "configView"
            java.lang.String r22 = "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView$HotListViewHolder;Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotViewInfo;IZI)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setAlpha"
            java.lang.String r25 = "(F)V"
            r18 = r1
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r0 = r2.mo10231a(r7)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r1.setAlpha(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView"
            java.lang.String r3 = "configView"
            java.lang.String r4 = "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView$HotListViewHolder;Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotViewInfo;IZI)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setAlpha"
            java.lang.String r7 = "(F)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
        L_0x021d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.BizTimeLineHotListView.m19040C1(com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView, com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView$e, com.tencent.mm.plugin.brandservice.ui.timeline.offenread.r, int, boolean, int):void");
    }

    /* renamed from: D1 */
    public static void m19041D1(BizTimeLineHotListView bizTimeLineHotListView, List list, BizTimeLineTopBarVideoChannelEntryChangedEvent bizTimeLineTopBarVideoChannelEntryChangedEvent) {
        if (!bizTimeLineHotListView.f51126M1 && list != null && bizTimeLineTopBarVideoChannelEntryChangedEvent != null) {
            C18469s sVar = new C18469s(3);
            sVar.f354229d = "";
            bizTimeLineHotListView.mo23008O1(sVar, bizTimeLineTopBarVideoChannelEntryChangedEvent.f107385d.f107387b);
            list.add(1, sVar);
            bizTimeLineHotListView.f51123J1 = true;
            C18432d dVar = bizTimeLineHotListView.f51117D1;
            if (dVar != null) {
                dVar.notifyDataSetChanged();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb  */
    /* renamed from: E1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m19042E1(com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.BizTimeLineHotListView r13, com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.BizTimeLineHotListView.C18434e r14, com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18469s r15) {
        /*
            r13.getClass()
            fx0.h r0 = fx0.C45825h.f123727a
            boolean r1 = r0.mo71294e()
            if (r1 == 0) goto L_0x000d
            goto L_0x0244
        L_0x000d:
            r13.mo23009P1(r14)
            android.widget.ImageView r1 = r14.f51163z
            java.lang.String r2 = "iconIV"
            gy3.C87412m.m108594g(r1, r2)
            r3 = 1
            java.lang.String r4 = r0.mo71290a(r3)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            r5 = 2131231376(0x7f080290, float:1.8078831E38)
            r6 = 0
            if (r4 == 0) goto L_0x0029
            r1 = 0
            goto L_0x00cb
        L_0x0029:
            java.lang.String r4 = fx0.C45825h.f123728b
            java.lang.String r4 = p243tn.C14050a.m13405b(r4)
            boolean r7 = r0.mo71295g()
            if (r7 == 0) goto L_0x0047
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r7 != 0) goto L_0x0041
            r7 = 15
            r0.mo71297j(r7)
            goto L_0x0059
        L_0x0041:
            r7 = 16
            r0.mo71297j(r7)
            goto L_0x0059
        L_0x0047:
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r7 != 0) goto L_0x0054
            r7 = 17
            r0.mo71297j(r7)
            r7 = 1
            goto L_0x005a
        L_0x0054:
            r7 = 18
            r0.mo71297j(r7)
        L_0x0059:
            r7 = 0
        L_0x005a:
            gc0.a r8 = gc0.C20828a.m22825b()
            java.lang.String r9 = fx0.C45825h.f123728b
            hc0.c$b r10 = new hc0.c$b
            r10.<init>()
            r10.f59364t = r3
            if (r7 == 0) goto L_0x00b8
            te3.gr4 r7 = fx0.C45825h.m51115f()
            if (r7 == 0) goto L_0x0072
            java.lang.String r7 = r7.f134222i
            goto L_0x0073
        L_0x0072:
            r7 = 0
        L_0x0073:
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r11 != 0) goto L_0x00b8
            java.lang.String r7 = p243tn.C14050a.m13405b(r7)
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            if (r11 == 0) goto L_0x00b8
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r12 = 48
            int r11 = kg3.C76577a.m92151b(r11, r12)
            android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFileWithSample(r7, r11, r11)
            if (r7 == 0) goto L_0x00b8
            android.content.res.Resources r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            x2.b r12 = new x2.b
            r12.<init>(r11, r7)
            int r11 = r7.getWidth()
            int r7 = r7.getHeight()
            int r7 = java.lang.Math.max(r11, r7)
            float r7 = (float) r7
            r11 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r11
            r12.mo163680c(r7)
            r10.f59360p = r12
            r11 = 19
            r0.mo71297j(r11)
            r7 = 1
            goto L_0x00b9
        L_0x00b8:
            r7 = 0
        L_0x00b9:
            if (r7 != 0) goto L_0x00bd
            r10.f59359o = r5
        L_0x00bd:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            r10.f59346b = r3
            r10.f59350f = r4
            hc0.c r4 = r10.mo32666a()
            r8.mo32519h(r9, r1, r4)
            r1 = 1
        L_0x00cb:
            if (r1 != 0) goto L_0x00d2
            android.widget.ImageView r1 = r14.f51163z
            r1.setImageResource(r5)
        L_0x00d2:
            android.widget.ImageView r1 = r14.f51160Q
            gy3.C87412m.m108594g(r1, r2)
            te3.gr4 r2 = fx0.C45825h.m51115f()
            r4 = 8
            if (r2 == 0) goto L_0x0124
            int r7 = r2.f134233w
            if (r7 != r3) goto L_0x0124
            java.lang.String r7 = r2.f134234x
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0124
            boolean r7 = r0.mo71295g()
            if (r7 == 0) goto L_0x00f2
            goto L_0x0124
        L_0x00f2:
            r1.setVisibility(r6)
            java.lang.String r7 = r2.f134234x
            java.lang.String r7 = p243tn.C14050a.m13405b(r7)
            android.content.Context r8 = r1.getContext()
            r9 = 12
            int r8 = kg3.C76577a.m92151b(r8, r9)
            gc0.a r9 = gc0.C20828a.m22825b()
            java.lang.String r2 = r2.f134234x
            hc0.c$b r10 = new hc0.c$b
            r10.<init>()
            r10.f59364t = r3
            r10.f59359o = r5
            r10.f59354j = r8
            r10.f59355k = r8
            r10.f59346b = r3
            r10.f59350f = r7
            hc0.c r5 = r10.mo32666a()
            r9.mo32519h(r2, r1, r5)
            goto L_0x0127
        L_0x0124:
            r1.setVisibility(r4)
        L_0x0127:
            android.widget.TextView r1 = r14.f51152H
            java.lang.String r2 = r15.f51263B
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0149
            java.lang.String r2 = r15.f51264C
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x013a
            goto L_0x0149
        L_0x013a:
            android.content.Context r2 = r13.getContext()
            r5 = 2131822792(0x7f1108c8, float:1.9278365E38)
            java.lang.String r2 = r2.getString(r5)
            r1.setText(r2)
            goto L_0x0162
        L_0x0149:
            boolean r2 = r0.mo71295g()
            if (r2 == 0) goto L_0x015d
            java.lang.String r2 = r15.f51264C
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x015d
            java.lang.String r2 = r15.f51264C
            r1.setText(r2)
            goto L_0x0162
        L_0x015d:
            java.lang.String r2 = r15.f51263B
            r1.setText(r2)
        L_0x0162:
            android.content.Context r2 = r13.getContext()
            r5 = 2131165652(0x7f0701d4, float:1.7945527E38)
            int r2 = kg3.C76577a.m92155f(r2, r5)
            float r2 = (float) r2
            android.content.Context r5 = r13.getContext()
            float r5 = kg3.C76577a.m92161l(r5)
            float r2 = r2 * r5
            r1.setTextSize(r6, r2)
            fy0.i r2 = fy0.C8219i.f27144a
            r2.mo9271b(r1)
            android.content.Context r5 = r13.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r7 = 2131100168(0x7f060208, float:1.781271E38)
            int r5 = r5.getColor(r7)
            r1.setTextColor(r5)
            android.content.Context r13 = r13.getContext()
            java.lang.String r1 = "context"
            gy3.C87412m.m108594g(r13, r1)
            te3.gr4 r1 = fx0.C45825h.m51115f()
            if (r1 == 0) goto L_0x0218
            int r5 = r1.f134231u
            if (r5 != r3) goto L_0x0218
            boolean r0 = r0.mo71295g()
            if (r0 == 0) goto L_0x01ac
            goto L_0x0218
        L_0x01ac:
            java.lang.String r0 = r1.f134232v
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x020d
            android.widget.TextView r0 = r14.f51158N
            java.lang.String r5 = r1.f134232v
            r0.setText(r5)
            android.widget.TextView r0 = r14.f51158N
            r5 = 2131165208(0x7f070018, float:1.7944627E38)
            int r5 = kg3.C76577a.m92155f(r13, r5)
            float r5 = (float) r5
            float r7 = kg3.C76577a.m92161l(r13)
            float r5 = r5 * r7
            r0.setTextSize(r6, r5)
            android.widget.TextView r0 = r14.f51158N
            r2.mo9271b(r0)
            android.widget.TextView r0 = r14.f51158N
            kw0.a r2 = kw0.C46746a.f125826a
            java.lang.String r1 = r1.f134232v
            int r1 = r1.length()
            float r2 = kg3.C76577a.m92165p(r13)
            float r13 = kg3.C76577a.m92174y(r13)
            int r13 = java.lang.Float.compare(r2, r13)
            r2 = 2
            if (r13 <= 0) goto L_0x01f6
            if (r1 >= r2) goto L_0x01f2
            r13 = 2131233275(0x7f0809fb, float:1.8082683E38)
            goto L_0x01ff
        L_0x01f2:
            r13 = 2131231215(0x7f0801ef, float:1.8078505E38)
            goto L_0x01ff
        L_0x01f6:
            if (r1 >= r2) goto L_0x01fc
            r13 = 2131231214(0x7f0801ee, float:1.8078503E38)
            goto L_0x01ff
        L_0x01fc:
            r13 = 2131231213(0x7f0801ed, float:1.80785E38)
        L_0x01ff:
            r0.setBackgroundResource(r13)
            android.widget.TextView r13 = r14.f51158N
            r13.setVisibility(r6)
            android.widget.ImageView r13 = r14.f51159P
            r13.setVisibility(r4)
            goto L_0x0222
        L_0x020d:
            android.widget.TextView r13 = r14.f51158N
            r13.setVisibility(r4)
            android.widget.ImageView r13 = r14.f51159P
            r13.setVisibility(r6)
            goto L_0x0222
        L_0x0218:
            android.widget.ImageView r13 = r14.f51159P
            r13.setVisibility(r4)
            android.widget.TextView r13 = r14.f51158N
            r13.setVisibility(r4)
        L_0x0222:
            boolean r13 = r15.f51256t
            if (r13 == 0) goto L_0x023a
            te3.gr4 r13 = fx0.C45825h.m51115f()
            if (r13 == 0) goto L_0x0231
            int r13 = r13.f134231u
            if (r13 != r3) goto L_0x0231
            goto L_0x0232
        L_0x0231:
            r3 = 0
        L_0x0232:
            if (r3 != 0) goto L_0x023a
            android.widget.ImageView r13 = r14.f51154J
            r13.setVisibility(r6)
            goto L_0x023f
        L_0x023a:
            android.widget.ImageView r13 = r14.f51154J
            r13.setVisibility(r4)
        L_0x023f:
            android.widget.ImageView r13 = r14.f51155K
            r13.setVisibility(r6)
        L_0x0244:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.BizTimeLineHotListView.m19042E1(com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView, com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotListView$e, com.tencent.mm.plugin.brandservice.ui.timeline.offenread.s):void");
    }

    /* renamed from: F1 */
    public void mo22999F1(List<C18468r> list) {
        if (list != null) {
            C18468r rVar = new C18468r(2);
            rVar.f354229d = "__BizTimeLine.CustomItem__";
            list.add(0, rVar);
            if (!this.f51126M1 && C45825h.m51116h()) {
                Log.m105924i("MicroMsg.BizTimeLineHotListView", "alvinluo addCustomItems timeline top bar entry is open");
                C18469s sVar = new C18469s(3);
                gr4 f = C45825h.m51115f();
                if (f != null) {
                    sVar.f354229d = "__BizTimeLine.VideoChannelEntry__";
                    mo23008O1(sVar, f);
                    list.add(1, sVar);
                    sVar.f51253q = 1;
                    this.f51123J1 = true;
                }
            }
        }
    }

    /* renamed from: G1 */
    public void mo23000G1(Context context, List<C18468r> list, C18471v vVar, C18440a0 a0Var, boolean z) {
        this.f51124K1 = vVar;
        this.f51125L1 = a0Var;
        this.f51126M1 = z;
        ((ArrayList) this.f51118E1).addAll(list);
        mo22999F1(this.f51118E1);
        this.f51117D1 = z ? new C18428c() : new C18432d();
        C18426a aVar = new C18426a(this, getContext());
        aVar.mo16974W(0);
        setLayoutManager(aVar);
        setAdapter(this.f51117D1);
        C18472y yVar = new C18472y(getCustomItemCount());
        this.f51116C1 = yVar;
        int i = C18466p.f51248c;
        yVar.f51273d = context;
        yVar.f51274e = this;
        yVar.f51281o = i;
        mo17098m1(yVar);
        yVar.f51274e.mo17043c(yVar);
        yVar.f51285s = (LinearLayoutManager) yVar.f51274e.getLayoutManager();
        yVar.f51278i = new C85110w(yVar, yVar.f51274e.getContext());
        yVar.f51279j = new C85111x(yVar, yVar.f51274e.getContext());
        setOnScrollPageListener(new C18459h(this));
        setOnItemClickListener(new C18457f(this));
        if (!z) {
            this.f51130Q1.alive();
            this.f51131R1.alive();
        }
    }

    /* renamed from: H1 */
    public void mo23001H1(String str, String str2) {
        if ((!Util.isNullOrNil(str) || !Util.isNullOrNil(str2)) && !Util.isNullOrNil((List) this.f51118E1)) {
            for (C18468r next : this.f51118E1) {
                if (!Util.isNullOrNil(str)) {
                    if (Util.isEqual(str, next.f354229d)) {
                        C19428d.f54856a.mo25189x(next.f354229d, next.f354232g);
                        mo23003J1(next);
                        return;
                    }
                } else if (!Util.isNullOrNil(str2) && Util.isEqual(str2, next.f354232g)) {
                    C19428d.f54856a.mo25189x(next.f354229d, next.f354232g);
                    mo23003J1(next);
                    return;
                }
            }
        }
    }

    /* renamed from: I1 */
    public void mo23002I1(List<C18468r> list, boolean z) {
        C18440a0 a0Var;
        ArrayList arrayList = new ArrayList(list);
        mo22999F1(arrayList);
        Log.m105925i("MicroMsg.BizTimeLineHotListView", "alvinluo refreshData new list: %d, old list: %d, configurationChanged: %b", Integer.valueOf(arrayList.size()), Integer.valueOf(((ArrayList) this.f51118E1).size()), Boolean.valueOf(z));
        C18467q qVar = new C18467q(this.f51118E1, arrayList);
        if (z) {
            qVar.f51251c = true;
        }
        C54248l.C54251c a = C54248l.m60949a(qVar, true);
        ((ArrayList) this.f51118E1).clear();
        ((ArrayList) this.f51118E1).addAll(arrayList);
        for (int i = 0; i < ((ArrayList) this.f51118E1).size(); i++) {
            ((C18468r) ((ArrayList) this.f51118E1).get(i)).f51254r = i;
        }
        a.mo75046b(this.f51117D1);
        if (!this.f51126M1 && (a0Var = this.f51125L1) != null) {
            if (this.f51123J1) {
                int itemPadding = getItemPadding();
                int a2 = C18466p.m19102a(getContext());
                float f = (float) ((itemPadding / 2) + a2);
                this.f51127N1 = f;
                Log.m105919d("MicroMsg.BizTimeLineHotListView", "updateTitlePos originalPaddingLeft=%s， width=%d", Float.valueOf(f), Integer.valueOf(a2));
                this.f51125L1.setOftenReadTitlePaddingLeft(this.f51127N1);
                this.f51125L1.setVideoTitlePaddingLeft((float) f51108T1);
                float f2 = (float) ((a2 / 2) - f51108T1);
                this.f51128O1 = f2;
                Log.m105919d("MicroMsg.BizTimeLineHotListView", "updateTitlePos originalVideoIconMiddle=%s", Float.valueOf(f2));
                return;
            }
            a0Var.setOftenReadTitlePaddingLeft((float) f51108T1);
            this.f51125L1.mo23046x0();
        }
    }

    /* renamed from: J1 */
    public void mo23003J1(C18468r rVar) {
        if (rVar != null) {
            C18434e eVar = (C18434e) mo17023I0(rVar.f51253q);
            if (eVar == null) {
                Log.m105921e("MicroMsg.BizTimeLineHotListView", "refreshUnread %s", rVar.f354229d);
                return;
            }
            mo23011R1(rVar, eVar);
        }
    }

    /* renamed from: K0 */
    public boolean mo17025K0(int i, int i2) {
        C18472y yVar = this.f51116C1;
        int b = yVar.mo23081b(yVar.f51275f + i);
        BizTimeLineHotListView bizTimeLineHotListView = yVar.f51274e;
        if (bizTimeLineHotListView != null && yVar.f51291y) {
            yVar.f51279j.f44872a = b;
            yVar.f51292z = true;
            bizTimeLineHotListView.getLayoutManager().startSmoothScroll(yVar.f51279j);
        }
        return super.mo17025K0(i, i2);
    }

    /* renamed from: K1 */
    public void mo23004K1(C18468r rVar) {
        if (rVar != null && !this.f51126M1) {
            C18434e eVar = (C18434e) mo17023I0(rVar.f51253q);
            if (eVar == null) {
                Log.m105921e("MicroMsg.BizTimeLineHotListView", "refreshUnread %s", rVar.f354229d);
                return;
            }
            mo23007N1(rVar, eVar.f51154J);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* renamed from: L1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23005L1() {
        /*
            r17 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r17
            java.util.List<com.tencent.mm.plugin.brandservice.ui.timeline.offenread.r> r2 = r1.f51118E1
            r0.addAll(r2)
            int r2 = r17.getCurrentPage()
            int r3 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18472y.m19113a(r2)
            int r4 = r2 + 1
            int r5 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18466p.f51248c
            int r4 = r4 * r5
            r5 = 1
            int r4 = r4 + r5
            if (r2 != 0) goto L_0x0021
            r2 = r1
            goto L_0x01cc
        L_0x0021:
            r2 = r1
        L_0x0022:
            if (r3 > r4) goto L_0x01cf
            int r6 = r0.size()
            if (r3 >= r6) goto L_0x01cf
            java.lang.Object r6 = r0.get(r3)
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.r r6 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18468r) r6
            if (r6 != 0) goto L_0x0034
            goto L_0x01cc
        L_0x0034:
            boolean r7 = r2.f51126M1
            r8 = 0
            if (r7 != 0) goto L_0x0065
            com.tencent.mm.pluginsdk.model.d r7 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
            java.lang.String r9 = com.tencent.p014mm.pluginsdk.model.C19428d.f54877v
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x0044
            goto L_0x0065
        L_0x0044:
            java.lang.String r9 = r6.f354229d
            boolean r7 = r7.mo25186u(r9)
            if (r7 == 0) goto L_0x0067
            boolean r7 = r2.f51132S1
            if (r7 != 0) goto L_0x0051
            goto L_0x0067
        L_0x0051:
            r2.f51132S1 = r8
            zt3.t r7 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.e r9 = new com.tencent.mm.plugin.brandservice.ui.timeline.offenread.e
            r9.<init>(r2, r6)
            r10 = 2000(0x7d0, double:9.88E-321)
            zt3.j r7 = (zt3.C119157j) r7
            r7.getClass()
            r7.mo183892w(r9, r10, r8)
            goto L_0x0067
        L_0x0065:
            r2.f51132S1 = r8
        L_0x0067:
            com.tencent.mm.plugin.brandservice.ui.timeline.offenread.v r7 = r2.f51124K1
            boolean r9 = r2.f51126M1
            r7.getClass()
            int r10 = r6.f51255s
            r11 = 1000(0x3e8, double:4.94E-321)
            r13 = 2
            if (r10 != r5) goto L_0x0128
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r14 = r6.f354229d
            r10.append(r14)
            java.lang.String r14 = "-isFinderLive:"
            r10.append(r14)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            java.util.HashMap<java.lang.String, te3.q53> r14 = r7.f51270a
            java.lang.Object r14 = r14.get(r10)
            te3.q53 r14 = (te3.C22525q53) r14
            if (r14 != 0) goto L_0x0121
            te3.q53 r14 = new te3.q53
            r14.<init>()
            java.lang.String r15 = r6.f354229d
            r14.f64473d = r15
            boolean r15 = r6.f51256t
            r14.f64474e = r15
            long r15 = java.lang.System.currentTimeMillis()
            long r11 = r15 / r11
            int r12 = (int) r11
            r14.f64476g = r12
            int r11 = r6.f51253q
            int r11 = r11 - r5
            r14.f64475f = r11
            r14.f64477h = r5
            r14.f64478i = r8
            r14.f64485s = r9
            if (r9 == 0) goto L_0x00ba
        L_0x00b8:
            r11 = 1
            goto L_0x00d2
        L_0x00ba:
            java.lang.String r11 = r6.f354232g
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 == 0) goto L_0x00c4
            r11 = 0
            goto L_0x00d2
        L_0x00c4:
            com.tencent.mm.pluginsdk.model.d r11 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
            java.lang.String r12 = r6.f354229d
            java.lang.String r15 = r6.f354232g
            boolean r11 = r11.mo25187v(r12, r15)
            if (r11 == 0) goto L_0x00d1
            goto L_0x00b8
        L_0x00d1:
            r11 = 2
        L_0x00d2:
            r14.f64486t = r11
            java.lang.String r11 = r6.f354232g
            r14.f64487u = r11
            int r11 = r6.f354235j
            r14.f64488v = r11
            int r11 = r6.f51252A
            if (r11 != r13) goto L_0x00e2
            r11 = 1
            goto L_0x00e3
        L_0x00e2:
            r11 = 0
        L_0x00e3:
            r14.f64491y = r11
            java.util.HashMap<java.lang.String, te3.q53> r11 = r7.f51270a
            r11.put(r10, r14)
            if (r9 != 0) goto L_0x00f7
            com.tencent.mm.pluginsdk.model.d r7 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
            java.lang.String r8 = r6.f354229d
            java.lang.String r6 = r6.f354232g
            r7.mo25150C(r8, r6)
            goto L_0x01cc
        L_0x00f7:
            boolean r7 = r7.f51272c
            r14.f64489w = r7
            boolean r7 = r6.f51257u
            r14.f64490x = r7
            com.tencent.mm.pluginsdk.model.d r7 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
            java.lang.String r9 = r6.f354229d
            java.lang.String r6 = r6.f354232g
            if (r9 != 0) goto L_0x0109
            goto L_0x01cc
        L_0x0109:
            if (r6 != 0) goto L_0x010d
            goto L_0x01cc
        L_0x010d:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = r7.mo25176k()
            java.lang.String r10 = "showLiveBarWhenExpose"
            boolean r7 = r7.decodeBool(r10, r8)
            if (r7 != 0) goto L_0x01cc
            java.util.HashMap<java.lang.String, java.lang.String> r7 = com.tencent.p014mm.pluginsdk.model.C19428d.f54861f
            r7.put(r9, r6)
            goto L_0x01cc
        L_0x0121:
            int r6 = r14.f64477h
            int r6 = r6 + r5
            r14.f64477h = r6
            goto L_0x01cc
        L_0x0128:
            r9 = 3
            if (r10 != r9) goto L_0x01cc
            te3.q53 r10 = new te3.q53
            r10.<init>()
            long r14 = java.lang.System.currentTimeMillis()
            long r11 = r14 / r11
            int r12 = (int) r11
            r10.f64476g = r12
            int r11 = r6.f51253q
            int r11 = r11 - r5
            r10.f64475f = r11
            r10.f64477h = r5
            fx0.h r11 = fx0.C45825h.f123727a
            boolean r12 = r11.mo71294e()
            if (r12 == 0) goto L_0x014a
            r12 = 2
            goto L_0x014b
        L_0x014a:
            r12 = 1
        L_0x014b:
            r10.f64478i = r12
            java.lang.String r12 = r11.mo71290a(r8)
            r10.f64479j = r12
            java.lang.String r12 = r11.mo71290a(r8)
            java.lang.String r12 = p243tn.C14050a.m13405b(r12)
            boolean r12 = com.tencent.p014mm.vfs.C86013q1.m106450k(r12)
            r10.f64481o = r12
            te3.gr4 r12 = fx0.C45825h.m51115f()
            if (r12 != 0) goto L_0x016a
            java.lang.String r12 = ""
            goto L_0x016c
        L_0x016a:
            java.lang.String r12 = r12.f134223j
        L_0x016c:
            r10.f64480n = r12
            te3.gr4 r12 = fx0.C45825h.m51115f()
            if (r12 != 0) goto L_0x0176
        L_0x0174:
            r9 = 0
            goto L_0x0187
        L_0x0176:
            boolean r16 = r11.mo71295g()
            if (r16 != 0) goto L_0x0186
            java.lang.String r9 = r12.f134220g
            java.lang.String r12 = r12.f134222i
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r9, (java.lang.String) r12)
            if (r9 == 0) goto L_0x0174
        L_0x0186:
            r9 = 1
        L_0x0187:
            r10.f64482p = r9
            int r9 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18471v.f51269d
            int r12 = r9 + 1
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18471v.f51269d = r12
            r10.f64483q = r9
            r10.f64484r = r14
            java.util.HashMap<java.lang.String, te3.q53> r7 = r7.f51270a
            java.lang.String r6 = r6.f354229d
            r7.put(r6, r10)
            boolean r6 = r11.mo71294e()
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 21258(0x530a, float:2.9789E-41)
            r11 = 5
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            r11[r8] = r12
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            r11[r5] = r12
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11[r13] = r8
            java.lang.String r8 = r10.f64479j
            com.tencent.mm.sdk.platformtools.QueueWorkerThread r10 = com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2.f121005a
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.WebViewUtilities.doUrlEncode(r8)
            r10 = 3
            r11[r10] = r8
            r8 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r11[r8] = r6
            r7.mo160131h(r9, r11)
        L_0x01cc:
            int r3 = r3 + r5
            goto L_0x0022
        L_0x01cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.BizTimeLineHotListView.mo23005L1():void");
    }

    /* renamed from: M1 */
    public void mo23006M1() {
        C18472y yVar = this.f51116C1;
        if (yVar != null) {
            RecyclerView.LayoutManager layoutManager = yVar.f51274e.getLayoutManager();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(layoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineViewPagerHelper", "resetToFirstPage", "()V", "Undefined", "scrollToPosition", "(I)V");
            layoutManager.scrollToPosition(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(layoutManager, "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineViewPagerHelper", "resetToFirstPage", "()V", "Undefined", "scrollToPosition", "(I)V");
            yVar.f51275f = 0;
            yVar.f51276g = 0;
            yVar.f51277h = 0;
            yVar.f51280n = 0;
        }
    }

    /* renamed from: N1 */
    public void mo23007N1(C18468r rVar, View view) {
        if (view == null || rVar == null) {
            Log.m105924i("MicroMsg.BizTimeLineHotListView", "green dot erro, null!");
        } else if (rVar.f51261y || rVar.f51256t) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView", "setUnreadGreenDot", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotViewInfo;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView", "setUnreadGreenDot", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotViewInfo;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView", "setUnreadGreenDot", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotViewInfo;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView", "setUnreadGreenDot", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotViewInfo;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: O1 */
    public final void mo23008O1(C18469s sVar, gr4 gr4) {
        if (sVar != null && gr4 != null) {
            sVar.f51263B = gr4.f134217d;
            sVar.f51264C = gr4.f134229s;
            sVar.f51265D = gr4.f134218e;
            sVar.f354230e = gr4.f134220g;
            sVar.f51266E = gr4.f134219f;
            int i = gr4.f134221h;
            sVar.f51267F = i;
            sVar.f51268G = gr4.f134225o;
            boolean z = false;
            if (i > 0) {
                int decodeInt = MultiProcessMMKV.getSingleMMKV("MicroMsg.BizTimeLineHotListView").decodeInt("VideoChannelTopBarVersion", 0);
                Log.m105925i("MicroMsg.BizTimeLineHotListView", "getVideoChannelUnReadState, version: %d, lastVersion: %d", Integer.valueOf(i), Integer.valueOf(decodeInt));
                if (i > decodeInt) {
                    z = true;
                }
            }
            sVar.f51256t = z;
        }
    }

    /* renamed from: P1 */
    public final void mo23009P1(C18434e eVar) {
        eVar.f51148D.setVisibility(0);
        View view = eVar.f51151G;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView", "showNativeView", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView$HotListViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView", "showNativeView", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView$HotListViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        BizTLRecCardCanvasView bizTLRecCardCanvasView = eVar.f51157M;
        if (bizTLRecCardCanvasView != null) {
            bizTLRecCardCanvasView.setVisibility(8);
        }
    }

    /* renamed from: Q1 */
    public final void mo23010Q1(RecyclerView.C16631z zVar, int i) {
        RecyclerView.C16631z zVar2 = zVar;
        Log.m105919d("MicroMsg.BizTimeLineHotListView", "alvinluo updateAlpha pos: %d", Integer.valueOf(i));
        if (zVar2 != null) {
            float x = zVar2.f44854d.getX();
            if (x >= ((float) (this.f51121H1 - (getItemWidth() / 2)))) {
                View view = zVar2.f44854d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(0.3f));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView", "updateAlpha", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView", "updateAlpha", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                return;
            }
            if (x < ((float) (this.f51121H1 - (getItemWidth() / 2)))) {
                float f = this.f51120G1;
                if (x >= f) {
                    float f2 = 1.0f - (((x - f) / ((float) this.f51122I1)) * 0.7f);
                    Log.m105919d("MicroMsg.BizTimeLineHotListView", "alvinluo updateAlpha %f", Float.valueOf(f2));
                    View view3 = zVar2.f44854d;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(Float.valueOf(f2));
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView", "updateAlpha", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView", "updateAlpha", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    return;
                }
            }
            View view5 = zVar2.f44854d;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView", "updateAlpha", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/brandservice/ui/timeline/offenread/BizTimeLineHotListView", "updateAlpha", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* renamed from: R1 */
    public final void mo23011R1(C18468r rVar, C18434e eVar) {
        if (!this.f51126M1) {
            C19428d dVar = C19428d.f54856a;
            if (!dVar.mo25179n() || (Util.isNullOrNil(rVar.f354232g) && !dVar.mo25186u(rVar.f354229d))) {
                eVar.f51161R.setVisibility(8);
                eVar.f51162S.setVisibility(8);
                eVar.f51162S.setContentDescription("");
                return;
            }
            if (dVar.mo25187v(rVar.f354229d, rVar.f354232g)) {
                eVar.f51161R.setVisibility(0);
                BizTagTextView bizTagTextView = eVar.f51162S;
                bizTagTextView.setContentDescription(bizTagTextView.getText());
            } else {
                eVar.f51161R.setVisibility(8);
                eVar.f51162S.setContentDescription("");
            }
            eVar.f51162S.setVisibility(0);
            eVar.f51162S.setTextSize(1, 8.0f);
            BizTagTextView bizTagTextView2 = eVar.f51162S;
            bizTagTextView2.f197542j = Math.round(bizTagTextView2.getTextSize());
            eVar.f51162S.setFillColor(getContext().getResources().getColor(C0966R.color.f3118fx));
            if (C76577a.m92165p(MMApplicationContext.getContext()) > 1.4f) {
                eVar.f51162S.setTextSize(1, 11.0f);
                BizTagTextView bizTagTextView3 = eVar.f51162S;
                bizTagTextView3.setPadding(bizTagTextView3.getPaddingLeft(), C76577a.m92151b(getContext(), 3), eVar.f51162S.getPaddingRight(), C76577a.m92151b(getContext(), 2));
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) eVar.f51162S.getLayoutParams();
                layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, C76577a.m92151b(getContext(), 3));
                eVar.f51162S.setLayoutParams(layoutParams);
            }
        }
    }

    public void dead() {
        Log.m105918d("MicroMsg.BizTimeLineHotListView", "dead");
        C119179t tVar = C119157j.f356862d;
        C18427b bVar = new C18427b();
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(bVar, 3000, false);
    }

    public int getCurrentPage() {
        C18472y yVar = this.f51116C1;
        if (yVar != null) {
            return yVar.f51280n;
        }
        return 0;
    }

    public int getCustomItemCount() {
        return 1;
    }

    public int getDataCount() {
        return this.f51118E1.size();
    }

    public int getItemPadding() {
        return C18466p.m19103b(getContext(), C18466p.f51247b);
    }

    public int getItemWidth() {
        return C18466p.m19104c(getContext());
    }

    public int getShowCount() {
        if (this.f51126M1) {
            return 30;
        }
        return this.f51123J1 ? C18466p.f51246a + 1 : C18466p.f51246a;
    }

    public float getShowCountPerPage() {
        return C18466p.f51247b;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.m105918d("MicroMsg.BizTimeLineHotListView", "onDetachedFromWindow");
    }

    public void setOnScrollPageListener(C18472y.C18473a aVar) {
        C18472y yVar = this.f51116C1;
        if (yVar != null) {
            yVar.f51288v = aVar;
        }
    }

    /* renamed from: y1 */
    public final void mo23020y1() {
        Log.m105926v("MicroMsg.BizTimeLineHotListView", "alvinluo init");
        if (getContext() instanceof MMFragmentActivity) {
            ((MMFragmentActivity) getContext()).keep(this);
        }
        f51109U1 = C76577a.m92151b(getContext(), 90);
        f51110V1 = C76577a.m92151b(getContext(), 30);
        C76577a.m92151b(getContext(), 12);
        f51111W1 = C76577a.m92151b(getContext(), 8);
        f51112X1 = C76577a.m92151b(getContext(), 6);
        f51113Y1 = C76577a.m92151b(getContext(), 7);
        f51114Z1 = C76577a.m92151b(getContext(), 4);
        f51108T1 = C76577a.m92151b(getContext(), 16);
        setItemAnimator((RecyclerView.C16616j) null);
    }

    public C18432d getAdapter() {
        return this.f51117D1;
    }

    public BizTimeLineHotListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C40008f fVar = C40008f.f107254d;
        this.f51130Q1 = new IListener<BizTimeLineTopBarVideoChannelEntryChangedEvent>(fVar) {
            {
                this.__eventId = 1183885262;
            }

            public boolean callback(IEvent iEvent) {
                BizTimeLineTopBarVideoChannelEntryChangedEvent bizTimeLineTopBarVideoChannelEntryChangedEvent = (BizTimeLineTopBarVideoChannelEntryChangedEvent) iEvent;
                if (bizTimeLineTopBarVideoChannelEntryChangedEvent != null) {
                    BizTimeLineHotListView bizTimeLineHotListView = BizTimeLineHotListView.this;
                    if (!bizTimeLineHotListView.f51126M1 && bizTimeLineHotListView.f51118E1 != null) {
                        Log.m105925i("MicroMsg.BizTimeLineHotListView", "alvinluo onTopBarVideoChannelEntryChanged switchOption: %d, list: %d", Integer.valueOf(bizTimeLineTopBarVideoChannelEntryChangedEvent.f107385d.f107386a), Integer.valueOf(((ArrayList) BizTimeLineHotListView.this.f51118E1).size()));
                        if (C45825h.m51116h()) {
                            if (((ArrayList) BizTimeLineHotListView.this.f51118E1).size() > 1) {
                                C18468r rVar = (C18468r) ((ArrayList) BizTimeLineHotListView.this.f51118E1).get(1);
                                if (rVar.f51255s != 3 || !(rVar instanceof C18469s)) {
                                    BizTimeLineHotListView bizTimeLineHotListView2 = BizTimeLineHotListView.this;
                                    BizTimeLineHotListView.m19041D1(bizTimeLineHotListView2, bizTimeLineHotListView2.f51118E1, bizTimeLineTopBarVideoChannelEntryChangedEvent);
                                } else {
                                    BizTimeLineHotListView bizTimeLineHotListView3 = BizTimeLineHotListView.this;
                                    C18469s sVar = (C18469s) rVar;
                                    bizTimeLineHotListView3.getClass();
                                    sVar.f354229d = "";
                                    bizTimeLineHotListView3.mo23008O1(sVar, bizTimeLineTopBarVideoChannelEntryChangedEvent.f107385d.f107387b);
                                    C18432d dVar = bizTimeLineHotListView3.f51117D1;
                                    if (dVar != null) {
                                        dVar.notifyItemChanged(1);
                                    }
                                }
                            } else if (((ArrayList) BizTimeLineHotListView.this.f51118E1).size() == 1) {
                                BizTimeLineHotListView bizTimeLineHotListView4 = BizTimeLineHotListView.this;
                                BizTimeLineHotListView.m19041D1(bizTimeLineHotListView4, bizTimeLineHotListView4.f51118E1, bizTimeLineTopBarVideoChannelEntryChangedEvent);
                            }
                        } else if (((ArrayList) BizTimeLineHotListView.this.f51118E1).size() > 1) {
                            C18468r rVar2 = (C18468r) ((ArrayList) BizTimeLineHotListView.this.f51118E1).get(1);
                            if (rVar2.f51255s == 3 && (rVar2 instanceof C18469s)) {
                                ((ArrayList) BizTimeLineHotListView.this.f51118E1).remove(1);
                                BizTimeLineHotListView bizTimeLineHotListView5 = BizTimeLineHotListView.this;
                                bizTimeLineHotListView5.f51123J1 = false;
                                C18432d dVar2 = bizTimeLineHotListView5.f51117D1;
                                if (dVar2 != null) {
                                    dVar2.notifyDataSetChanged();
                                }
                            }
                        }
                    }
                }
                return false;
            }
        };
        this.f51131R1 = new IListener<FinderLiveSwitchEvent>(fVar) {
            {
                this.__eventId = -1537763836;
            }

            public boolean callback(IEvent iEvent) {
                FinderLiveSwitchEvent finderLiveSwitchEvent = (FinderLiveSwitchEvent) iEvent;
                if (finderLiveSwitchEvent != null && !BizTimeLineHotListView.this.f51126M1) {
                    FinderLiveSwitchEvent.C55130a aVar = finderLiveSwitchEvent.f154791d;
                    if (aVar.f154792a == 4) {
                        Log.m105925i("MicroMsg.BizTimeLineHotListView", "on FinderLiveSwitchEvent %s", aVar.f154793b);
                        ((C119157j) C119157j.f356862d).mo183895z(new C18455d(this, finderLiveSwitchEvent));
                    }
                }
                return false;
            }
        };
        this.f51132S1 = true;
        mo23020y1();
    }
}

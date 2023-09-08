package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import di3.C86312j;
import fy3.C32224a;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import hb2.C59822f;
import hc0.C20937c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jq3.C60896i;
import jq3.C60898l;
import jq3.C60905o;
import jq3.C9493c;
import kg3.C76577a;
import ma2.C61454t;
import nb2.C61646d;
import ob0.C11385n;
import ob0.C117747y;
import p629ny.C76979h;
import p640ox.C77049b;
import p823sg.C90193h;
import rx3.C13601g;
import sx3.C64197v;
import te3.C64417hb1;
import te3.C64463jb1;
import te3.C64793w23;
import ya2.C66601e;
import z04.C119027c;

/* renamed from: com.tencent.mm.plugin.mv.ui.view.b */
public final class C57126b implements C11385n {

    /* renamed from: q */
    public static final int f163665q = C76577a.m92151b(MMApplicationContext.getContext(), 4);

    /* renamed from: d */
    public final Context f163666d;

    /* renamed from: e */
    public WxRecyclerView f163667e;

    /* renamed from: f */
    public final ArrayList<C57129c> f163668f = new ArrayList<>();

    /* renamed from: g */
    public final C66601e f163669g;

    /* renamed from: h */
    public TextView f163670h;

    /* renamed from: i */
    public final C13601g f163671i;

    /* renamed from: j */
    public List<Long> f163672j;

    /* renamed from: n */
    public C59822f f163673n;

    /* renamed from: o */
    public final View f163674o;

    /* renamed from: p */
    public C60898l.C60899a f163675p;

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.b$a */
    public static final class C57127a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C57126b f163676d;

        public C57127a(C57126b bVar) {
            this.f163676d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/MusicMvListDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f163676d.f163669g.mo90643c();
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvListDialog$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.b$b */
    public static final class C57128b implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ C57126b f163677d;

        public C57128b(C57126b bVar) {
            this.f163677d = bVar;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            C57129c cVar;
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g((C60905o) zVar, "holder");
            ArrayList<C57129c> arrayList = this.f163677d.f163668f;
            int i2 = 0;
            if (!(arrayList.size() > i)) {
                arrayList = null;
            }
            if (arrayList != null && (cVar = arrayList.get(i)) != null) {
                C57126b bVar = this.f163677d;
                if (!C87412m.m108589b(bVar.f163673n, cVar.f163679e)) {
                    bVar.f163673n = cVar.f163679e;
                    MusicMvMainUIC musicMvMainUIC = (MusicMvMainUIC) C39818r.f106831a.mo62443b(bVar.f163666d).mo75002a(MusicMvMainUIC.class);
                    C59822f fVar = cVar.f163679e;
                    musicMvMainUIC.getClass();
                    C87412m.m108594g(fVar, "musicMv");
                    Log.m105924i(musicMvMainUIC.f163267d, "start switchToMv from musicMv, dataList.size:" + musicMvMainUIC.f163270g.size());
                    Iterator<C61646d> it = musicMvMainUIC.f163270g.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C61646d next = it.next();
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            C64197v.m75542k();
                            throw null;
                        } else if (C87412m.m108589b(next.f175298d, fVar)) {
                            Log.m105924i(musicMvMainUIC.f163267d, "switchToMv index:" + i2);
                            musicMvMainUIC.mo80458n3(i2);
                            C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(musicMvMainUIC.getContext(), 7, C64793w23.class);
                            if (w232 != null) {
                                w232.f186033d = 12;
                            }
                            musicMvMainUIC.mo80448G3(i2);
                        } else {
                            i2 = i3;
                        }
                    }
                    eVar.notifyDataSetChanged();
                }
                bVar.f163669g.mo90643c();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.b$c */
    public static final class C57129c implements C9493c {

        /* renamed from: d */
        public final long f163678d;

        /* renamed from: e */
        public final C59822f f163679e;

        /* renamed from: f */
        public final int f163680f;

        public C57129c(long j, C59822f fVar, int i) {
            C87412m.m108594g(fVar, "musicMv");
            this.f163678d = j;
            this.f163679e = fVar;
            this.f163680f = i;
        }

        /* renamed from: c */
        public int mo75c() {
            return 5;
        }

        public long getItemId() {
            return this.f163678d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.b$d */
    public final class C57130d extends C60896i<C57129c> {
        public C57130d() {
        }

        /* renamed from: c */
        public int mo43c() {
            return C0966R.C0971layout.bij;
        }

        /* renamed from: e */
        public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
            C64417hb1 hb12;
            C64463jb1 jb12;
            TextView textView;
            C57129c cVar2 = (C57129c) cVar;
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(cVar2, "item");
            MMRoundCornerImageView mMRoundCornerImageView = (MMRoundCornerImageView) oVar.mo85812D(C0966R.C0970id.h8k);
            C59822f fVar = cVar2.f163679e;
            String str = fVar.f170754b;
            int i3 = 0;
            if (str != null) {
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59345a = true;
                bVar.f59353i = 1;
                C20828a.m22825b().mo32519h(str, mMRoundCornerImageView, bVar.mo32666a());
            } else {
                String str2 = fVar.f170757e;
                String str3 = !(str2 == null || str2.length() == 0) ? cVar2.f163679e.f170757e : null;
                if (str3 != null) {
                    C20937c.C20939b bVar2 = new C20937c.C20939b();
                    C61454t tVar = C61454t.f174766a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("thumb_");
                    byte[] bytes = str3.getBytes(C119027c.f356488a);
                    C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                    sb.append(C90193h.m112878f(bytes));
                    String i4 = new C86009m1(tVar.mo86430b(sb.toString())).mo119971i();
                    C87412m.m108593f(i4, "VFSFile(MusicFileNameUti…Array())}\")).absolutePath");
                    bVar2.f59350f = i4;
                    bVar2.f59346b = true;
                    bVar2.f59345a = true;
                    bVar2.f59365u = (float) C57126b.f163665q;
                    C20828a.m22825b().mo32519h(str3, mMRoundCornerImageView, bVar2.mo32666a());
                }
            }
            FinderObject d = C59822f.f170752A.mo84779d(cVar2.f163679e);
            if (d != null) {
                C57126b bVar3 = C57126b.this;
                FinderContact finderContact = d.contact;
                if (!(finderContact == null || (textView = (TextView) oVar.mo85812D(C0966R.C0970id.h8z)) == null)) {
                    Context context = bVar3.f163666d;
                    textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context, context.getString(C0966R.string.h4x, new Object[]{finderContact.nickname})));
                }
                FinderObjectDesc finderObjectDesc = d.objectDesc;
                if (!(finderObjectDesc == null || (hb12 = finderObjectDesc.mvInfo) == null || (jb12 = hb12.f183457f) == null)) {
                    String string = bVar3.f163666d.getString(C0966R.string.h4v, new Object[]{Integer.valueOf((int) ((float) Math.rint((double) (jb12.f183776e * ((float) 100)))))});
                    C87412m.m108593f(string, "context.getString(R.stri…etion_format, completion)");
                    TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.h8j);
                    if (textView2 != null) {
                        textView2.setText(string);
                    }
                }
                ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.hxr);
                if (imageView != null) {
                    imageView.setImageResource(C0966R.raw.float_ball_state_music);
                }
                ImageView imageView2 = (ImageView) oVar.mo85812D(C0966R.C0970id.hxr);
                if (imageView2 != null) {
                    if (!C87412m.m108589b(bVar3.f163673n, cVar2.f163679e)) {
                        i3 = 8;
                    }
                    imageView2.setVisibility(i3);
                }
                TextView textView3 = (TextView) oVar.mo85812D(C0966R.C0970id.h8q);
                WeImageView weImageView = (WeImageView) oVar.mo85812D(C0966R.C0970id.h8r);
                C59822f fVar2 = cVar2.f163679e;
                if (!fVar2.f170778z) {
                    int i5 = fVar2.f170763k;
                    int i6 = d.likeCount;
                    if (i5 != i6) {
                        if (textView3 != null) {
                            textView3.setText(String.valueOf(i5));
                        }
                    } else if (textView3 != null) {
                        textView3.setText(String.valueOf(i6));
                    }
                } else if (textView3 != null) {
                    textView3.setText(String.valueOf(cVar2.f163680f));
                }
                if (weImageView != null) {
                    weImageView.setImageResource(C0966R.raw.icons_filled_like);
                    weImageView.setIconColor(bVar3.f163666d.getResources().getColor(C0966R.color.f2975b6));
                }
            }
        }

        /* renamed from: f */
        public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(oVar, "holder");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.b$e */
    public static final class C57131e extends C87413o implements C32224a<WxRecyclerAdapter<C57129c>> {

        /* renamed from: d */
        public final /* synthetic */ C57126b f163682d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57131e(C57126b bVar) {
            super(0);
            this.f163682d = bVar;
        }

        public Object invoke() {
            return new WxRecyclerAdapter(new MusicMvListDialog$adapter$2$1(this.f163682d), this.f163682d.f163668f, true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.b$f */
    public static final class C57132f extends C87413o implements C32224a<LinearLayoutManager> {

        /* renamed from: d */
        public final /* synthetic */ C57126b f163683d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57132f(C57126b bVar) {
            super(0);
            this.f163683d = bVar;
        }

        public Object invoke() {
            return new LinearLayoutManager(this.f163683d.f163666d);
        }
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C57126b(android.content.Context r8) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r8, r0)
            r7.<init>()
            r7.f163666d = r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.f163668f = r0
            ya2.e r0 = new ya2.e
            r1 = 1
            r0.<init>(r8, r1)
            r7.f163669g = r0
            com.tencent.mm.plugin.mv.ui.view.b$e r2 = new com.tencent.mm.plugin.mv.ui.view.b$e
            r2.<init>(r7)
            rx3.g r2 = rx3.C36568h.m40985a(r2)
            r7.f163671i = r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = java.util.Collections.synchronizedList(r3)
            java.lang.String r4 = "synchronizedList(ArrayList())"
            gy3.C87412m.m108593f(r3, r4)
            r7.f163672j = r3
            com.tencent.mm.plugin.mv.ui.view.b$f r3 = new com.tencent.mm.plugin.mv.ui.view.b$f
            r3.<init>(r7)
            rx3.g r3 = rx3.C36568h.m40985a(r3)
            android.view.View r4 = r0.f191514f
            gy3.C87412m.m108591d(r4)
            r5 = 2131298242(0x7f0907c2, float:1.8214452E38)
            android.view.View r4 = r4.findViewById(r5)
            java.lang.String r5 = "rootView!!.findViewById(…ttom_sheet_custom_layout)"
            gy3.C87412m.m108593f(r4, r5)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            android.view.View r5 = r0.f191514f
            gy3.C87412m.m108591d(r5)
            android.content.Context r5 = r5.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            r6 = 2131496762(0x7f0c0f3a, float:1.8617098E38)
            r5.inflate(r6, r4, r1)
            android.view.View r1 = r0.f191514f
            r4 = 0
            if (r1 == 0) goto L_0x006f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            goto L_0x0070
        L_0x006f:
            r1 = r4
        L_0x0070:
            if (r1 != 0) goto L_0x0073
            goto L_0x007d
        L_0x0073:
            android.graphics.Point r5 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r8)
            int r5 = r5.y
            int r5 = r5 / 2
            r1.height = r5
        L_0x007d:
            android.view.View r1 = r0.f191514f
            if (r1 == 0) goto L_0x0089
            r5 = 2131299709(0x7f090d7d, float:1.8217427E38)
            android.view.View r1 = r1.findViewById(r5)
            goto L_0x008a
        L_0x0089:
            r1 = r4
        L_0x008a:
            if (r1 == 0) goto L_0x0094
            com.tencent.mm.plugin.mv.ui.view.b$a r5 = new com.tencent.mm.plugin.mv.ui.view.b$a
            r5.<init>(r7)
            r1.setOnClickListener(r5)
        L_0x0094:
            android.view.View r1 = r0.f191514f
            if (r1 == 0) goto L_0x00a2
            r5 = 2131315432(0x7f094ae8, float:1.8249317E38)
            android.view.View r1 = r1.findViewById(r5)
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L_0x00a3
        L_0x00a2:
            r1 = r4
        L_0x00a3:
            r7.f163670h = r1
            android.view.View r0 = r0.f191514f
            if (r0 == 0) goto L_0x00b3
            r1 = 2131309908(0x7f093554, float:1.8238113E38)
            android.view.View r0 = r0.findViewById(r1)
            r4 = r0
            com.tencent.mm.view.recyclerview.WxRecyclerView r4 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r4
        L_0x00b3:
            r7.f163667e = r4
            if (r4 != 0) goto L_0x00b8
            goto L_0x00c3
        L_0x00b8:
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r0 = r3.getValue()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            r4.setLayoutManager(r0)
        L_0x00c3:
            com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r7.f163667e
            if (r0 != 0) goto L_0x00c8
            goto L_0x00d4
        L_0x00c8:
            r1 = r2
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r1
            r0.setAdapter(r1)
        L_0x00d4:
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r0 = r2.getValue()
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r0
            com.tencent.mm.plugin.mv.ui.view.b$b r1 = new com.tencent.mm.plugin.mv.ui.view.b$b
            r1.<init>(r7)
            r0.f173488o = r1
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            r0 = 2131496768(0x7f0c0f40, float:1.861711E38)
            com.tencent.mm.view.recyclerview.WxRecyclerView r1 = r7.f163667e
            r2 = 0
            android.view.View r8 = r8.inflate(r0, r1, r2)
            java.lang.String r0 = "from(context).inflate(R.…_footer, mvListRV, false)"
            gy3.C87412m.m108593f(r8, r0)
            r7.f163674o = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.view.C57126b.<init>(android.content.Context):void");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("Music.Mv.MusicMvListDialog", "onSceneEnd errType:" + i + " errCode:" + i2 + " errMsg:" + str + " scene:" + yVar);
    }
}

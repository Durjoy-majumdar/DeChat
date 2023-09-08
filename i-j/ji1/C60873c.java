package ji1;

import al1.C54130j;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.core.view.LivePreviewView;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.ratio.RatioLayout;
import di3.C7335d;
import di3.C86312j;
import dl1.C58321a;
import gi1.C59463a;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import iq3.C60600b;
import j20.C117292a;
import java.util.HashMap;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import ki1.C61098b;
import ki1.C61100d;
import l60.C99344b;
import ok1.C62042e;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C11991t;
import pl1.C62345f;
import qj1.C62660c;
import si1.C63907i;
import sx3.C110818d0;
import te3.C64640px0;
import tf0.C64916p1;
import up1.C27696y;

/* renamed from: ji1.c */
public final class C60873c extends C60600b<C59463a> {

    /* renamed from: b */
    public final Context f173430b;

    /* renamed from: c */
    public final C62660c f173431c;

    /* renamed from: d */
    public final LivePreviewView f173432d;

    /* renamed from: e */
    public int f173433e = 1;

    /* renamed from: f */
    public final HashMap<String, C61100d> f173434f = new HashMap<>();

    /* renamed from: g */
    public LinkedList<C59463a> f173435g = new LinkedList<>();

    /* renamed from: h */
    public boolean f173436h;

    /* renamed from: i */
    public int f173437i;

    public C60873c(Context context, C62660c cVar, LivePreviewView livePreviewView) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(cVar, "basePlugin");
        C87412m.m108594g(livePreviewView, "previewView");
        this.f173430b = context;
        this.f173431c = cVar;
        this.f173432d = livePreviewView;
    }

    /* renamed from: a */
    public int mo85553a() {
        return this.f173435g.size();
    }

    /* renamed from: b */
    public Object mo85554b(int i) {
        C59463a aVar = this.f173435g.get(i);
        C87412m.m108593f(aVar, "audienceLinkMicUserList[pos]");
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (o40.C61926c.m72696u(r8.f169895b.f169905i, 2) != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        if (r2 != 0) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        r2 = 2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo85555c(int r7, java.lang.Object r8) {
        /*
            r6 = this;
            gi1.a r8 = (gi1.C59463a) r8
            java.lang.String r0 = "data"
            gy3.C87412m.m108594g(r8, r0)
            al1.j r0 = r8.f169894a
            r1 = 0
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = r0.f151997a
            goto L_0x0010
        L_0x000f:
            r0 = r1
        L_0x0010:
            qj1.c r2 = r6.f173431c
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            androidx.lifecycle.i0 r2 = r2.mo87696x0(r3)
            cl1.u r2 = (cl1.C55001u) r2
            te3.bq2 r2 = r2.f154419p
            java.lang.String r2 = r2.f182319n
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0029
            r2 = 3
            goto L_0x005c
        L_0x0029:
            al1.j r0 = r8.f169894a
            if (r0 == 0) goto L_0x005c
            gi1.f r0 = r8.f169895b
            boolean r0 = r0.f169904h
            if (r0 != 0) goto L_0x005c
            qj1.c r0 = r6.f173431c
            java.lang.Class<cl1.c0> r5 = cl1.C54949c0.class
            androidx.lifecycle.i0 r0 = r0.mo87696x0(r5)
            cl1.c0 r0 = (cl1.C54949c0) r0
            boolean r0 = r0.mo75864e3()
            if (r0 == 0) goto L_0x004e
            gi1.f r0 = r8.f169895b
            int r0 = r0.f169905i
            boolean r0 = o40.C61926c.m72696u(r0, r3)
            if (r0 == 0) goto L_0x005b
            goto L_0x0059
        L_0x004e:
            al1.j r0 = r8.f169894a
            if (r0 == 0) goto L_0x0057
            int r0 = r0.f152001e
            if (r0 != r4) goto L_0x0057
            r2 = 1
        L_0x0057:
            if (r2 == 0) goto L_0x005b
        L_0x0059:
            r2 = 1
            goto L_0x005c
        L_0x005b:
            r2 = 2
        L_0x005c:
            java.lang.String r0 = r8.mo84561a()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r0 = 95
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "getItemView pos: "
            r4.append(r5)
            r4.append(r7)
            java.lang.String r7 = " key: "
            r4.append(r7)
            r4.append(r0)
            java.lang.String r7 = " micMode: "
            r4.append(r7)
            int r7 = r6.f173433e
            r4.append(r7)
            java.lang.String r7 = " viewCache: "
            r4.append(r7)
            java.util.HashMap<java.lang.String, ki1.d> r7 = r6.f173434f
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            java.lang.String r4 = "MicDecorLayoutAdapter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
            gi1.f r7 = r8.f169895b
            boolean r7 = r7.f169904h
            if (r7 == 0) goto L_0x00b4
            si1.i r7 = new si1.i
            android.content.Context r8 = r6.f173430b
            r7.<init>(r8, r1, r3, r1)
            goto L_0x00ce
        L_0x00b4:
            java.util.HashMap<java.lang.String, ki1.d> r7 = r6.f173434f
            java.lang.Object r7 = r7.get(r0)
            ki1.d r7 = (ki1.C61100d) r7
            if (r7 != 0) goto L_0x00c9
            ki1.d r7 = new ki1.d
            android.content.Context r8 = r6.f173430b
            qj1.c r1 = r6.f173431c
            com.tencent.mm.live.core.view.LivePreviewView r3 = r6.f173432d
            r7.<init>(r8, r2, r1, r3)
        L_0x00c9:
            java.util.HashMap<java.lang.String, ki1.d> r8 = r6.f173434f
            r8.put(r0, r7)
        L_0x00ce:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ji1.C60873c.mo85555c(int, java.lang.Object):android.view.View");
    }

    /* renamed from: e */
    public RatioLayout.C57914a mo85557e(int i) {
        return this.f173435g.get(i).f169895b;
    }

    /* renamed from: h */
    public void mo85560h(int i, View view) {
        FinderObjectDesc finderObjectDesc;
        LinkedList<FinderMedia> linkedList;
        FinderMedia finderMedia;
        String str;
        FinderObjectDesc finderObjectDesc2;
        C64640px0 px02;
        int i2 = i;
        View view2 = view;
        C87412m.m108594g(view2, "view");
        if (view2 instanceof C61100d) {
            C61100d dVar = (C61100d) view2;
            C59463a aVar = this.f173435g.get(i2);
            C87412m.m108593f(aVar, "audienceLinkMicUserList[pos]");
            boolean z = this.f173436h;
            int i3 = this.f173433e;
            Class<C60200t1> cls = C60200t1.class;
            Class cls2 = C11990s0.class;
            dVar.f173977o = z;
            dVar.mo86032b("start bindData isAudioMode: " + z + " micMode: " + i3);
            String str2 = null;
            dVar.f173973h = aVar.f169894a;
            dVar.setCorner(0);
            int i4 = dVar.f173969d;
            String str3 = "";
            boolean z2 = true;
            if (i4 == 1) {
                dVar.f173972g.f175523b.setVisibility(8);
                dVar.f173972g.f175524c.setVisibility(8);
                C54130j jVar = dVar.f173973h;
                if (jVar != null) {
                    dVar.f173972g.f175530i.setVisibility(8);
                    dVar.f173972g.f175529h.setVisibility(8);
                    dVar.f173972g.f175526e.setVisibility(0);
                    dVar.f173972g.f175527f.setVisibility(0);
                    ImageView imageView = dVar.f173972g.f175526e;
                    C87412m.m108593f(imageView, "viewBinding.micHead");
                    if (C72996z1.m85817T4(jVar.f151999c)) {
                        C39818r rVar = C39818r.f106831a;
                        ((C11990s0) rVar.mo62446e(cls).mo62447c(cls2)).mo11872i2().mo85957c(new C62345f(jVar.f151998b, (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) rVar.mo62446e(cls).mo62447c(cls2)).mo11867O2(C11978e0.C11979a.AVATAR));
                    } else {
                        C39818r rVar2 = C39818r.f106831a;
                        ((C11990s0) rVar2.mo62446e(cls).mo62447c(cls2)).mo11865K1().mo85957c(new C62345f(jVar.f151998b, (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) rVar2.mo62446e(cls).mo62447c(cls2)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
                    }
                    ImageView imageView2 = dVar.f173972g.f175525d;
                    C87412m.m108593f(imageView2, "viewBinding.micBg");
                    dVar.mo86033c(jVar, imageView2);
                    TextView textView = dVar.f173972g.f175527f;
                    C7335d c = C86312j.m106911c(C64916p1.class);
                    C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                    TextView textView2 = dVar.f173972g.f175527f;
                    C87412m.m108593f(textView2, "viewBinding.micNickName");
                    textView.setText(C64916p1.C64917a.m76442i((C64916p1) c, textView2, C62042e.m72808l0(C62042e.f176370a, jVar.f151999c, jVar.f152000d, false, 4, (Object) null), 0, 4, (Object) null));
                    dVar.f173972g.f175528g.setText(str3);
                    dVar.f173972g.f175528g.setVisibility(8);
                }
            } else if (i4 != 2) {
                if (i4 == 3) {
                    Class cls3 = C54991o.class;
                    dVar.f173972g.f175529h.setVisibility(0);
                    dVar.f173972g.f175529h.setText(dVar.getContext().getResources().getString(C0966R.string.dg_));
                    dVar.f173972g.f175525d.setVisibility(8);
                    dVar.f173972g.f175526e.setVisibility(8);
                    if (z) {
                        dVar.f173972g.f175523b.setVisibility(8);
                        dVar.f173972g.f175524c.setVisibility(8);
                        if (dVar.f173972g.f175525d.getDrawable() == null || dVar.f173972g.f175525d.getVisibility() == 8) {
                            dVar.f173972g.f175525d.setVisibility(0);
                            FinderObject finderObject = ((C54991o) dVar.f173970e.mo87696x0(cls3)).f154341n;
                            if (!(finderObject == null || (finderObjectDesc2 = finderObject.objectDesc) == null || (px02 = finderObjectDesc2.liveDesc) == null)) {
                                str2 = px02.f184911d;
                            }
                            if (str2 == null || str2.length() == 0) {
                                FinderObject finderObject2 = ((C54991o) dVar.f173970e.mo87696x0(cls3)).f154341n;
                                if (!(finderObject2 == null || (finderObjectDesc = finderObject2.objectDesc) == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null || (str = finderMedia.url) == null)) {
                                    str3 = str;
                                }
                            } else {
                                str3 = str2;
                            }
                            String l3 = ((C54991o) dVar.f173970e.mo87696x0(cls3)).mo76010l3(str3);
                            if (!(l3 == null || l3.length() == 0)) {
                                z2 = false;
                            }
                            if (!z2) {
                                C99344b<C100810g0, Bitmap> a = ((C11990s0) C39818r.f106831a.mo62446e(cls).mo62447c(cls2)).mo11871f2().mo85955a(new C11991t(l3));
                                C61098b bVar = new C61098b(dVar);
                                a.getClass();
                                a.f291320d = bVar;
                                a.mo85951a();
                            }
                        }
                        dVar.f173972g.f175530i.setVisibility(8);
                    } else {
                        dVar.f173972g.f175525d.setVisibility(4);
                        dVar.f173972g.f175530i.setVisibility(0);
                        dVar.mo86034d();
                        dVar.mo86035e();
                    }
                }
            } else if (dVar.f173973h != null) {
                dVar.mo86034d();
                dVar.mo86035e();
                dVar.f173972g.f175530i.setVisibility(0);
                dVar.f173972g.f175526e.setVisibility(8);
                dVar.f173972g.f175527f.setVisibility(8);
            }
            int i5 = dVar.f173969d;
            if ((i5 != 3 || dVar.f173977o) && i5 != 2) {
                View view3 = dVar.f173972g.f175532k;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/mic/preview/widget/FinderLiveMicNewPreviewWidget", "checkShowBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/mic/preview/widget/FinderLiveMicNewPreviewWidget", "checkShowBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View view5 = dVar.f173972g.f175532k;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/mic/preview/widget/FinderLiveMicNewPreviewWidget", "checkShowBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/mic/preview/widget/FinderLiveMicNewPreviewWidget", "checkShowBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (view2 instanceof C63907i) {
            C63907i iVar = (C63907i) view2;
            C58321a aVar4 = C58321a.GRAB_EMPTY;
            C59463a aVar5 = this.f173435g.get(i2);
            C87412m.m108593f(aVar5, "audienceLinkMicUserList[pos]");
            iVar.mo86637c(aVar4, aVar5);
            iVar.mo88692h(C76577a.m92151b(this.f173430b, 16), 7.0f);
        }
    }
}

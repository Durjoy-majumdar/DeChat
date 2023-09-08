package ve1;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C31543z5;
import er1.C7878t0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k60.C60979d;
import kf1.C9833k9;
import kj2.C117407d;
import l60.C99342a;
import l60.C99344b;
import o40.C61926c;
import os1.C11739f;
import os1.C62165o;
import p629ny.C76979h;
import p749xh.C66261f3;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C62344b0;
import pl1.C62345f;
import rs1.C13442s8;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import sx3.C64197v;
import te3.C49712hj1;
import up1.C27696y;
import vp1.C65840n;
import wp1.C15585f;
import ye1.C66631m;
import ye1.C66634t;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: ve1.m8 */
public final class C65626m8 extends C60896i<C9833k9> {

    /* renamed from: e */
    public final C49712hj1 f188836e;

    /* renamed from: f */
    public final int f188837f;

    /* renamed from: g */
    public final C13601g f188838g = C36568h.m40985a(C14574b.f40376d);

    /* renamed from: ve1.m8$b */
    public static final class C14574b extends C87413o implements C32224a<C62165o> {

        /* renamed from: d */
        public static final C14574b f40376d = new C14574b();

        public C14574b() {
            super(0);
        }

        public Object invoke() {
            return (C62165o) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62165o.class);
        }
    }

    /* renamed from: ve1.m8$a */
    public static final class C65627a extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ C60905o f188839a;

        /* renamed from: b */
        public final /* synthetic */ C65626m8 f188840b;

        public C65627a(C60905o oVar, C65626m8 m8Var) {
            this.f188839a = oVar;
            this.f188840b = m8Var;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            C87412m.m108594g(view, "view");
            if (z) {
                try {
                    C9833k9 k9Var = (C9833k9) this.f188839a.f173503E;
                    if (k9Var != null) {
                        C65626m8 m8Var = this.f188840b;
                        LinkedList<FinderObject> linkedList = k9Var.f30387d.f184844h;
                        List<FinderObject> subList = linkedList.subList(0, Math.min(3, linkedList.size()));
                        C87412m.m108593f(subList, "it.card.`object`.subList…, it.card.`object`.size))");
                        String str = "";
                        for (FinderObject finderObject : subList) {
                            str = str + C61926c.m72691p(finderObject.f164794id) + '|';
                        }
                        C49712hj1 hj12 = m8Var.f188836e;
                        if (hj12 != null) {
                            C62165o oVar = (C62165o) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62165o.class);
                            oVar.getClass();
                            Integer num = oVar.f176742f.get(C62165o.f176740i.mo87218a(k9Var));
                            ((C58417y0) C86312j.m106911c(C58417y0.class)).My0(str, num == null ? -1 : num.intValue(), hj12);
                        }
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("Finder.StreamCardFeedConvert", e, "", new Object[0]);
                }
            }
        }
    }

    public C65626m8(C49712hj1 hj12, int i) {
        this.f188836e = hj12;
        this.f188837f = i;
    }

    /* renamed from: j */
    public static final void m77313j(C65626m8 m8Var, MMActivity mMActivity, FinderObject finderObject, C9833k9 k9Var, int i, int i2) {
        C65626m8 m8Var2 = m8Var;
        MMActivity mMActivity2 = mMActivity;
        FinderObject finderObject2 = finderObject;
        C9833k9 k9Var2 = k9Var;
        int i3 = i;
        m8Var.getClass();
        LinkedList<FinderObject> linkedList = k9Var2.f30387d.f184844h;
        C87412m.m108593f(linkedList, "item.card.`object`");
        StringBuilder sb = new StringBuilder();
        sb.append("[jump2HotTab] finderObject=");
        sb.append(finderObject2 != null ? Long.valueOf(finderObject2.f164794id) : null);
        sb.append(" objectList=");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (FinderObject finderObject3 : linkedList) {
            arrayList.add(Long.valueOf(finderObject3.f164794id));
        }
        sb.append(arrayList);
        Log.m105924i("Finder.StreamCardFeedConvert", sb.toString());
        LinkedList<BaseFinderFeed> linkedList2 = k9Var2.f30389f;
        if (linkedList2 == null || linkedList2.isEmpty()) {
            Log.m105920e("Finder.StreamCardFeedConvert", "rvFeedList is empty");
            return;
        }
        C39818r rVar = C39818r.f106831a;
        C39622i0 a = rVar.mo62444c(mMActivity2).mo75002a(FinderHomeUIC.class);
        C87412m.m108593f(a, "UICProvider.of(context).…inderHomeUIC::class.java)");
        FinderHomeUIC finderHomeUIC = (FinderHomeUIC) a;
        C11739f.C11740a c3 = ((C11739f) rVar.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class)).mo11600c3(4);
        c3.f34376i = C11739f.C11742c.InCacheTime;
        c3.f34374g = System.currentTimeMillis();
        c3.f34369b = new ArrayList<>(k9Var2.f30389f);
        Bundle bundle = new Bundle();
        C62165o oVar = (C62165o) ((C36570n) m8Var2.f188838g).getValue();
        LinkedList<FinderObject> linkedList3 = k9Var2.f30387d.f184844h;
        C87412m.m108593f(linkedList3, "item.card.`object`");
        String a2 = C62165o.f176740i.mo87218a(k9Var2);
        C52815g8 g8Var = new C52815g8(bundle);
        oVar.getClass();
        C87412m.m108594g(a2, XWalkReaderBasePlugin.PARAM_KEY_TOKEN);
        if (!oVar.f176741e.containsKey(a2)) {
            Log.m105924i("Finder.StreamCardVM", "[checkPreloadForReportReadStats] token=" + a2 + " not exist.");
            oVar.f176741e.put(a2, linkedList3);
            g8Var.invoke();
        } else {
            Log.m105924i("Finder.StreamCardVM", "[checkPreloadForReportReadStats] token=" + a2 + " has exist.");
        }
        bundle.putInt("RequestScene", 1);
        int i4 = -1;
        if (finderObject2 != null) {
            Iterator<FinderObject> it = linkedList.iterator();
            int i5 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().f164794id == finderObject2.f164794id) {
                    i4 = i5;
                    break;
                }
                i5++;
            }
        }
        bundle.putInt("ScrollPosition", i4);
        if (i3 == 1) {
            bundle.putInt("Source", 3);
        } else if (i3 == 3) {
            bundle.putInt("Source", 2);
        } else if (i3 != 4) {
            bundle.putInt("Source", 4);
        } else {
            bundle.putInt("Source", 2);
        }
        LinkedList<FinderObject> linkedList4 = k9Var2.f30387d.f184844h;
        List<FinderObject> subList = linkedList4.subList(0, Math.min(3, linkedList4.size()));
        C87412m.m108593f(subList, "item.card.`object`.subLi…item.card.`object`.size))");
        String str = "";
        for (FinderObject finderObject4 : subList) {
            str = str + C61926c.m72691p(finderObject4.f164794id) + '|';
        }
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        String p = C61926c.m72691p(finderObject2 != null ? finderObject2.f164794id : 0);
        C49712hj1 i35 = ((C13442s8) C39818r.f106831a.mo62444c(mMActivity2).mo75002a(C13442s8.class)).mo12853i3(m8Var2.f188837f);
        y0Var.getClass();
        C87412m.m108594g(str, "totalFeedId");
        C117407d.INSTANCE.mo160131h(20586, Integer.valueOf(i), p, Integer.valueOf(i4 + 1), Long.valueOf(C31543z5.m39453c()), str, Integer.valueOf(i2), Integer.valueOf(i35.f134675i), i35.f134672f, i35.f134670d);
        finderHomeUIC.mo5135k3(4, bundle);
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f6255v;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C9833k9 k9Var = (C9833k9) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(k9Var, "item");
        C66634t a = C66634t.m78607a(oVar.f44854d);
        oVar.f44854d.setOnClickListener(new C65603h8(this, k9Var, i));
        a.f191603a.f191596a.setOnClickListener(new C65610i8(this, a, k9Var, i));
        a.f191604b.f191596a.setOnClickListener(new C65614j8(this, a, k9Var, i));
        a.f191605c.f191596a.setOnClickListener(new C65619k8(this, a, k9Var, i));
        a.f191607e.setOnClickListener(new C65622l8(this, k9Var, i));
        C62165o oVar2 = (C62165o) ((C36570n) this.f188838g).getValue();
        oVar2.getClass();
        oVar2.f176742f.put(C62165o.f176740i.mo87218a(k9Var), Integer.valueOf(i));
        a.f191608f.setText(k9Var.f30387d.f184841e);
        a.f191606d.setText(k9Var.f30387d.f184842f);
        LinkedList<FinderObject> linkedList = k9Var.f30387d.f184844h;
        C87412m.m108593f(linkedList, "item.card.`object`");
        int i3 = 0;
        for (T next : linkedList) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                FinderObject finderObject = (FinderObject) next;
                if (i3 == 0) {
                    C66631m mVar = a.f191603a;
                    C87412m.m108593f(mVar, "itemBinding.card1");
                    C87412m.m108593f(finderObject, C66261f3.COL_FINDEROBJECT);
                    mo89706k(mVar, finderObject);
                } else if (i3 == 1) {
                    C66631m mVar2 = a.f191604b;
                    C87412m.m108593f(mVar2, "itemBinding.card2");
                    C87412m.m108593f(finderObject, C66261f3.COL_FINDEROBJECT);
                    mo89706k(mVar2, finderObject);
                } else if (i3 == 2) {
                    C66631m mVar3 = a.f191605c;
                    C87412m.m108593f(mVar3, "itemBinding.card3");
                    C87412m.m108593f(finderObject, C66261f3.COL_FINDEROBJECT);
                    mo89706k(mVar3, finderObject);
                }
                i3 = i4;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        C66634t a = C66634t.m78607a(oVar.f44854d);
        C85875k4.m106189j0(a.f191608f.getPaint(), 0.8f);
        C85875k4.m106189j0(a.f191606d.getPaint(), 0.8f);
        C85875k4.m106189j0(a.f191603a.f191601f.getPaint(), 0.8f);
        C85875k4.m106189j0(a.f191604b.f191601f.getPaint(), 0.8f);
        C85875k4.m106189j0(a.f191605c.f191601f.getPaint(), 0.8f);
        WeImageView weImageView = a.f191603a.f191600e;
        Context context = oVar.f173499A;
        weImageView.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icon_filled_awesome, context.getResources().getColor(C0966R.color.f2975b6)));
        WeImageView weImageView2 = a.f191604b.f191600e;
        Context context2 = oVar.f173499A;
        weImageView2.setImageDrawable(C74933u4.m89768e(context2, C0966R.raw.icon_filled_awesome, context2.getResources().getColor(C0966R.color.f2975b6)));
        WeImageView weImageView3 = a.f191605c.f191600e;
        Context context3 = oVar.f173499A;
        weImageView3.setImageDrawable(C74933u4.m89768e(context3, C0966R.raw.icon_filled_awesome, context3.getResources().getColor(C0966R.color.f2975b6)));
        View view = oVar.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        C23564m.m28138h(view, new C65627a(oVar, this));
    }

    /* renamed from: k */
    public final void mo89706k(C66631m mVar, FinderObject finderObject) {
        LinkedList<FinderMedia> linkedList;
        mVar.f191596a.setTag(finderObject);
        TextView textView = mVar.f191599d;
        int i = finderObject.likeCount;
        textView.setText(i > 0 ? C7878t0.m8034c(2, i) : "0");
        TextView textView2 = mVar.f191601f;
        C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
        Context context = mVar.f191596a.getContext();
        FinderContact finderContact = finderObject.contact;
        FinderMedia finderMedia = null;
        textView2.setText(hVar.mo107057T1(context, finderContact != null ? finderContact.nickname : null));
        C11978e0 e0Var = C11978e0.f34938a;
        C60979d<C100810g0> a = e0Var.mo11849a();
        FinderContact finderContact2 = finderObject.contact;
        C62345f fVar = new C62345f(finderContact2 != null ? finderContact2.headUrl : null, (C27696y) null, 2, (C8480h) null);
        ImageView imageView = mVar.f191597b;
        C87412m.m108593f(imageView, "cardView.avatar");
        a.mo85957c(fVar, imageView, e0Var.mo11851c(C11978e0.C11979a.AVATAR));
        C60979d<C100810g0> b = e0Var.mo11850b();
        C15585f.C15586a aVar = C15585f.f42211a;
        FinderObjectDesc finderObjectDesc = finderObject.objectDesc;
        if (!(finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null)) {
            finderMedia = linkedList.getFirst();
        }
        if (finderMedia == null) {
            finderMedia = new FinderMedia();
        }
        C99344b<C100810g0, Bitmap> a2 = b.mo85955a(new C62344b0(C65840n.m77568d(finderMedia), C27696y.THUMB_IMAGE, (String) null, (String) null, 12, (C8480h) null));
        a2.mo138758f(e0Var.mo11851c(C11978e0.C11979a.TIMELINE));
        ImageView imageView2 = mVar.f191598c;
        C87412m.m108593f(imageView2, "cardView.cover");
        ((C99342a) a2).mo85954d(imageView2);
    }
}

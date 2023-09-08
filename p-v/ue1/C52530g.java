package ue1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatting.BasePrivateMsgConvListFragment;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60179k4;
import ht1.C60187m5;
import ht1.C60208v1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import je1.C46516e2;
import o40.C61926c;
import p192l4.C10462b;
import p739wi.C53170a;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C48770aw0;
import te3.C48915bw0;
import te3.C50405mi0;
import up1.C37521f;
import up1.C52593j;
import ye1.C53515f;
import zc1.C66785b;
import zt3.C119157j;

/* renamed from: ue1.g */
public class C52530g extends BasePrivateMsgConvListFragment.C40273a<C52528f> {

    /* renamed from: e */
    public final String f146724e = "Finder.ConversationAdapter";

    /* renamed from: f */
    public ArrayList<C52528f> f146725f = new ArrayList<>();

    /* renamed from: g */
    public HashMap<String, C52528f> f146726g = new HashMap<>();

    /* renamed from: h */
    public int f146727h = 1;

    /* renamed from: i */
    public int f146728i = 2;

    /* renamed from: j */
    public C52531a f146729j;

    /* renamed from: n */
    public C52532b f146730n;

    /* renamed from: ue1.g$a */
    public interface C52531a {
        /* renamed from: a */
        void mo73481a(View view, int i, C52528f fVar);
    }

    /* renamed from: ue1.g$b */
    public interface C52532b {
        /* renamed from: a */
        void mo73482a(View view, int i, C52528f fVar);
    }

    /* renamed from: ue1.g$c */
    public static final class C52533c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List<C52528f> f146731d;

        public C52533c(List<C52528f> list) {
            this.f146731d = list;
        }

        public final void run() {
            Class cls = C60208v1.class;
            List<C52528f> list = this.f146731d;
            ArrayList<C50405mi0> arrayList = new ArrayList<>(C36907w.m41090l(list, 10));
            for (C52528f fVar : list) {
                C50405mi0 mi02 = new C50405mi0();
                mi02.f138041d = fVar.field_talker;
                mi02.f138042e = fVar.field_sessionId;
                arrayList.add(mi02);
            }
            C37521f.f99374d.getClass();
            if (!((Boolean) C37521f.f99303U6.mo60266n()).booleanValue()) {
                new C46516e2(new LinkedList(arrayList)).mo9225i();
                return;
            }
            for (C50405mi0 mi03 : arrayList) {
                C60187m5 Ff = ((C60208v1) C86312j.m106911c(cls)).mo78700Ff(C72996z1.m85825X4(mi03.f138041d) ? ((C60179k4) C86312j.m106911c(C60179k4.class)).mo78770n(mi03.f138041d) : mi03.f138041d);
                C58969q qVar = null;
                if (!(Ff instanceof C58969q)) {
                    Ff = null;
                }
                if (Ff != null) {
                    qVar = (C58969q) Ff;
                }
                if (qVar != null) {
                    C48915bw0 bw02 = new C48915bw0();
                    LinkedList<C48770aw0> linkedList = new LinkedList<>();
                    bw02.f131341d = linkedList;
                    C48770aw0 aw02 = new C48770aw0();
                    aw02.f130789d = 2;
                    aw02.f130791f = 1;
                    linkedList.add(aw02);
                    LinkedList<C48770aw0> linkedList2 = bw02.f131341d;
                    C48770aw0 aw03 = new C48770aw0();
                    aw03.f130789d = 4;
                    aw03.f130791f = 1;
                    aw03.f130793h = "测试";
                    linkedList2.add(aw03);
                    qVar.field_badgeInfoList = bw02;
                    qVar.field_rewardTotalAmountInWecoin = 2000;
                    qVar.field_interactionCount = 12;
                    ((C60208v1) C86312j.m106911c(cls)).Do0(qVar);
                }
            }
        }
    }

    /* renamed from: ue1.g$d */
    public static final class C52534d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C52530g f146732d;

        /* renamed from: e */
        public final /* synthetic */ MStorageEventData f146733e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52534d(C52530g gVar, MStorageEventData mStorageEventData) {
            super(0);
            this.f146732d = gVar;
            this.f146733e = mStorageEventData;
        }

        public Object invoke() {
            String str = this.f146732d.f146724e;
            Log.m105924i(str, "[onConversationStorageChange] convScene = " + this.f146732d.f146728i + ",eventData.eventId = " + this.f146733e.eventId + ',');
            MStorageEventData mStorageEventData = this.f146733e;
            int i = mStorageEventData.eventId;
            if (i == 1 || i == 2) {
                C52530g gVar = this.f146732d;
                Object obj = mStorageEventData.obj;
                C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversation");
                C52530g.m58792g5(gVar, (C52528f) obj);
            } else if (i == 5) {
                C52530g gVar2 = this.f146732d;
                Object obj2 = mStorageEventData.obj;
                C87412m.m108592e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversation");
                C52528f fVar = (C52528f) obj2;
                gVar2.getClass();
                int i2 = fVar.field_type;
                if (i2 == 1 && gVar2.f146727h == 1) {
                    C52528f fVar2 = gVar2.f146726g.get("findersayhisessionholder");
                    if (fVar2 != null) {
                        fVar2.field_unReadCount = 0;
                        fVar2.field_readStatus = 1;
                        int indexOf = gVar2.f146725f.indexOf(fVar);
                        if (indexOf >= 0 && indexOf < gVar2.f146725f.size()) {
                            gVar2.mo73479w5(indexOf);
                        }
                    }
                } else if (i2 == 3 && gVar2.f146727h == 1) {
                    C52528f fVar3 = gVar2.f146726g.get("finderaliassessionholder");
                    if (fVar3 != null) {
                        fVar3.field_unReadCount = 0;
                        fVar3.field_readStatus = 1;
                        int indexOf2 = gVar2.f146725f.indexOf(fVar);
                        if (indexOf2 >= 0 && indexOf2 < gVar2.f146725f.size()) {
                            gVar2.mo73479w5(indexOf2);
                        }
                    }
                } else {
                    int P = C110818d0.m150918P(gVar2.f146725f, gVar2.f146726g.get(fVar.field_sessionId));
                    fVar.mo73472l2();
                    if (P >= 0 && P < gVar2.f146725f.size()) {
                        gVar2.f146725f.set(P, fVar);
                        HashMap<String, C52528f> hashMap = gVar2.f146726g;
                        String str2 = fVar.field_sessionId;
                        C87412m.m108593f(str2, "conv.field_sessionId");
                        hashMap.put(str2, fVar);
                        if (P >= 0 && P < gVar2.f146725f.size()) {
                            gVar2.mo73479w5(P);
                        }
                    }
                }
            } else if (i == 6) {
                C52530g gVar3 = this.f146732d;
                Object obj3 = mStorageEventData.obj;
                C87412m.m108592e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversation");
                C52528f fVar4 = (C52528f) obj3;
                int P2 = C110818d0.m150918P(gVar3.f146725f, gVar3.f146726g.get(fVar4.field_sessionId));
                if (P2 >= 0 && P2 < gVar3.f146725f.size()) {
                    gVar3.f146725f.remove(P2);
                    gVar3.f146726g.remove(fVar4.field_sessionId);
                    gVar3.mo73476O5(P2);
                }
            } else if (i == 7) {
                C52530g gVar4 = this.f146732d;
                Object obj4 = mStorageEventData.obj;
                C87412m.m108592e(obj4, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversation");
                C52530g.m58792g5(gVar4, (C52528f) obj4);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ue1.g$e */
    public static final class C52535e implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C53170a f146734d;

        /* renamed from: e */
        public final /* synthetic */ C52530g f146735e;

        /* renamed from: f */
        public final /* synthetic */ View f146736f;

        public C52535e(C53170a aVar, C52530g gVar, View view) {
            this.f146734d = aVar;
            this.f146735e = gVar;
            this.f146736f = view;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/conv/FinderConversationAdapter$onCreateViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C53170a aVar = this.f146734d;
            C52528f fVar = (C52528f) aVar.f173503E;
            C52532b bVar = this.f146735e.f146730n;
            if (bVar != null) {
                View view2 = this.f146736f;
                int j = aVar.mo17363j();
                C87412m.m108593f(fVar, "item");
                bVar.mo73482a(view2, j, fVar);
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/conv/FinderConversationAdapter$onCreateViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: ue1.g$f */
    public static final class C52536f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C53170a f146737d;

        /* renamed from: e */
        public final /* synthetic */ C52530g f146738e;

        /* renamed from: f */
        public final /* synthetic */ View f146739f;

        public C52536f(C53170a aVar, C52530g gVar, View view) {
            this.f146737d = aVar;
            this.f146738e = gVar;
            this.f146739f = view;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/conv/FinderConversationAdapter$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C53170a aVar = this.f146737d;
            C52528f fVar = (C52528f) aVar.f173503E;
            C52531a aVar2 = this.f146738e.f146729j;
            if (aVar2 != null) {
                View view2 = this.f146739f;
                int j = aVar.mo17363j();
                C87412m.m108593f(fVar, "item");
                aVar2.mo73481a(view2, j, fVar);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/conv/FinderConversationAdapter$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: g5 */
    public static final void m58792g5(C52530g gVar, C52528f fVar) {
        int i;
        boolean z;
        gVar.getClass();
        int i2 = fVar.field_type;
        int i3 = 0;
        if (i2 == 1 && gVar.f146727h == 1 && gVar.f146728i == 2) {
            C52528f fVar2 = gVar.f146726g.get("findersayhisessionholder");
            if (fVar2 == null) {
                fVar2 = C52593j.f146894e.mo73554a();
                fVar2.field_sessionId = "findersayhisessionholder";
                fVar2.field_talker = "findersayhisessionholder";
                fVar2.field_placedFlag = 1000;
                fVar2.field_type = 100;
                fVar2.field_scene = 2;
                fVar2.field_senderUserName = C66785b.f191882e.mo90662O5();
                fVar2.mo73472l2();
                gVar.f146726g.put("findersayhisessionholder", fVar2);
            }
            fVar2.field_unReadCount += fVar.field_unReadCount;
            fVar2.field_digest = fVar.field_digest;
            fVar2.field_updateTime = fVar.field_updateTime;
            fVar2.field_readStatus = fVar.field_readStatus;
            int indexOf = gVar.f146725f.indexOf(fVar2);
            if (indexOf >= 0) {
                gVar.mo73479w5(indexOf);
                return;
            }
            gVar.f146725f.add(0, fVar2);
            gVar.mo73480y5(indexOf);
        } else if ((i2 == 3 || i2 == 200) && gVar.f146727h == 1 && gVar.f146728i == 1) {
            C52528f fVar3 = gVar.f146726g.get("finderaliassessionholder");
            if (fVar3 == null) {
                fVar3 = C52593j.f146894e.mo73554a();
                fVar3.field_sessionId = "finderaliassessionholder";
                fVar3.field_talker = "finderaliassessionholder";
                fVar3.field_placedFlag = 0;
                fVar3.field_type = 200;
                fVar3.field_scene = 1;
                fVar3.mo73472l2();
                gVar.f146726g.put("finderaliassessionholder", fVar3);
            }
            fVar3.field_unReadCount += fVar.field_unReadCount;
            fVar3.field_digest = fVar.field_digest;
            fVar3.field_updateTime = fVar.field_updateTime;
            fVar3.field_readStatus = fVar.field_readStatus;
            int indexOf2 = gVar.f146725f.indexOf(fVar3);
            if (indexOf2 >= 0) {
                gVar.mo73479w5(indexOf2);
                return;
            }
            gVar.f146725f.add(0, fVar3);
            gVar.mo73480y5(indexOf2);
        } else {
            int P = C110818d0.m150918P(gVar.f146725f, gVar.f146726g.get(fVar.field_sessionId));
            if (P >= 0) {
                gVar.f146725f.remove(P);
                gVar.mo73476O5(P);
            }
            fVar.mo73472l2();
            ArrayList<C52528f> arrayList = gVar.f146725f;
            ListIterator<C52528f> listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i = -1;
                    break;
                }
                if (listIterator.previous().field_placedFlag > 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    i = listIterator.nextIndex();
                    break;
                }
            }
            if (i >= 0) {
                i3 = i + 1;
            }
            gVar.f146725f.add(i3, fVar);
            gVar.mo73480y5(i3);
            gVar.f146726g.remove(fVar.field_sessionId);
            HashMap<String, C52528f> hashMap = gVar.f146726g;
            String str = fVar.field_sessionId;
            C87412m.m108593f(str, "conv.field_sessionId");
            hashMap.put(str, fVar);
        }
    }

    /* renamed from: F4 */
    public List<C52528f> mo62831F4() {
        return this.f146725f;
    }

    /* renamed from: G4 */
    public void mo62832G4(boolean z, List<C52528f> list) {
        C87412m.m108594g(list, "convs");
        C61926c.m72668M(new C52537h(this, list, z));
        C37521f.f99374d.getClass();
        if (((Boolean) C37521f.f99312V6.mo60266n()).booleanValue() || this.f146727h == 2) {
            ((C119157j) C119157j.f356862d).mo183884o(new C52533c(list));
        }
    }

    /* renamed from: N5 */
    public void mo73475N5(int i, int i2) {
        notifyItemRangeInserted(i, i2);
    }

    /* renamed from: O4 */
    public boolean mo62833O4(String str, MStorageEventData mStorageEventData) {
        T t;
        boolean z;
        if (str == null || mStorageEventData == null) {
            return false;
        }
        Object obj = mStorageEventData.obj;
        if (obj instanceof C52528f) {
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversation");
            C52528f fVar = (C52528f) obj;
            if (fVar.field_scene != this.f146728i) {
                String str2 = this.f146724e;
                Log.m105924i(str2, "conv.field_scene:" + fVar.field_scene + " != conveScene:" + this.f146728i);
                return false;
            }
            C61926c.m72668M(new C52534d(this, mStorageEventData));
        } else if (!(obj instanceof String)) {
            return false;
        } else {
            C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.String");
            if (!(((String) obj).length() > 0)) {
                return false;
            }
            Object obj2 = mStorageEventData.obj;
            C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) obj2;
            Iterator<T> it = this.f146725f.iterator();
            while (true) {
                t = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                C52528f fVar2 = (C52528f) next;
                C72996z1 z1Var = fVar2.f146720Y0;
                if (z1Var != null) {
                    t = z1Var.getUsername();
                }
                if (C87412m.m108589b(t, str3) || C87412m.m108589b(fVar2.field_talker, str3)) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    t = next;
                    break;
                }
            }
            C52528f fVar3 = (C52528f) t;
            if (fVar3 != null) {
                String str4 = this.f146724e;
                Log.m105924i(str4, "[onContactStorageChange] username=" + str3);
                fVar3.mo73472l2();
                int indexOf = this.f146725f.indexOf(fVar3);
                if (indexOf >= 0 && indexOf < this.f146725f.size()) {
                    mo73479w5(indexOf);
                }
            }
        }
        return true;
    }

    /* renamed from: O5 */
    public void mo73476O5(int i) {
        notifyItemRemoved(i);
    }

    /* renamed from: P5 */
    public C53170a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.a_4, viewGroup, false);
        int i2 = C0966R.C0970id.a1r;
        ImageView imageView = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.a1r);
        if (imageView != null) {
            i2 = C0966R.C0970id.f357797bt1;
            ImageView imageView2 = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.f357797bt1);
            if (imageView2 != null) {
                i2 = C0966R.C0970id.btb;
                TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.btb);
                if (textView != null) {
                    i2 = C0966R.C0970id.f357849c24;
                    TextView textView2 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.f357849c24);
                    if (textView2 != null) {
                        LinearLayout linearLayout = (LinearLayout) inflate;
                        TextView textView3 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.f8c);
                        if (textView3 != null) {
                            TextView textView4 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.kkm);
                            if (textView4 != null) {
                                TextView textView5 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.km8);
                                if (textView5 != null) {
                                    TextView textView6 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.km9);
                                    if (textView6 != null) {
                                        C53515f fVar = new C53515f(linearLayout, imageView, imageView2, textView, textView2, linearLayout, textView3, textView4, textView5, textView6);
                                        C87412m.m108593f(linearLayout, "viewBinding.root");
                                        C53170a aVar = new C53170a(linearLayout, fVar);
                                        linearLayout.setOnLongClickListener(new C52535e(aVar, this, linearLayout));
                                        linearLayout.setOnClickListener(new C52536f(aVar, this, linearLayout));
                                        return aVar;
                                    }
                                    i2 = C0966R.C0970id.km9;
                                } else {
                                    i2 = C0966R.C0970id.km8;
                                }
                            } else {
                                i2 = C0966R.C0970id.kkm;
                            }
                        } else {
                            i2 = C0966R.C0970id.f8c;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    public int getItemCount() {
        return this.f146725f.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x02c8 A[Catch:{ Exception -> 0x048b }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02ca A[Catch:{ Exception -> 0x048b }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02cd A[ADDED_TO_REGION, Catch:{ Exception -> 0x048b }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02f3 A[Catch:{ Exception -> 0x048b }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0317 A[Catch:{ Exception -> 0x0487 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x032c A[Catch:{ Exception -> 0x0487 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0361 A[Catch:{ Exception -> 0x0487 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0388 A[SYNTHETIC, Splitter:B:150:0x0388] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03b8 A[Catch:{ Exception -> 0x03cd }, LOOP:1: B:161:0x03b6->B:162:0x03b8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x040a A[Catch:{ Exception -> 0x03cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x04ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r31, int r32) {
        /*
            r30 = this;
            r1 = r30
            r0 = r31
            wi.a r0 = (p739wi.C53170a) r0
            java.lang.String r2 = "holder"
            gy3.C87412m.m108594g(r0, r2)
            android.view.View r2 = r0.f44854d
            java.lang.String r3 = "holder.itemView"
            gy3.C87412m.m108593f(r2, r3)
            l4.a r3 = r0.f173501C
            java.lang.String r4 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.databinding.FinderConversationItemBinding"
            gy3.C87412m.m108592e(r3, r4)
            ye1.f r3 = (ye1.C53515f) r3
            r4 = r32
            ue1.f r4 = r1.mo73478u5(r4)
            if (r4 != 0) goto L_0x0025
            goto L_0x04fd
        L_0x0025:
            r0.f173503E = r4
            android.widget.ImageView r5 = r3.f150470a
            r6 = 0
            r5.setImageDrawable(r6)
            android.widget.ImageView r5 = r3.f150470a
            java.lang.String r7 = r4.field_sessionId
            tl3.C78039a.m94189a(r5, r7)
            android.widget.TextView r5 = r3.f150471b
            java.lang.CharSequence r7 = r4.f146721Z0
            r5.setText(r7)
            android.widget.TextView r5 = r3.f150472c
            ue1.f$a r7 = r4.f146719X0
            java.lang.String r8 = ""
            if (r7 == 0) goto L_0x0049
            java.lang.CharSequence r7 = r7.mo73473a(r4)
            if (r7 != 0) goto L_0x004a
        L_0x0049:
            r7 = r8
        L_0x004a:
            r5.setText(r7)
            long r9 = r4.field_placedFlag
            java.lang.String r5 = "finderaliassessionholder"
            java.lang.String r7 = "findersayhisessionholder"
            r11 = 0
            r13 = 1
            r14 = 0
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 <= 0) goto L_0x006d
            java.lang.String r9 = r4.field_sessionId
            boolean r9 = gy3.C87412m.m108589b(r9, r7)
            if (r9 != 0) goto L_0x006d
            java.lang.String r9 = r4.field_sessionId
            boolean r9 = gy3.C87412m.m108589b(r9, r5)
            if (r9 != 0) goto L_0x006d
            r9 = 1
            goto L_0x006e
        L_0x006d:
            r9 = 0
        L_0x006e:
            if (r9 == 0) goto L_0x0077
            r9 = 2131233605(0x7f080b45, float:1.8083352E38)
            r2.setBackgroundResource(r9)
            goto L_0x007d
        L_0x0077:
            r9 = 2131231818(0x7f08044a, float:1.8079728E38)
            r2.setBackgroundResource(r9)
        L_0x007d:
            android.widget.TextView r9 = r3.f150473d
            android.content.Context r10 = r2.getContext()
            java.lang.String r15 = "itemView.context"
            gy3.C87412m.m108593f(r10, r15)
            int r15 = r4.field_status
            if (r15 != r13) goto L_0x0094
            r15 = 2131829845(0x7f112455, float:1.929267E38)
            java.lang.String r10 = r10.getString(r15)
            goto L_0x009a
        L_0x0094:
            long r11 = r4.field_updateTime
            java.lang.CharSequence r10 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85112e(r10, r11, r13)
        L_0x009a:
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r9.setText(r10)
            java.lang.String r9 = r4.field_sessionId
            boolean r7 = gy3.C87412m.m108589b(r9, r7)
            r9 = 8
            if (r7 == 0) goto L_0x00c3
            android.widget.TextView r5 = r3.f150475f
            int r7 = r4.field_unReadCount
            if (r7 <= 0) goto L_0x00b7
            int r7 = r4.field_readStatus
            if (r7 != 0) goto L_0x00b7
            r7 = 0
            goto L_0x00b9
        L_0x00b7:
            r7 = 8
        L_0x00b9:
            r5.setVisibility(r7)
            android.widget.TextView r5 = r3.f150474e
            r5.setVisibility(r9)
            goto L_0x0181
        L_0x00c3:
            java.lang.String r7 = r4.field_sessionId
            boolean r5 = gy3.C87412m.m108589b(r7, r5)
            r7 = 2131167343(0x7f07086f, float:1.7948957E38)
            if (r5 == 0) goto L_0x0139
            int r5 = r1.f146728i
            if (r5 != r13) goto L_0x0122
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r5 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            com.tencent.mm.plugin.FinderCommonFeatureService r5 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r5
            up1.j r5 = r5.mo76776L4()
            r10 = 3
            int r5 = r5.mo73553qq(r13, r10, r8)
            android.widget.TextView r10 = r3.f150474e
            if (r5 <= 0) goto L_0x00e9
            r11 = 0
            goto L_0x00eb
        L_0x00e9:
            r11 = 8
        L_0x00eb:
            r10.setVisibility(r11)
            android.widget.TextView r10 = r3.f150474e
            java.lang.String r11 = java.lang.String.valueOf(r5)
            r10.setText(r11)
            android.widget.TextView r10 = r3.f150474e
            android.content.Context r11 = r2.getContext()
            int r5 = com.tencent.p014mm.p136ui.tools.C45081s1.m49933b(r11, r5)
            r10.setBackgroundResource(r5)
            android.widget.TextView r5 = r3.f150474e
            android.content.Context r10 = r2.getContext()
            int r7 = kg3.C76577a.m92155f(r10, r7)
            float r7 = (float) r7
            android.content.Context r10 = r2.getContext()
            float r10 = kg3.C76577a.m92161l(r10)
            float r7 = r7 * r10
            r5.setTextSize(r14, r7)
            android.widget.TextView r5 = r3.f150475f
            r5.setVisibility(r9)
            goto L_0x0181
        L_0x0122:
            android.widget.TextView r5 = r3.f150475f
            int r7 = r4.field_unReadCount
            if (r7 <= 0) goto L_0x012e
            int r7 = r4.field_readStatus
            if (r7 != 0) goto L_0x012e
            r7 = 0
            goto L_0x0130
        L_0x012e:
            r7 = 8
        L_0x0130:
            r5.setVisibility(r7)
            android.widget.TextView r5 = r3.f150474e
            r5.setVisibility(r9)
            goto L_0x0181
        L_0x0139:
            android.widget.TextView r5 = r3.f150474e
            int r10 = r4.field_unReadCount
            if (r10 <= 0) goto L_0x0145
            int r10 = r4.field_readStatus
            if (r10 != 0) goto L_0x0145
            r10 = 0
            goto L_0x0147
        L_0x0145:
            r10 = 8
        L_0x0147:
            r5.setVisibility(r10)
            android.widget.TextView r5 = r3.f150474e
            int r10 = r4.field_unReadCount
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r5.setText(r10)
            android.widget.TextView r5 = r3.f150474e
            android.content.Context r10 = r2.getContext()
            int r11 = r4.field_unReadCount
            int r10 = com.tencent.p014mm.p136ui.tools.C45081s1.m49933b(r10, r11)
            r5.setBackgroundResource(r10)
            android.widget.TextView r5 = r3.f150474e
            android.content.Context r10 = r2.getContext()
            int r7 = kg3.C76577a.m92155f(r10, r7)
            float r7 = (float) r7
            android.content.Context r10 = r2.getContext()
            float r10 = kg3.C76577a.m92161l(r10)
            float r7 = r7 * r10
            r5.setTextSize(r14, r7)
            android.widget.TextView r5 = r3.f150475f
            r5.setVisibility(r9)
        L_0x0181:
            r5 = 2131302737(0x7f091951, float:1.8223569E38)
            android.view.View r5 = r2.findViewById(r5)
            if (r5 == 0) goto L_0x01c2
            r7 = 2131302575(0x7f0918af, float:1.822324E38)
            java.lang.CharSequence r10 = r4.f146721Z0
            r5.setTag(r7, r10)
            r7 = 2131302517(0x7f091875, float:1.8223122E38)
            ue1.f$a r10 = r4.f146719X0
            if (r10 == 0) goto L_0x019f
            java.lang.CharSequence r10 = r10.mo73473a(r4)
            if (r10 != 0) goto L_0x01a0
        L_0x019f:
            r10 = r8
        L_0x01a0:
            r5.setTag(r7, r10)
            r7 = 2131302516(0x7f091874, float:1.822312E38)
            android.widget.TextView r3 = r3.f150473d
            if (r3 == 0) goto L_0x01af
            java.lang.CharSequence r3 = r3.getText()
            goto L_0x01b0
        L_0x01af:
            r3 = r6
        L_0x01b0:
            if (r3 != 0) goto L_0x01b3
            r3 = r8
        L_0x01b3:
            r5.setTag(r7, r3)
            r3 = 2131302572(0x7f0918ac, float:1.8223234E38)
            int r7 = r4.field_unReadCount
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5.setTag(r3, r7)
        L_0x01c2:
            com.tencent.mm.storage.z1 r3 = r4.f146720Y0
            if (r3 == 0) goto L_0x01cb
            java.lang.String r3 = r3.getUsername()
            goto L_0x01cc
        L_0x01cb:
            r3 = r6
        L_0x01cc:
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85825X4(r3)
            if (r3 == 0) goto L_0x01e9
            java.lang.Class<ht1.k4> r3 = ht1.C60179k4.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ht1.k4 r3 = (ht1.C60179k4) r3
            com.tencent.mm.storage.z1 r5 = r4.f146720Y0
            if (r5 == 0) goto L_0x01e3
            java.lang.String r5 = r5.getUsername()
            goto L_0x01e4
        L_0x01e3:
            r5 = r6
        L_0x01e4:
            java.lang.String r3 = r3.mo78770n(r5)
            goto L_0x01f3
        L_0x01e9:
            com.tencent.mm.storage.z1 r3 = r4.f146720Y0
            if (r3 == 0) goto L_0x01f2
            java.lang.String r3 = r3.getUsername()
            goto L_0x01f3
        L_0x01f2:
            r3 = r6
        L_0x01f3:
            java.lang.Class<ht1.v1> r5 = ht1.C60208v1.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ht1.v1 r5 = (ht1.C60208v1) r5
            ht1.m5 r5 = r5.mo78700Ff(r3)
            boolean r7 = r5 instanceof fe1.C58969q
            if (r7 == 0) goto L_0x0204
            goto L_0x0205
        L_0x0204:
            r5 = r6
        L_0x0205:
            if (r5 == 0) goto L_0x020a
            r6 = r5
            fe1.q r6 = (fe1.C58969q) r6
        L_0x020a:
            if (r6 == 0) goto L_0x04fd
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85817T4(r3)
            if (r3 == 0) goto L_0x0233
            er1.w3 r15 = er1.C58784w3.f168295a
            r3 = 2131300441(0x7f091059, float:1.8218912E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r5 = "itemView.findViewById<Im…iew>(R.id.conv_auth_info)"
            gy3.C87412m.m108593f(r3, r5)
            r16 = r3
            android.widget.ImageView r16 = (android.widget.ImageView) r16
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r3 = r6.field_authInfo
            r18 = 0
            r19 = 0
            r20 = 12
            r21 = 0
            r17 = r3
            er1.C58784w3.m68429F1(r15, r16, r17, r18, r19, r20, r21)
        L_0x0233:
            r3 = 2131306482(0x7f0927f2, float:1.8231164E38)
            android.view.View r5 = r2.findViewById(r3)
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.content.Context r0 = r0.f173499A
            java.lang.String r7 = "holder.context"
            gy3.C87412m.m108593f(r0, r7)
            java.lang.String r7 = "buildFinderCustomerInfo:"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r15 = 2
            te3.bw0 r9 = r6.field_badgeInfoList     // Catch:{ Exception -> 0x048b }
            if (r9 == 0) goto L_0x02bb
            java.util.LinkedList<te3.aw0> r9 = r9.f131341d     // Catch:{ Exception -> 0x02b7 }
            if (r9 == 0) goto L_0x02bb
            int r9 = r9.size()     // Catch:{ Exception -> 0x02b7 }
            if (r9 == 0) goto L_0x02bb
            f40.o r9 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x02b7 }
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()     // Catch:{ Exception -> 0x02b7 }
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_HAS_GET_REWARD_BOOLEAN_SYNC     // Catch:{ Exception -> 0x02b7 }
            boolean r3 = r9.mo119686g(r3, r14)     // Catch:{ Exception -> 0x02b7 }
            r9 = 4
            if (r3 == 0) goto L_0x027b
            int[] r3 = new int[r15]     // Catch:{ Exception -> 0x048b }
            r3[r14] = r15     // Catch:{ Exception -> 0x048b }
            r3[r13] = r9     // Catch:{ Exception -> 0x048b }
            goto L_0x027f
        L_0x027b:
            int[] r3 = new int[r13]     // Catch:{ Exception -> 0x02b7 }
            r3[r14] = r9     // Catch:{ Exception -> 0x02b7 }
        L_0x027f:
            r18 = r3
            java.lang.Class<ir.n> r3 = p565ir.C60606n.class
            di3.d r3 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x02b7 }
            ir.n r3 = (p565ir.C60606n) r3     // Catch:{ Exception -> 0x02b7 }
            te3.bw0 r9 = r6.field_badgeInfoList     // Catch:{ Exception -> 0x02b7 }
            java.util.LinkedList<te3.aw0> r9 = r9.f131341d     // Catch:{ Exception -> 0x02b7 }
            java.lang.String r15 = "localFinderContact.field_badgeInfoList.infos"
            gy3.C87412m.m108593f(r9, r15)     // Catch:{ Exception -> 0x02b7 }
            r19 = 1
            r20 = 0
            r14 = 2
            r15 = r3
            r16 = r5
            r17 = r9
            java.util.List r3 = r15.Tv0(r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x048b }
            r11.addAll(r3)     // Catch:{ Exception -> 0x048b }
            te3.bw0 r3 = r6.field_badgeInfoList     // Catch:{ Exception -> 0x048b }
            java.util.LinkedList<te3.aw0> r3 = r3.f131341d     // Catch:{ Exception -> 0x048b }
            int r3 = r3.size()     // Catch:{ Exception -> 0x048b }
            if (r3 > r13) goto L_0x02bc
            int r3 = r4.field_type     // Catch:{ Exception -> 0x048b }
            if (r3 != r13) goto L_0x02bc
            int r3 = r1.f146727h     // Catch:{ Exception -> 0x048b }
            if (r3 != r14) goto L_0x02bc
            r3 = 1
            goto L_0x02bd
        L_0x02b7:
            r0 = move-exception
            r14 = 2
            goto L_0x048c
        L_0x02bb:
            r14 = 2
        L_0x02bc:
            r3 = 0
        L_0x02bd:
            java.lang.String r4 = "isLocalFinderContact=true;"
            r12.append(r4)     // Catch:{ Exception -> 0x048b }
            int r4 = r6.field_follow_Flag     // Catch:{ Exception -> 0x048b }
            int r9 = fe1.C58969q.f168707c2     // Catch:{ Exception -> 0x048b }
            if (r4 != r9) goto L_0x02ca
            r4 = 1
            goto L_0x02cb
        L_0x02ca:
            r4 = 0
        L_0x02cb:
            if (r4 == 0) goto L_0x02e5
            if (r3 == 0) goto L_0x02e5
            android.content.res.Resources r9 = r0.getResources()     // Catch:{ Exception -> 0x048b }
            r15 = 2131829967(0x7f1124cf, float:1.9292918E38)
            java.lang.String r9 = r9.getString(r15)     // Catch:{ Exception -> 0x048b }
            java.lang.String r15 = "context.resources.getStr…string.finder_tag_follow)"
            gy3.C87412m.m108593f(r9, r15)     // Catch:{ Exception -> 0x048b }
            java.lang.String r15 = "isFinderContact=true;followed;"
            r12.append(r15)     // Catch:{ Exception -> 0x048b }
            goto L_0x02eb
        L_0x02e5:
            java.lang.String r9 = "isFinderContact=true;no follow;"
            r12.append(r9)     // Catch:{ Exception -> 0x048b }
            r9 = r8
        L_0x02eb:
            long r14 = r6.field_rewardTotalAmountInWecoin     // Catch:{ Exception -> 0x048b }
            r17 = 0
            int r19 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r19 <= 0) goto L_0x0317
            android.content.res.Resources r13 = r0.getResources()     // Catch:{ Exception -> 0x048b }
            r20 = r2
            r18 = r8
            r8 = 1
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0487 }
            java.lang.Long r8 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x0487 }
            r14 = 0
            r2[r14] = r8     // Catch:{ Exception -> 0x0487 }
            r8 = 2131829209(0x7f1121d9, float:1.929138E38)
            java.lang.String r2 = r13.getString(r8, r2)     // Catch:{ Exception -> 0x0487 }
            java.lang.String r8 = "context.resources\n      …al_amount_wecoin, wecoin)"
            gy3.C87412m.m108593f(r2, r8)     // Catch:{ Exception -> 0x0487 }
            java.lang.String r8 = "isFinderContact=true;have wecoin;"
            r12.append(r8)     // Catch:{ Exception -> 0x0487 }
            goto L_0x0322
        L_0x0317:
            r20 = r2
            r18 = r8
            java.lang.String r2 = "isFinderContact=true;no wecoin;"
            r12.append(r2)     // Catch:{ Exception -> 0x0487 }
            r2 = r18
        L_0x0322:
            long r13 = r6.field_interactionCount     // Catch:{ Exception -> 0x0487 }
            if (r19 != 0) goto L_0x0361
            r22 = 0
            int r6 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r6 <= 0) goto L_0x0361
            android.content.res.Resources r6 = r0.getResources()     // Catch:{ Exception -> 0x0487 }
            r8 = 1
            java.lang.Object[] r15 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0487 }
            java.lang.Long r17 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x0487 }
            r18 = 0
            r15[r18] = r17     // Catch:{ Exception -> 0x0487 }
            r8 = 2131829208(0x7f1121d8, float:1.9291379E38)
            java.lang.String r8 = r6.getString(r8, r15)     // Catch:{ Exception -> 0x0487 }
            java.lang.String r6 = "context.resources\n      …_count, interactionCount)"
            gy3.C87412m.m108593f(r8, r6)     // Catch:{ Exception -> 0x0487 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0487 }
            r6.<init>()     // Catch:{ Exception -> 0x0487 }
            java.lang.String r15 = "interactionCount="
            r6.append(r15)     // Catch:{ Exception -> 0x0487 }
            r6.append(r13)     // Catch:{ Exception -> 0x0487 }
            r15 = 59
            r6.append(r15)     // Catch:{ Exception -> 0x0487 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0487 }
            r12.append(r6)     // Catch:{ Exception -> 0x0487 }
            goto L_0x0368
        L_0x0361:
            java.lang.String r6 = "interactionCount=0;"
            r12.append(r6)     // Catch:{ Exception -> 0x0487 }
            r8 = r18
        L_0x0368:
            int r6 = r11.size()     // Catch:{ Exception -> 0x0487 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0487 }
            r15.<init>()     // Catch:{ Exception -> 0x0487 }
            r18 = r5
            java.lang.String r5 = "spanSize="
            r15.append(r5)     // Catch:{ Exception -> 0x03cd }
            r15.append(r6)     // Catch:{ Exception -> 0x03cd }
            java.lang.String r5 = r15.toString()     // Catch:{ Exception -> 0x03cd }
            r12.append(r5)     // Catch:{ Exception -> 0x03cd }
            r5 = 0
        L_0x0384:
            java.lang.String r15 = " "
            if (r5 >= r6) goto L_0x038e
            r10.append(r15)     // Catch:{ Exception -> 0x03cd }
            int r5 = r5 + 1
            goto L_0x0384
        L_0x038e:
            r10.append(r9)     // Catch:{ Exception -> 0x03cd }
            r10.append(r2)     // Catch:{ Exception -> 0x03cd }
            r10.append(r8)     // Catch:{ Exception -> 0x03cd }
            boolean r5 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x03cd }
            if (r5 == 0) goto L_0x03ae
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x03cd }
            if (r5 == 0) goto L_0x03ae
            boolean r5 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x03cd }
            if (r5 == 0) goto L_0x03ae
            if (r6 <= 0) goto L_0x03ae
            r10.append(r15)     // Catch:{ Exception -> 0x03cd }
        L_0x03ae:
            android.text.SpannableString r5 = new android.text.SpannableString     // Catch:{ Exception -> 0x03cd }
            r5.<init>(r10)     // Catch:{ Exception -> 0x03cd }
            r22 = r12
            r15 = 0
        L_0x03b6:
            if (r15 >= r6) goto L_0x03d0
            java.lang.Object r12 = r11.get(r15)     // Catch:{ Exception -> 0x03cd }
            r24 = r6
            int r6 = r15 + 1
            r25 = r11
            r11 = 33
            r5.setSpan(r12, r15, r6, r11)     // Catch:{ Exception -> 0x03cd }
            r15 = r6
            r6 = r24
            r11 = r25
            goto L_0x03b6
        L_0x03cd:
            r0 = move-exception
            goto L_0x048f
        L_0x03d0:
            r6 = 2131165371(0x7f0700bb, float:1.7944957E38)
            r11 = 18
            if (r4 == 0) goto L_0x0408
            if (r3 == 0) goto L_0x0408
            int r3 = r10.indexOf(r9)     // Catch:{ Exception -> 0x03cd }
            int r4 = r9.length()     // Catch:{ Exception -> 0x03cd }
            int r4 = r4 + r3
            go3.x r9 = new go3.x     // Catch:{ Exception -> 0x03cd }
            r25 = 12
            java.lang.String r12 = "#E6000000"
            int r26 = android.graphics.Color.parseColor(r12)     // Catch:{ Exception -> 0x03cd }
            java.lang.String r12 = "#F7F7F7"
            int r27 = android.graphics.Color.parseColor(r12)     // Catch:{ Exception -> 0x03cd }
            android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x03cd }
            int r28 = kg3.C76577a.m92151b(r12, r11)     // Catch:{ Exception -> 0x03cd }
            int r29 = kg3.C76577a.m92155f(r0, r6)     // Catch:{ Exception -> 0x03cd }
            r24 = r9
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ Exception -> 0x03cd }
            r12 = 33
            r5.setSpan(r9, r3, r4, r12)     // Catch:{ Exception -> 0x03cd }
        L_0x0408:
            if (r19 <= 0) goto L_0x0439
            int r3 = r10.indexOf(r2)     // Catch:{ Exception -> 0x03cd }
            int r2 = r2.length()     // Catch:{ Exception -> 0x03cd }
            int r2 = r2 + r3
            go3.x r4 = new go3.x     // Catch:{ Exception -> 0x03cd }
            r25 = 12
            java.lang.String r9 = "#FF6146"
            int r26 = android.graphics.Color.parseColor(r9)     // Catch:{ Exception -> 0x03cd }
            java.lang.String r9 = "#26FF6146"
            int r27 = android.graphics.Color.parseColor(r9)     // Catch:{ Exception -> 0x03cd }
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x03cd }
            int r28 = kg3.C76577a.m92151b(r9, r11)     // Catch:{ Exception -> 0x03cd }
            int r29 = kg3.C76577a.m92155f(r0, r6)     // Catch:{ Exception -> 0x03cd }
            r24 = r4
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ Exception -> 0x03cd }
            r9 = 33
            r5.setSpan(r4, r3, r2, r9)     // Catch:{ Exception -> 0x03cd }
        L_0x0439:
            if (r19 != 0) goto L_0x0470
            r2 = 0
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0470
            int r2 = r10.indexOf(r8)     // Catch:{ Exception -> 0x03cd }
            int r3 = r8.length()     // Catch:{ Exception -> 0x03cd }
            int r3 = r3 + r2
            go3.x r4 = new go3.x     // Catch:{ Exception -> 0x03cd }
            r25 = 12
            java.lang.String r8 = "#FA9D3B"
            int r26 = android.graphics.Color.parseColor(r8)     // Catch:{ Exception -> 0x03cd }
            java.lang.String r8 = "#26FA9D3B"
            int r27 = android.graphics.Color.parseColor(r8)     // Catch:{ Exception -> 0x03cd }
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x03cd }
            int r28 = kg3.C76577a.m92151b(r8, r11)     // Catch:{ Exception -> 0x03cd }
            int r29 = kg3.C76577a.m92155f(r0, r6)     // Catch:{ Exception -> 0x03cd }
            r24 = r4
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ Exception -> 0x03cd }
            r0 = 33
            r5.setSpan(r4, r2, r3, r0)     // Catch:{ Exception -> 0x03cd }
        L_0x0470:
            java.lang.String r0 = r1.f146724e     // Catch:{ Exception -> 0x03cd }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03cd }
            r2.<init>()     // Catch:{ Exception -> 0x03cd }
            r2.append(r7)     // Catch:{ Exception -> 0x03cd }
            r3 = r22
            r2.append(r3)     // Catch:{ Exception -> 0x03cd }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x03cd }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ Exception -> 0x03cd }
            goto L_0x04ac
        L_0x0487:
            r0 = move-exception
        L_0x0488:
            r18 = r5
            goto L_0x048f
        L_0x048b:
            r0 = move-exception
        L_0x048c:
            r20 = r2
            goto L_0x0488
        L_0x048f:
            java.lang.String r2 = r1.f146724e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r10)
        L_0x04ac:
            if (r18 == 0) goto L_0x04ed
            int r0 = r5.length()
            if (r0 != 0) goto L_0x04b6
            r13 = 1
            goto L_0x04b7
        L_0x04b6:
            r13 = 0
        L_0x04b7:
            if (r13 != 0) goto L_0x04ed
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            re1.a r0 = up1.C37521f.f99312V6
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x04d1
            int r0 = r1.f146727h
            r2 = 2
            if (r0 != r2) goto L_0x04ed
        L_0x04d1:
            r2 = r18
            r2.setText(r5)
            r3 = 0
            r2.setVisibility(r3)
            android.content.Context r0 = r20.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r3 = 2131099650(0x7f060002, float:1.781166E38)
            int r0 = r0.getColor(r3)
            r2.setTextColor(r0)
            goto L_0x04fd
        L_0x04ed:
            r2 = r20
            r3 = 2131306482(0x7f0927f2, float:1.8231164E38)
            android.view.View r0 = r2.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2 = 8
            r0.setVisibility(r2)
        L_0x04fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ue1.C52530g.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
    }

    /* renamed from: u5 */
    public C52528f mo73478u5(int i) {
        C52528f fVar = this.f146725f.get(i);
        C87412m.m108593f(fVar, "dataList[position]");
        return fVar;
    }

    /* renamed from: w5 */
    public void mo73479w5(int i) {
        notifyItemChanged(i);
    }

    /* renamed from: y5 */
    public void mo73480y5(int i) {
        notifyItemInserted(i);
    }
}

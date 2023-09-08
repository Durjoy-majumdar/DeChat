package jz1;

import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.GameLifeSessionStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import cz1.C45230i;
import cz1.C7143c;
import cz1.C7144e;
import cz1.C7148f;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import hz1.C46161a;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jz1.C46595b;
import o40.C61926c;
import org.json.JSONObject;
import p196ln.C76705f;
import rx3.C13598b0;
import sw1.C48478n;
import we3.C78592b;
import wy1.C53224d;
import xy1.C53472h;
import xy1.C79011i;

/* renamed from: jz1.q */
public final class C46615q {

    /* renamed from: a */
    public C46628v f125548a;

    /* renamed from: b */
    public final C46595b f125549b;

    /* renamed from: c */
    public boolean f125550c = true;

    /* renamed from: d */
    public final C53472h f125551d = ((C53472h) C86312j.m106911c(C53472h.class));

    /* renamed from: e */
    public final C45230i f125552e = ((C53224d) C86312j.m106911c(C53224d.class)).zx0();

    /* renamed from: f */
    public final C46622d f125553f = new C46622d(this);

    /* renamed from: g */
    public final MStorage.IOnStorageChange f125554g = new C46617b(this);

    /* renamed from: h */
    public final MStorage.IOnStorageChange f125555h = new C46621c(this);

    /* renamed from: jz1.q$a */
    public static final class C46616a extends C87413o implements C32227p<Boolean, List<? extends C7143c>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C46615q f125556d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46616a(C46615q qVar) {
            super(2);
            this.f125556d = qVar;
        }

        public Object invoke(Object obj, Object obj2) {
            C46628v vVar;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            List list = (List) obj2;
            C87412m.m108594g(list, "result");
            if (!booleanValue) {
                C46628v vVar2 = this.f125556d.f125548a;
                if (vVar2 != null) {
                    vVar2.mo66479D5();
                }
            } else {
                C46595b bVar = this.f125556d.f125549b;
                bVar.getClass();
                C61926c.m72668M(new C46601e(bVar, list));
                C46628v vVar3 = this.f125556d.f125548a;
                if (vVar3 != null) {
                    vVar3.mo66484N5();
                }
                int i = 1;
                if (list.size() < 15 && (vVar = this.f125556d.f125548a) != null) {
                    vVar.mo66478D2(true);
                }
                C46615q qVar = this.f125556d;
                qVar.getClass();
                C61926c.m72668M(new C46613o(qVar));
                C46615q qVar2 = this.f125556d;
                qVar2.getClass();
                Log.m105924i("GameLife.ConversationPresenter", "checkHistoryConversation");
                ((C48478n) C86312j.m106911c(C48478n.class)).mo65694tC(new C46614p(qVar2));
                int w2 = this.f125556d.f125549b.mo71886w2();
                long j = C46161a.f124440a;
                GameLifeSessionStruct gameLifeSessionStruct = new GameLifeSessionStruct();
                gameLifeSessionStruct.f107922d = 2;
                gameLifeSessionStruct.f107923e = 202;
                gameLifeSessionStruct.f107924f = 0;
                gameLifeSessionStruct.f107925g = 1;
                gameLifeSessionStruct.f107926h = j;
                gameLifeSessionStruct.f107933o = (long) w2;
                JSONObject jSONObject = new JSONObject();
                if (w2 == 0) {
                    i = 2;
                }
                jSONObject.put("list_state", i);
                gameLifeSessionStruct.mo62729s(URLEncoder.encode(jSONObject.toString()));
                gameLifeSessionStruct.mo86054n();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: jz1.q$b */
    public static final class C46617b implements MStorage.IOnStorageChange {

        /* renamed from: d */
        public final /* synthetic */ C46615q f125557d;

        /* renamed from: jz1.q$b$a */
        public static final class C46618a extends C87413o implements C32227p<Boolean, C7143c, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C46615q f125558d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C46618a(C46615q qVar) {
                super(2);
                this.f125558d = qVar;
            }

            public Object invoke(Object obj, Object obj2) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C7143c cVar = (C7143c) obj2;
                C87412m.m108594g(cVar, "result");
                if (booleanValue) {
                    C46595b bVar = this.f125558d.f125549b;
                    bVar.getClass();
                    C61926c.m72668M(new C46600d(bVar, cVar));
                    C46615q qVar = this.f125558d;
                    qVar.getClass();
                    C61926c.m72668M(new C46613o(qVar));
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: jz1.q$b$b */
        public static final class C46619b extends C87413o implements C32227p<Boolean, C7143c, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C46615q f125559d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C46619b(C46615q qVar) {
                super(2);
                this.f125559d = qVar;
            }

            public Object invoke(Object obj, Object obj2) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C7143c cVar = (C7143c) obj2;
                C87412m.m108594g(cVar, "result");
                if (booleanValue) {
                    C46595b bVar = this.f125559d.f125549b;
                    bVar.getClass();
                    C61926c.m72668M(new C46602f(bVar, cVar));
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: jz1.q$b$c */
        public static final class C46620c extends C87413o implements C32227p<Boolean, List<? extends C7143c>, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C46615q f125560d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C46620c(C46615q qVar) {
                super(2);
                this.f125560d = qVar;
            }

            public Object invoke(Object obj, Object obj2) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                List list = (List) obj2;
                C87412m.m108594g(list, "list");
                if (booleanValue) {
                    C46595b bVar = this.f125560d.f125549b;
                    bVar.getClass();
                    C61926c.m72668M(new C46601e(bVar, list));
                    C46615q qVar = this.f125560d;
                    qVar.getClass();
                    C61926c.m72668M(new C46613o(qVar));
                }
                return C13598b0.f38549a;
            }
        }

        public C46617b(C46615q qVar) {
            this.f125557d = qVar;
        }

        public final void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Object obj = mStorageEventData.obj;
            if (obj instanceof C7143c) {
                int i = mStorageEventData.eventId;
                if (i == 1 || i == 2) {
                    C7144e.f25118a.mo8336a((C7143c) obj, new C46618a(this.f125557d));
                } else if (i == 3) {
                    C46595b bVar = this.f125557d.f125549b;
                    C7143c cVar = (C7143c) obj;
                    bVar.getClass();
                    C87412m.m108594g(cVar, "conversation");
                    C61926c.m72668M(new C46599c(bVar, cVar));
                    C46615q qVar = this.f125557d;
                    qVar.getClass();
                    C61926c.m72668M(new C46613o(qVar));
                } else if (i == 4 || i == 5) {
                    C7144e.f25118a.mo8336a((C7143c) obj, new C46619b(this.f125557d));
                } else if (i == 8) {
                    int w2 = this.f125557d.f125549b.mo71886w2();
                    C46620c cVar2 = new C46620c(this.f125557d);
                    List<C7143c> Xs = ((C53224d) C86312j.m106911c(C53224d.class)).zx0().mo70734Xs(0, w2);
                    for (C7143c cVar3 : Xs) {
                        ((C76705f) C86312j.m106911c(C76705f.class)).mo106829VT().loadBitmap(cVar3.field_selfUserName);
                    }
                    C7144e.f25118a.mo8337b(Xs, new C7148f(cVar2));
                }
                Log.m105918d("GameLife.ConversationPresenter", "conversationStorageChange " + mStorageEventData.obj + ' ' + mStorageEventData.eventId);
            }
        }
    }

    /* renamed from: jz1.q$c */
    public static final class C46621c implements MStorage.IOnStorageChange {

        /* renamed from: d */
        public final /* synthetic */ C46615q f125561d;

        public C46621c(C46615q qVar) {
            this.f125561d = qVar;
        }

        public final void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Log.m105925i("GameLife.ConversationPresenter", "onGameLifeContactStorageChange eventId:[%d]", Integer.valueOf(mStorageEventData.eventId));
            if (mStorageEventData.eventId == 3) {
                C46615q qVar = this.f125561d;
                Object obj = mStorageEventData.obj;
                qVar.getClass();
                if (obj instanceof String) {
                    if (((CharSequence) obj).length() > 0) {
                        LinkedList<C7143c> linkedList = qVar.f125549b.f125504g;
                        ArrayList arrayList = new ArrayList();
                        for (T next : linkedList) {
                            C7143c cVar = (C7143c) next;
                            if (C87412m.m108589b(cVar.field_selfUserName, obj) || C87412m.m108589b(cVar.field_talker, obj)) {
                                arrayList.add(next);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C7143c cVar2 = (C7143c) it.next();
                            Log.m105924i("GameLife.ConversationPresenter", "[onContactStorageChange] username=" + obj);
                            C78592b a = C78592b.C53158a.m59566a();
                            if (a != null) {
                                a.mo108585Rr(cVar2.field_sessionId);
                                a.mo108585Rr(cVar2.field_selfUserName);
                            }
                            C7144e.f25118a.mo8336a(cVar2, new C46624r(qVar));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: jz1.q$d */
    public static final class C46622d implements C46595b.C46597b {

        /* renamed from: a */
        public final /* synthetic */ C46615q f125562a;

        public C46622d(C46615q qVar) {
            this.f125562a = qVar;
        }

        /* renamed from: a */
        public void mo71887a(View view, int i, C7143c cVar) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(cVar, "conversation");
            ((C79011i) C86312j.m106911c(C79011i.class)).mo71417oN();
            C46628v vVar = this.f125562a.f125548a;
            if (vVar != null) {
                String str = cVar.field_sessionId;
                C87412m.m108593f(str, "conversation.field_sessionId");
                String str2 = cVar.field_selfUserName;
                C87412m.m108593f(str2, "conversation.field_selfUserName");
                String str3 = cVar.field_talker;
                C87412m.m108593f(str3, "conversation.field_talker");
                vVar.mo66483M4(str, str2, str3);
            }
        }
    }

    /* renamed from: jz1.q$e */
    public static final class C46623e extends C87413o implements C32227p<Boolean, List<? extends C7143c>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C46615q f125563d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C46623e(C46615q qVar) {
            super(2);
            this.f125563d = qVar;
        }

        public Object invoke(Object obj, Object obj2) {
            C46628v vVar;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            List list = (List) obj2;
            C87412m.m108594g(list, "result");
            if (!booleanValue) {
                C46628v vVar2 = this.f125563d.f125548a;
                if (vVar2 != null) {
                    vVar2.mo66485O2();
                }
            } else {
                C46595b bVar = this.f125563d.f125549b;
                bVar.getClass();
                C61926c.m72668M(new C46603g(bVar, list));
                C46628v vVar3 = this.f125563d.f125548a;
                if (vVar3 != null) {
                    vVar3.mo66482L4(list.size());
                }
                if (list.size() < 10 && (vVar = this.f125563d.f125548a) != null) {
                    vVar.mo66478D2(false);
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C46615q(C46628v vVar, C46595b bVar) {
        C87412m.m108594g(bVar, "adapter");
        this.f125548a = vVar;
        this.f125549b = bVar;
    }

    /* renamed from: a */
    public void mo71896a() {
        C46616a aVar = new C46616a(this);
        List<C7143c> Xs = ((C53224d) C86312j.m106911c(C53224d.class)).zx0().mo70734Xs(0, 15);
        for (C7143c cVar : Xs) {
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106829VT().loadBitmap(cVar.field_selfUserName);
        }
        C7144e.f25118a.mo8337b(Xs, new C7148f(aVar));
    }

    /* renamed from: b */
    public void mo71897b() {
        int w2 = this.f125549b.mo71886w2();
        C46623e eVar = new C46623e(this);
        List<C7143c> Xs = ((C53224d) C86312j.m106911c(C53224d.class)).zx0().mo70734Xs(w2, 10);
        for (C7143c cVar : Xs) {
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106829VT().loadBitmap(cVar.field_selfUserName);
        }
        C7144e.f25118a.mo8337b(Xs, new C7148f(eVar));
    }
}

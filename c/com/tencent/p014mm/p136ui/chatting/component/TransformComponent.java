package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ExtTranslateVoiceEvent;
import com.tencent.p014mm.autogen.events.ExtVoiceTransformTextResultEvent;
import com.tencent.p014mm.autogen.events.RecallVoiceTransTextActEvent;
import com.tencent.p014mm.autogen.events.VoicePlayStopEvent;
import com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C30745h5;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kd0.C76546u;
import kd0.C76552z;
import nj3.C76879j;
import nj3.C76912y0;
import p227rn.C48053v;
import p270xi.C91212b;
import rb0.C47984k;
import zj3.C79347d1;
import zj3.C79348e;
import zj3.C79362h1;
import zj3.C79368l;

@C91212b(exportInterface = C79347d1.class)
/* renamed from: com.tencent.mm.ui.chatting.component.TransformComponent */
public class TransformComponent extends C73412a implements C79347d1 {

    /* renamed from: p */
    public static HashMap<Long, String> f215667p = new HashMap<>();

    /* renamed from: q */
    public static HashMap<Long, ChattingItemTranslate.C73918e> f215668q = new HashMap<>();

    /* renamed from: r */
    public static LinkedHashMap<Long, Pair<C72963f4, Integer>> f215669r = new LinkedHashMap<>();

    /* renamed from: s */
    public static HashMap<Long, Boolean> f215670s = new HashMap<>();

    /* renamed from: t */
    public static ArrayList<Long> f215671t = new ArrayList<>();

    /* renamed from: u */
    public static HashMap<Long, C73396c> f215672u = new HashMap<>();

    /* renamed from: e */
    public IListener<RecallVoiceTransTextActEvent> f215673e = new IListener<RecallVoiceTransTextActEvent>(C40008f.f107254d) {
        {
            this.__eventId = 2127530956;
        }

        public boolean callback(IEvent iEvent) {
            RecallVoiceTransTextActEvent recallVoiceTransTextActEvent = (RecallVoiceTransTextActEvent) iEvent;
            C73396c cVar = TransformComponent.f215672u.get(Long.valueOf(recallVoiceTransTextActEvent.f193871d.f193872a));
            if (cVar != null) {
                Log.m105925i("MicroMsg.TransformComponent", "RecallVoiceTransTextActEvent %s %s", Long.valueOf(recallVoiceTransTextActEvent.f193871d.f193872a), Integer.valueOf(cVar.f215690b));
                TransformComponent.this.mo102294c6(cVar.f215689a, cVar.f215690b);
            }
            return false;
        }
    };

    /* renamed from: f */
    public boolean f215674f = false;

    /* renamed from: g */
    public boolean f215675g = false;

    /* renamed from: h */
    public boolean f215676h = false;

    /* renamed from: i */
    public List<Long> f215677i = new ArrayList();

    /* renamed from: j */
    public boolean f215678j = false;

    /* renamed from: n */
    public long f215679n;

    /* renamed from: o */
    public int f215680o = -1;

    /* renamed from: com.tencent.mm.ui.chatting.component.TransformComponent$a */
    public class C73394a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ExtTranslateVoiceEvent f215682d;

        /* renamed from: e */
        public final /* synthetic */ int f215683e;

        /* renamed from: f */
        public final /* synthetic */ C72963f4 f215684f;

        public C73394a(ExtTranslateVoiceEvent extTranslateVoiceEvent, int i, C72963f4 f4Var) {
            this.f215682d = extTranslateVoiceEvent;
            this.f215683e = i;
            this.f215684f = f4Var;
        }

        public void run() {
            C72963f4 f4Var;
            if (TransformComponent.this.mo102282C4(Long.valueOf(this.f215682d.f193561d.f193564b).longValue())) {
                ExtTranslateVoiceEvent.C67685b bVar = this.f215682d.f193562e;
                if (bVar.f193570b) {
                    if (Util.isNullOrNil(bVar.f193569a)) {
                        ExtTranslateVoiceEvent extTranslateVoiceEvent = this.f215682d;
                        if (extTranslateVoiceEvent.f193562e.f193571c == 2) {
                            Log.m105925i("MicroMsg.TransformComponent", "go VoiceTransTextAct translateVoice fail msgId:%s", extTranslateVoiceEvent.f193561d.f193564b);
                            TransformComponent transformComponent = TransformComponent.this;
                            String string = transformComponent.mo102291a6().getString(C0966R.string.f360275bc3);
                            C67391b bVar2 = transformComponent.f215752d;
                            if (!(bVar2 == null || bVar2.mo91565f() == null)) {
                                C76912y0.m92767f(transformComponent.mo102291a6(), string);
                            }
                        }
                        TransformComponent.this.mo102296e6(Long.valueOf(this.f215682d.f193561d.f193564b).longValue());
                        TransformComponent.this.mo102295d6(Long.valueOf(this.f215682d.f193561d.f193564b).longValue());
                        TransformComponent transformComponent2 = TransformComponent.this;
                        transformComponent2.f215678j = false;
                        transformComponent2.mo102292b6();
                    } else {
                        Log.m105925i("MicroMsg.TransformComponent", "go VoiceTransTextAct isCompleted msgId:%s", this.f215682d.f193561d.f193564b);
                        TransformComponent transformComponent3 = TransformComponent.this;
                        long longValue = Long.valueOf(this.f215682d.f193561d.f193564b).longValue();
                        synchronized (transformComponent3) {
                            Pair pair = TransformComponent.f215669r.get(Long.valueOf(longValue));
                            f4Var = pair == null ? null : (C72963f4) pair.first;
                        }
                        if (f4Var != null) {
                            TransformComponent.this.mo102289Z5(Long.valueOf(this.f215682d.f193561d.f193564b).longValue(), this.f215682d.f193562e.f193569a, ChattingItemTranslate.C73918e.Transformed);
                            f4Var.mo108743W2(f4Var.f230723F | 64);
                            ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var);
                            TransformComponent.this.mo102295d6(Long.valueOf(this.f215682d.f193561d.f193564b).longValue());
                            TransformComponent.this.mo102292b6();
                            TransformComponent.this.mo102298g6(this.f215683e);
                        }
                        TransformComponent.this.f215678j = false;
                    }
                    if (34 == this.f215684f.getType()) {
                        TransformComponent.f215672u.put(Long.valueOf(this.f215684f.getMsgId()), new C73396c(this.f215684f, this.f215683e));
                    } else {
                        TransformComponent.this.mo102294c6(this.f215684f, this.f215683e);
                    }
                } else {
                    if (!Util.isNullOrNil(bVar.f193569a)) {
                        TransformComponent.this.mo102289Z5(Long.valueOf(this.f215682d.f193561d.f193564b).longValue(), this.f215682d.f193562e.f193569a, ChattingItemTranslate.C73918e.Transforming);
                        Log.m105925i("MicroMsg.TransformComponent", "go VoiceTransTextAct refresh msgId:%s", this.f215682d.f193561d.f193564b);
                    }
                    TransformComponent.this.mo102292b6();
                    TransformComponent.this.mo102298g6(this.f215683e);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.TransformComponent$b */
    public class C73395b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f215686d;

        /* renamed from: e */
        public final /* synthetic */ C72963f4 f215687e;

        public C73395b(int i, C72963f4 f4Var) {
            this.f215686d = i;
            this.f215687e = f4Var;
        }

        public void run() {
            Pair pair;
            synchronized (TransformComponent.this) {
                Iterator<Map.Entry<Long, Pair<C72963f4, Integer>>> it = TransformComponent.f215669r.entrySet().iterator();
                pair = it.hasNext() ? (Pair) it.next().getValue() : null;
            }
            if (pair != null) {
                TransformComponent transformComponent = TransformComponent.this;
                if (transformComponent.f215674f) {
                    transformComponent.mo102288Y5(4);
                }
                TransformComponent.this.mo102287Y4((C72963f4) pair.first, false, ((Integer) pair.second).intValue(), 0);
                return;
            }
            if (this.f215686d != -1) {
                C72963f4 item = ((C79368l) TransformComponent.this.f215752d.f193278b.mo102812a(C79368l.class)).getItem(this.f215686d + 1);
                if (item != null && item.mo100995g4() && item.mo108769t2() == 0) {
                    TransformComponent transformComponent2 = TransformComponent.this;
                    if (transformComponent2.f215676h) {
                        transformComponent2.f215676h = false;
                        transformComponent2.mo102288Y5(2);
                        new VoicePlayStopEvent().asyncPublish(Looper.getMainLooper());
                        return;
                    }
                }
                if (item == null || !item.mo100995g4() || item.mo108769t2() != 0 || C76552z.m92079q(item)) {
                    TransformComponent.this.mo102288Y5(0);
                } else {
                    TransformComponent transformComponent3 = TransformComponent.this;
                    if (!transformComponent3.f215674f) {
                        ((ArrayList) transformComponent3.f215677i).add(Long.valueOf(this.f215687e.getMsgId()));
                    }
                    TransformComponent transformComponent4 = TransformComponent.this;
                    transformComponent4.f215674f = true;
                    ((ArrayList) transformComponent4.f215677i).add(Long.valueOf(item.getMsgId()));
                    C76552z.m92082t(item);
                    TransformComponent.this.mo102287Y4(item, false, this.f215686d + 1, 0);
                    return;
                }
            }
            new VoicePlayStopEvent().asyncPublish(Looper.getMainLooper());
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.TransformComponent$c */
    public static class C73396c {

        /* renamed from: a */
        public C72963f4 f215689a;

        /* renamed from: b */
        public int f215690b;

        public C73396c(C72963f4 f4Var, int i) {
            this.f215689a = f4Var;
            this.f215690b = i;
        }
    }

    /* renamed from: C4 */
    public synchronized boolean mo102282C4(long j) {
        return f215669r.containsKey(Long.valueOf(j));
    }

    /* renamed from: E2 */
    public boolean mo102283E2(long j) {
        return f215671t.contains(Long.valueOf(j));
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        Log.m105924i("MicroMsg.TransformComponent", "[onChattingPause]");
        mo102300r3(3);
    }

    /* renamed from: H4 */
    public synchronized boolean mo102284H4(long j) {
        Boolean bool = f215670s.get(Long.valueOf(j));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: J1 */
    public void mo102285J1(long j) {
        f215671t.remove(Long.valueOf(j));
    }

    /* renamed from: M4 */
    public synchronized String mo102286M4(long j, String str) {
        String str2;
        C30745h5 jo;
        str2 = f215667p.get(Long.valueOf(j));
        if (Util.isNullOrNil(str2) && (jo = C76546u.wx0().mo57655jo(str)) != null && !Util.isNullOrNil(jo.field_content)) {
            str2 = jo.field_content;
        }
        return str2;
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        this.f215673e.alive();
    }

    /* renamed from: W5 */
    public void mo26189W5(View view, int i, int i2, int i3) {
        if (i < this.f215680o) {
            this.f215675g = false;
        }
        this.f215680o = i;
    }

    /* renamed from: Y4 */
    public void mo102287Y4(C72963f4 f4Var, boolean z, int i, int i2) {
        ChattingItemTranslate.C73918e eVar = ChattingItemTranslate.C73918e.PreTransform;
        if (f4Var == null) {
            Log.m105918d("MicroMsg.TransformComponent", "go VoiceTransTextAct need MsgInfo but null");
            return;
        }
        int i3 = 2;
        if (mo102284H4(f4Var.getMsgId())) {
            Log.m105925i("MicroMsg.TransformComponent", "go VoiceTransTextAct unsetflag MsgId:%s,isVoiceTransforming:%s", Long.valueOf(f4Var.getMsgId()), Boolean.valueOf(this.f215678j));
            f4Var.mo108743W2(f4Var.f230723F & -65);
            long msgId = f4Var.getMsgId();
            synchronized (this) {
                f215670s.put(Long.valueOf(msgId), Boolean.FALSE);
            }
            mo102292b6();
        } else if (!mo102282C4(f4Var.getMsgId()) || !z) {
            Log.m105919d("MicroMsg.TransformComponent", "voice to text, pos:%s", Integer.valueOf(i));
            C30745h5 jo = C76546u.wx0().mo57655jo(f4Var.mo108765s2());
            if (jo == null || Util.isNullOrNil(jo.field_content)) {
                int m = C97625j3.m125815e().mo123467m();
                if (m == 4 || m == 6) {
                    if (this.f215678j) {
                        Log.m105924i("MicroMsg.TransformComponent", "go VoiceTransformText insert transformQueue");
                        long msgId2 = f4Var.getMsgId();
                        synchronized (this) {
                            f215669r.put(Long.valueOf(msgId2), new Pair(f4Var, Integer.valueOf(i)));
                        }
                        mo102289Z5(f4Var.getMsgId(), "", eVar);
                        mo102292b6();
                    } else {
                        ExtTranslateVoiceEvent extTranslateVoiceEvent = new ExtTranslateVoiceEvent();
                        extTranslateVoiceEvent.f193561d.f193565c = 1;
                        extTranslateVoiceEvent.publish();
                        ((C79362h1) this.f215752d.f193278b.mo102812a(C79362h1.class)).mo102336h4(f4Var.getMsgId());
                        ExtTranslateVoiceEvent extTranslateVoiceEvent2 = new ExtTranslateVoiceEvent();
                        extTranslateVoiceEvent2.f193561d.f193564b = String.valueOf(f4Var.getMsgId());
                        extTranslateVoiceEvent2.f193561d.f193563a = f4Var.mo108765s2();
                        ExtTranslateVoiceEvent.C67684a aVar = extTranslateVoiceEvent2.f193561d;
                        aVar.f193566d = 1;
                        aVar.f193565c = 0;
                        Class cls = C79348e.class;
                        if (C45628s0.m50738C(this.f215752d.mo91577r())) {
                            i3 = ((C79348e) this.f215752d.f193278b.mo102812a(cls)).mo70071q1() ? ((C79348e) this.f215752d.f193278b.mo102812a(cls)).mo70075s4() ? 5 : 4 : C47984k.m53335i(this.f215752d.mo91577r()) ? 3 : ((C48053v) C86312j.m106911c(C48053v.class)).mo72617gl(this.f215752d.mo91577r()) ? 0 : C47984k.m53340n(this.f215752d.mo91577r()) ? 6 : 7;
                        } else if (!this.f215752d.mo91582w()) {
                            i3 = 1;
                        }
                        aVar.f193568f = i3;
                        extTranslateVoiceEvent2.f193561d.f193567e = new C73394a(extTranslateVoiceEvent2, i, f4Var);
                        if (34 == f4Var.getType()) {
                            f215671t.add(Long.valueOf(f4Var.getMsgId()));
                        }
                        mo102289Z5(Long.valueOf(extTranslateVoiceEvent2.f193561d.f193564b).longValue(), "", ChattingItemTranslate.C73918e.Transforming);
                        long msgId3 = f4Var.getMsgId();
                        synchronized (this) {
                            f215669r.put(Long.valueOf(msgId3), new Pair(f4Var, Integer.valueOf(i)));
                        }
                        this.f215678j = true;
                        this.f215679n = f4Var.getMsgId();
                        mo102292b6();
                        mo102298g6(i);
                        if (extTranslateVoiceEvent2.publish()) {
                            Log.m105924i("MicroMsg.TransformComponent", "go VoiceTransTextAct publish ExtTranslateVoiceEvent");
                        } else {
                            Log.m105924i("MicroMsg.TransformComponent", "go VoiceTransTextAct publish ExtTranslateVoiceEvent fail");
                            String string = mo102291a6().getString(C0966R.string.f360275bc3);
                            C67391b bVar = this.f215752d;
                            if (!(bVar == null || bVar.mo91565f() == null)) {
                                C76912y0.m92767f(mo102291a6(), string);
                            }
                            mo102296e6(Long.valueOf(extTranslateVoiceEvent2.f193561d.f193564b).longValue());
                            mo102295d6(Long.valueOf(extTranslateVoiceEvent2.f193561d.f193564b).longValue());
                            this.f215678j = false;
                            mo102294c6(f4Var, i);
                        }
                    }
                    if (z) {
                        this.f215675g = true;
                        return;
                    }
                    return;
                }
                C76879j.m92738i(mo102291a6(), C0966R.string.bc4, C0966R.string.a3h);
                mo102297f6(2, f4Var);
                this.f215674f = false;
                return;
            }
            Log.m105925i("MicroMsg.TransformComponent", "alvinluo VoiceTransformText has TransContent MsgId:%s, clientMsgId: %s", Long.valueOf(f4Var.getMsgId()), f4Var.mo108765s2());
            f4Var.mo108743W2(f4Var.f230723F | 64);
            mo102289Z5(f4Var.getMsgId(), jo.field_content, ChattingItemTranslate.C73918e.Transformed);
            ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var);
            this.f215674f = false;
            mo102298g6(i);
        } else {
            if (mo102299h5(f4Var.getMsgId()) == eVar) {
                Log.m105924i("MicroMsg.TransformComponent", "go VoiceTransTextAct unsetflag removeCache");
                mo102295d6(f4Var.getMsgId());
                mo102296e6(f4Var.getMsgId());
                mo102297f6(5, f4Var);
            } else if (this.f215678j) {
                ExtTranslateVoiceEvent extTranslateVoiceEvent3 = new ExtTranslateVoiceEvent();
                extTranslateVoiceEvent3.f193561d.f193565c = 3;
                extTranslateVoiceEvent3.publish();
                mo102295d6(f4Var.getMsgId());
                mo102296e6(f4Var.getMsgId());
                f4Var.mo108743W2(f4Var.f230723F & -65);
                ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var);
                this.f215678j = false;
                mo102294c6(f4Var, -1);
            }
            mo102292b6();
            if (z) {
                mo102288Y5(i2);
            }
        }
    }

    /* renamed from: Y5 */
    public final void mo102288Y5(int i) {
        if (this.f215674f && ((ArrayList) this.f215677i).size() > 0) {
            String l = ((Long) ((ArrayList) this.f215677i).get(0)).toString();
            for (int i2 = 1; i2 < ((ArrayList) this.f215677i).size(); i2++) {
                l = l + XVFSFile.PATH_SEPARATOR + ((ArrayList) this.f215677i).get(i2);
            }
            C115669n.INSTANCE.mo160131h(16128, Integer.valueOf(i), Integer.valueOf(((ArrayList) this.f215677i).size()), Integer.valueOf(true ^ this.f215675g ? 1 : 0), 0, l);
            this.f215674f = false;
            ((ArrayList) this.f215677i).clear();
        }
    }

    /* renamed from: Z5 */
    public synchronized void mo102289Z5(long j, String str, ChattingItemTranslate.C73918e eVar) {
        f215667p.put(Long.valueOf(j), str);
        f215668q.put(Long.valueOf(j), eVar);
        if (eVar == ChattingItemTranslate.C73918e.Transformed) {
            f215670s.put(Long.valueOf(j), Boolean.TRUE);
        }
    }

    /* renamed from: a2 */
    public boolean mo102290a2(C72963f4 f4Var) {
        return f4Var != null && !Util.isNullOrNil(mo102286M4(f4Var.getMsgId(), f4Var.mo108765s2()));
    }

    /* renamed from: a6 */
    public final Context mo102291a6() {
        C67391b bVar = this.f215752d;
        return bVar != null ? bVar.mo91565f() : MMApplicationContext.getContext();
    }

    /* renamed from: b6 */
    public final void mo102292b6() {
        C67391b bVar = this.f215752d;
        if (bVar != null) {
            bVar.mo91540A();
        }
    }

    /* renamed from: c4 */
    public boolean mo102293c4() {
        return !((Boolean) C97625j3.m125812b().mo105906u().mo119684e(75, Boolean.FALSE)).booleanValue();
    }

    /* renamed from: c6 */
    public final synchronized void mo102294c6(C72963f4 f4Var, int i) {
        C67391b bVar = this.f215752d;
        MMHandler l = bVar != null ? bVar.mo91571l() : null;
        if (l != null) {
            l.post(new C73395b(i, f4Var));
        }
    }

    /* renamed from: d6 */
    public final synchronized void mo102295d6(long j) {
        if (f215669r.containsKey(Long.valueOf(j))) {
            f215669r.remove(Long.valueOf(j));
        }
    }

    /* renamed from: e6 */
    public final synchronized void mo102296e6(long j) {
        f215667p.remove(Long.valueOf(j));
        f215668q.remove(Long.valueOf(j));
    }

    /* renamed from: f6 */
    public final void mo102297f6(int i, C72963f4 f4Var) {
        if (f4Var != null) {
            ExtVoiceTransformTextResultEvent extVoiceTransformTextResultEvent = new ExtVoiceTransformTextResultEvent();
            ExtVoiceTransformTextResultEvent.C67689a aVar = extVoiceTransformTextResultEvent.f193580d;
            aVar.getClass();
            aVar.f193581a = f4Var.mo108765s2();
            extVoiceTransformTextResultEvent.f193580d.f193582b = i;
            extVoiceTransformTextResultEvent.publish();
        }
    }

    /* renamed from: g6 */
    public final void mo102298g6(int i) {
        if (this.f215675g && i != -1) {
            C67391b bVar = this.f215752d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C67391b bVar2 = bVar;
            C117292a.m165358d(bVar2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/TransformComponent", "scrollTo", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            bVar.mo91544E(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(bVar2, "com/tencent/mm/ui/chatting/component/TransformComponent", "scrollTo", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        }
    }

    /* renamed from: h5 */
    public synchronized ChattingItemTranslate.C73918e mo102299h5(long j) {
        ChattingItemTranslate.C73918e eVar;
        eVar = f215668q.get(Long.valueOf(j));
        if (eVar == null) {
            eVar = ChattingItemTranslate.C73918e.NoTransform;
        }
        return eVar;
    }

    /* renamed from: n2 */
    public void mo26199n2() {
        Log.m105924i("MicroMsg.TransformComponent", "clear VoiceTransTextAct");
        synchronized (this) {
            f215669r.clear();
        }
        f215668q.clear();
        f215669r.clear();
        f215670s.clear();
        if (this.f215678j) {
            ExtTranslateVoiceEvent extTranslateVoiceEvent = new ExtTranslateVoiceEvent();
            extTranslateVoiceEvent.f193561d.f193565c = 3;
            extTranslateVoiceEvent.publish();
            this.f215678j = false;
        }
        Log.m105924i("MicroMsg.TransformComponent", "alvinluo hide transformText");
        ThreadPool.post(new C73478f5(this), "UnsetTransformFlag");
    }

    /* renamed from: r3 */
    public void mo102300r3(int i) {
        C72963f4 f4Var;
        if (i == 2) {
            this.f215676h = true;
        } else if (this.f215678j) {
            long j = this.f215679n;
            synchronized (this) {
                Pair pair = f215669r.get(Long.valueOf(j));
                f4Var = pair == null ? null : (C72963f4) pair.first;
            }
            mo102287Y4(f4Var, true, -1, i);
        }
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        this.f215673e.dead();
    }

    /* renamed from: z2 */
    public void mo102301z2() {
        C97625j3.m125812b().mo105906u().mo119676J(75, Boolean.TRUE);
    }
}

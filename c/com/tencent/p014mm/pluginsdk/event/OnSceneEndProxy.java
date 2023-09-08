package com.tencent.p014mm.pluginsdk.event;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.NetSceneResponseEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import f40.C86709a0;
import java.util.HashMap;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.pluginsdk.event.OnSceneEndProxy */
public abstract class OnSceneEndProxy<T extends IEvent> extends IListener<T> implements C11385n {

    /* renamed from: e */
    public static HashMap<C117747y, IEvent> f120792e = new HashMap<>();

    /* renamed from: d */
    public int f120793d = 0;

    static {
        new HashMap();
    }

    public OnSceneEndProxy() {
        super(C40008f.f107254d);
    }

    /* renamed from: e */
    public void mo69320e() {
        if (this.f120793d == 0) {
            C86709a0.m107524d().mo123455a(mo62732i(), this);
        }
        this.f120793d++;
    }

    /* renamed from: f */
    public abstract C117747y mo62730f(T t);

    /* renamed from: g */
    public abstract IEvent mo62731g(int i, int i2, String str, C117747y yVar, T t);

    /* renamed from: h */
    public void mo69321h(T t) {
        C117747y f = mo62730f(t);
        if (f != null) {
            C86709a0.m107524d().mo123460f(f);
            f120792e.put(f, t);
        }
    }

    /* renamed from: i */
    public abstract int mo62732i();

    /* renamed from: j */
    public void mo69322j() {
        int i = this.f120793d;
        if (i != 0) {
            int i2 = i - 1;
            this.f120793d = i2;
            if (i2 == 0) {
                C86709a0.m107524d().mo123470p(mo62732i(), this);
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        IEvent remove;
        if (mo62732i() == yVar.getType() && (remove = f120792e.remove(yVar)) != null) {
            NetSceneResponseEvent netSceneResponseEvent = new NetSceneResponseEvent();
            netSceneResponseEvent.f107652d.f107656d = mo62731g(i, i2, str, yVar, remove);
            NetSceneResponseEvent.C40142a aVar = netSceneResponseEvent.f107652d;
            aVar.f107653a = i;
            aVar.f107654b = i2;
            aVar.f107655c = str;
            netSceneResponseEvent.publish();
        }
    }
}

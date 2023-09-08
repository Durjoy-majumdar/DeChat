package com.tencent.mapsdk.internal;

import java.util.HashMap;

/* renamed from: com.tencent.mapsdk.internal.jw */
public final class C104552jw<Key, Value> {

    /* renamed from: a */
    private int f309927a;

    /* renamed from: b */
    private C104552jw<Key, Value>.a f309928b;

    /* renamed from: c */
    private C104552jw<Key, Value>.a f309929c;

    /* renamed from: d */
    private HashMap<Key, C104552jw<Key, Value>.a> f309930d = new HashMap<>();

    /* renamed from: com.tencent.mapsdk.internal.jw$a */
    public class C104554a {

        /* renamed from: a */
        public Key f309931a;

        /* renamed from: b */
        public Value f309932b;

        /* renamed from: c */
        public C104552jw<Key, Value>.a f309933c;

        /* renamed from: d */
        public C104552jw<Key, Value>.a f309934d;

        public /* synthetic */ C104554a(C104552jw jwVar, Object obj, Object obj2, byte b) {
            this(obj, obj2);
        }

        private C104554a(Key key, Value value) {
            this.f309931a = key;
            this.f309932b = value;
        }
    }

    private C104552jw(int i) {
        this.f309927a = i;
    }

    /* renamed from: a */
    private void m139998a(Key key, Value value) {
        if (this.f309930d.containsKey(key)) {
            C104552jw<Key, Value>.a aVar = this.f309928b;
            while (true) {
                if (aVar == null) {
                    aVar = null;
                    break;
                } else if (aVar.f309931a.equals(key)) {
                    break;
                } else {
                    aVar = aVar.f309934d;
                }
            }
            if (aVar != null) {
                m139997a(aVar);
                return;
            }
            return;
        }
        if (this.f309930d.size() >= this.f309927a) {
            m139999a();
        }
        C104552jw<Key, Value>.a aVar2 = new C104554a(this, key, value, (byte) 0);
        C104552jw<Key, Value>.a aVar3 = this.f309929c;
        if (aVar3 == null) {
            this.f309929c = aVar2;
            this.f309928b = aVar2;
        } else {
            aVar3.f309934d = aVar2;
            aVar2.f309933c = aVar3;
            this.f309929c = aVar2;
        }
        this.f309930d.put(key, aVar2);
    }

    /* renamed from: b */
    private boolean m140001b(Key key) {
        return this.f309930d.remove(key) != null;
    }

    /* renamed from: c */
    private boolean m140003c() {
        return this.f309930d.isEmpty();
    }

    /* renamed from: d */
    private int m140004d() {
        return this.f309930d.size();
    }

    /* renamed from: e */
    private void m140005e() {
        this.f309930d.clear();
        this.f309929c = null;
        this.f309928b = null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C104552jw<Key, Value>.a aVar = this.f309928b;
        if (aVar.f309933c != null) {
            System.out.println("header的pre不为NULL!");
        }
        sb.append("header: \n");
        while (aVar != null) {
            sb.append(aVar.f309931a + "->");
            aVar = aVar.f309934d;
        }
        sb.append("\ntail: \n");
        C104552jw<Key, Value>.a aVar2 = this.f309929c;
        if (aVar2.f309934d != null) {
            System.out.println("tail的next不为NULL!");
        }
        while (aVar2 != null) {
            sb.append(aVar2.f309931a + "<-");
            aVar2 = aVar2.f309933c;
        }
        sb.append("\n");
        return sb.toString();
    }

    /* renamed from: b */
    private boolean m140000b() {
        return m139999a();
    }

    /* renamed from: c */
    private C104552jw<Key, Value>.a m140002c(Key key) {
        for (C104552jw<Key, Value>.a aVar = this.f309928b; aVar != null; aVar = aVar.f309934d) {
            if (aVar.f309931a.equals(key)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m139999a() {
        C104552jw<Key, Value>.a aVar = this.f309928b;
        C104552jw<Key, Value>.a aVar2 = aVar.f309934d;
        this.f309928b = aVar2;
        aVar2.f309933c = null;
        Key key = aVar.f309931a;
        if (key == null || this.f309930d.remove(key) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private Value m139996a(Key key) {
        C104554a aVar = this.f309930d.get(key);
        if (aVar == null) {
            return null;
        }
        m139997a((C104552jw<Key, Value>.a) aVar);
        return aVar.f309932b;
    }

    /* renamed from: a */
    private void m139997a(C104552jw<Key, Value>.a aVar) {
        C104552jw<Key, Value>.a aVar2;
        if (aVar != null && (aVar2 = this.f309929c) != aVar) {
            C104552jw<Key, Value>.a aVar3 = this.f309928b;
            if (aVar3 == aVar) {
                C104552jw<Key, Value>.a aVar4 = aVar3.f309934d;
                this.f309928b = aVar4;
                aVar4.f309933c = null;
            } else {
                C104552jw<Key, Value>.a aVar5 = aVar.f309933c;
                aVar5.f309934d = aVar.f309934d;
                aVar.f309934d.f309933c = aVar5;
            }
            aVar2.f309934d = aVar;
            aVar.f309933c = aVar2;
            this.f309929c = aVar;
            aVar.f309934d = null;
        }
    }
}

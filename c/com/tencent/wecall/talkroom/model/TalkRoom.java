package com.tencent.wecall.talkroom.model;

import android.text.TextUtils;
import as3.C103860b1;
import as3.C103905v;
import as3.C103914z0;
import bs3.C104161b;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroup;
import cs3.C106962a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nw3.C109777d;
import nw3.C109801h0;
import p978i9.C108421e;

public class TalkRoom extends MultiTalkGroup {

    /* renamed from: j */
    public C103914z0 f320124j;

    /* renamed from: n */
    public Map<String, C109777d> f320125n = new ConcurrentHashMap();

    /* renamed from: com.tencent.wecall.talkroom.model.TalkRoom$a */
    public static class C106946a implements Comparator<C109777d> {
        public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            C109777d dVar = (C109777d) obj;
            C109777d dVar2 = (C109777d) obj2;
            return 0;
        }
    }

    public TalkRoom(String str, Integer num, C103914z0 z0Var) {
        if (!TextUtils.isEmpty(str)) {
            if (C109801h0.m149216a(str)) {
                this.f320043e = str;
            } else {
                this.f320042d = str;
            }
            if (num != null) {
                this.f320045g = num.intValue();
            }
        }
        mo157176e(z0Var);
    }

    /* renamed from: f */
    public static C103905v m144660f(C103914z0 z0Var) {
        if (z0Var != null) {
            try {
                byte[] bArr = z0Var.f307243f;
                if (bArr != null) {
                    C103905v vVar = new C103905v();
                    C108421e.m146905c(vVar, bArr);
                    return vVar;
                }
            } catch (Exception e) {
                C104161b.m138997f("tagorewang:TalkRoom", "toPlayItemInfo err: ", e);
            }
        }
        return null;
    }

    /* renamed from: a */
    public List<C109777d> mo157172a() {
        ArrayList arrayList = new ArrayList(((ConcurrentHashMap) this.f320125n).values());
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, new C106946a());
        }
        C109777d dVar = (C109777d) ((ConcurrentHashMap) this.f320125n).get(C106962a.f320180a);
        arrayList.remove(dVar);
        arrayList.add(0, dVar);
        C109777d dVar2 = (C109777d) ((ConcurrentHashMap) this.f320125n).get(90100);
        if (dVar2 != null) {
            arrayList.remove(dVar2);
            arrayList.add(dVar2);
        }
        return arrayList;
    }

    /* renamed from: b */
    public C109777d mo157173b(String str) {
        return (C109777d) ((ConcurrentHashMap) this.f320125n).get(str);
    }

    /* renamed from: c */
    public List<C103860b1> mo157174c() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry value : ((ConcurrentHashMap) this.f320125n).entrySet()) {
            arrayList.add(((C109777d) value.getValue()).f328542a);
        }
        return arrayList;
    }

    /* renamed from: d */
    public String mo157175d() {
        C103914z0 z0Var = this.f320124j;
        if (z0Var != null && !TextUtils.isEmpty(z0Var.f307239b)) {
            return this.f320124j.f307239b;
        }
        C103914z0 z0Var2 = this.f320124j;
        if (z0Var2 == null || TextUtils.isEmpty(z0Var2.f307239b)) {
            ArrayList arrayList = new ArrayList(((ConcurrentHashMap) this.f320125n).values());
            arrayList.remove(((ConcurrentHashMap) this.f320125n).get(C106962a.f320180a));
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, new C106946a());
            }
            C104161b.m138995d("tagorewang:TalkRoom", "getOtherMembers size: ", Integer.valueOf(arrayList.size()), " all size: ", Integer.valueOf(((ConcurrentHashMap) this.f320125n).size()));
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            for (int i = 0; i != size; i++) {
                try {
                    ((C109777d) arrayList.get(i)).getClass();
                    sb.append((String) null);
                    if (i != size - 1) {
                        sb.append(12289);
                    }
                } catch (Exception e) {
                    C104161b.m138997f("tagorewang:TalkRoom", "updateRoomNameIfEmpty err and continue: ", e);
                }
            }
            if (sb.toString().length() > 0) {
                return sb.toString();
            }
        }
        C103914z0 z0Var3 = this.f320124j;
        if (z0Var3 != null && !TextUtils.isEmpty(z0Var3.f307239b)) {
            return this.f320124j.f307239b;
        }
        C104161b.m138997f("tagorewang:TalkRoom", "updateRoomNameIfEmpty still empty, groupId: ", this.f320042d, " tmpId: ", this.f320043e);
        return null;
    }

    /* renamed from: e */
    public void mo157176e(C103914z0 z0Var) {
        if (z0Var != null) {
            try {
                this.f320044f = z0Var.f307250m;
                this.f320046h = z0Var.f307249l;
                if (!(this.f320124j == null || z0Var.f307241d == 0)) {
                    C103905v f = m144660f(z0Var);
                    C103905v f2 = m144660f(this.f320124j);
                    if (f == null) {
                        z0Var.f307243f = this.f320124j.f307243f;
                    } else {
                        int i = f.f307183b;
                        if (i == 0 || i != f2.f307183b) {
                            C104161b.m138997f("tagorewang:TalkRoom", "setRoomInfo bad id: ", Integer.valueOf(f2.f307183b), " -> ", Integer.valueOf(f.f307183b));
                            z0Var.f307243f = this.f320124j.f307243f;
                        }
                    }
                }
                this.f320124j = z0Var;
            } catch (Exception e) {
                C104161b.m138997f("tagorewang:TalkRoom", "setRoomInfo assert failed: ", e);
                this.f320124j = z0Var;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("groupId: ");
            sb.append(this.f320042d);
            sb.append(" tmpId: ");
            sb.append(this.f320043e);
            sb.append(" routeId: ");
            sb.append(this.f320045g);
            sb.append(" room name: ");
            sb.append(mo157175d());
        } catch (Exception e) {
            sb.append(" broken by " + e.getMessage());
        }
        return sb.toString();
    }
}

package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.concurrent.ConcurrentHashMap;
import p261wl.C38166b;
import p261wl.C38174i;
import p763ym.C102870n;

/* renamed from: com.tencent.mm.pluginsdk.model.app.s */
public class C96776s extends MAutoStorage<C68070l> implements C102870n {

    /* renamed from: e */
    public static final String[] f283519e = {MAutoStorage.getCreateSQLs(C68070l.f195461A, "AppMessage")};

    /* renamed from: d */
    public final C96778b f283520d = new C96778b((C96777a) null);

    /* renamed from: com.tencent.mm.pluginsdk.model.app.s$b */
    public static final class C96778b implements C102870n.C102871a {

        /* renamed from: a */
        public ConcurrentHashMap<C102870n.C102871a, Object> f283521a = new ConcurrentHashMap<>();

        public C96778b(C96777a aVar) {
        }

        /* renamed from: A5 */
        public boolean mo135040A5(C68070l lVar, boolean z) {
            for (C102870n.C102871a next : this.f283521a.keySet()) {
                if (next.mo135044t1(lVar.field_msgId)) {
                    return next.mo135040A5(lVar, z);
                }
            }
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C102870n.C102872b.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (((C102870n.C102872b) iVar.get()).mo58543t1(lVar.field_msgId)) {
                    return ((C102870n.C102872b) iVar.get()).mo58538A5(lVar, z);
                }
            }
            return false;
        }

        /* renamed from: V0 */
        public boolean mo135041V0(C68070l lVar, boolean z, String... strArr) {
            for (C102870n.C102871a next : this.f283521a.keySet()) {
                if (next.mo135044t1(lVar.field_msgId)) {
                    return next.mo135041V0(lVar, z, strArr);
                }
            }
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C102870n.C102872b.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (((C102870n.C102872b) iVar.get()).mo58543t1(lVar.field_msgId)) {
                    return ((C102870n.C102872b) iVar.get()).mo58539V0(lVar, z, strArr);
                }
            }
            return false;
        }

        /* renamed from: a0 */
        public C68070l mo135042a0(long j) {
            for (C102870n.C102871a next : this.f283521a.keySet()) {
                if (next.mo135044t1(j)) {
                    return next.mo135042a0(j);
                }
            }
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C102870n.C102872b.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (((C102870n.C102872b) iVar.get()).mo58543t1(j)) {
                    return ((C102870n.C102872b) iVar.get()).mo58540a0(j);
                }
            }
            return null;
        }

        /* renamed from: c1 */
        public boolean mo135043c1(C68070l lVar, boolean z) {
            for (C102870n.C102871a next : this.f283521a.keySet()) {
                if (next.mo135044t1(lVar.field_msgId)) {
                    return next.mo135043c1(lVar, z);
                }
            }
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C102870n.C102872b.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                C38174i iVar = (C38174i) bVar.next();
                if (((C102870n.C102872b) iVar.get()).mo58543t1(lVar.field_msgId)) {
                    return ((C102870n.C102872b) iVar.get()).mo58541c1(lVar, z);
                }
            }
            return false;
        }

        /* renamed from: t1 */
        public boolean mo135044t1(long j) {
            for (C102870n.C102871a t1 : this.f283521a.keySet()) {
                if (t1.mo135044t1(j)) {
                    return true;
                }
            }
            C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C102870n.C102872b.class);
            C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
            while (bVar.hasNext()) {
                if (((C102870n.C102872b) ((C38174i) bVar.next()).get()).mo58543t1(j)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C96776s(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C68070l.f195461A, "AppMessage", (String[]) null);
    }

    /* renamed from: Lo */
    public /* bridge */ /* synthetic */ boolean mo135037Lo(C68070l lVar, String[] strArr) {
        return super.update(lVar, strArr);
    }

    /* renamed from: a0 */
    public C68070l mo135038a0(long j) {
        if (this.f283520d.mo135044t1(j)) {
            return this.f283520d.mo135042a0(j);
        }
        C68070l lVar = new C68070l();
        lVar.field_msgId = j;
        if (super.get(lVar, new String[0])) {
            return lVar;
        }
        return null;
    }

    public boolean insertNotify(IAutoDBItem iAutoDBItem, boolean z) {
        C68070l lVar = (C68070l) iAutoDBItem;
        return this.f283520d.mo135044t1(lVar.field_msgId) ? this.f283520d.mo135040A5(lVar, z) : super.insertNotify(lVar, z);
    }

    /* renamed from: jo */
    public /* bridge */ /* synthetic */ boolean mo135039jo(C68070l lVar) {
        return super.insert(lVar);
    }

    public boolean replace(IAutoDBItem iAutoDBItem, boolean z) {
        C68070l lVar = (C68070l) iAutoDBItem;
        return this.f283520d.mo135044t1(lVar.field_msgId) ? this.f283520d.mo135043c1(lVar, z) : super.replace(lVar, z);
    }

    public boolean updateNotify(IAutoDBItem iAutoDBItem, boolean z, String[] strArr) {
        C68070l lVar = (C68070l) iAutoDBItem;
        return this.f283520d.mo135044t1(lVar.field_msgId) ? this.f283520d.mo135041V0(lVar, z, strArr) : super.updateNotify(lVar, z, strArr);
    }
}

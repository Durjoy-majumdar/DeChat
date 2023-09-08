package ry1;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.BaseAdapter;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import di3.C86312j;
import java.util.LinkedList;
import kg3.C76577a;
import o90.C100301b;
import p763ym.C53543s;
import p763ym.C79138l;
import p823sg.C101611g;
import q90.C101062d;

/* renamed from: ry1.b */
public abstract class C48104b<T> extends BaseAdapter {

    /* renamed from: i */
    public static final /* synthetic */ int f128961i = 0;

    /* renamed from: d */
    public Context f128962d;

    /* renamed from: e */
    public LinkedList<T> f128963e;

    /* renamed from: f */
    public C101611g<String, Bitmap> f128964f;

    /* renamed from: g */
    public MTimerHandler f128965g = new MTimerHandler(new C48105a(), false);

    /* renamed from: h */
    public final MStorage.IOnStorageChange f128966h;

    /* renamed from: ry1.b$a */
    public class C48105a implements MTimerHandler.CallBack {
        public C48105a() {
        }

        public boolean onTimerExpired() {
            C48104b.this.notifyDataSetChanged();
            return false;
        }
    }

    /* renamed from: ry1.b$b */
    public class C48106b implements MStorage.IOnStorageChange {
        public C48106b() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            C48104b.this.f128965g.stopTimer();
            MTimerHandler mTimerHandler = C48104b.this.f128965g;
            int i = C48104b.f128961i;
            mTimerHandler.startTimer((long) 500);
        }
    }

    public C48104b(Context context) {
        C48106b bVar = new C48106b();
        this.f128966h = bVar;
        this.f128962d = context;
        this.f128963e = new LinkedList<>();
        this.f128964f = new C100301b(20, getClass());
        ((C53543s) C86312j.m106911c(C53543s.class)).Gk0().add(bVar);
    }

    /* renamed from: a */
    public void mo72845a(LinkedList<T> linkedList) {
        if (linkedList != null) {
            this.f128963e.addAll(linkedList);
            super.notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public Bitmap mo72846b(String str) {
        Bitmap bitmap;
        if (Util.isNullOrNil(str)) {
            return null;
        }
        if (((C101062d) this.f128964f).check(str) && (bitmap = (Bitmap) ((C100301b) this.f128964f).get(str)) != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        Bitmap ub = ((C79138l) C86312j.m106911c(C79138l.class)).mo74018ub(str, 1, C76577a.m92156g(this.f128962d));
        if (ub != null && !ub.isRecycled()) {
            ((C100301b) this.f128964f).mo139557c(str, ub);
        }
        return ub;
    }

    /* renamed from: d */
    public void mo72847d(LinkedList<T> linkedList) {
        if (linkedList != null) {
            this.f128963e = linkedList;
            super.notifyDataSetChanged();
        }
    }

    public int getCount() {
        return this.f128963e.size();
    }

    public Object getItem(int i) {
        return this.f128963e.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }
}

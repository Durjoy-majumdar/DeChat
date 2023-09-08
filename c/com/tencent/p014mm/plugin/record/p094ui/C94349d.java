package com.tencent.p014mm.plugin.record.p094ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.plugin.record.p094ui.C94356i;
import com.tencent.p014mm.plugin.record.p094ui.viewWrappers.C94386e;
import com.tencent.p014mm.plugin.sight.decode.model.C94571a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.LinkedList;
import pb1.C100723m0;
import pb1.C100746u;
import qg2.C101169u;
import sg2.C101617b;

/* renamed from: com.tencent.mm.plugin.record.ui.d */
public class C94349d extends C94356i {

    /* renamed from: z */
    public static HashMap<String, Boolean> f272701z = new HashMap<>();

    /* renamed from: y */
    public C100723m0 f272702y = new C94350a();

    /* renamed from: com.tencent.mm.plugin.record.ui.d$a */
    public class C94350a implements C100723m0 {

        /* renamed from: com.tencent.mm.plugin.record.ui.d$a$a */
        public class C94351a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C100746u f272704d;

            public C94351a(C94350a aVar, C100746u uVar) {
                this.f272704d = uVar;
            }

            public void run() {
                View view = (View) ((HashMap) C94386e.f272817c).get(this.f272704d.field_dataId);
                Object[] objArr = new Object[1];
                objArr[0] = Boolean.valueOf(view == null);
                Log.m105919d("MicroMsg.FavRecordAdapter", "view is null %s", objArr);
                if (view != null) {
                    C101617b bVar = (C101617b) view.getTag();
                    String b = C101169u.m132685b(bVar);
                    Log.m105919d("MicroMsg.FavRecordAdapter", "dataItemId: %s", bVar.f297464a.f299280T);
                    if (bVar.f297464a.f299280T.equals(this.f272704d.field_dataId)) {
                        C100746u uVar = this.f272704d;
                        Log.m105919d("MicroMsg.FavRecordAdapter", "change the sight status %s, dataId %s, progress %s cdnInfo %s", Integer.valueOf(this.f272704d.field_status), uVar.field_dataId, Float.valueOf(uVar.mo140167n2()), Boolean.valueOf(this.f272704d.mo140168o2()));
                        C94571a aVar = (C94571a) view.findViewById(C0966R.C0970id.f39);
                        ((ImageView) view.findViewById(C0966R.C0970id.k17)).setVisibility(8);
                        ((MMPinProgressBtn) view.findViewById(C0966R.C0970id.i7j)).setVisibility(8);
                        Log.m105924i("MicroMsg.FavRecordAdapter", "setVideoPath " + b);
                        aVar.setCanPlay(true);
                        aVar.mo130071b(b, false, 0);
                    }
                }
            }
        }

        public C94350a() {
        }

        /* renamed from: R4 */
        public void mo128275R4(C100746u uVar) {
            C94347b bVar = (C94347b) C94349d.this.f272721r;
            long j = uVar.field_favLocalId;
            if (j != bVar.f272700c.field_localId) {
                Log.m105925i("MicroMsg.FavRecordAdapter", "not equal Id %d %d", Long.valueOf(j), Long.valueOf(bVar.f272700c.field_localId));
                return;
            }
            Log.m105919d("MicroMsg.FavRecordAdapter", "on cdn status changed, fav local id %d, data id %s, status %d", Long.valueOf(j), uVar.field_dataId, Integer.valueOf(uVar.field_status));
            if (4 == uVar.field_status) {
                C94349d.f272701z.put(Util.nullAs(uVar.field_dataId, "null"), Boolean.TRUE);
            }
            if (uVar.mo140168o2()) {
                C94349d.this.f272713g.post(new C94351a(this, uVar));
            }
            C94349d dVar = C94349d.this;
            dVar.f272713g.post(dVar.f272727x);
        }
    }

    public C94349d(Context context, C94356i.C94359c cVar) {
        super(context, cVar);
    }

    /* renamed from: b */
    public int mo129739b() {
        return 1;
    }

    /* renamed from: g */
    public void mo129740g(C101617b bVar) {
        Log.m105919d("MicroMsg.FavRecordAdapter", "setupRecord %s", Long.valueOf(((C94347b) this.f272721r).f272700c.field_localId));
        bVar.f297469f = 1;
        bVar.f297468e = 1;
        bVar.f297470g = 15;
        bVar.f297465b = ((C94347b) this.f272721r).f272700c;
    }

    /* renamed from: h */
    public void mo129741h(C94346a aVar) {
        C94347b bVar = (C94347b) aVar;
        Log.m105925i("MicroMsg.FavRecordAdapter", "updateData localId %s,status %s", Long.valueOf(bVar.f272700c.field_localId), Integer.valueOf(bVar.f272700c.field_itemStatus));
        this.f272721r = aVar;
        ((LinkedList) this.f272720q).clear();
        ((LinkedList) this.f272720q).addAll(aVar.f272698a);
        notifyDataSetChanged();
    }
}

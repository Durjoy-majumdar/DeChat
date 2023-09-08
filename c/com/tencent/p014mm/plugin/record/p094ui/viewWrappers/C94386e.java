package com.tencent.p014mm.plugin.record.p094ui.viewWrappers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.plugin.record.p094ui.C94356i;
import com.tencent.p014mm.plugin.record.p094ui.RecordMsgFileUI;
import com.tencent.p014mm.plugin.sight.decode.model.C94571a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import og2.C100336e;
import og2.C100344n;
import pb1.C100734q;
import pb1.C100755z;
import qg2.C101136b0;
import qg2.C101147j0;
import sg2.C101617b;
import sg2.C101618c;
import te3.C101834rc0;

/* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.e */
public class C94386e implements C94356i.C94363d {

    /* renamed from: c */
    public static Map<String, View> f272817c = new HashMap();

    /* renamed from: a */
    public C94356i.C94359c f272818a;

    /* renamed from: b */
    public View.OnClickListener f272819b = new C94387a(this);

    /* renamed from: com.tencent.mm.plugin.record.ui.viewWrappers.e$a */
    public class C94387a implements View.OnClickListener {
        public C94387a(C94386e eVar) {
        }

        public void onClick(View view) {
            int i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C101617b bVar = (C101617b) view.getTag();
            int i2 = bVar.f297468e;
            boolean z = true;
            if (i2 == 0) {
                if (C101147j0.m132614G(bVar.f297464a, bVar.f297466c)) {
                    Log.m105924i("MicroMsg.SightViewWrapper", "onclick: play sight");
                    Intent intent = new Intent(view.getContext(), RecordMsgFileUI.class);
                    intent.putExtra("message_id", bVar.f297466c);
                    intent.putExtra("record_xml", bVar.f297467d);
                    intent.putExtra("record_data_id", bVar.f297464a.f299280T);
                    Context context = view.getContext();
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    Context context2 = context;
                    C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context2, "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    C100344n qq = ((C101136b0) ((C100336e) C86312j.m106911c(C100336e.class)).mo139410hi()).mo140585qq(C101147j0.m132641v(bVar.f297464a.f299280T, bVar.f297466c, true));
                    Object[] objArr = new Object[1];
                    objArr[0] = qq == null ? "null" : Integer.valueOf(qq.field_status);
                    Log.m105925i("MicroMsg.SightViewWrapper", "onclick: cdnInfo status %s", objArr);
                    if (!(qq == null || 2 == (i = qq.field_status) || 3 == i)) {
                        if (4 == i) {
                            C76879j.m92726T(view.getContext(), view.getResources().getString(C0966R.string.cqn));
                            C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        } else if (i == 0 || 1 == i) {
                            C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        }
                    }
                    C101147j0.m132618K(bVar.f297464a, bVar.f297466c, true);
                }
            } else if (i2 == 1) {
                Log.m105925i("MicroMsg.SightViewWrapper", "click item favid %d, localid %d, itemstatus %d", Integer.valueOf(bVar.f297465b.field_id), Long.valueOf(bVar.f297465b.field_localId), Integer.valueOf(bVar.f297465b.field_itemStatus));
                if (bVar.f297465b.mo140189x2()) {
                    FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
                    FavoriteOperationEvent.C92515a aVar2 = favoriteOperationEvent.f264833d;
                    aVar2.f264835a = 14;
                    aVar2.f264840f = bVar.f297464a;
                    favoriteOperationEvent.publish();
                    Log.m105925i("MicroMsg.SightViewWrapper", "favItemInfo is Done,file exist ret = %d", Integer.valueOf(favoriteOperationEvent.f264834e.f264855a));
                    if (favoriteOperationEvent.f264834e.f264855a == 1) {
                        Intent intent2 = new Intent();
                        intent2.putExtra("key_detail_info_id", bVar.f297465b.field_localId);
                        intent2.putExtra("key_detail_data_id", bVar.f297464a.f299280T);
                        intent2.putExtra("key_detail_can_delete", false);
                        C100734q.m131877u0(view.getContext(), ".ui.detail.FavoriteFileDetailUI", intent2, 1, (Bundle) null);
                        C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    } else if (Util.isNullOrNil(bVar.f297464a.f299325s)) {
                        Log.m105928w("MicroMsg.SightViewWrapper", "favItemInfo getCdnDataUrl empty");
                        C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    } else {
                        Log.m105928w("MicroMsg.SightViewWrapper", "? info is done, source file not exist, cdn data url is not null");
                    }
                } else {
                    C100755z zVar = bVar.f297465b;
                    if (zVar.field_itemStatus != 8) {
                        z = false;
                    }
                    if (z || zVar.mo140174A2()) {
                        Log.m105924i("MicroMsg.SightViewWrapper", "favItemInfo isDownLoadFaied or isUploadFailed, wait download");
                    } else if (bVar.f297465b.mo140190y2() || bVar.f297465b.mo140175B2()) {
                        Log.m105924i("MicroMsg.SightViewWrapper", "favItemInfo isDownloading or isUploadding, wait download");
                        C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    } else {
                        Log.m105928w("MicroMsg.SightViewWrapper", "other status, not done, downloading, uploading, downloadfail, uploadfail");
                    }
                }
                FavoriteOperationEvent favoriteOperationEvent2 = new FavoriteOperationEvent();
                FavoriteOperationEvent.C92515a aVar3 = favoriteOperationEvent2.f264833d;
                C100755z zVar2 = bVar.f297465b;
                aVar3.f264839e = zVar2.field_localId;
                if (zVar2.mo140174A2()) {
                    Log.m105928w("MicroMsg.SightViewWrapper", "upload failed, try to restart...");
                    favoriteOperationEvent2.f264833d.f264835a = 15;
                    favoriteOperationEvent2.publish();
                } else {
                    Log.m105928w("MicroMsg.SightViewWrapper", "download failed, try to restart...");
                    favoriteOperationEvent2.f264833d.f264835a = 16;
                    favoriteOperationEvent2.publish();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/record/ui/viewWrappers/SightViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C94386e(C94356i.C94359c cVar) {
        this.f272818a = cVar;
    }

    /* renamed from: a */
    public void mo129755a(View view, int i, C101617b bVar, Object obj) {
        int i2;
        View view2 = view;
        C101617b bVar2 = bVar;
        view2.setTag(bVar2);
        view2.setOnClickListener(this.f272819b);
        C94571a aVar = (C94571a) view2.findViewById(C0966R.C0970id.f39);
        ImageView imageView = (ImageView) view2.findViewById(C0966R.C0970id.k17);
        MMPinProgressBtn mMPinProgressBtn = (MMPinProgressBtn) view2.findViewById(C0966R.C0970id.i7j);
        aVar.setPosition(i);
        C101618c cVar = (C101618c) bVar2;
        C94356i.C94359c cVar2 = this.f272818a;
        Map<String, View> map = f272817c;
        C94356i.C94359c.C94362c cVar3 = new C94356i.C94359c.C94362c();
        C101834rc0 rc02 = cVar.f297464a;
        cVar3.f272740a = rc02;
        int i3 = cVar.f297468e;
        boolean z = true;
        if (i3 == 0) {
            long j = cVar.f297466c;
            cVar3.f272741b = j;
            if (C101147j0.m132614G(rc02, j)) {
                imageView.setVisibility(8);
                mMPinProgressBtn.setVisibility(8);
                String q = C101147j0.m132636q(cVar.f297464a, cVar.f297466c, 1);
                if (!q.equals(aVar.getVideoPath())) {
                    aVar.setThumbBmp(cVar2.mo129736b(cVar3));
                }
                aVar.mo130071b(q, false, 0);
                return;
            }
            C100344n qq = ((C101136b0) ((C100336e) C86312j.m106911c(C100336e.class)).mo139410hi()).mo140585qq(C101147j0.m132641v(cVar.f297464a.f299280T, cVar.f297466c, true));
            if (qq == null || 2 == (i2 = qq.field_status)) {
                imageView.setImageResource(C0966R.raw.shortvideo_play_btn);
            } else if (3 == i2 || 4 == i2) {
                imageView.setImageResource(C0966R.C0969drawable.bqe);
            } else if (i2 == 0 || 1 == i2) {
                imageView.setVisibility(8);
                mMPinProgressBtn.setVisibility(0);
                mMPinProgressBtn.setProgress((int) ((((float) qq.field_offset) / ((float) Math.max(1, qq.field_totalLen))) * 100.0f));
                aVar.clear();
                aVar.setThumbBmp(cVar2.mo129736b(cVar3));
                return;
            } else {
                imageView.setImageResource(C0966R.raw.shortvideo_play_btn);
            }
            imageView.setVisibility(0);
            mMPinProgressBtn.setVisibility(8);
            aVar.clear();
            aVar.setThumbBmp(cVar2.mo129736b(cVar3));
        } else if (i3 == 1) {
            ((HashMap) map).put(rc02.f299280T, view2);
            Log.m105919d("MicroMsg.SightRecordData", "dataId %s, status %s", Long.valueOf(cVar.f297465b.field_localId), Integer.valueOf(cVar.f297465b.field_itemStatus));
            cVar3.f272741b = cVar.f297465b.field_localId;
            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
            FavoriteOperationEvent.C92515a aVar2 = favoriteOperationEvent.f264833d;
            aVar2.f264835a = 14;
            aVar2.f264840f = cVar.f297464a;
            favoriteOperationEvent.publish();
            if (!cVar.f297465b.mo140189x2() && favoriteOperationEvent.f264834e.f264855a != 1) {
                C100755z zVar = cVar.f297465b;
                if (zVar.field_itemStatus != 8) {
                    z = false;
                }
                if (z || zVar.mo140174A2()) {
                    imageView.setImageResource(C0966R.raw.shortvideo_play_btn);
                } else if (cVar.f297465b.mo140190y2()) {
                    imageView.setVisibility(8);
                    mMPinProgressBtn.setVisibility(0);
                    mMPinProgressBtn.mo153891a();
                    aVar.clear();
                    aVar.setThumbBmp(cVar2.mo129736b(cVar3));
                    return;
                } else {
                    Log.m105928w("MicroMsg.SightRecordData", "other status, not done, downloading, uploading, downloadfail, uploadfail");
                    imageView.setImageResource(C0966R.raw.shortvideo_play_btn);
                }
            } else if (favoriteOperationEvent.f264834e.f264855a == 1) {
                imageView.setVisibility(8);
                mMPinProgressBtn.setVisibility(8);
                favoriteOperationEvent.f264833d.f264835a = 2;
                favoriteOperationEvent.publish();
                String str = favoriteOperationEvent.f264834e.f264857c;
                if (Util.isNullOrNil(str)) {
                    Log.m105928w("MicroMsg.SightRecordData", "videoPath is null!");
                    return;
                }
                if (!str.equals(aVar.getVideoPath())) {
                    aVar.setThumbBmp(cVar2.mo129736b(cVar3));
                }
                aVar.mo130071b(str, false, 0);
                return;
            } else if (Util.isNullOrNil(cVar.f297464a.f299325s)) {
                imageView.setImageResource(C0966R.C0969drawable.bqe);
            } else {
                Log.m105928w("MicroMsg.SightRecordData", "? info is done, source file not exist, cdn data url is not null");
                imageView.setImageResource(C0966R.raw.shortvideo_play_btn);
            }
            imageView.setVisibility(0);
            mMPinProgressBtn.setVisibility(8);
            aVar.clear();
            aVar.setThumbBmp(cVar2.mo129736b(cVar3));
        }
    }

    /* renamed from: b */
    public View mo129756b(Context context) {
        View inflate = View.inflate(context, C0966R.C0971layout.bqi, (ViewGroup) null);
        ((C94571a) inflate.findViewById(C0966R.C0970id.f39)).setDrawableWidth(C76577a.m92151b(context, 260));
        return inflate;
    }

    public void destroy() {
        this.f272818a = null;
    }

    public void pause() {
    }
}

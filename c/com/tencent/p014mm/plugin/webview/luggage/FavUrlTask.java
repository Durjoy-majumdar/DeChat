package com.tencent.p014mm.plugin.webview.luggage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DeleteFavoriteEvent;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.autogen.events.ReaderAppOperationEvent;
import com.tencent.p014mm.autogen.events.SnsfillEventInfoEvent;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C86493v0;
import ke3.C88144b;
import pb1.C100714h1;

/* renamed from: com.tencent.mm.plugin.webview.luggage.FavUrlTask */
public class FavUrlTask extends MainProcessTask {
    public static final Parcelable.Creator<FavUrlTask> CREATOR = new C96645a();

    /* renamed from: f */
    public int f283014f;

    /* renamed from: g */
    public Bundle f283015g;

    /* renamed from: h */
    public boolean f283016h;

    /* renamed from: i */
    public boolean f283017i;

    /* renamed from: j */
    public int f283018j;

    /* renamed from: n */
    public int f283019n;

    /* renamed from: o */
    public boolean f283020o;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.FavUrlTask$a */
    public class C96645a implements Parcelable.Creator<FavUrlTask> {
        public Object createFromParcel(Parcel parcel) {
            return new FavUrlTask(parcel, (C96645a) null);
        }

        public Object[] newArray(int i) {
            return new FavUrlTask[i];
        }
    }

    public FavUrlTask() {
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
        this.f283014f = parcel.readInt();
        this.f283015g = parcel.readBundle();
        boolean z = false;
        this.f283016h = parcel.readByte() == 1;
        this.f283017i = parcel.readByte() == 1;
        this.f283018j = parcel.readInt();
        this.f283019n = parcel.readInt();
        if (parcel.readByte() == 1) {
            z = true;
        }
        this.f283020o = z;
    }

    /* renamed from: j */
    public void mo1553j() {
        boolean z;
        int i = this.f283014f;
        if (i == 1) {
            Bundle bundle = this.f283015g;
            if (bundle != null) {
                long j = bundle.getLong("msg_id", Long.MIN_VALUE);
                String string = this.f283015g.getString("sns_local_id");
                int i2 = this.f283015g.getInt("news_svr_id", 0);
                String string2 = this.f283015g.getString("news_svr_tweetid");
                DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
                if (Long.MIN_VALUE != j) {
                    doFavoriteEvent.f264674d.f264682g = this.f283015g.getInt("message_index", 0);
                    z = ((C100714h1) C86312j.m106911c(C100714h1.class)).mo135057PN(doFavoriteEvent, j);
                } else if (!Util.isNullOrNil(string)) {
                    SnsfillEventInfoEvent snsfillEventInfoEvent = new SnsfillEventInfoEvent();
                    SnsfillEventInfoEvent.C92600a aVar = snsfillEventInfoEvent.f265220d;
                    aVar.f265224c = string;
                    aVar.f265225d = doFavoriteEvent;
                    aVar.f265222a = this.f283015g.getString("rawUrl");
                    snsfillEventInfoEvent.publish();
                    z = snsfillEventInfoEvent.f265221e.f265226a;
                } else if (i2 != 0) {
                    ReaderAppOperationEvent readerAppOperationEvent = new ReaderAppOperationEvent();
                    ReaderAppOperationEvent.C67767a aVar2 = readerAppOperationEvent.f193863d;
                    aVar2.f193865a = 3;
                    aVar2.f193866b = doFavoriteEvent;
                    aVar2.f193867c = i2;
                    aVar2.f193868d = string2;
                    readerAppOperationEvent.publish();
                    z = readerAppOperationEvent.f193864e.f193870a;
                } else {
                    this.f283016h = true;
                    return;
                }
                if (z) {
                    String nullAsNil = Util.nullAsNil(this.f283015g.getString("prePublishId"));
                    String a = C86493v0.m107223a(nullAsNil);
                    C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a, true);
                    c.mo120962i("sendAppMsgScene", 2);
                    c.mo120962i("preChatName", this.f283015g.getString("preChatName"));
                    c.mo120962i("preMsgIndex", Integer.valueOf(this.f283015g.getInt("preMsgIndex")));
                    c.mo120962i("prePublishId", nullAsNil);
                    c.mo120962i("preUsername", this.f283015g.getString("preUsername"));
                    c.mo120962i("getA8KeyScene", this.f283015g.getString("getA8KeyScene"));
                    c.mo120962i("referUrl", this.f283015g.getString("referUrl"));
                    Bundle bundle2 = this.f283015g.getBundle("jsapiargs");
                    if (bundle2 != null) {
                        c.mo120962i("adExtStr", bundle2.getString("key_snsad_statextstr"));
                    }
                    doFavoriteEvent.f264674d.f264683h = a;
                    doFavoriteEvent.publish();
                } else {
                    DoFavoriteEvent.C92474a aVar3 = doFavoriteEvent.f264674d;
                    if (aVar3.f264687l == 0) {
                        aVar3.f264687l = C0966R.string.co9;
                    }
                    doFavoriteEvent.publish();
                }
                this.f283018j = doFavoriteEvent.f264675e.f9046a;
            }
        } else if (i == 2) {
            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
            favoriteOperationEvent.f264833d.f264835a = 35;
            favoriteOperationEvent.publish();
        } else if (i == 3) {
            C88144b.m109788f("favorite");
            this.f283020o = true;
        } else if (i == 4) {
            DeleteFavoriteEvent deleteFavoriteEvent = new DeleteFavoriteEvent();
            deleteFavoriteEvent.f264667d.f264669a = this.f283015g.getLong("fav_local_id", -1);
            deleteFavoriteEvent.f264667d.f264670b = 11;
            deleteFavoriteEvent.publish();
            Log.m105925i("MicroMsg.FavUrlTask", "do del fav web url, local id %d, result %B", Long.valueOf(deleteFavoriteEvent.f264667d.f264669a), Boolean.valueOf(deleteFavoriteEvent.f264668e.f264671a));
            this.f283017i = deleteFavoriteEvent.f264668e.f264671a;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f283014f);
        parcel.writeBundle(this.f283015g);
        parcel.writeByte(this.f283016h ? (byte) 1 : 0);
        parcel.writeByte(this.f283017i ? (byte) 1 : 0);
        parcel.writeInt(this.f283018j);
        parcel.writeInt(this.f283019n);
        parcel.writeByte(this.f283020o ? (byte) 1 : 0);
    }

    public FavUrlTask(Parcel parcel, C96645a aVar) {
        mo1551g(parcel);
    }
}

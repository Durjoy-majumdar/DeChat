package com.tencent.p014mm.autogen.events;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import if0.C46238a;
import java.util.List;
import ob0.C117747y;
import org.json.JSONObject;
import te3.C101801kd0;
import te3.C101811md0;
import te3.C101834rc0;
import te3.C101861wc0;

/* renamed from: com.tencent.mm.autogen.events.FavoriteOperationEvent */
public final class FavoriteOperationEvent extends IEvent {

    /* renamed from: d */
    public C92515a f264833d = new C92515a();

    /* renamed from: e */
    public C92516b f264834e = new C92516b();

    /* renamed from: com.tencent.mm.autogen.events.FavoriteOperationEvent$a */
    public static final class C92515a {

        /* renamed from: a */
        public int f264835a = 0;

        /* renamed from: b */
        public String f264836b;

        /* renamed from: c */
        public String f264837c;

        /* renamed from: d */
        public C101801kd0 f264838d;

        /* renamed from: e */
        public long f264839e;

        /* renamed from: f */
        public C101834rc0 f264840f;

        /* renamed from: g */
        public Intent f264841g;

        /* renamed from: h */
        public Context f264842h;

        /* renamed from: i */
        public MMHandler f264843i;

        /* renamed from: j */
        public Runnable f264844j;

        /* renamed from: k */
        public String f264845k;

        /* renamed from: l */
        public String f264846l;

        /* renamed from: m */
        public int f264847m = 0;

        /* renamed from: n */
        public int f264848n = 0;

        /* renamed from: o */
        public String f264849o;

        /* renamed from: p */
        public C117747y f264850p;

        /* renamed from: q */
        public String f264851q;

        /* renamed from: r */
        public String f264852r;

        /* renamed from: s */
        public C101811md0 f264853s;

        /* renamed from: t */
        public int f264854t = 0;
    }

    /* renamed from: com.tencent.mm.autogen.events.FavoriteOperationEvent$b */
    public static final class C92516b {

        /* renamed from: a */
        public int f264855a = -1;

        /* renamed from: b */
        public List f264856b;

        /* renamed from: c */
        public String f264857c;

        /* renamed from: d */
        public String f264858d;

        /* renamed from: e */
        public String f264859e;

        /* renamed from: f */
        public C101861wc0 f264860f;

        /* renamed from: g */
        public ISQLiteDatabase f264861g;

        /* renamed from: h */
        public List f264862h;

        /* renamed from: i */
        public boolean f264863i = false;

        /* renamed from: j */
        public String f264864j;
    }

    public FavoriteOperationEvent() {
        this.order = false;
        this.callback = null;
    }

    /* renamed from: a */
    public JSONObject mo126601a() {
        JSONObject jSONObject = new JSONObject();
        try {
            C46238a.m51547b(jSONObject, "type", Integer.valueOf(this.f264833d.f264835a));
            C46238a.m51547b(jSONObject, FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f264833d.f264836b);
            C46238a.m51547b(jSONObject, "desc", this.f264833d.f264837c);
            C46238a.m51547b(jSONObject, "favProtoItem", this.f264833d.f264838d);
            C46238a.m51547b(jSONObject, "favLocalId", Long.valueOf(this.f264833d.f264839e));
            this.f264833d.getClass();
            C46238a.m51547b(jSONObject, "tags", (Object) null);
            C46238a.m51547b(jSONObject, "favDataItem", this.f264833d.f264840f);
            C46238a.m51547b(jSONObject, "dataIntent", this.f264833d.f264841g);
            this.f264833d.getClass();
            C46238a.m51547b(jSONObject, "favInfoListener", (Object) null);
            C46238a.m51547b(jSONObject, "context", this.f264833d.f264842h);
            C46238a.m51547b(jSONObject, "handler", this.f264833d.f264843i);
            C46238a.m51547b(jSONObject, "uiCallback", this.f264833d.f264844j);
            C46238a.m51547b(jSONObject, "toUser", this.f264833d.f264845k);
            C46238a.m51547b(jSONObject, "editText", this.f264833d.f264846l);
            C46238a.m51547b(jSONObject, "voiceType", Integer.valueOf(this.f264833d.f264847m));
            C46238a.m51547b(jSONObject, "voiceDuration", Integer.valueOf(this.f264833d.f264848n));
            C46238a.m51547b(jSONObject, "path", this.f264833d.f264849o);
            C46238a.m51547b(jSONObject, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f264833d.f264850p);
            C46238a.m51547b(jSONObject, "favIdList", this.f264833d.f264851q);
            C46238a.m51547b(jSONObject, "dataIdList", this.f264833d.f264852r);
            C46238a.m51547b(jSONObject, "favReportInfo", this.f264833d.f264853s);
            C46238a.m51547b(jSONObject, "delType", Integer.valueOf(this.f264833d.f264854t));
        } catch (Exception unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            C46238a.m51547b(jSONObject2, "ret", Integer.valueOf(this.f264834e.f264855a));
            this.f264834e.getClass();
            C46238a.m51547b(jSONObject2, "record", (Object) null);
            C46238a.m51547b(jSONObject2, "tags", this.f264834e.f264856b);
            C46238a.m51547b(jSONObject2, "path", this.f264834e.f264857c);
            C46238a.m51547b(jSONObject2, "thumbPath", this.f264834e.f264858d);
            C46238a.m51547b(jSONObject2, "thumbUrl", this.f264834e.f264859e);
            C46238a.m51547b(jSONObject2, "exportInfo", this.f264834e.f264860f);
            C46238a.m51547b(jSONObject2, "favDB", this.f264834e.f264861g);
            C46238a.m51547b(jSONObject2, "wrapperList", this.f264834e.f264862h);
            this.f264834e.getClass();
            Boolean bool = Boolean.FALSE;
            C46238a.m51547b(jSONObject2, "isPlay", bool);
            this.f264834e.getClass();
            C46238a.m51547b(jSONObject2, "resumePlay", bool);
            C46238a.m51547b(jSONObject2, "isPause", Boolean.valueOf(this.f264834e.f264863i));
            this.f264834e.getClass();
            C46238a.m51547b(jSONObject2, "getProgress", Double.valueOf(0.0d));
            C46238a.m51547b(jSONObject2, "dataList", this.f264834e.f264864j);
        } catch (Exception unused2) {
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("data", jSONObject);
            jSONObject3.put("result", jSONObject2);
        } catch (Exception unused3) {
        }
        return jSONObject3;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FavoriteOperationEvent)) {
            return false;
        }
        FavoriteOperationEvent favoriteOperationEvent = (FavoriteOperationEvent) iEvent;
        C92515a aVar = favoriteOperationEvent.f264833d;
        if (!C46238a.m51546a(Integer.valueOf(this.f264833d.f264835a), Integer.valueOf(aVar.f264835a)) || !C46238a.m51546a(this.f264833d.f264836b, aVar.f264836b) || !C46238a.m51546a(this.f264833d.f264837c, aVar.f264837c) || !C46238a.m51546a(this.f264833d.f264838d, aVar.f264838d) || !C46238a.m51546a(Long.valueOf(this.f264833d.f264839e), Long.valueOf(aVar.f264839e))) {
            return false;
        }
        this.f264833d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null) || !C46238a.m51546a(this.f264833d.f264840f, aVar.f264840f) || !C46238a.m51546a(this.f264833d.f264841g, aVar.f264841g)) {
            return false;
        }
        this.f264833d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null) || !C46238a.m51546a(this.f264833d.f264842h, aVar.f264842h) || !C46238a.m51546a(this.f264833d.f264843i, aVar.f264843i) || !C46238a.m51546a(this.f264833d.f264844j, aVar.f264844j) || !C46238a.m51546a(this.f264833d.f264845k, aVar.f264845k) || !C46238a.m51546a(this.f264833d.f264846l, aVar.f264846l) || !C46238a.m51546a(Integer.valueOf(this.f264833d.f264847m), Integer.valueOf(aVar.f264847m)) || !C46238a.m51546a(Integer.valueOf(this.f264833d.f264848n), Integer.valueOf(aVar.f264848n)) || !C46238a.m51546a(this.f264833d.f264849o, aVar.f264849o) || !C46238a.m51546a(this.f264833d.f264850p, aVar.f264850p) || !C46238a.m51546a(this.f264833d.f264851q, aVar.f264851q) || !C46238a.m51546a(this.f264833d.f264852r, aVar.f264852r) || !C46238a.m51546a(this.f264833d.f264853s, aVar.f264853s) || !C46238a.m51546a(Integer.valueOf(this.f264833d.f264854t), Integer.valueOf(aVar.f264854t))) {
            return false;
        }
        C92516b bVar = favoriteOperationEvent.f264834e;
        if (!C46238a.m51546a(Integer.valueOf(this.f264834e.f264855a), Integer.valueOf(bVar.f264855a))) {
            return false;
        }
        this.f264834e.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null) || !C46238a.m51546a(this.f264834e.f264856b, bVar.f264856b) || !C46238a.m51546a(this.f264834e.f264857c, bVar.f264857c) || !C46238a.m51546a(this.f264834e.f264858d, bVar.f264858d) || !C46238a.m51546a(this.f264834e.f264859e, bVar.f264859e) || !C46238a.m51546a(this.f264834e.f264860f, bVar.f264860f) || !C46238a.m51546a(this.f264834e.f264861g, bVar.f264861g) || !C46238a.m51546a(this.f264834e.f264862h, bVar.f264862h)) {
            return false;
        }
        this.f264834e.getClass();
        Boolean bool = Boolean.FALSE;
        if (!C46238a.m51546a(bool, bool)) {
            return false;
        }
        this.f264834e.getClass();
        if (!C46238a.m51546a(bool, bool) || !C46238a.m51546a(Boolean.valueOf(this.f264834e.f264863i), Boolean.valueOf(bVar.f264863i))) {
            return false;
        }
        this.f264834e.getClass();
        return C46238a.m51546a(Double.valueOf(0.0d), Double.valueOf(0.0d)) && C46238a.m51546a(this.f264834e.f264864j, bVar.f264864j);
    }
}

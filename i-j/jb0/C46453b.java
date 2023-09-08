package jb0;

import android.content.SharedPreferences;
import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C97625j3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47349a0;
import p216op.C47389f;
import r41.C47926a;
import uc0.C52521t;
import uc0.C52523w;
import uc0.C52524x;

/* renamed from: jb0.b */
public class C46453b implements C11385n {

    /* renamed from: g */
    public static C46453b f125131g;

    /* renamed from: d */
    public volatile boolean f125132d = false;

    /* renamed from: e */
    public SharedPreferences f125133e = MMApplicationContext.getDefaultPreference();

    /* renamed from: f */
    public ArrayList<C46454a> f125134f = new ArrayList<>();

    /* renamed from: jb0.b$a */
    public interface C46454a {
        /* renamed from: a */
        void mo71843a();
    }

    /* renamed from: a */
    public final void mo71842a() {
        Log.m105924i("MicroMsg.TraceConfigUpdater", "summer release");
        this.f125132d = false;
        C97625j3.m125815e().mo123470p(159, this);
        C97625j3.m125815e().mo123470p(160, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Uri uri;
        Uri.Builder builder;
        C117747y yVar2 = yVar;
        Class cls = C47389f.class;
        int type = yVar.getType();
        Log.m105925i("MicroMsg.TraceConfigUpdater", "summer onSceneEnd: errType:[%d], errCode:[%d], type:[%d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(type));
        if (!(yVar2 instanceof C47349a0) || ((C47349a0) yVar2).mo72393j() != 21) {
            Log.m105924i("MicroMsg.TraceConfigUpdater", "summer onSceneEnd another scene and ret");
        } else if (type == 159) {
            if (i == 0 && i2 == 0) {
                C52523w[] bD = ((C52524x) ((C47389f) C86312j.m106911c(cls)).mo72331SU()).mo73465bD(21);
                if (bD == null || bD.length == 0) {
                    Log.m105924i("MicroMsg.TraceConfigUpdater", "summer doDownload error no pkg found.");
                    mo71842a();
                    return;
                }
                C52523w wVar = bD[0];
                Log.m105924i("MicroMsg.TraceConfigUpdater", "summer doDownload pkg id:" + wVar.f146696a + " version:" + wVar.f146697b + " status:" + wVar.f146701f + " type:" + wVar.f146702g);
                if (5 == wVar.f146701f) {
                    C97625j3.m125815e().mo123460f(new C52521t(wVar.f146696a, 21));
                    return;
                }
                Log.m105924i("MicroMsg.TraceConfigUpdater", "summer pkgInfo has downloaded and release");
                this.f125133e.edit().putLong("trace_config_last_update_time", System.currentTimeMillis()).commit();
                mo71842a();
                return;
            }
            mo71842a();
        } else if (type == 160) {
            if (i == 0 && i2 == 0) {
                int i3 = ((C52521t) yVar2).f146689f;
                ((C52524x) ((C47389f) C86312j.m106911c(cls)).mo72331SU()).getClass();
                String a = C47926a.m53249a();
                String ic02 = ((C52524x) ((C47389f) C86312j.m106911c(cls)).mo72331SU()).ic0(i3, 21);
                if (a == null) {
                    uri = null;
                } else {
                    try {
                        uri = C116299g2.m163858n(a);
                    } catch (IOException e) {
                        Log.printErrStackTrace("MicroMsg.TraceConfigUpdater", e, "", new Object[0]);
                    }
                }
                if (uri == null) {
                    builder = new Uri.Builder().path(ic02);
                } else {
                    builder = uri.buildUpon();
                    if (!ic02.isEmpty()) {
                        builder.appendPath(ic02);
                    }
                }
                Uri build = builder.build();
                String path = build.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!build.getPath().equals(k)) {
                        build = builder.path(k).build();
                    }
                }
                Map<String, String> parseXml = XmlParser.parseXml(C86013q1.m106432N(C116299g2.m163865u(build)), "TraceConfig", (String) null);
                if (parseXml == null) {
                    Log.m105918d("MicroMsg.TraceConfigUpdater", "summer kvMap is null and ret");
                } else {
                    HashMap hashMap = new HashMap();
                    int i4 = 0;
                    while (true) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(".TraceConfig.Item");
                        sb.append(i4 == 0 ? "" : Integer.valueOf(i4));
                        String sb4 = sb.toString();
                        String str2 = parseXml.get(sb4 + ".$key");
                        if (str2 == null) {
                            break;
                        }
                        i4++;
                        long j = Util.getLong(parseXml.get(sb4), -1);
                        if (j >= 0) {
                            Log.m105924i("MicroMsg.TraceConfigUpdater", "summer updateTraceConfig i: " + i4 + " key: " + str2 + "|value: " + j);
                            hashMap.put(str2, Long.valueOf(j));
                        }
                    }
                    SharedPreferences.Editor edit = this.f125133e.edit();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        edit.putLong((String) entry.getKey(), ((Long) entry.getValue()).longValue());
                    }
                    edit.putLong("trace_config_last_update_time", System.currentTimeMillis()).commit();
                    Log.m105918d("MicroMsg.TraceConfigUpdater", "summer updateTraceConfig configMap size: " + hashMap.size());
                    int size = this.f125134f.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        this.f125134f.get(i5).mo71843a();
                    }
                    C52523w Ow = ((C52524x) ((C47389f) C86312j.m106911c(cls)).mo72331SU()).mo73461Ow(i3, 21);
                    Ow.f146701f = 2;
                    ((C52524x) ((C47389f) C86312j.m106911c(cls)).mo72331SU()).mo73463TE(Ow);
                }
            }
            mo71842a();
        }
    }
}

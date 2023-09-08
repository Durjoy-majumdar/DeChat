package p516f9;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceId;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: f9.y */
public final /* synthetic */ class C116846y implements C116829k {

    /* renamed from: a */
    public final FirebaseInstanceId f350231a;

    /* renamed from: b */
    public final String f350232b;

    /* renamed from: c */
    public final String f350233c;

    public C116846y(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.f350231a = firebaseInstanceId;
        this.f350232b = str;
        this.f350233c = str2;
    }

    /* renamed from: a */
    public final String mo180817a() {
        String str;
        FirebaseInstanceId firebaseInstanceId = this.f350231a;
        String str2 = this.f350232b;
        String str3 = this.f350233c;
        C116847z zVar = (C116847z) firebaseInstanceId.f339220c;
        zVar.getClass();
        Bundle bundle = new Bundle();
        zVar.mo180846b(str2, str3, bundle);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zVar.f350238e.execute(new C116810a0(zVar, bundle, taskCompletionSource));
        try {
            String str4 = (String) Tasks.await(taskCompletionSource.getTask().continueWith(zVar.f350238e, new C116812b0(zVar)));
            C116835n nVar = FirebaseInstanceId.f339216h;
            String e = firebaseInstanceId.f339219b.mo180813e();
            synchronized (nVar) {
                long currentTimeMillis = System.currentTimeMillis();
                int i = C31961o.f85110e;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(XWalkReaderBasePlugin.PARAM_KEY_TOKEN, str4);
                    jSONObject.put("appVersion", e);
                    jSONObject.put(AppMeasurement.Param.TIMESTAMP, currentTimeMillis);
                    str = jSONObject.toString();
                } catch (JSONException e2) {
                    new StringBuilder(String.valueOf(e2).length() + 24);
                    str = null;
                }
                if (str != null) {
                    SharedPreferences.Editor edit = nVar.f350202a.edit();
                    edit.putString(C116835n.m164817a("", str2, str3), str);
                    edit.commit();
                }
            }
            return str4;
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw new IOException(cause);
            } else {
                throw new IOException(e3);
            }
        } catch (InterruptedException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}

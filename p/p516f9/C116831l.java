package p516f9;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.iid.C113382a;
import com.google.firebase.iid.zzi;
import com.tencent.xweb.file.XVFSFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p1042u.C111059i;

/* renamed from: f9.l */
public final class C116831l extends Handler {

    /* renamed from: a */
    public final /* synthetic */ C113382a f350193a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116831l(C113382a aVar, Looper looper) {
        super(looper);
        this.f350193a = aVar;
    }

    public final void handleMessage(Message message) {
        Bundle bundle;
        String str;
        String str2;
        C113382a aVar = this.f350193a;
        aVar.getClass();
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new zzi.C113383a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzi) {
                        aVar.f339233f = (zzi) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        aVar.f339232e = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("error");
                        if (stringExtra == null) {
                            new StringBuilder(String.valueOf(intent2.getExtras()).length() + 49);
                            return;
                        }
                        if (Log.isLoggable("FirebaseInstanceId", 3) && stringExtra.length() != 0) {
                            "Received InstanceID error ".concat(stringExtra);
                        }
                        if (stringExtra.startsWith("|")) {
                            String[] split = stringExtra.split("\\|");
                            if (split.length <= 2 || !"ID".equals(split[1])) {
                                str2 = "Unexpected structured response ";
                                if (stringExtra.length() == 0) {
                                    return;
                                }
                            } else {
                                str = split[2];
                                String str3 = split[3];
                                if (str3.startsWith(XVFSFile.PATH_SEPARATOR)) {
                                    str3 = str3.substring(1);
                                }
                                bundle = intent2.putExtra("error", str3).getExtras();
                                aVar.mo169424a(str, bundle);
                                return;
                            }
                        } else {
                            synchronized (aVar.f339228a) {
                                int i = 0;
                                while (true) {
                                    C111059i<String, TaskCompletionSource<Bundle>> iVar = aVar.f339228a;
                                    if (i < iVar.f332583f) {
                                        aVar.mo169424a(iVar.mo162789j(i), intent2.getExtras());
                                        i++;
                                    }
                                }
                            }
                            return;
                        }
                    } else {
                        Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                        if (matcher.matches()) {
                            str = matcher.group(1);
                            String group = matcher.group(2);
                            bundle = intent2.getExtras();
                            bundle.putString("registration_id", group);
                            aVar.mo169424a(str, bundle);
                            return;
                        } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            str2 = "Unexpected response string: ";
                            if (stringExtra.length() == 0) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    str2.concat(stringExtra);
                } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(action);
                    if (valueOf.length() != 0) {
                        "Unexpected response action: ".concat(valueOf);
                    }
                }
            }
        }
    }
}

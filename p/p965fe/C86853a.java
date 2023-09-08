package p965fe;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import com.tencent.matrix.batterycanary.stats.C114572i;
import com.tencent.matrix.batterycanary.stats.p1183ui.BatteryStatsActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.xweb.file.XVFSFile;
import j20.C117292a;
import java.util.LinkedHashMap;
import k20.C9556a;
import p1177ce.C113291d;
import p1177ce.C113314g;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p329d3.C58104c;
import p961ee.C86507b;
import p981ie.C117159b;
import p981ie.C87704h;
import p981ie.C87705i;

/* renamed from: fe.a */
public final class C86853a {

    /* renamed from: l */
    public static final C86853a f252120l = new C86853a();

    /* renamed from: a */
    public final DisplayMetrics f252121a = new DisplayMetrics();

    /* renamed from: b */
    public final Handler f252122b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final SparseBooleanArray f252123c = new SparseBooleanArray();

    /* renamed from: d */
    public C58104c<Integer, String> f252124d = new C58104c<>(Integer.valueOf(Process.myPid()), m107857d(C117159b.m165214o()));

    /* renamed from: e */
    public View f252125e;

    /* renamed from: f */
    public C113314g f252126f;

    /* renamed from: g */
    public C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot> f252127g;

    /* renamed from: h */
    public boolean f252128h = false;

    /* renamed from: i */
    public C87704h f252129i = new C87704h();

    /* renamed from: j */
    public C87705i<C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot>> f252130j = new C86855a();

    /* renamed from: k */
    public Runnable f252131k = new C86854b();

    /* renamed from: fe.a$b */
    public class C86854b implements Runnable {
        public C86854b() {
        }

        public void run() {
            C86853a aVar = C86853a.this;
            if (aVar.f252126f == null) {
                View view = aVar.f252125e;
                if (view != null) {
                    Toast.makeText(view.getContext(), "Search TAG 'TOP_THREAD_DUMP' for detail report", 1).show();
                    return;
                }
                return;
            }
            Intent intent = new Intent(C86853a.this.f252126f.mo165879a(), BatteryStatsActivity.class);
            if (!(C86853a.this.f252126f.mo165879a() instanceof Activity)) {
                intent.addFlags(268435456);
            }
            Context a = C86853a.this.f252126f.mo165879a();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context = a;
            C117292a.m165358d(context, aVar2.mo10232b(), "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$2", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            a.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/matrix/batterycanary/shell/ui/TopThreadIndicator$2", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: fe.a$a */
    public class C86855a implements C87705i<C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot>> {
        public C86855a() {
        }

        public void accept(Object obj) {
            C114572i iVar;
            C114490k0.C114491a.C114492a aVar = (C114490k0.C114491a.C114492a) obj;
            if (aVar == null) {
                View view = C86853a.this.f252125e;
                if (view != null) {
                    Toast.makeText(view.getContext(), "Skip dump: no data", 0).show();
                }
            } else if (((JiffiesMonitorFeature.JiffiesSnapshot) aVar.f343207c).f343059d != Process.myPid()) {
                View view2 = C86853a.this.f252125e;
                if (view2 != null) {
                    Toast.makeText(view2.getContext(), "Skip dump: only support curr process now", 0).show();
                }
            } else {
                C113291d.C113292a.C113308d dVar = new C113291d.C113292a.C113308d();
                dVar.mo165870i();
                dVar.mo165862a("| TOP_THREAD_DUMP\n");
                if (aVar.mo173690b()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    long j = 10;
                    float i = C86507b.m107278i(((Long) ((JiffiesMonitorFeature.JiffiesSnapshot) aVar.f343207c).f343062g.f343211a).longValue(), aVar.f343208d / 10);
                    linkedHashMap.put("load", Float.valueOf(i));
                    dVar.mo165863b("Proc");
                    dVar.mo165869h("pid", String.valueOf(((JiffiesMonitorFeature.JiffiesSnapshot) aVar.f343207c).f343059d));
                    dVar.mo165869h("cmm", String.valueOf(((JiffiesMonitorFeature.JiffiesSnapshot) aVar.f343207c).f343061f));
                    StringBuilder sb = new StringBuilder();
                    sb.append(C86507b.m107280k(i, 1));
                    String str = "%";
                    sb.append(str);
                    dVar.mo165869h("load", sb.toString());
                    dVar.mo165864c("Thread(" + ((JiffiesMonitorFeature.JiffiesSnapshot) aVar.f343207c).f343063h.f343212a.size() + ")");
                    dVar.mo165868g("  TID\tLOAD \tSTATUS \tTHREAD_NAME \tJIFFY");
                    for (ITEM item : ((JiffiesMonitorFeature.JiffiesSnapshot) aVar.f343207c).f343063h.f343212a) {
                        long longValue = ((Long) item.f343211a).longValue();
                        dVar.f339024a.append("|   -> ");
                        dVar.f339024a.append(C86507b.m107279j(String.valueOf(item.f343066b), 5));
                        dVar.f339024a.append("\t");
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(C86507b.m107280k(C86507b.m107278i(longValue, aVar.f343208d / 10), 1));
                        String str2 = str;
                        sb4.append(str2);
                        dVar.f339024a.append(C86507b.m107279j(sb4.toString(), 4));
                        dVar.f339024a.append("\t");
                        dVar.f339024a.append(item.f343068d ? "+" : "~");
                        dVar.f339024a.append("/");
                        dVar.f339024a.append(item.f343069e);
                        dVar.f339024a.append("\t");
                        dVar.f339024a.append(C86507b.m107279j(item.f343067c, 16));
                        dVar.f339024a.append("\t");
                        dVar.f339024a.append(Long.valueOf(longValue));
                        dVar.f339024a.append("\t");
                        dVar.mo165862a("\n");
                        str = str2;
                    }
                    dVar.mo165863b("Stacks");
                    for (ITEM item2 : ((JiffiesMonitorFeature.JiffiesSnapshot) aVar.f343207c).f343063h.f343212a) {
                        if (C86507b.m107278i(((Long) item2.f343211a).longValue(), aVar.f343208d / j) <= 0.0f) {
                            break;
                        }
                        dVar.mo165864c(item2.f343067c + "(" + item2.f343066b + ")");
                        String a = C86853a.this.f252129i.mo122129a(item2.f343066b);
                        linkedHashMap.put("stack_" + item2.f343067c + "(" + item2.f343066b + ")", a);
                        String[] split = a.split("\n");
                        int length = split.length;
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < length) {
                            String str3 = split[i2];
                            dVar.f339024a.append(i3 == 0 ? "|   -> " : "|      ");
                            dVar.f339024a.append(str3);
                            dVar.mo165862a("\n");
                            i3++;
                            i2++;
                            j = 10;
                        }
                    }
                    C113314g gVar = C86853a.this.f252126f;
                    if (!(gVar == null || (iVar = (C114572i) gVar.mo165880e(C114572i.class)) == null)) {
                        iVar.mo173741i("MATRIX_TOP_DUMP", ((JiffiesMonitorFeature.JiffiesSnapshot) aVar.f343207c).f343059d, linkedHashMap);
                    }
                } else {
                    dVar.mo165863b("Invalid data, ignore");
                }
                dVar.mo165867f();
                dVar.mo165865d();
                View view3 = C86853a.this.f252125e;
                if (view3 != null) {
                    Toast.makeText(view3.getContext(), "Dump finish, search TAG 'TOP_THREAD_DUMP' for detail", 1).show();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m107856a(C86853a aVar, TextView textView, int i) {
        aVar.getClass();
        textView.setTextColor(textView.getResources().getColor(i == 2 ? C0966R.color.Red_80 : i == 1 ? C0966R.color.Orange_80 : C0966R.color.FG_2));
    }

    /* renamed from: d */
    public static String m107857d(String str) {
        return str.contains(XVFSFile.PATH_SEPARATOR) ? str.substring(str.lastIndexOf(XVFSFile.PATH_SEPARATOR) + 1) : FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT;
    }

    /* renamed from: b */
    public boolean mo121316b(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Settings.canDrawOverlays(context);
        }
        return true;
    }

    /* renamed from: c */
    public void mo121317c() {
        View view = this.f252125e;
        if (view != null) {
            ((WindowManager) view.getContext().getApplicationContext().getSystemService("window")).removeView(this.f252125e);
            this.f252125e = null;
        }
    }
}

package com.tencent.matrix.batterycanary.stats.p1183ui;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import com.tencent.matrix.batterycanary.stats.C114559a;
import com.tencent.matrix.batterycanary.stats.C114572i;
import com.tencent.matrix.batterycanary.stats.p1183ui.BatteryStatsActivity;
import com.tencent.xweb.file.XVFSFile;
import java.util.Collections;
import java.util.Set;
import p1196he.C117080b;
import p172io.flutter.embedding.android.FlutterActivityLaunchConfigs;

/* renamed from: com.tencent.matrix.batterycanary.stats.ui.a */
public class C114592a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C114572i f343423d;

    /* renamed from: e */
    public final /* synthetic */ BatteryStatsActivity.C114576a f343424e;

    /* renamed from: com.tencent.matrix.batterycanary.stats.ui.a$a */
    public class C114593a implements PopupMenu.OnMenuItemClickListener {
        public C114593a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            String charSequence = menuItem.getTitle().toString();
            if (charSequence.contains(XVFSFile.PATH_SEPARATOR)) {
                String substring = charSequence.substring(charSequence.lastIndexOf(XVFSFile.PATH_SEPARATOR) + 1);
                TextView textView = C114592a.this.f343424e.f343376a;
                textView.setText(XVFSFile.PATH_SEPARATOR + substring);
                C114595c cVar = BatteryStatsActivity.this.f343373d;
                cVar.f343432e = substring;
                cVar.f343431d = 0;
                cVar.f343430c.post(new C117080b(cVar));
                BatteryStatsActivity.this.f343373d.mo173755b();
                BatteryStatsActivity.m161185G7(BatteryStatsActivity.this, 0);
            }
            return false;
        }
    }

    public C114592a(BatteryStatsActivity.C114576a aVar, C114572i iVar) {
        this.f343424e = aVar;
        this.f343423d = iVar;
    }

    public void onClick(View view) {
        Set<String> set;
        PopupMenu popupMenu = new PopupMenu(view.getContext(), this.f343424e.f343376a);
        popupMenu.getMenu().add("Process :main");
        C114559a aVar = this.f343423d.f343366d;
        if (aVar != null) {
            set = ((C114559a.C114560a) aVar).f343349b.decodeStringSet("bs-proc-set");
            if (set == null) {
                set = Collections.emptySet();
            }
        } else {
            set = Collections.emptySet();
        }
        for (String next : set) {
            if (!FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT.equals(next)) {
                Menu menu = popupMenu.getMenu();
                menu.add("Process :" + next);
            }
        }
        popupMenu.setOnMenuItemClickListener(new C114593a());
        popupMenu.show();
    }
}

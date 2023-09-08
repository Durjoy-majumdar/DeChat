package com.tencent.p014mm.plugin.setting.p102ui.setting;

import a31.C67003a;
import android.database.Cursor;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p645pj.C77091b;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsRingtoneUI */
public class SettingsRingtoneUI extends MMActivity implements Runnable, AdapterView.OnItemClickListener {

    /* renamed from: d */
    public RingtoneManager f205786d;

    /* renamed from: e */
    public Cursor f205787e;

    /* renamed from: f */
    public LayoutInflater f205788f;

    /* renamed from: g */
    public MMHandler f205789g;

    /* renamed from: h */
    public int f205790h = -1;

    /* renamed from: i */
    public int f205791i = -1;

    /* renamed from: j */
    public Ringtone f205792j;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsRingtoneUI$a */
    public class C71086a extends BaseAdapter {

        /* renamed from: d */
        public Cursor f205793d;

        /* renamed from: e */
        public int f205794e = 0;

        /* renamed from: f */
        public int f205795f = 0;

        public C71086a(Cursor cursor) {
            this.f205793d = cursor;
            this.f205794e = cursor.getCount() + 1;
            Log.m105918d("RingtonePickerActivity", "count = " + this.f205794e);
            this.f205795f = SettingsRingtoneUI.this.getResources().getDimensionPixelSize(C0966R.dimen.f3926j6);
        }

        /* renamed from: a */
        public String getItem(int i) {
            if (this.f205793d.isClosed() || !this.f205793d.moveToPosition(i - 1)) {
                return "";
            }
            Cursor cursor = this.f205793d;
            return cursor.getString(cursor.getColumnIndex(FFmpegMetadataRetriever.METADATA_KEY_TITLE));
        }

        public int getCount() {
            return this.f205794e;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            CheckedTextView checkedTextView = (CheckedTextView) SettingsRingtoneUI.this.f205788f.inflate(C0966R.C0971layout.f359966bw2, (ViewGroup) null);
            if (i == 0) {
                checkedTextView.setBackgroundResource(C0966R.C0969drawable.f4855pa);
                checkedTextView.setText(C0966R.string.ivy);
            } else if (i == this.f205794e - 1) {
                checkedTextView.setBackgroundResource(C0966R.C0969drawable.f4855pa);
                checkedTextView.setText(getItem(i));
            } else {
                checkedTextView.setBackgroundResource(C0966R.C0969drawable.f4855pa);
                checkedTextView.setText(getItem(i));
            }
            int i2 = this.f205795f;
            checkedTextView.setPadding(i2, 0, i2, 0);
            checkedTextView.setCheckMarkDrawable(C0966R.C0969drawable.apl);
            return checkedTextView;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bxs;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f205789g = new MMHandler();
        this.f205788f = LayoutInflater.from(this);
        RingtoneManager ringtoneManager = new RingtoneManager(this);
        this.f205786d = ringtoneManager;
        ringtoneManager.setType(2);
        setVolumeControlStream(5);
        this.f205792j = RingtoneManager.getRingtone(this, RingtoneManager.getDefaultUri(2));
        setMMTitle((int) C0966R.string.ivz);
        setBackBtn(new C71140c3(this));
        addTextOptionMenu(0, getString(C0966R.string.f361302it2), new C71143d3(this), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        ListView listView = (ListView) findViewById(C0966R.C0970id.jf4);
        View view = new View(this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0966R.dimen.f3895i6);
        view.setLayoutParams(new AbsListView.LayoutParams(-1, dimensionPixelSize));
        View view2 = new View(this);
        view2.setLayoutParams(new AbsListView.LayoutParams(-1, dimensionPixelSize));
        view.setClickable(false);
        view2.setClickable(false);
        listView.addHeaderView(view);
        listView.addFooterView(view2);
        this.f205787e = this.f205786d.getCursor();
        listView.setAdapter(new C71086a(this.f205787e));
        listView.setItemsCanFocus(false);
        listView.setOnItemClickListener(this);
        String str = (String) C77091b.m93038t().second;
        if (str != null) {
            int ringtonePosition = this.f205786d.getRingtonePosition(Uri.parse(str));
            int i = ringtonePosition > -1 ? ringtonePosition + 2 : 1;
            this.f205790h = i;
            if (i == 1) {
                getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit().putString("settings.ringtone.name", getString(C0966R.string.ivy)).commit();
                Log.m105918d("RingtonePickerActivity", "set ringtone follow system");
            }
            this.f205791i = this.f205790h - 1;
        } else {
            this.f205790h = 1;
        }
        listView.setItemChecked(this.f205790h, true);
        listView.setSelection(this.f205790h);
    }

    public void onDestroy() {
        this.f205789g.removeCallbacks(this);
        Cursor cursor = this.f205787e;
        if (cursor != null && !cursor.isClosed()) {
            this.f205787e.close();
            this.f205787e = null;
        }
        RingtoneManager ringtoneManager = this.f205786d;
        if (ringtoneManager != null) {
            try {
                Field declaredField = ringtoneManager.getClass().getDeclaredField("mActivity");
                C67003a.m79166a(declaredField);
                declaredField.setAccessible(true);
                declaredField.set(ringtoneManager, (Object) null);
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
        }
        super.onDestroy();
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsRingtoneUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        this.f205789g.removeCallbacks(this);
        this.f205791i = i - 1;
        this.f205789g.postDelayed(this, (long) 300);
        C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsRingtoneUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return (i == 24 || i == 25) ? super.onKeyUp(i, keyEvent) : super.onKeyDown(i, keyEvent);
    }

    public void onStop() {
        this.f205786d.stopPreviousRingtone();
        super.onStop();
    }

    public void run() {
        if (!isFinishing()) {
            int i = this.f205791i;
            Ringtone ringtone = i == 0 ? this.f205792j : this.f205786d.getRingtone(i - 1);
            if (ringtone != null) {
                try {
                    ringtone.play();
                } catch (Exception e) {
                    Log.printErrStackTrace("RingtonePickerActivity", e, "play ringtone error", new Object[0]);
                }
            }
        }
    }
}

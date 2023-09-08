package com.tencent.p014mm.plugin.backup.backupui;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.RadioCheckPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import go3.C20836t;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import nj3.C76879j;
import nj3.C88989a;
import pj3.C47511g;
import yu0.C102913k;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.backup.backupui.BackupSelectExtUI */
public class BackupSelectExtUI extends MMPreference {

    /* renamed from: d */
    public C47511g f50122d;

    /* renamed from: e */
    public RadioCheckPreference f50123e;

    /* renamed from: f */
    public RadioCheckPreference f50124f;

    /* renamed from: g */
    public RadioCheckPreference f50125g;

    /* renamed from: h */
    public RadioCheckPreference f50126h;

    /* renamed from: i */
    public Preference f50127i;

    /* renamed from: j */
    public Preference f50128j;

    /* renamed from: n */
    public int f50129n;

    /* renamed from: o */
    public int f50130o = 0;

    /* renamed from: p */
    public boolean f50131p = false;

    /* renamed from: q */
    public int f50132q = 0;

    /* renamed from: r */
    public long f50133r = 0;

    /* renamed from: s */
    public long f50134s = 0;

    /* renamed from: t */
    public long f50135t = 0;

    /* renamed from: u */
    public SimpleDateFormat f50136u = new SimpleDateFormat("yyyy.MM.dd");

    /* renamed from: com.tencent.mm.plugin.backup.backupui.BackupSelectExtUI$a */
    public class C18147a implements DatePickerDialog.OnDateSetListener {

        /* renamed from: a */
        public final /* synthetic */ int f50137a;

        public C18147a(int i) {
            this.f50137a = i;
        }

        public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            StringBuffer stringBuffer = new StringBuffer();
            boolean z = true;
            stringBuffer.append(String.format("%02d", new Object[]{Integer.valueOf(i)}));
            stringBuffer.append(String.format("%02d", new Object[]{Integer.valueOf(i2 + 1)}));
            stringBuffer.append(String.format("%02d", new Object[]{Integer.valueOf(i3)}));
            int i4 = this.f50137a;
            if (i4 == 1) {
                stringBuffer.append("000000");
                long k = C102913k.m136046k(stringBuffer.toString());
                BackupSelectExtUI backupSelectExtUI = BackupSelectExtUI.this;
                backupSelectExtUI.f50133r = (k / 1000) * 1000;
                backupSelectExtUI.f50128j.mo7741E(backupSelectExtUI.f50136u.format(new Date(k)));
                BackupSelectExtUI.this.f50122d.notifyDataSetChanged();
                BackupSelectExtUI backupSelectExtUI2 = BackupSelectExtUI.this;
                if (backupSelectExtUI2.f50133r == 0 || backupSelectExtUI2.f50134s == 0) {
                    z = false;
                }
                backupSelectExtUI2.enableOptionMenu(z);
            } else if (i4 == 2) {
                stringBuffer.append("000000");
                long k2 = C102913k.m136046k(stringBuffer.toString());
                BackupSelectExtUI backupSelectExtUI3 = BackupSelectExtUI.this;
                backupSelectExtUI3.f50134s = ((k2 / 1000) * 1000) + 86400000;
                backupSelectExtUI3.f50127i.mo7741E(backupSelectExtUI3.f50136u.format(new Date(k2)));
                BackupSelectExtUI.this.f50122d.notifyDataSetChanged();
                BackupSelectExtUI backupSelectExtUI4 = BackupSelectExtUI.this;
                if (backupSelectExtUI4.f50133r == 0 || backupSelectExtUI4.f50134s == 0) {
                    z = false;
                }
                backupSelectExtUI4.enableOptionMenu(z);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.backupui.BackupSelectExtUI$b */
    public class C18148b implements MenuItem.OnMenuItemClickListener {
        public C18148b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BackupSelectExtUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.backup.backupui.BackupSelectExtUI$c */
    public class C18149c implements MenuItem.OnMenuItemClickListener {
        public C18149c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BackupSelectExtUI backupSelectExtUI = BackupSelectExtUI.this;
            if (backupSelectExtUI.f50130o != 1 || backupSelectExtUI.f50133r < backupSelectExtUI.f50134s) {
                Intent intent = new Intent();
                intent.putExtra("BACKUP_SELECT_TIME_MODE", BackupSelectExtUI.this.f50130o);
                intent.putExtra("BACKUP_SELECT_CONTENT_TYPE", BackupSelectExtUI.this.f50132q);
                intent.putExtra("BACKUP_SELECT_TIME_START_TIME", BackupSelectExtUI.this.f50133r);
                intent.putExtra("BACKUP_SELECT_TIME_END_TIME", BackupSelectExtUI.this.f50134s);
                BackupSelectExtUI.this.setResult(-1, intent);
                BackupSelectExtUI.this.finish();
                return true;
            }
            int i = backupSelectExtUI.f50129n;
            if (i == 1) {
                C76879j.m92748s(backupSelectExtUI.getContext(), BackupSelectExtUI.this.getString(C0966R.string.acf), "");
            } else if (i == 2) {
                C76879j.m92748s(backupSelectExtUI.getContext(), BackupSelectExtUI.this.getString(C0966R.string.aa9), "");
            }
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo22751H7() {
        int i = this.f50132q;
        if (i == 0) {
            this.f50125g.mo7745I(true);
            this.f50126h.mo7745I(false);
            this.f50122d.notifyDataSetChanged();
        } else if (i == 1) {
            this.f50125g.mo7745I(false);
            this.f50126h.mo7745I(true);
            this.f50122d.notifyDataSetChanged();
        }
    }

    /* renamed from: I7 */
    public final void mo22752I7() {
        int i = this.f50130o;
        if (i == 0) {
            this.f50123e.mo7745I(true);
            this.f50124f.mo7745I(false);
            this.f50122d.mo72526j(this.f50128j);
            this.f50122d.mo72526j(this.f50127i);
            enableOptionMenu(true);
            this.f50122d.notifyDataSetChanged();
        } else if (i == 1) {
            mo22753J7();
        }
    }

    /* renamed from: J7 */
    public final void mo22753J7() {
        this.f50122d.removeAll();
        this.f50122d.mo72520b(C0966R.xml.f8859l);
        this.f50123e = (RadioCheckPreference) this.f50122d.mo72519a("backup_select_ext_time_all");
        this.f50124f = (RadioCheckPreference) this.f50122d.mo72519a("backup_select_ext_time_some");
        this.f50128j = this.f50122d.mo72519a("backup_select_begin_time");
        this.f50127i = this.f50122d.mo72519a("backup_select_end_time");
        this.f50125g = (RadioCheckPreference) this.f50122d.mo72519a("backup_select_ext_content_all_msg");
        this.f50126h = (RadioCheckPreference) this.f50122d.mo72519a("backup_select_ext_content_text_only");
        if (!this.f50131p) {
            C47511g gVar = this.f50122d;
            gVar.mo72526j(gVar.mo72519a("backup_select_ext_content_title"));
            this.f50122d.mo72526j(this.f50125g);
            this.f50122d.mo72526j(this.f50126h);
        }
        int i = this.f50129n;
        if (i == 1) {
            this.f50122d.mo72519a("backup_select_ext_time_title").mo69923G(C0966R.string.adr);
            if (this.f50131p) {
                this.f50122d.mo72519a("backup_select_ext_content_title").mo69923G(C0966R.string.adq);
            }
        } else if (i == 2) {
            this.f50122d.mo72519a("backup_select_ext_time_title").mo69923G(C0966R.string.abw);
            if (this.f50131p) {
                this.f50122d.mo72519a("backup_select_ext_content_title").mo69923G(C0966R.string.abv);
            }
        }
        int i2 = this.f50130o;
        if (i2 == 0) {
            this.f50123e.mo7745I(true);
            this.f50124f.mo7745I(false);
            this.f50128j.mo69932y(false);
            this.f50127i.mo69932y(false);
            this.f50122d.mo72526j(this.f50128j);
            this.f50122d.mo72526j(this.f50127i);
            enableOptionMenu(true);
        } else if (i2 == 1) {
            if (this.f50133r == 0 || this.f50134s == 0) {
                this.f50128j.mo7740D(C0966R.string.aeb);
                this.f50127i.mo7740D(C0966R.string.aeb);
                enableOptionMenu(false);
            } else {
                this.f50128j.mo7741E(this.f50136u.format(new Date(this.f50133r)));
                this.f50127i.mo7741E(this.f50136u.format(new Date(this.f50134s - 86400000)));
                enableOptionMenu((this.f50133r == 0 || this.f50134s == 0) ? false : true);
            }
            this.f50123e.mo7745I(false);
            this.f50124f.mo7745I(true);
            this.f50128j.mo69932y(true);
            this.f50127i.mo69932y(true);
        }
        if (this.f50131p) {
            int i3 = this.f50132q;
            if (i3 == 0) {
                this.f50125g.mo7745I(true);
                this.f50126h.mo7745I(false);
            } else if (i3 == 1) {
                this.f50125g.mo7745I(false);
                this.f50126h.mo7745I(true);
            }
        }
        this.f50122d.notifyDataSetChanged();
    }

    public int getResourceId() {
        return C0966R.xml.f8859l;
    }

    public void initView() {
        this.f50129n = getIntent().getIntExtra("BACKUP_MODE", 0);
        setMMTitle((int) C0966R.string.ae9);
        this.f50130o = getIntent().getIntExtra("BACKUP_SELECT_TIME_MODE", 0);
        this.f50131p = getIntent().getBooleanExtra("BACKUP_SELECT_SUPPORT_CONTENT_TYPE", false);
        this.f50132q = getIntent().getIntExtra("BACKUP_SELECT_CONTENT_TYPE", 0);
        this.f50133r = getIntent().getLongExtra("BACKUP_SELECT_TIME_START_TIME", 0);
        this.f50134s = getIntent().getLongExtra("BACKUP_SELECT_TIME_END_TIME", 0);
        this.f50135t = getIntent().getLongExtra("BACKUP_SELECT_TIME_MIN_CONVERSATION_TIME", 0);
        mo22753J7();
        setBackBtn(new C18148b());
        addTextOptionMenu(0, getString(C0966R.string.aew), new C18149c(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f50122d = getPreferenceScreen();
        initView();
    }

    public Dialog onCreateDialog(int i) {
        int i2 = i;
        Calendar instance = Calendar.getInstance();
        if (i2 == 1) {
            long j = this.f50133r;
            if (j == 0) {
                j = Util.nowMilliSecond();
            }
            instance.setTimeInMillis(j);
        } else if (i2 == 2) {
            long j2 = this.f50134s;
            instance.setTimeInMillis(j2 == 0 ? Util.nowMilliSecond() : j2 - 86400000);
        }
        C20836t tVar = new C20836t(getContext(), new C18147a(i2), instance.get(1), instance.get(2), instance.get(5), instance.getTimeInMillis());
        tVar.setCanceledOnTouchOutside(false);
        long nowMilliSecond = (((Util.nowMilliSecond() / 86400000) * 86400000) + 57600000) - 1;
        long j3 = (((this.f50135t / 86400000) * 86400000) + 57600000) - 86400000;
        if (nowMilliSecond > j3) {
            try {
                tVar.getDatePicker().setMinDate(j3);
                tVar.getDatePicker().setMaxDate(nowMilliSecond);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.BackupSelectExtUI", "DatePicker exception!! minTime:%d, maxTime:%d, exception:%s", Long.valueOf(j3), Long.valueOf(nowMilliSecond), e);
            }
        }
        return tVar;
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        if (str.equals("backup_select_ext_time_all")) {
            this.f50130o = 0;
            mo22752I7();
            return true;
        } else if (str.equals("backup_select_ext_time_some")) {
            this.f50130o = 1;
            mo22752I7();
            return true;
        } else if (str.equals("backup_select_ext_content_all_msg")) {
            if (this.f50131p) {
                this.f50132q = 0;
                mo22751H7();
            } else {
                Log.m105920e("MicroMsg.BackupSelectExtUI", "onPreferenceTreeClick select ext content all msg, but not support content type");
            }
            return true;
        } else if (str.equals("backup_select_ext_content_text_only")) {
            if (this.f50131p) {
                this.f50132q = 1;
                mo22751H7();
            } else {
                Log.m105920e("MicroMsg.BackupSelectExtUI", "onPreferenceTreeClick select ext content text only, but not support content type");
            }
            return true;
        } else if (str.equals("backup_select_begin_time")) {
            showDialog(1);
            return true;
        } else if (!str.equals("backup_select_end_time")) {
            return false;
        } else {
            showDialog(2);
            return true;
        }
    }
}

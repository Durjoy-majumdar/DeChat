package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WCWebUpdater;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.DialPad */
public class DialPad extends RelativeLayout implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: i */
    public static final String[] f313280i = {"1", "2", "3", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN, "7", "8", "9", "*", "0", "#"};

    /* renamed from: j */
    public static final String[] f313281j = {"", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ", "", "+", ""};

    /* renamed from: d */
    public boolean f313282d = false;

    /* renamed from: e */
    public Map<Integer, DialNumberButton> f313283e = new HashMap();

    /* renamed from: f */
    public Map<String, DialNumberButton> f313284f = new HashMap();

    /* renamed from: g */
    public Map<Integer, View> f313285g = new HashMap();

    /* renamed from: h */
    public C105386a f313286h;

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.DialPad$a */
    public interface C105386a {
        /* renamed from: a */
        void mo150109a(String str);

        /* renamed from: b */
        void mo150110b(String str);
    }

    public DialPad(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f7139zh, this);
        float dimensionPixelSize = (float) getContext().getResources().getDimensionPixelSize(C0966R.dimen.f357039ac0);
        String[] strArr = f313280i;
        String str = strArr[0];
        String[] strArr2 = f313281j;
        mo150102a(C0966R.C0970id.f357866c61, str, strArr2[0], dimensionPixelSize);
        mo150102a(C0966R.C0970id.c67, strArr[1], strArr2[1], dimensionPixelSize);
        mo150102a(C0966R.C0970id.c66, strArr[2], strArr2[2], dimensionPixelSize);
        mo150102a(C0966R.C0970id.c5z, strArr[3], strArr2[3], dimensionPixelSize);
        mo150102a(C0966R.C0970id.c5y, strArr[4], strArr2[4], dimensionPixelSize);
        mo150102a(C0966R.C0970id.c64, strArr[5], strArr2[5], dimensionPixelSize);
        mo150102a(C0966R.C0970id.f357867c62, strArr[6], strArr2[6], dimensionPixelSize);
        mo150102a(C0966R.C0970id.c5x, strArr[7], strArr2[7], dimensionPixelSize);
        mo150102a(C0966R.C0970id.f357865c60, strArr[8], strArr2[8], dimensionPixelSize);
        mo150102a(C0966R.C0970id.c65, strArr[9], strArr2[9], (float) getContext().getResources().getDimensionPixelSize(C0966R.dimen.f357040ac3));
        mo150102a(C0966R.C0970id.c68, strArr[10], strArr2[10], dimensionPixelSize);
        mo150102a(C0966R.C0970id.f357868c63, strArr[11], strArr2[11], (float) getContext().getResources().getDimensionPixelSize(C0966R.dimen.ac4));
        this.f313285g.put(Integer.valueOf(C0966R.C0970id.c8g), findViewById(C0966R.C0970id.c8g));
        this.f313285g.put(Integer.valueOf(C0966R.C0970id.c8l), findViewById(C0966R.C0970id.c8l));
        this.f313285g.put(Integer.valueOf(C0966R.C0970id.c8j), findViewById(C0966R.C0970id.c8j));
        this.f313285g.put(Integer.valueOf(C0966R.C0970id.c8c), findViewById(C0966R.C0970id.c8c));
        this.f313285g.put(Integer.valueOf(C0966R.C0970id.c8b), findViewById(C0966R.C0970id.c8b));
        for (View next : this.f313285g.values()) {
            if (this.f313282d) {
                next.setBackgroundDrawable(getResources().getDrawable(C0966R.color.agb));
            } else {
                next.setBackgroundDrawable(getResources().getDrawable(C0966R.color.f3302mz));
            }
        }
        setClipToPadding(false);
        setClipChildren(false);
    }

    /* renamed from: a */
    public final void mo150102a(int i, String str, String str2, float f) {
        DialNumberButton dialNumberButton = (DialNumberButton) findViewById(i);
        dialNumberButton.getClass();
        if (!Util.isNullOrNil(str) && str.length() == 1) {
            dialNumberButton.f313278d.setText(str);
        }
        if (!Util.isNullOrNil(str2) || "1".equals(str)) {
            dialNumberButton.f313279e.setText(str2);
            dialNumberButton.f313279e.setVisibility(0);
        } else {
            dialNumberButton.f313279e.setVisibility(8);
        }
        dialNumberButton.f313278d.setTextSize(0, f);
        dialNumberButton.setOnClickListener(this);
        dialNumberButton.setOnLongClickListener(this);
        dialNumberButton.setInTalkUIMode(this.f313282d);
        this.f313283e.put(Integer.valueOf(i), dialNumberButton);
        this.f313284f.put(str, dialNumberButton);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r7) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/ipcall/ui/DialPad"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r7)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r6
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            java.util.Map<java.lang.Integer, com.tencent.mm.plugin.ipcall.ui.DialNumberButton> r0 = r6.f313283e
            int r1 = r7.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x00dc
            java.util.Map<java.lang.Integer, com.tencent.mm.plugin.ipcall.ui.DialNumberButton> r0 = r6.f313283e
            int r7 = r7.getId()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r7 = r0.get(r7)
            com.tencent.mm.plugin.ipcall.ui.DialNumberButton r7 = (com.tencent.p014mm.plugin.ipcall.p065ui.DialNumberButton) r7
            java.lang.String r0 = r7.getNumberText()
            java.lang.String r7 = r7.getOtherText()
            com.tencent.mm.plugin.ipcall.model.g r1 = com.tencent.p014mm.plugin.ipcall.model.C105385g.xx0()
            a43.a r1 = r1.f313277r
            if (r1 != 0) goto L_0x005e
            com.tencent.mm.plugin.ipcall.model.g r1 = com.tencent.p014mm.plugin.ipcall.model.C105385g.xx0()
            a43.a r2 = new a43.a
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2.<init>(r3)
            r1.f313277r = r2
        L_0x005e:
            com.tencent.mm.plugin.ipcall.model.g r1 = com.tencent.p014mm.plugin.ipcall.model.C105385g.xx0()
            a43.a r1 = r1.f313277r
            r1.getClass()
            r2 = -1
            if (r0 == 0) goto L_0x0086
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0073
            goto L_0x0086
        L_0x0073:
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = a43.C103303a.f304583c
            boolean r4 = r3.containsKey(r0)
            if (r4 == 0) goto L_0x0086
            java.lang.Object r3 = r3.get(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x0087
        L_0x0086:
            r3 = -1
        L_0x0087:
            if (r3 != r2) goto L_0x008a
            goto L_0x00cd
        L_0x008a:
            android.content.Context r2 = a43.C103303a.f304584d
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r4 = "dtmf_tone"
            r5 = 1
            int r2 = android.provider.Settings.System.getInt(r2, r4, r5)
            if (r2 != r5) goto L_0x009b
            r2 = 1
            goto L_0x009c
        L_0x009b:
            r2 = 0
        L_0x009c:
            if (r2 != 0) goto L_0x009f
            goto L_0x00cd
        L_0x009f:
            ou0.a r2 = pu0.C110248b.vx0()
            android.media.AudioManager r2 = r2.f329358h
            if (r2 != 0) goto L_0x00b1
            android.content.Context r2 = a43.C103303a.f304584d
            java.lang.String r4 = "audio"
            java.lang.Object r2 = r2.getSystemService(r4)
            android.media.AudioManager r2 = (android.media.AudioManager) r2
        L_0x00b1:
            int r2 = r2.getRingerMode()
            if (r2 == 0) goto L_0x00cd
            if (r2 != r5) goto L_0x00ba
            goto L_0x00cd
        L_0x00ba:
            java.lang.Object r2 = r1.f304585a
            monitor-enter(r2)
            android.media.ToneGenerator r1 = r1.f304586b     // Catch:{ all -> 0x00ca }
            if (r1 != 0) goto L_0x00c3
            monitor-exit(r2)     // Catch:{ all -> 0x00ca }
            goto L_0x00cd
        L_0x00c3:
            r4 = 250(0xfa, float:3.5E-43)
            r1.startTone(r3, r4)     // Catch:{ all -> 0x00ca }
            monitor-exit(r2)     // Catch:{ all -> 0x00ca }
            goto L_0x00cd
        L_0x00ca:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ca }
            throw r7
        L_0x00cd:
            com.tencent.mm.plugin.ipcall.ui.DialPad$a r1 = r6.f313286h
            if (r1 == 0) goto L_0x00dc
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x00d8
            goto L_0x00d9
        L_0x00d8:
            r0 = r7
        L_0x00d9:
            r1.mo150109a(r0)
        L_0x00dc:
            java.lang.String r7 = "com/tencent/mm/plugin/ipcall/ui/DialPad"
            java.lang.String r0 = "android/view/View$OnClickListener"
            java.lang.String r1 = "onClick"
            java.lang.String r2 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r6, r7, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ipcall.p065ui.DialPad.onClick(android.view.View):void");
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/DialPad", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (((HashMap) this.f313283e).containsKey(Integer.valueOf(view.getId()))) {
            DialNumberButton dialNumberButton = (DialNumberButton) ((HashMap) this.f313283e).get(Integer.valueOf(view.getId()));
            String numberText = dialNumberButton.getNumberText();
            String otherText = dialNumberButton.getOtherText();
            C105386a aVar = this.f313286h;
            if (aVar != null) {
                if (Util.isNullOrNil(numberText)) {
                    numberText = otherText;
                }
                aVar.mo150110b(numberText);
            }
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/ipcall/ui/DialPad", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/ipcall/ui/DialPad", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }

    public void onViewAdded(View view) {
        Log.m105925i("MicroMsg.DialPad", "onViewAdded, class: %s", view.getClass().getSimpleName());
    }

    public void onViewRemoved(View view) {
        Log.m105925i("MicroMsg.DialPad", "onViewRemoved, class: %s", view.getClass().getSimpleName());
    }

    public void setDialButtonClickListener(C105386a aVar) {
        this.f313286h = aVar;
    }

    public void setTalkUIMode(boolean z) {
        this.f313282d = z;
        for (DialNumberButton inTalkUIMode : ((HashMap) this.f313283e).values()) {
            inTalkUIMode.setInTalkUIMode(z);
        }
        for (View view : ((HashMap) this.f313285g).values()) {
            if (this.f313282d) {
                view.setBackgroundDrawable(getResources().getDrawable(C0966R.color.agb));
            } else {
                view.setBackgroundDrawable(getResources().getDrawable(C0966R.color.f3302mz));
            }
        }
    }
}

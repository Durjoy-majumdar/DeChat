package com.tencent.p014mm.pluginsdk.cmd;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mm.pluginsdk.cmd.RecoveryConsoleUI */
public class RecoveryConsoleUI extends MMActivity implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public List<Map<String, String>> f23935d;

    /* renamed from: e */
    public List<C30650a.C6643a> f23936e;

    /* renamed from: f */
    public SimpleAdapter f23937f;

    /* renamed from: g */
    public ListView f23938g;

    public int getLayoutId() {
        return C0966R.C0971layout.beo;
    }

    public void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        setTitle("Recovery Console");
        HashMap<String, C30650a.C6643a> hashMap = C30650a.f82495b;
        synchronized (hashMap) {
            arrayList = new ArrayList(hashMap.values());
        }
        this.f23936e = arrayList;
        this.f23935d = new ArrayList(((ArrayList) this.f23936e).size());
        Iterator it = ((ArrayList) this.f23936e).iterator();
        while (it.hasNext()) {
            HashMap hashMap2 = new HashMap();
            ((C30650a.C6643a) it.next()).getClass();
            hashMap2.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, getString(0));
            ((ArrayList) this.f23935d).add(hashMap2);
        }
        this.f23937f = new SimpleAdapter(this, this.f23935d, C0966R.C0971layout.bcy, new String[]{FFmpegMetadataRetriever.METADATA_KEY_TITLE}, new int[]{16908310});
        ListView listView = (ListView) findViewById(16908298);
        this.f23938g = listView;
        listView.setAdapter(this.f23937f);
        this.f23938g.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/cmd/RecoveryConsoleUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        ((C30650a.C6643a) ((ArrayList) this.f23936e).get(i)).getClass();
        C30650a.m39146a(this, (String) null, "");
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/cmd/RecoveryConsoleUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}

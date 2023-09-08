package com.tencent.p014mm.plugin.downloader_app.search;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import android.util.Base64;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.downloader.event.DownloadEventBus;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import h51.C46004a;
import h51.C46012e;
import h51.C8488f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import p237sp.C36768q;
import wq3.C111847h;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader_app.search.DownloadSearchListView */
public class DownloadSearchListView extends MRecyclerView implements C111847h {

    /* renamed from: C1 */
    public Context f110399C1;

    /* renamed from: D1 */
    public C46004a f110400D1;

    /* renamed from: E1 */
    public List<C46012e> f110401E1;

    /* renamed from: F1 */
    public List<C46012e> f110402F1;

    /* renamed from: G1 */
    public C36768q.C36769a f110403G1 = new C41017a();

    /* renamed from: com.tencent.mm.plugin.downloader_app.search.DownloadSearchListView$a */
    public class C41017a implements C36768q.C36769a {
        public C41017a() {
        }

        /* renamed from: f */
        public void mo2084f(int i, long j) {
            C53736a c;
            if (i == 9 && (c = C40933j.m44314c(j)) != null) {
                C46004a aVar = DownloadSearchListView.this.f110400D1;
                String str = c.field_appId;
                if (!Util.isNullOrNil((List) aVar.f124054f) && !Util.isNullOrNil(str)) {
                    Iterator<C46012e> it = aVar.f124054f.iterator();
                    while (it.hasNext()) {
                        C46012e next = it.next();
                        String str2 = next.f124084d;
                        if (str2 != null && str2.equals(str)) {
                            next.f124083c = 2;
                        }
                    }
                    aVar.notifyDataSetChanged();
                }
            }
        }
    }

    public DownloadSearchListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f110399C1 = context;
    }

    private void setData(List<C46012e> list) {
        C46004a aVar = this.f110400D1;
        aVar.f124054f.clear();
        if (!Util.isNullOrNil((List) list)) {
            aVar.f124054f.addAll(list);
        }
        aVar.notifyDataSetChanged();
    }

    /* renamed from: B1 */
    public void mo64046B1(String str) {
        if (!Util.isNullOrNil(str)) {
            Context context = this.f110399C1;
            if (!Util.isNullOrNil(str)) {
                C46012e.m51292a(context, str);
                int i = 0;
                SharedPreferences sharedPreferences = context.getSharedPreferences("search_history_href", 0);
                String string = sharedPreferences.getString("search_history_list", "");
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(Base64.encodeToString(str.getBytes(), 0));
                stringBuffer.append(";");
                stringBuffer.append(string);
                String[] split = stringBuffer.toString().split(";");
                stringBuffer.setLength(0);
                while (i < split.length && i < 10) {
                    stringBuffer.append(split[i]);
                    stringBuffer.append(";");
                    i++;
                }
                sharedPreferences.edit().putString("search_history_list", stringBuffer.toString()).commit();
            }
            this.f110401E1 = C46012e.m51293b(this.f110399C1);
        }
    }

    /* renamed from: C1 */
    public void mo64047C1() {
        this.f110399C1.getSharedPreferences("search_history_href", 0).edit().putString("search_history_list", "").commit();
        List<C46012e> list = this.f110401E1;
        if (list != null) {
            list.clear();
        }
        setData((List<C46012e>) null);
    }

    /* renamed from: D1 */
    public void mo64048D1(String str) {
        if (!Util.isNullOrNil(str)) {
            C46012e.m51292a(this.f110399C1, str);
            List<C46012e> b = C46012e.m51293b(this.f110399C1);
            this.f110401E1 = b;
            setData(b);
        }
    }

    /* renamed from: E1 */
    public void mo64049E1() {
        setData((List<C46012e>) null);
    }

    /* renamed from: F1 */
    public void mo64050F1() {
        setVisibility(0);
        if (Util.isNullOrNil((List) this.f110401E1)) {
            this.f110401E1 = C46012e.m51293b(this.f110399C1);
        }
        setData(this.f110401E1);
    }

    /* renamed from: G1 */
    public void mo64051G1(List<C46012e> list) {
        setVisibility(0);
        ((ArrayList) this.f110402F1).clear();
        if (!Util.isNullOrNil((List) list)) {
            ((ArrayList) this.f110402F1).addAll(list);
        }
        setData(this.f110402F1);
    }

    public void onAttachedToWindow() {
        Log.m105924i("MicroMsg.DownloadSearchListView", "onAttachedToWindow");
        super.onAttachedToWindow();
        C36768q.C36769a aVar = this.f110403G1;
        if (aVar != null) {
            ((CopyOnWriteArraySet) DownloadEventBus.f110053f).add(aVar);
        } else {
            DownloadEventBus downloadEventBus = DownloadEventBus.f110051d;
        }
    }

    public void onDetachedFromWindow() {
        Log.m105924i("MicroMsg.DownloadSearchListView", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        C36768q.C36769a aVar = this.f110403G1;
        if (aVar != null) {
            ((CopyOnWriteArraySet) DownloadEventBus.f110053f).remove(aVar);
        } else {
            DownloadEventBus downloadEventBus = DownloadEventBus.f110051d;
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        setLayoutManager(new LinearLayoutManager(getContext()));
        C46004a aVar = new C46004a(this.f110399C1, this);
        this.f110400D1 = aVar;
        setAdapter(aVar);
        mo17085h0(new C8488f(getResources()));
        this.f110401E1 = C46012e.m51293b(this.f110399C1);
        this.f110402F1 = new ArrayList();
    }

    public DownloadSearchListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f110399C1 = context;
    }
}

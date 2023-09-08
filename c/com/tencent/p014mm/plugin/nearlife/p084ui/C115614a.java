package com.tencent.p014mm.plugin.nearlife.p084ui;

import android.content.Context;
import android.view.View;
import android.widget.BaseAdapter;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fc2.C116858d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.C64885zm2;

/* renamed from: com.tencent.mm.plugin.nearlife.ui.a */
public abstract class C115614a extends BaseAdapter {

    /* renamed from: d */
    public boolean f346813d = false;

    /* renamed from: e */
    public String f346814e = "";

    /* renamed from: f */
    public Context f346815f;

    /* renamed from: g */
    public ArrayList<C116858d> f346816g = new ArrayList<>();

    /* renamed from: h */
    public HashSet<String> f346817h = new HashSet<>();

    /* renamed from: i */
    public ArrayList<BackwardSupportUtil.ExifHelper.LatLongData> f346818i = null;

    /* renamed from: j */
    public Map<BackwardSupportUtil.ExifHelper.LatLongData, C51018qv3> f346819j;

    /* renamed from: n */
    public Map<BackwardSupportUtil.ExifHelper.LatLongData, Integer> f346820n;

    /* renamed from: o */
    public Map<String, BackwardSupportUtil.ExifHelper.LatLongData> f346821o;

    /* renamed from: p */
    public BackwardSupportUtil.ExifHelper.LatLongData f346822p;

    /* renamed from: q */
    public boolean f346823q = true;

    /* renamed from: r */
    public String f346824r = "";

    /* renamed from: s */
    public int f346825s = 0;

    /* renamed from: t */
    public View.OnClickListener f346826t;

    public C115614a(Context context, View.OnClickListener onClickListener, String str, boolean z) {
        this.f346815f = context;
        this.f346826t = onClickListener;
        this.f346814e = str;
        this.f346813d = z;
        this.f346818i = new ArrayList<>();
        this.f346819j = new HashMap();
        this.f346820n = new HashMap();
        this.f346821o = new HashMap();
    }

    /* renamed from: f */
    public static String m162538f(List<C51163rv3> list) {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            C51163rv3 rv32 = list.get(i);
            if (rv32 != null && (str = rv32.f141175d) != null && !str.equals("") && !rv32.f141175d.toLowerCase().equals("null")) {
                stringBuffer.append(rv32.f141175d);
                if (i < list.size() - 1) {
                    stringBuffer.append("·");
                }
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public void mo175740a(C116858d dVar, int i) {
        if (!this.f346817h.contains(dVar.f350244b) && i <= this.f346816g.size()) {
            this.f346816g.add(i, dVar);
            this.f346817h.add(dVar.f350244b);
            ((HashMap) this.f346821o).put(dVar.f350244b, this.f346822p);
        }
    }

    /* renamed from: b */
    public void mo175741b() {
        this.f346816g.clear();
        this.f346817h.clear();
        ((HashMap) this.f346820n).clear();
        ((HashMap) this.f346819j).clear();
        ((HashMap) this.f346821o).clear();
        this.f346825s = 0;
        notifyDataSetChanged();
    }

    /* renamed from: d */
    public boolean mo175742d() {
        Iterator<BackwardSupportUtil.ExifHelper.LatLongData> it = this.f346818i.iterator();
        while (it.hasNext()) {
            if (mo175743g(it.next()) > 0) {
                return true;
            }
        }
        return this.f346823q && mo175743g(this.f346822p) > 0;
    }

    /* renamed from: g */
    public int mo175743g(BackwardSupportUtil.ExifHelper.LatLongData latLongData) {
        if (((HashMap) this.f346820n).containsKey(latLongData)) {
            return ((Integer) ((HashMap) this.f346820n).get(latLongData)).intValue();
        }
        return 1;
    }

    public int getCount() {
        return this.f346816g.size();
    }

    public long getItemId(int i) {
        return 0;
    }

    /* renamed from: h */
    public int mo175747h(String str) {
        Iterator<C116858d> it = this.f346816g.iterator();
        int i = -1;
        while (it.hasNext()) {
            i++;
            if (it.next().f350244b.equals(str)) {
                break;
            }
        }
        return i;
    }

    /* renamed from: i */
    public C116858d getItem(int i) {
        return (i < 0 || i >= this.f346816g.size()) ? new C116858d("", new C64885zm2()) : this.f346816g.get(i);
    }

    /* renamed from: j */
    public void mo175749j(BackwardSupportUtil.ExifHelper.LatLongData latLongData, int i, C51018qv3 qv32) {
        BackwardSupportUtil.ExifHelper.LatLongData latLongData2;
        Object[] objArr = new Object[4];
        int i2 = 0;
        objArr[0] = Float.valueOf(latLongData.latitude);
        objArr[1] = Float.valueOf(latLongData.longtitude);
        objArr[2] = Integer.valueOf(i);
        if (qv32 != null) {
            i2 = qv32.f140572d;
        }
        objArr[3] = Integer.valueOf(i2);
        Log.m105919d("MicroMsg.BaseLifeAdapter", "set flag & buf, lat:%f long:%f flag:%d len:%d", objArr);
        if (this.f346818i.contains(latLongData) || ((latLongData2 = this.f346822p) != null && latLongData2.equals(latLongData))) {
            ((HashMap) this.f346820n).put(latLongData, Integer.valueOf(i));
            ((HashMap) this.f346819j).put(latLongData, qv32);
        }
    }
}

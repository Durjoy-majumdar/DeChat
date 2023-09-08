package com.tencent.p014mm.plugin.report.service;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.tencent.mm.plugin.report.service.f */
public class C42880f {

    /* renamed from: a */
    public static Set<Integer> f116105a = new HashSet();

    /* renamed from: b */
    public static boolean f116106b = false;

    /* renamed from: a */
    public static void m46539a() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(MMApplicationContext.getContext().getResources().openRawResource(C0966R.raw.invalid_idkey)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                ((HashSet) f116105a).add(Integer.valueOf(Integer.parseInt(readLine)));
            }
        } catch (IOException unused) {
            Log.m105920e("IDKeyInvalidList", "invalid value in R file");
        }
        f116106b = true;
    }

    /* renamed from: b */
    public static boolean m46540b(int i) {
        synchronized (f116105a) {
            if (!f116106b) {
                m46539a();
            }
        }
        return ((HashSet) f116105a).contains(Integer.valueOf(i));
    }
}

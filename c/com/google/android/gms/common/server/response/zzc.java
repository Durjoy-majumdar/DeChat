package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;

final class zzc implements FastParser.zza<Float> {
    public final /* synthetic */ Object zzh(FastParser fastParser, BufferedReader bufferedReader) {
        return Float.valueOf(fastParser.zzg(bufferedReader));
    }
}

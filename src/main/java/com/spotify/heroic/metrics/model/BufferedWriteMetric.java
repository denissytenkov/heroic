package com.spotify.heroic.metrics.model;

import java.util.List;

import lombok.Data;

import com.spotify.heroic.cluster.model.NodeRegistryEntry;
import com.spotify.heroic.model.DataPoint;
import com.spotify.heroic.model.Series;

@Data
public class BufferedWriteMetric {
    private final NodeRegistryEntry node;
    private final String backendGroup;
    private final Series series;
    private final List<DataPoint> data;
}
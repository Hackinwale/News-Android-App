package de.luhmer.owncloudnewsreader.interfaces;

import de.luhmer.owncloudnewsreader.database.model.RssItem;

/**
 * Created by David on 01.09.2014.
 */
public interface IPlayPodcastClicked {
    void openPodcast(RssItem rssItem);
}

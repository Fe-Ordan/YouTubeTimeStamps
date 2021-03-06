package com.blundell.tut;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

class MockBackend {

    private static final List<Comment> MOCK_DATA = new ArrayList<>();
    private static final List<Comment> MOCK_DATA_ISO = new ArrayList<>();

    static {
        MOCK_DATA.add(new Comment(date("2016-02-19 06:00"), "Lorem ipsum dolor sit amet, ad antiopam intellegebat eum."));
        MOCK_DATA.add(new Comment(date("2016-02-14 11:55"), "Est viderer mentitum ad. Saepe alienum laboramus eu vel,"));
        MOCK_DATA.add(new Comment(date("2016-02-14 09:00"), "cu odio scribentur concludaturque sed, cu nihil virtute principes has."));
        MOCK_DATA.add(new Comment(date("2016-02-13 12:00"), "Oblique vituperatoribus his no, an mei esse eligendi."));
        MOCK_DATA.add(new Comment(date("2016-02-06 12:00"), "Atqui civibus cu eam, an magna maluisset mei."));
        MOCK_DATA.add(new Comment(date("2016-01-14 18:40"), "Eu usu erat iisque, id vel sale everti."));
        MOCK_DATA.add(new Comment(date("2016-01-13 18:40"), "Ut etiam comprehensam signiferumque his, mel"));
        MOCK_DATA.add(new Comment(date("2015-10-14 18:40"), "an inani laudem eruditi, nec cu putant admodum corrumpit."));
        MOCK_DATA.add(new Comment(date("2014-02-14 18:40"), "No maiorum dissentias consectetuer eos, at animal volutpat quaerendum duo."));
        MOCK_DATA.add(new Comment(date("2014-02-14 18:40"), "Aeque commune ne vel."));
        MOCK_DATA.add(new Comment(date("2014-02-14 18:40"), "Ferri quidam nam ad. Eros temporibus ea duo."));

        //Iso Data Template.
        MOCK_DATA_ISO.add(new Comment(dateIso("2016-02-19T06:00:03Z"), "Lorem ipsum dolor sit amet, ad antiopam intellegebat eum."));
        MOCK_DATA_ISO.add(new Comment(dateIso("2016-02-14T11:55:55Z"), "Est viderer mentitum ad. Saepe alienum laboramus eu vel,"));
        MOCK_DATA_ISO.add(new Comment(dateIso("2016-02-14T09:00:01Z"), "cu odio scribentur concludaturque sed, cu nihil virtute principes has."));
        MOCK_DATA_ISO.add(new Comment(dateIso("2016-02-13T12:00:05Z"), "Oblique vituperatoribus his no, an mei esse eligendi."));
        MOCK_DATA_ISO.add(new Comment(dateIso("2016-02-06T12:00:30Z"), "Atqui civibus cu eam, an magna maluisset mei."));
        MOCK_DATA_ISO.add(new Comment(dateIso("2016-01-14T18:40:10Z"), "Eu usu erat iisque, id vel sale everti."));
        MOCK_DATA_ISO.add(new Comment(dateIso("2016-01-13T18:40:20Z"), "Ut etiam comprehensam signiferumque his, mel"));
        MOCK_DATA_ISO.add(new Comment(dateIso("2015-10-14T18:40:15Z"), "an inani laudem eruditi, nec cu putant admodum corrumpit."));
        MOCK_DATA_ISO.add(new Comment(dateIso("2014-02-14T18:40:50Z"), "No maiorum dissentias consectetuer eos, at animal volutpat quaerendum duo."));
        MOCK_DATA_ISO.add(new Comment(dateIso("2014-02-14T18:40:01Z"), "Aeque commune ne vel."));
        MOCK_DATA_ISO.add(new Comment(dateIso("2014-02-14T18:40:03Z"), "Ferri quidam nam ad. Eros temporibus ea duo."));
    }

    private static Date date(String string) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.UK).parse(string);
        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static Date dateIso(String string){
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(string);
        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static List<Comment> loadComments() {
        return MOCK_DATA;
    }

    public static List<Comment> loadIsoComments() {
        return MOCK_DATA_ISO;
    }

}

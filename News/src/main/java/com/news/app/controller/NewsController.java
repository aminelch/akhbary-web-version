package com.news.app.controller;

import com.news.app.model.Example;
import com.news.app.service.NewsService;
//import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;


@RestController
public class NewsController {

//    private String country = "ar";
//    private String category = "all";

//
//    @GetMapping(value = "/api/v1/categorizednews/{country}/{category}")
//    public List<Example> sendCategorizedUpdate(@PathVariable String country, @PathVariable String category) throws ParseException, IOException {
//        return NewsService.sendCategorizedUpdate(country, category);
//    }
//
//    @GetMapping(value = "/Sourcednews/{country}/{source123}")
//    public List<Example> sendSourcedUpdate(@PathVariable String country, @PathVariable String source123) throws ParseException, IOException {
//        return NewsService.sendSourcedUpdate(country, source123);
//    }
//
//    @GetMapping(value = "/news/{country}/{category}/{source123}")
//    public List<Example> sendRefinedUpdate(@PathVariable String country, @PathVariable String category, @PathVariable String source123) throws ParseException, IOException {
//        return NewsService.sendRefinedUpdate(country, category, source123);
//    }


    /**
     * get All available News
     *
     * @return
     * @throws IOException
     */

    @GetMapping(value = "/api/v1/everythings")
    public List<Example> getEveryThings() throws ParseException, IOException {
        return NewsService.sendCategorizedUpdate("sa", "technology");
    }

    /**
     * Search for a specific word
     *
     * @param query
     * @return
     * @throws ParseException
     * @throws IOException
     */
    @GetMapping("/api/v1/search/{query}")
    public List<Example> search(@PathVariable String query) throws ParseException, IOException {
        return NewsService.searchFor(query);
    }


    /**
     * Get available news categorized  by technology
     *
     * @return
     * @throws ParseException
     * @throws IOException
     */
    @GetMapping("/api/v1/news/technology")
    public List<Example> newsGetTechnology() throws ParseException, IOException {
        return NewsService.newsGetTechnologyFor();
    }

    /**
     * Get available news categorized by  entertainment
     *
     * @return
     * @throws ParseException
     * @throws IOException
     */
    @GetMapping("/api/v1/news/entertainment")
    public List<Example> newsGetEntertainment() throws ParseException, IOException {
        return NewsService.newsGetEntertainmentFor();
    }

    /**
     * Get available news categorized by health
     *
     * @return
     * @throws ParseException
     * @throws IOException
     */
    @GetMapping("/api/v1/news/health")
    public List<Example> newsGetHealth() throws ParseException, IOException {
        return NewsService.newsGetHealthFor();
    }

    /**
     * Get available news categorized by science
     *
     * @return
     * @throws ParseException
     * @throws IOException
     */
    @GetMapping("/api/v1/news/science")
    public List<Example> newsGetScience() throws ParseException, IOException {
        return NewsService.newsGetScienceFor();
    }

    /**
     * Get available news categorized by sports
     *
     * @return
     * @throws ParseException
     * @throws IOException
     */
    @GetMapping("/api/v1/news/sports")
    public List<Example> newsGetSports() throws ParseException, IOException {
        return NewsService.newsGetSportsFor();
    }


    /**
     * Get available news categorized by general
     *
     * @return
     * @throws ParseException
     * @throws IOException
     */
    @GetMapping("/api/v1/news/general")
    public List<Example> newsGetGeneral() throws ParseException, IOException {
        return NewsService.newsGetGeneralFor();
    }

    /**
     * Get available news categorized by business
     *
     * @return
     * @throws ParseException
     * @throws IOException
     */
    @GetMapping("/api/v1/news/business")
    public List<Example> newsGetBusiness() throws ParseException, IOException {
        return NewsService.newsGetBusinessFor();
    }

}
